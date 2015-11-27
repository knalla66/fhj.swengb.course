package fhj.swengb

import java.net.URL

import org.junit.Assert._
import org.junit.Test

import scala.util.Try

class PersonTest {

  @Test def testRladstaetter(): Unit = {
    assertEquals("rladstaetter", Speakers.rladstaetter.userId)
  }

  @Test def testSpecialchars(): Unit = {
    val s = Student("Robert", "Ladstätter", "awesomecoder", 0)
    assertEquals("rladstaetter", s.userId)
  }

  def checkStudentsForGithubAccount(groupId: Int): Unit = {
    val studentsWithUnkownGithub =
      Students.students.filter(_.githubUsername == "XXXXX")
    val groupedStudents: Map[Int, Seq[Student]] = studentsWithUnkownGithub.toSeq.sortWith((a, b) => a.secondName.compareTo(b.secondName) < 0).groupBy(s => s.groupId)
    val someStudents = groupedStudents.get(groupId)
    if (someStudents.isDefined) {
      val students = someStudents.get
      assertEquals("Following students have no known github account: \n" + students.map(_.longName).mkString("\n"), 0, students.size)
    }
  }

  // Luca Niederdorfer
  @Test def testGroup1(): Unit = checkStudentsForGithubAccount(1)

  @Test def testGroup2(): Unit = checkStudentsForGithubAccount(2)

  @Test def testGroup3(): Unit = checkStudentsForGithubAccount(3)

  def checkAccount(name: String): Boolean = {
    val url = new URL("https://github.com/" + name)
    Try(SwengbUtil.fetch(url).contains(name)).toOption.getOrElse(false)
  }

  def checkGithubForStudents(students: Set[Student]): Unit = {
    val gitHubAddressInvalid: Set[Student] = students.map(s => s -> checkAccount(s.githubUsername)).filter { case (s, exists) => !exists }.map { case (s, _) => s }
    assertEquals(s"For students ${gitHubAddressInvalid.mkString("[", ",", "]")} the github address could not be validated.", 0, gitHubAddressInvalid.size)
  }

  @Test def existsGithubAccountGroup1(): Unit = checkGithubForStudents(Students.studentGroup1)

  @Test def existsGithubAccountGroup2(): Unit = checkGithubForStudents(Students.studentGroup2)

  @Test def existsGithubAccountGroup3(): Unit = checkGithubForStudents(Students.studentGroup3)

}
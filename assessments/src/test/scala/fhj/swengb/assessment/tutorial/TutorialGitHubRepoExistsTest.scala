package fhj.swengb.assessment.tutorial

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.Assert._
import org.junit.{Ignore, Test}

/**
  * Checks for all students if they've created a certain Assignment github repo
  */
@Ignore
class TutorialGitHubRepoExistsTest {

  @Test def abajric(): Unit = assertTrue( Assessment("tutorial", Students.abajric).gitHubRepoExists)

  @Test def jblazevic(): Unit = assert(Assessment("tutorial", Students.jblazevic).gitHubRepoExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("tutorial", Students.cdirnbauer).gitHubRepoExists)

  @Test def dfolk(): Unit = assert(Assessment("tutorial", Students.dfolk).gitHubRepoExists)

  @Test def mfuchs(): Unit = assert(Assessment("tutorial", Students.mfuchs).gitHubRepoExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("tutorial", Students.cfuerbahs).gitHubRepoExists)

  @Test def fgraf(): Unit = assert(Assessment("tutorial", Students.fgraf).gitHubRepoExists)

  @Test def thasenbichler(): Unit = assert(Assessment("tutorial", Students.thasenbichler).gitHubRepoExists)

  @Test def cherzog(): Unit = assert(Assessment("tutorial", Students.cherzog).gitHubRepoExists)

  @Test def ghoxha(): Unit = assert(Assessment("tutorial", Students.ghoxha).gitHubRepoExists)

  @Test def shysi(): Unit = assert(Assessment("tutorial", Students.shysi).gitHubRepoExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("tutorial", Students.dkandlhofer).gitHubRepoExists)

  @Test def ekarimova(): Unit = assert(Assessment("tutorial", Students.ekarimova).gitHubRepoExists)

  @Test def mknaller(): Unit = assert(Assessment("tutorial", Students.mknaller).gitHubRepoExists)

  @Test def pkoerner(): Unit = assert(Assessment("tutorial", Students.pkoerner).gitHubRepoExists)

  @Test def clagger(): Unit = assert(Assessment("tutorial", Students.clagger).gitHubRepoExists)

  @Test def sleitner(): Unit = assert(Assessment("tutorial", Students.sleitner).gitHubRepoExists)

  @Test def alichtenegger(): Unit = assert(Assessment("tutorial", Students.alichtenegger).gitHubRepoExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("tutorial", Students.gmeizenitsch).gitHubRepoExists)

  @Test def pnguyen(): Unit = assert(Assessment("tutorial", Students.pnguyen).gitHubRepoExists)

  @Test def tortmann(): Unit = assert(Assessment("tutorial", Students.tortmann).gitHubRepoExists)

  @Test def aschneider(): Unit = assert(Assessment("tutorial", Students.aschneider).gitHubRepoExists)

  @Test def aseebacher(): Unit = assert(Assessment("tutorial", Students.aseebacher).gitHubRepoExists)

  @Test def vskerbinz(): Unit = assert(Assessment("tutorial", Students.vskerbinz).gitHubRepoExists)

  @Test def nspalek(): Unit = assert(Assessment("tutorial", Students.nspalek).gitHubRepoExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("tutorial", Students.wsteinkellner).gitHubRepoExists)

  @Test def hvidal(): Unit = assert(Assessment("tutorial", Students.hvidal).gitHubRepoExists)

  @Test def mwageneder(): Unit = assert(Assessment("tutorial", Students.mwageneder).gitHubRepoExists)

  @Test def myildiz(): Unit = assert(Assessment("tutorial", Students.myildiz).gitHubRepoExists)

  @Test def lzefferer(): Unit = assert(Assessment("tutorial", Students.lzefferer).gitHubRepoExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("tutorial", Students.mzsifkovits).gitHubRepoExists)


}
        /*
object o {

  def main(args: Array[String]) {
    Students.sortedStudents.foreach {
      s => {
        println(
          s"""@Test def ${s.userId}(): Unit = assert(Assessment("tutorial",Students.${s.userId}).gitHubRepoExists)
         """.stripMargin)
      }
    }
  }
}     */
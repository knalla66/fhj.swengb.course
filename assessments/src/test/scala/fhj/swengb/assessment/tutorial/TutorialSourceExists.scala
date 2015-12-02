package fhj.swengb.assessment.tutorial

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.Test

/**
  * Checks for all students if their directory structure is correct
  */
class TutorialSourceExists {

  @Test def abajric(): Unit = assert(Assessment("tutorial", Students.abajric).srcExists)

  @Test def jblazevic(): Unit = assert(Assessment("tutorial", Students.jblazevic).srcExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("tutorial", Students.cdirnbauer).srcExists)

  @Test def dfolk(): Unit = assert(Assessment("tutorial", Students.dfolk).srcExists)

  @Test def mfuchs(): Unit = assert(Assessment("tutorial", Students.mfuchs).srcExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("tutorial", Students.cfuerbahs).srcExists)

  @Test def fgraf(): Unit = assert(Assessment("tutorial", Students.fgraf).srcExists)

  @Test def thasenbichler(): Unit = assert(Assessment("tutorial", Students.thasenbichler).srcExists)

  @Test def cherzog(): Unit = assert(Assessment("tutorial", Students.cherzog).srcExists)

  @Test def ghoxha(): Unit = assert(Assessment("tutorial", Students.ghoxha).srcExists)

  @Test def shysi(): Unit = assert(Assessment("tutorial", Students.shysi).srcExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("tutorial", Students.dkandlhofer).srcExists)

  @Test def ekarimova(): Unit = assert(Assessment("tutorial", Students.ekarimova).srcExists)

  @Test def mknaller(): Unit = assert(Assessment("tutorial", Students.mknaller).srcExists)

  @Test def pkoerner(): Unit = assert(Assessment("tutorial", Students.pkoerner).srcExists)

  @Test def clagger(): Unit = assert(Assessment("tutorial", Students.clagger).srcExists)

  @Test def sleitner(): Unit = assert(Assessment("tutorial", Students.sleitner).srcExists)

  @Test def alichtenegger(): Unit = assert(Assessment("tutorial", Students.alichtenegger).srcExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("tutorial", Students.gmeizenitsch).srcExists)

  @Test def pnguyen(): Unit = assert(Assessment("tutorial", Students.pnguyen).srcExists)

  @Test def tortmann(): Unit = assert(Assessment("tutorial", Students.tortmann).srcExists)

  @Test def aschneider(): Unit = assert(Assessment("tutorial", Students.aschneider).srcExists)

  @Test def aseebacher(): Unit = assert(Assessment("tutorial", Students.aseebacher).srcExists)

  @Test def vskerbinz(): Unit = assert(Assessment("tutorial", Students.vskerbinz).srcExists)

  @Test def nspalek(): Unit = assert(Assessment("tutorial", Students.nspalek).srcExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("tutorial", Students.wsteinkellner).srcExists)

  @Test def hvidal(): Unit = assert(Assessment("tutorial", Students.hvidal).srcExists)

  @Test def mwageneder(): Unit = assert(Assessment("tutorial", Students.mwageneder).srcExists)

  @Test def myildiz(): Unit = assert(Assessment("tutorial", Students.myildiz).srcExists)

  @Test def lzefferer(): Unit = assert(Assessment("tutorial", Students.lzefferer).srcExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("tutorial", Students.mzsifkovits).srcExists)


}
        /*
object o {

  def main(args: Array[String]) {
    Students.sortedStudents.foreach {
      s => {
        println(
          s"""@Test def ${s.userId}(): Unit = assert(Assessment("tutorial",Students.${s.userId}).srcExists)
         """.stripMargin)
      }
    }
  }
}         */
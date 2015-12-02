package fhj.swengb.assessment.tutorial

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.Test

/**
  * Checks for all students if their directory structure is correct
  */
class TutorialTestExists {

  @Test def abajric(): Unit = assert(Assessment("tutorial", Students.abajric).testExists)

  @Test def jblazevic(): Unit = assert(Assessment("tutorial", Students.jblazevic).testExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("tutorial", Students.cdirnbauer).testExists)

  @Test def dfolk(): Unit = assert(Assessment("tutorial", Students.dfolk).testExists)

  @Test def mfuchs(): Unit = assert(Assessment("tutorial", Students.mfuchs).testExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("tutorial", Students.cfuerbahs).testExists)

  @Test def fgraf(): Unit = assert(Assessment("tutorial", Students.fgraf).testExists)

  @Test def thasenbichler(): Unit = assert(Assessment("tutorial", Students.thasenbichler).testExists)

  @Test def cherzog(): Unit = assert(Assessment("tutorial", Students.cherzog).testExists)

  @Test def ghoxha(): Unit = assert(Assessment("tutorial", Students.ghoxha).testExists)

  @Test def shysi(): Unit = assert(Assessment("tutorial", Students.shysi).testExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("tutorial", Students.dkandlhofer).testExists)

  @Test def ekarimova(): Unit = assert(Assessment("tutorial", Students.ekarimova).testExists)

  @Test def mknaller(): Unit = assert(Assessment("tutorial", Students.mknaller).testExists)

  @Test def pkoerner(): Unit = assert(Assessment("tutorial", Students.pkoerner).testExists)

  @Test def clagger(): Unit = assert(Assessment("tutorial", Students.clagger).testExists)

  @Test def sleitner(): Unit = assert(Assessment("tutorial", Students.sleitner).testExists)

  @Test def alichtenegger(): Unit = assert(Assessment("tutorial", Students.alichtenegger).testExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("tutorial", Students.gmeizenitsch).testExists)

  @Test def pnguyen(): Unit = assert(Assessment("tutorial", Students.pnguyen).testExists)

  @Test def tortmann(): Unit = assert(Assessment("tutorial", Students.tortmann).testExists)

  @Test def aschneider(): Unit = assert(Assessment("tutorial", Students.aschneider).testExists)

  @Test def aseebacher(): Unit = assert(Assessment("tutorial", Students.aseebacher).testExists)

  @Test def vskerbinz(): Unit = assert(Assessment("tutorial", Students.vskerbinz).testExists)

  @Test def nspalek(): Unit = assert(Assessment("tutorial", Students.nspalek).testExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("tutorial", Students.wsteinkellner).testExists)

  @Test def hvidal(): Unit = assert(Assessment("tutorial", Students.hvidal).testExists)

  @Test def mwageneder(): Unit = assert(Assessment("tutorial", Students.mwageneder).testExists)

  @Test def myildiz(): Unit = assert(Assessment("tutorial", Students.myildiz).testExists)

  @Test def lzefferer(): Unit = assert(Assessment("tutorial", Students.lzefferer).testExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("tutorial", Students.mzsifkovits).testExists)


}

/*
object o {

def main(args: Array[String]) {
 Students.sortedStudents.foreach {
   s => {
     println(
       s"""@Test def ${s.userId}(): Unit = assert(Assessment("tutorial",Students.${s.userId}).testExists)
      """.stripMargin)
   }
 }
}
}  */
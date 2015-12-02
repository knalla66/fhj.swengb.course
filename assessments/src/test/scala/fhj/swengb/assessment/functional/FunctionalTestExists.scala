package fhj.swengb.assessment.functional

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.{Ignore, Test}

/**
  * Checks for all students if their directory structure is correct
  */
@Ignore
class FunctionalTestExists {

  @Test def abajric(): Unit = assert(Assessment("functional", Students.abajric).testExists)

  @Test def jblazevic(): Unit = assert(Assessment("functional", Students.jblazevic).testExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("functional", Students.cdirnbauer).testExists)

  @Test def dfolk(): Unit = assert(Assessment("functional", Students.dfolk).testExists)

  @Test def mfuchs(): Unit = assert(Assessment("functional", Students.mfuchs).testExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("functional", Students.cfuerbahs).testExists)

  @Test def fgraf(): Unit = assert(Assessment("functional", Students.fgraf).testExists)

  @Test def thasenbichler(): Unit = assert(Assessment("functional", Students.thasenbichler).testExists)

  @Test def cherzog(): Unit = assert(Assessment("functional", Students.cherzog).testExists)

  @Test def ghoxha(): Unit = assert(Assessment("functional", Students.ghoxha).testExists)

  @Test def shysi(): Unit = assert(Assessment("functional", Students.shysi).testExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("functional", Students.dkandlhofer).testExists)

  @Test def ekarimova(): Unit = assert(Assessment("functional", Students.ekarimova).testExists)

  @Test def mknaller(): Unit = assert(Assessment("functional", Students.mknaller).testExists)

  @Test def pkoerner(): Unit = assert(Assessment("functional", Students.pkoerner).testExists)

  @Test def clagger(): Unit = assert(Assessment("functional", Students.clagger).testExists)

  @Test def sleitner(): Unit = assert(Assessment("functional", Students.sleitner).testExists)

  @Test def alichtenegger(): Unit = assert(Assessment("functional", Students.alichtenegger).testExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("functional", Students.gmeizenitsch).testExists)

  @Test def pnguyen(): Unit = assert(Assessment("functional", Students.pnguyen).testExists)

  @Test def tortmann(): Unit = assert(Assessment("functional", Students.tortmann).testExists)

  @Test def aschneider(): Unit = assert(Assessment("functional", Students.aschneider).testExists)

  @Test def aseebacher(): Unit = assert(Assessment("functional", Students.aseebacher).testExists)

  @Test def vskerbinz(): Unit = assert(Assessment("functional", Students.vskerbinz).testExists)

  @Test def nspalek(): Unit = assert(Assessment("functional", Students.nspalek).testExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("functional", Students.wsteinkellner).testExists)

  @Test def hvidal(): Unit = assert(Assessment("functional", Students.hvidal).testExists)

  @Test def mwageneder(): Unit = assert(Assessment("functional", Students.mwageneder).testExists)

  @Test def myildiz(): Unit = assert(Assessment("functional", Students.myildiz).testExists)

  @Test def lzefferer(): Unit = assert(Assessment("functional", Students.lzefferer).testExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("functional", Students.mzsifkovits).testExists)


}


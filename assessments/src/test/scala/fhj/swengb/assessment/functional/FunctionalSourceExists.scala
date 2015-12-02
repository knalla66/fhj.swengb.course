package fhj.swengb.assessment.functional

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.{Ignore, Test}

/**
  * Checks for all students if their directory structure is correct
  */
@Ignore
class FunctionalSourceExists {

  @Test def abajric(): Unit = assert(Assessment("functional", Students.abajric).srcExists)

  @Test def jblazevic(): Unit = assert(Assessment("functional", Students.jblazevic).srcExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("functional", Students.cdirnbauer).srcExists)

  @Test def dfolk(): Unit = assert(Assessment("functional", Students.dfolk).srcExists)

  @Test def mfuchs(): Unit = assert(Assessment("functional", Students.mfuchs).srcExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("functional", Students.cfuerbahs).srcExists)

  @Test def fgraf(): Unit = assert(Assessment("functional", Students.fgraf).srcExists)

  @Test def thasenbichler(): Unit = assert(Assessment("functional", Students.thasenbichler).srcExists)

  @Test def cherzog(): Unit = assert(Assessment("functional", Students.cherzog).srcExists)

  @Test def ghoxha(): Unit = assert(Assessment("functional", Students.ghoxha).srcExists)

  @Test def shysi(): Unit = assert(Assessment("functional", Students.shysi).srcExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("functional", Students.dkandlhofer).srcExists)

  @Test def ekarimova(): Unit = assert(Assessment("functional", Students.ekarimova).srcExists)

  @Test def mknaller(): Unit = assert(Assessment("functional", Students.mknaller).srcExists)

  @Test def pkoerner(): Unit = assert(Assessment("functional", Students.pkoerner).srcExists)

  @Test def clagger(): Unit = assert(Assessment("functional", Students.clagger).srcExists)

  @Test def sleitner(): Unit = assert(Assessment("functional", Students.sleitner).srcExists)

  @Test def alichtenegger(): Unit = assert(Assessment("functional", Students.alichtenegger).srcExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("functional", Students.gmeizenitsch).srcExists)

  @Test def pnguyen(): Unit = assert(Assessment("functional", Students.pnguyen).srcExists)

  @Test def tortmann(): Unit = assert(Assessment("functional", Students.tortmann).srcExists)

  @Test def aschneider(): Unit = assert(Assessment("functional", Students.aschneider).srcExists)

  @Test def aseebacher(): Unit = assert(Assessment("functional", Students.aseebacher).srcExists)

  @Test def vskerbinz(): Unit = assert(Assessment("functional", Students.vskerbinz).srcExists)

  @Test def nspalek(): Unit = assert(Assessment("functional", Students.nspalek).srcExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("functional", Students.wsteinkellner).srcExists)

  @Test def hvidal(): Unit = assert(Assessment("functional", Students.hvidal).srcExists)

  @Test def mwageneder(): Unit = assert(Assessment("functional", Students.mwageneder).srcExists)

  @Test def myildiz(): Unit = assert(Assessment("functional", Students.myildiz).srcExists)

  @Test def lzefferer(): Unit = assert(Assessment("functional", Students.lzefferer).srcExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("functional", Students.mzsifkovits).srcExists)


}


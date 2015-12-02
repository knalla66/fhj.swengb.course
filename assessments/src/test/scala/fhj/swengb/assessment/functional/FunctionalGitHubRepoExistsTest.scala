package fhj.swengb.assessment.functional

import fhj.swengb.Students
import fhj.swengb.assessment.Assessment
import org.junit.Assert._
import org.junit.{Ignore, Test}

/**
  * Checks for all students if they've created a certain Assignment github repo
  */
@Ignore
class FunctionalGitHubRepoExistsTest {

  @Test def abajric(): Unit = assertTrue( Assessment("functional", Students.abajric).gitHubRepoExists)

  @Test def jblazevic(): Unit = assert(Assessment("functional", Students.jblazevic).gitHubRepoExists)

  @Test def cdirnbauer(): Unit = assert(Assessment("functional", Students.cdirnbauer).gitHubRepoExists)

  @Test def dfolk(): Unit = assert(Assessment("functional", Students.dfolk).gitHubRepoExists)

  @Test def mfuchs(): Unit = assert(Assessment("functional", Students.mfuchs).gitHubRepoExists)

  @Test def cfuerbahs(): Unit = assert(Assessment("functional", Students.cfuerbahs).gitHubRepoExists)

  @Test def fgraf(): Unit = assert(Assessment("functional", Students.fgraf).gitHubRepoExists)

  @Test def thasenbichler(): Unit = assert(Assessment("functional", Students.thasenbichler).gitHubRepoExists)

  @Test def cherzog(): Unit = assert(Assessment("functional", Students.cherzog).gitHubRepoExists)

  @Test def ghoxha(): Unit = assert(Assessment("functional", Students.ghoxha).gitHubRepoExists)

  @Test def shysi(): Unit = assert(Assessment("functional", Students.shysi).gitHubRepoExists)

  @Test def dkandlhofer(): Unit = assert(Assessment("functional", Students.dkandlhofer).gitHubRepoExists)

  @Test def ekarimova(): Unit = assert(Assessment("functional", Students.ekarimova).gitHubRepoExists)

  @Test def mknaller(): Unit = assert(Assessment("functional", Students.mknaller).gitHubRepoExists)

  @Test def pkoerner(): Unit = assert(Assessment("functional", Students.pkoerner).gitHubRepoExists)

  @Test def clagger(): Unit = assert(Assessment("functional", Students.clagger).gitHubRepoExists)

  @Test def sleitner(): Unit = assert(Assessment("functional", Students.sleitner).gitHubRepoExists)

  @Test def alichtenegger(): Unit = assert(Assessment("functional", Students.alichtenegger).gitHubRepoExists)

  @Test def gmeizenitsch(): Unit = assert(Assessment("functional", Students.gmeizenitsch).gitHubRepoExists)

  @Test def pnguyen(): Unit = assert(Assessment("functional", Students.pnguyen).gitHubRepoExists)

  @Test def tortmann(): Unit = assert(Assessment("functional", Students.tortmann).gitHubRepoExists)

  @Test def aschneider(): Unit = assert(Assessment("functional", Students.aschneider).gitHubRepoExists)

  @Test def aseebacher(): Unit = assert(Assessment("functional", Students.aseebacher).gitHubRepoExists)

  @Test def vskerbinz(): Unit = assert(Assessment("functional", Students.vskerbinz).gitHubRepoExists)

  @Test def nspalek(): Unit = assert(Assessment("functional", Students.nspalek).gitHubRepoExists)

  @Test def wsteinkellner(): Unit = assert(Assessment("functional", Students.wsteinkellner).gitHubRepoExists)

  @Test def hvidal(): Unit = assert(Assessment("functional", Students.hvidal).gitHubRepoExists)

  @Test def mwageneder(): Unit = assert(Assessment("functional", Students.mwageneder).gitHubRepoExists)

  @Test def myildiz(): Unit = assert(Assessment("functional", Students.myildiz).gitHubRepoExists)

  @Test def lzefferer(): Unit = assert(Assessment("functional", Students.lzefferer).gitHubRepoExists)

  @Test def mzsifkovits(): Unit = assert(Assessment("functional", Students.mzsifkovits).gitHubRepoExists)


}


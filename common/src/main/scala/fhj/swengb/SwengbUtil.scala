package fhj.swengb

import java.io.File
import java.net.URL
import java.nio.charset.StandardCharsets
import java.nio.file.{Paths, Files}

import scala.io.Source

/**
  * Useful tooling for basic operations
  */
object SwengbUtil {

  def mkParent(file : File) : Unit = {
    if (!file.getParentFile.exists()) {
      file.getParentFile.mkdirs()
    }
  }
  def writeToFile(file: File, content: String): File = {
    Files.write(Paths.get(file.toURI), content.getBytes(StandardCharsets.UTF_8)).toFile
  }

  def fetch(url: URL): String = {
    Source.fromURL(url).mkString
  }
}



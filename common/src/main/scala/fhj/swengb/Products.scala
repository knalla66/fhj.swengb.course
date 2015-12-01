package fhj.swengb

import java.net.URL
import java.sql.{Connection, ResultSet, Statement}

import fhj.swengb.Db.DbEntity
import fhj.swengb.Db.DbEntity
import fhj.swengb.Person._

import scala.collection.mutable.ListBuffer


object Products extends DbEntity[Products] {
      // Bei DB
  val dropTableSql = "drop table if exists products"
  val createTableSql = "create table products (ID int, productName string, productDescription String, productPrice double)"
  val insertSql = "insert into products (ID int, productName string, productDescription String, productPrice double VALUES (?, ?, ?, ?)"


  def reTable(stmt: Statement): Int = {
    stmt.executeUpdate(Products.dropTableSql)
    stmt.executeUpdate(Products.createTableSql)
  }

  def toDb(c: Connection)(p: Products): Int = {
    val pstmt = c.prepareStatement(insertSql)
    pstmt.setString(1, p.ID)
    pstmt.setString(2, p.productName)
    pstmt.setString(3, p.productDescription)
    pstmt.setInt(4, p.productPrice)
    pstmt.executeUpdate()
  }

  def fromDb(rs: ResultSet): List[Person] = {
    val lb: ListBuffer[Person] = new ListBuffer[Person]()
    while (rs.next()) lb.append(Student(rs.getString("firstName"),
      rs.getString("secondName"),
      rs.getString("githubUsername"),
      rs.getInt("groupId")))
    lb.toList
  }

  def queryAll(con: Connection): ResultSet =
    query(con)("select * from person")

}

/**
 * Created by lad on 24.09.15.
 */
sealed trait Products {

  def ID: Int

  def productName: String

  def productDescription: String

  def productPrice: Double

  def longName = s"$firstName $secondName"

  def normalize(in: String): String = {
    val mapping =
      Map("ä" -> "ae",
        "ö" -> "oe",
        "ü" -> "ue",
        "ß" -> "ss")
    mapping.foldLeft(in) { case ((s, (a, b))) => s.replace(a, b) }
  }

  /*
  def normalize2(input: String): String = {
    val output = Normalizer.normalize(input, Normalizer.Form.NFD)
    val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
    pattern.matcher(output).replaceAll("")
  } */


  def userId: String = {
    val fst = firstName(0).toLower.toString
    normalize(fst + secondName.toLowerCase)
  }

  val gitHubHome: String = s"https://github.com/$githubUsername/"

  @deprecated("remove", "now")
  val tutorialName: String = "fhj.swengb.assignments.tutorial"
  val tutorialURL: URL = new URL(gitHubHome + tutorialName)

  def mkHome: String = s" - $longName : [$githubUsername]($gitHubHome)"

  def gitHubUser: GitHub.User = {
    import GitHub.GithubUserProtocol._
    import GitHub._
    import spray.json._

    val webserviceString: String = scala.io.Source.fromURL(new URL(s"https://api.github.com/users/$githubUsername?client_id=083fd3dd1f81ff332025&client_secret=6450ef529f167ab41cf263a82a05fd1ce2084724")).mkString
    webserviceString.parseJson.convertTo[User]
  }

}

case class Speaker(firstName: String,
                   secondName: String,
                   githubUsername: String,
                   groupId: Int) extends Person

case class Student(firstName: String,
                   secondName: String,
                   githubUsername: String,
                   groupId: Int) extends Person

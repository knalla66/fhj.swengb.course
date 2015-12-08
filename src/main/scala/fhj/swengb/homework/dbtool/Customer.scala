package fhj.swengb.homework.dbtool

import java.sql.{ResultSet, Connection, Statement}

import scala.collection.mutable.ListBuffer

/**
  * Created by loete on 01.12.2015.
  */
object Customer extends Db.DbEntity[Customer] {

  val dropTableSql = "drop table if exists customer"
  val createTableSql = "create table customer (cid integer, name string, address string)"
  val insertSql = "insert into customer (cid, name, address) VALUES (?, ?, ?)"


  def reTable(stmt: Statement): Int = {
    stmt.executeUpdate(Customer.dropTableSql)
    stmt.executeUpdate(Customer.createTableSql)
  }

  def toDb(c: Connection)(i: Customer): Int = {
    val pstmt = c.prepareStatement(insertSql)
    pstmt.setInt(1, i.cid)
    pstmt.setString(2, i.name)
    pstmt.setString(3, i.address)
    pstmt.executeUpdate()
  }

  def fromDb(rs: ResultSet): List[Customer] = {
    val lb: ListBuffer[Customer] = new ListBuffer[Customer]()
    while (rs.next()) lb.append(Customer(rs.getInt("cid"), rs.getString("name"), rs.getString("address")))
    lb.toList
  }

  def queryAll(con: Connection): ResultSet = query(con)("select * from customer")

}

case class Customer(cid:Int, name: String, address:String) extends Db.DbEntity[Customer] {

  def reTable(stmt: Statement): Int = 0

  def toDb(c: Connection)(t: Customer): Int = 0

  def fromDb(rs: ResultSet): List[Customer] = List()

  def dropTableSql: String = "drop table if exists customer"

  def createTableSql: String = "create table customer (cid integer, name string, address string)"

  def insertSql: String = "insert into customer (cid, name, address) VALUES (?, ?, ?)"

}

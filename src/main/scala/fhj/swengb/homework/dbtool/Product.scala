package fhj.swengb.homework.dbtool

import java.sql.{ResultSet, Connection, Statement}

import scala.collection.mutable.ListBuffer

/**
  * Created by loete on 27.11.2015.
  */

object Product extends Db.DbEntity[Product] {

  val dropTableSql = "drop table if exists product"
  val createTableSql = "create table product (id integer, name string, price double)"
  val insertSql = "insert into product (id, name, price) VALUES (?, ?, ?)"


  def reTable(stmt: Statement): Int = {
    stmt.executeUpdate(Product.dropTableSql)
    stmt.executeUpdate(Product.createTableSql)
  }

  def toDb(c: Connection)(p: Product): Int = {
    val pstmt = c.prepareStatement(insertSql)
    pstmt.setInt(1, p.id)
    pstmt.setString(2, p.name)
    pstmt.setDouble(3, p.price)
    pstmt.executeUpdate()
  }

  def fromDb(rs: ResultSet): List[Product] = {
    val lb: ListBuffer[Product] = new ListBuffer[Product]()
    while (rs.next()) lb.append(Product(rs.getInt("id"), rs.getString("name"), rs.getDouble("price")))
    lb.toList
  }

  def queryAll(con: Connection): ResultSet = query(con)("select * from product")

}

case class Product(id:Int, name: String, price:Double) extends Db.DbEntity[Product] {

  def reTable(stmt: Statement): Int = 0

  def toDb(c: Connection)(t: Product): Int = 0

  def fromDb(rs: ResultSet): List[Product] = List()

  def dropTableSql: String = "drop table if exists product"

  def createTableSql: String = "create table product (id integer, name String, price Double"

  def insertSql: String = "insert into person (id, name, price) VALUES (?, ?, ?)"

}

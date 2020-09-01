package ru.otus.sc.greet.dao

/** Dao which represents something what could do `echoing`
  */

trait EchoDao {
  def echo(in: String)
}

package ru.otus.sc.greet.dao

/**
  * Interface for convertation to JSON
  */
trait JsonDao {
  def toJson(input: String): String
}

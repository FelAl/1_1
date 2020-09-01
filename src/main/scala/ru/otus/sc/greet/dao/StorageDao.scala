package ru.otus.sc.greet.dao

/** Dao for storage Map and some calculation which can be lazy
  */
trait StorageDao {
  val storage: Map[String, String]
  val hugeComputation: Int
}

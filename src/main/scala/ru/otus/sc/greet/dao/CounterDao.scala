package ru.otus.sc.greet.dao

/**
  * CounterDao with two methods
  */
trait CounterDao[T] {
  var counter: T
  def plusOne: T
}

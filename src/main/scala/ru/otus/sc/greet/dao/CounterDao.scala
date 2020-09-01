package ru.otus.sc.greet.dao

/**
  * CounterDao with two members
  * counter itself
  * plusOne method
  */
trait CounterDao[T] {
  var counter: T
  def plusOne: T
}

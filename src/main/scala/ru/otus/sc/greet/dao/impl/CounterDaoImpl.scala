package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.CounterDao

/**
  *  Naive counter implementation
  * @param cnt
  */
class CounterDaoImpl(cnt: Long) extends CounterDao[Long] {
  var counter = 0
  def plusOne = { counter += 1; counter }
}

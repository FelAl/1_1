package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.CounterDao

class CounterDaoImpl(cnt: Long) extends CounterDao[Long] {
  var counter = 0
  def plusOne = { counter += 1; counter }
}

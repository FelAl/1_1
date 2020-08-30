package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.CounterDao
import java.util.concurrent.atomic.AtomicLong

class CounterDaoAtomicImpl extends CounterDao[AtomicLong] {
  var counter = new AtomicLong(0)
  def plusOne = { counter.incrementAndGet(); counter }
}

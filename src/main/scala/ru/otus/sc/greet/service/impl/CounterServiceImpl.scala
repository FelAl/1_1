package ru.otus.sc.greet.service.impl

import ru.otus.sc.greet.dao.CounterDao
import ru.otus.sc.greet.model.counter.Counter
import ru.otus.sc.greet.service.CounterService

class CounterServiceImpl(counterDao: CounterDao[Long]) extends CounterService {
  def getCounter = Counter(cnt = 0)
}

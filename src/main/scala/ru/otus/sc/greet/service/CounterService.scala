package ru.otus.sc.greet.service

import ru.otus.sc.greet.model.counter.Counter

trait CounterService {
  def getCounter: Counter
}

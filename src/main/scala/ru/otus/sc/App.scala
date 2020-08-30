package ru.otus.sc

import ru.otus.sc.greet.dao.impl.{CounterDaoImpl, GreetingDaoImpl}
import ru.otus.sc.greet.model.counter.Counter
import ru.otus.sc.greet.model.{GreetRequest, GreetResponse}
import ru.otus.sc.greet.service.{CounterService, GreetingService}
import ru.otus.sc.greet.service.impl.{CounterServiceImpl, GreetingServiceImpl}

trait App {
  def greet(request: GreetRequest): GreetResponse
  def getCounter: Counter
}

object App {
  private class AppImpl(greeting: GreetingService, conterServ: CounterService) extends App {
    def greet(request: GreetRequest): GreetResponse = greeting.greet(request)
    def getCounter                                  = conterServ.getCounter
  }

  def apply(): App = {
    val greetingDao     = new GreetingDaoImpl
    val greetingService = new GreetingServiceImpl(greetingDao)

    val counterDao     = new CounterDaoImpl(cnt = 0)
    val counterService = new CounterServiceImpl(counterDao)
    new AppImpl(greetingService, counterService)
  }
}

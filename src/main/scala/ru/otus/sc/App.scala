package ru.otus.sc

import ru.otus.sc.greet.dao.EchoDao
import ru.otus.sc.greet.dao.impl.{CounterDaoImpl, EchoDaoImpl, GreetingDaoImpl}
import ru.otus.sc.greet.model.counter.Counter
import ru.otus.sc.greet.model.{GreetRequest, GreetResponse}
import ru.otus.sc.greet.service.{CounterService, EchoService, GreetingService}
import ru.otus.sc.greet.service.impl.{CounterServiceImpl, EchoServiceImpl, GreetingServiceImpl}

trait App {
  def greet(request: GreetRequest): GreetResponse
  def getCounter: Counter
}

object App {
  private class AppImpl(greeting: GreetingService, conterServ: CounterService, echoing: EchoService)
      extends App {
    def greet(request: GreetRequest): GreetResponse = greeting.greet(request)
    def getCounter                                  = conterServ.getCounter
  }

  def apply(): App = {
    val greetingDao     = new GreetingDaoImpl
    val greetingService = new GreetingServiceImpl(greetingDao)

    val counterDao     = new CounterDaoImpl(cnt = 0)
    val counterService = new CounterServiceImpl(counterDao)

    val echoDao     = new EchoDaoImpl
    val echoService = new EchoServiceImpl(echoDao)

    new AppImpl(greetingService, counterService, echoService)
  }
}

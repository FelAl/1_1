package ru.otus.sc

import ru.otus.sc.greet.dao.{EchoDao, StorageDao}
import ru.otus.sc.greet.dao.impl.{
  CounterDaoImpl,
  EchoDaoImpl,
  GreetingDaoImpl,
  JsonDaoImpl,
  StorageDaoImpl
}
import ru.otus.sc.greet.model.counter.Counter
import ru.otus.sc.greet.model.echo.EchoModel
import ru.otus.sc.greet.model.{GreetRequest, GreetResponse, JsonSchema, StorageModel}
import ru.otus.sc.greet.service.{
  CounterService,
  EchoService,
  GreetingService,
  JsonService,
  StorageService
}
import ru.otus.sc.greet.service.impl.{
  CounterServiceImpl,
  EchoServiceImpl,
  GreetingServiceImpl,
  JsonServiceImpl,
  StorageServiceImpl
}

trait App {
  def greet(request: GreetRequest): GreetResponse
  def getCounter: Counter
}

object App {
  private class AppImpl(
      greeting: GreetingService,
      conterServ: CounterService,
      echoing: EchoService,
      store: StorageService,
      jsonConverter: JsonService
  ) extends App {
    def greet(request: GreetRequest): GreetResponse       = greeting.greet(request)
    def getCounter                                        = conterServ.getCounter
    def echo(echoModel: EchoModel): String                = echoing.echo(echoModel)
    def storage(store: StorageModel): Map[String, String] = store.storage
    def getValLongComputation(store: StorageModel): Int   = store.computationalValue
    def convertSomethingToJson(str: String, converter: JsonSchema): String =
      if (converter.prettifyOptionIsOn)
        str
      else "not pretty"
  }

  def apply(): App = {
    val greetingDao     = new GreetingDaoImpl
    val greetingService = new GreetingServiceImpl(greetingDao)

    val counterDao     = new CounterDaoImpl(cnt = 0)
    val counterService = new CounterServiceImpl(counterDao)

    val echoDao     = new EchoDaoImpl
    val echoService = new EchoServiceImpl(echoDao)

    val storageDao    = new StorageDaoImpl
    val storageSevice = new StorageServiceImpl(storageDao)

    val jsonDao     = new JsonDaoImpl
    val jsonService = new JsonServiceImpl(jsonDao)

    new AppImpl(greetingService, counterService, echoService, storageSevice, jsonService)
  }
}

package ru.otus.sc.greet.service.impl

import ru.otus.sc.greet.dao.EchoDao
import ru.otus.sc.greet.model.echo.EchoModel
import ru.otus.sc.greet.service.EchoService

class EchoServiceImpl(echoDao: EchoDao) extends EchoService {
  def echo(echoModel: EchoModel) = s"Echo service ${echoModel.in}"
}

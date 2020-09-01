package ru.otus.sc.greet.service

import ru.otus.sc.greet.model.echo.EchoModel

trait EchoService {
  def echo(echoModel: EchoModel): String
}

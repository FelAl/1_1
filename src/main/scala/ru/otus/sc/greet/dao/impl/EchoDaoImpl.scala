package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.EchoDao

/** *
  * Straitforward EchoDao implementation
  */
class EchoDaoImpl extends EchoDao {
  def echo(in: String) = s"Echo ${in}"
}

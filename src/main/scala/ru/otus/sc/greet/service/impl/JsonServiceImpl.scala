package ru.otus.sc.greet.service.impl

import ru.otus.sc.greet.dao.JsonDao

class JsonServiceImpl(dao: JsonDao) {
  def toJson(input: String) = dao.toJson(input)
}

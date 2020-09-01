package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.JsonDao

class JsonDaoImpl extends JsonDao {
  def toJson(inputStr: String) = "{" + "\"value\":" + "\"" + inputStr + "\"" + "}"
}

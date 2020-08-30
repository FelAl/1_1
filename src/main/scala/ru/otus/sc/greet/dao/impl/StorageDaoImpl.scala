package ru.otus.sc.greet.dao.impl

import ru.otus.sc.greet.dao.StorageDao

class StorageDaoImpl extends StorageDao {
  val storage = Map(
    "one"   -> "resultOne",
    "two"   -> "resultTwo",
    "three" -> "resultThree"
  )
}

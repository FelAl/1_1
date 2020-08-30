package ru.otus.sc.greet.service.impl

import ru.otus.sc.greet.dao.StorageDao
import ru.otus.sc.greet.service.StorageService

class StorageServiceImpl(dao: StorageDao) extends StorageService {
  def getValueFromStorage(key: String) = dao.storage(key)
}

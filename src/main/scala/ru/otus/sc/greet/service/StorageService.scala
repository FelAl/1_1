package ru.otus.sc.greet.service

trait StorageService {
  def getValueFromStorage(key: String): String
}

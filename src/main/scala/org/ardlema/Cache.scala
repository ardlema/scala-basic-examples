package org.ardlema

trait Cache[T] {

  def getOrFetch(key: String)(fetch: () => T): T = {
    println("Default empty cache will always invoke the callback...")
    fetch()
  }

  def clear(key: String) {}
}
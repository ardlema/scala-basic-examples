package org.ardlema

trait ExpiryCache[T] extends Cache[T] {

  val timeout: Long = 3000

  var lastAccess: Map[String, Long] = Map()

  override def getOrFetch(key: String)(fetch: () => T): T = {
    if (lastAccess.contains(key) && System.currentTimeMillis - lastAccess(key) > timeout) {
      println("Timeout expired!! Clearing the cache...")
      clear(key)
    }
    lastAccess = lastAccess + (key -> System.currentTimeMillis)
    super.getOrFetch(key)(fetch)
  }
}
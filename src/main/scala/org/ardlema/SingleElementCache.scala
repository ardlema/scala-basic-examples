package org.ardlema

trait SingleElementCache[T] extends Cache[T] {
  private var cacheKey: String = null
  private var cacheValue: T = null.asInstanceOf[T]

  override def getOrFetch(key: String)(fetch: () => T): T = {
    if (cacheKey == key) {
      println("Single element cache hit ...")
      cacheValue
    } else {
      println("Single element cache miss, invoking the callback ...")
      val result = fetch()
      cacheValue = result
      cacheKey = key
      result
    }
  }

  override def clear(key: String) = {
    cacheKey = null
  }
}
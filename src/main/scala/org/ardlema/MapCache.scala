package org.ardlema

import scala.collection.mutable.Map

trait MapCache[T] extends Cache[T] {
  private var elements: Map[String, T] = Map()

  override def getOrFetch(key: String)(fetch: () => T): T = {
    elements.get(key) match {
      case Some(value) => {
        println("Element found!! Getting it from cache...")
        value
      }
      case None => {
        println("Element not found!! Invoking fetch callback...")
        val value = fetch()
        println("Adding the element to the cache")
        elements = elements + (key -> value)
        value
      }
    }
  }

  override def clear(key: String) {
    elements.remove(key)
  }
}

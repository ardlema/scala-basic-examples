package org.ardlema

class ImplicitExamples {
  implicit def fromIntToString(a: Int): String = a.toString

  def id(a: String): String = a
}

object Helpers {
  implicit class IntHelper(x: Int) {
    def duplicateInt: Int = x * 2
  }
}
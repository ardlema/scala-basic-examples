package org.ardlema

class CustomString(val theString: String) {
  private var extraData = ""
  override def toString = theString + " " + extraData
}

object CustomString {
  def apply(base: String, extras: String) = {
    val s = new CustomString(base)
    s.extraData = extras
    s
  }

  def apply(base:String) = new CustomString(base)
}



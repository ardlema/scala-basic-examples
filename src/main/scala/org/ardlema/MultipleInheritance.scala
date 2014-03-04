package org.ardlema

abstract class Bird {
  def sound: String
}

trait FlyingBird extends Bird {
  override def sound = "Any flying sound"
  def fly () = { "I can fly!" }
}

trait RunningBird extends Bird {
  override def sound = "Any running sound"
  def run () = { "I can run!" }
}

class FlyingAndRunningBird
  extends FlyingBird
  with RunningBird

object MultipleInheritance {
  def main(args: Array[String]) {
      val flyingChicken = new FlyingAndRunningBird
      val flyingChickenSound = flyingChicken.sound
      println(s"Flying chicken sound: $flyingChickenSound")
  }
}




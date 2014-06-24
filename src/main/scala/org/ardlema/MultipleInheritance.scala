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
  extends RunningBird
  with FlyingBird

object MultipleInheritance {
  def main(args: Array[String]) {
      val flyingAndRunningChicken = new FlyingAndRunningBird
      val flyingAndRunningChickenSound = flyingAndRunningChicken.sound
      println(s"FlyingAndRunning chicken sound: $flyingAndRunningChickenSound")
  }
}




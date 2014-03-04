package org.ardlema

object StreamingApplicationWithCache {

  def main(args: Array[String]) {
    println("Creating streaming user with cache...")
    val myStreamingUser = new StreamingUser("1", "alberto")
    println("**** First access ****")
    println(myStreamingUser.movies)
    println("**** Second access ****")
    println(myStreamingUser.movies)
    println("**** Third access ****")
    println(myStreamingUser.movies)
  }

}

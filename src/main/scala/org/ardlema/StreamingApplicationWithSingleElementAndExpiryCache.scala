package org.ardlema

object StreamingApplicationWithSingleElementAndExpiryCache {

  def main(args: Array[String]) {
    println("Creating streaming user with expiry cache...")
    val myStreamingUserWithExpiryCache = new StreamingUserWithSingleElementExpiryCache("2", "arturo")
    println("**** First access ****")
    println(myStreamingUserWithExpiryCache.movies)
    println("**** Second access ****")
    println(myStreamingUserWithExpiryCache.movies)
    println("Waiting 4 seconds....")
    Thread.sleep(4000)
    println("**** Third access ****")
    println(myStreamingUserWithExpiryCache.movies)
  }

}

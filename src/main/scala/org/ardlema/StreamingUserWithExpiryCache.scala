package org.ardlema

class StreamingUserWithExpiryCache(userId: String, name: String) extends ExpiryCache[List[Movie]]{
  def movies = getOrFetch("movies"){ () =>
    Movie.loadMoviesByUserId(userId)
  }
}
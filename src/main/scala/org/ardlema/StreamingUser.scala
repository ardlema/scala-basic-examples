package org.ardlema

class StreamingUser(userId: String, name: String) extends MapCache[List[Movie]]{
  def movies = getOrFetch("movies"){ () =>
    Movie.loadMoviesByUserId(userId)
  }
}

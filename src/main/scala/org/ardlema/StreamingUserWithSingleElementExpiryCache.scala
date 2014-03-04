package org.ardlema

class StreamingUserWithSingleElementExpiryCache(userId: String, name: String)
  extends SingleElementCache[List[Movie]]
  with ExpiryCache[List[Movie]]{
   def movies = getOrFetch("movies"){ () =>
     Movie.loadMoviesByUserId(userId)
   }
 }
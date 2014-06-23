import org.ardlema.Movie
import org.scalatest.{GivenWhenThen, ShouldMatchers, FunSpec}


class MovieTests
  extends FunSpec
  with ShouldMatchers
  with GivenWhenThen {

  describe("The movie class") {
    it("should fetch the movies from a file") {
      Given("a json with a list of movies")
      When("we fetch the movies for an existing userId")
      val listOfMoviesByUserId = Movie.loadMoviesByUserId("1")

      Then("we get the list of movies the user has access to")
      listOfMoviesByUserId.size should equal (2)
      listOfMoviesByUserId(0).title should equal("Clerks")
      listOfMoviesByUserId(0).year should equal(1994)
      listOfMoviesByUserId(1).title should equal("Ghostbusters")
      listOfMoviesByUserId(1).year should equal(1984)
    }

    it("should fetch an empty list when the userId does not exist") {
      Given("a json with a list of movies")
      When("we fetch the movies for a non existing userId")
      val listOfMoviesByUserId = Movie.loadMoviesByUserId("99")

      Then("we get an empty list")
      listOfMoviesByUserId.size should equal (0)
    }
  }
}

import org.ardlema.StreamingUser
import org.scalatest.{GivenWhenThen, ShouldMatchers, FunSpec}

class StreamingUserTests
  extends FunSpec
  with ShouldMatchers
  with GivenWhenThen {

  describe("The streaming user") {
    it("should not get the movies from the cache the first time we fetch the movies") {
      Given("an empty cache")
      val myStreamingUser = new StreamingUser("1", "alberto")
      When("we fetch the movies")
      val moviesAvailableForAlberto = myStreamingUser.movies
      Then("the value is not retrieved from the cache")


    }

    it("should get the values from the cache the second time we fetch an element") {
      Given("a cache filled with an element")
      When("we fetch a value")
      Then("the value is retrieved from the cache")
    }
  }

}

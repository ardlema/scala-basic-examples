import org.scalatest.{GivenWhenThen, ShouldMatchers, FunSpec}
import org.ardlema.utils.Http

class UsersApi {
  def getUsers = Http.get("http://myserver.com/getUsers")
}

trait UsersApiMock extends UsersApi {
  override def getUsers = "<response><userId>1</userId></response>"
}

class UsersApiTests
  extends FunSpec
  with ShouldMatchers
  with GivenWhenThen {
  describe("UsersApi") {
    it("should return from the API"){
      Given("A users api class which mix in a UsersApiMock")
      val usersApi = new UsersApi with UsersApiMock
      When("We get the users from the users Api")
      val response = usersApi.getUsers
      Then("The response should be the mocked response")
      response should be ("<response><userId>1</userId></response>")
    }
  }
}


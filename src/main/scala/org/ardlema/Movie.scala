package org.ardlema

import net.liftweb.json._
import scala.io.Source._

case class Movie(title: String, year: Int)
case class Permission(userId: String, movies: List[Movie])

object Movie {
  val filePath = "src/main/resources/movies.json"
  implicit val formats = DefaultFormats

  def loadMoviesByUserId(userId: String) = {
    val moviesJsonContent = fromFile(filePath).mkString
    val parsedPermissions = parse(moviesJsonContent)
    val permissionElements = parsedPermissions.children.map(_.extract[Permission])
    val permissionsElementsFilterById = filterPermissionsById(permissionElements, userId)
    permissionsElementsFilterById size match {
      case 0 => List()
      case _ => permissionsElementsFilterById(0).movies
    }
  }

  def filterPermissionsById(permissionElements: List[Permission], userId: String) = {
    permissionElements.filter(permission => permission.userId.equals(userId))
  }
}

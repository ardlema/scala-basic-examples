package org.ardlema

package org.ardlema.scalaintro



object PatternMatching {


  case class Name(name: String, surname: String)

  case class Footballer(name: Name, age: Int, previousTeams: List[String] = List())

  def isRealMadridCandidate(footballer: Footballer) = footballer match {
    case Footballer(_, _, teams) if teams contains "Barcelona" => false
    case Footballer(Name(firstName,_), _, _) if firstName.endsWith("inho") => true
    case Footballer(Name(_,"zidane"), _, _) => true
    case Footballer(_, age, _) if age > 35 => false
    case _ => false
  }

  def main(args: Array[String]) {

    val messi = Footballer(Name("leo", "messi"), 26, List("Barcelona"))
    val brasileiro = Footballer(Name("paulinho", "oulinho"), 22, List("Santos"))
    val enzozidane = Footballer(Name("enzo","zidane"), 19)
    val julioIglesias = Footballer(Name("julio","iglesias"), Int.MaxValue)


    println("Messi -> "+isRealMadridCandidate(messi))
    println("Paulinho -> "+isRealMadridCandidate(brasileiro))
    println("Enzo zidane -> "+isRealMadridCandidate(enzozidane))
    println("Julio Iglesias -> "+isRealMadridCandidate(julioIglesias))
  }

  sealed abstract class LogMessage
  case class StringMessage(message:String) extends LogMessage
  case class ExceptionMessage(exception:Throwable) extends LogMessage
  case class BothMessage(message:String, exception:Throwable) extends LogMessage

  class Logger {
    def debug(l:LogMessage) = log(10,l)
    def info(l:LogMessage) = log(5,l)
    def error(l:LogMessage) = log(1,l)

    def log(level:Int, l:LogMessage):Unit = l match  {
      case StringMessage(msg) => println(msg)
      case ExceptionMessage(exception:Error) => exception.printStackTrace
      case ExceptionMessage(ex) => println(ex.toString)
    }
  }

}

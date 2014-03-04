package org.ardlema

case class TestCaseClass(name: String, surname: String)

class SimpleClass(var name:String, var surname: String)

object ClassVersusCaseClass {
  def main(args: Array[String]) {
    val testCaseClass = TestCaseClass("alberto", "rodriguez")
    val testCaseNameValue = testCaseClass.name
    val testCaseSurnameValue = testCaseClass.surname
    println(s"Nombre: $testCaseNameValue - Apellido: $testCaseSurnameValue")
    
    val simpleClass = new SimpleClass("pepe","perez")
    val simpleClassNameValue = simpleClass.name
    val simpleClassSurnameValue = simpleClass.surname
    println(s"Nombre: $simpleClassNameValue - Apellido: $simpleClassSurnameValue")

  }
}


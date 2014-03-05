package org.ardlema

class Animal
class Cat extends Animal

class Group[+A] (val list: List[A])

object VarianceExamples {
  def main(args: Array[String]) {
    val groupOfCats: Group[Cat] = new Group(List(new Cat))
    val groupOfAnimals: Group[Animal] = new Group(List(new Animal))

    val groupOfAnimalFromGroupOfCats: Group[Animal] = groupOfCats
    //val groupOfCatsFromGroupOfAnimals: Group[Cat] = groupOfAnimals
  }
}
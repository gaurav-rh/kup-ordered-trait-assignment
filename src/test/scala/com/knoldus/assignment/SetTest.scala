package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class SetTest extends AnyFlatSpec {
  val emptySetObject = new EmptySet[Number]
  val one: Number = Number(1)
  val zero: Number = Number(0)
  val four: Number = Number(4)
  val ten: Number = Number(10)
  val five: Number = Number(5)
  val three: Number = Number(3)
  val nonEmptySetObject = new NonEmptySet[Number](five, emptySetObject.include(four), emptySetObject.include(one))

  "Condition" should "include element in EmptySet using incl method" in {
    val emptySet = emptySetObject.include(four).include(three)
    assert(emptySet.contains(four))
  }
  "condition" should "check weather the element is present in the set tree or not " in {
    val emptySet = emptySetObject.include(one).include(zero)
    assert(emptySet.contains(zero))
    assert(!emptySet.contains(ten))
  }
  "condition" should "check weather non empty set has value 5 " in {
    assert(nonEmptySetObject.contains(five))
  }

}
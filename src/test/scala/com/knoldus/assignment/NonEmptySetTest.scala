package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class NonEmptySetTest extends AnyFlatSpec {
  val emptySetObject = new EmptySet[Number]
  val one: Number = Number(1)
  val zero: Number = Number(0)
  val four: Number = Number(4)
  val ten: Number = Number(10)
  val five: Number = Number(5)
  val three: Number = Number(3)
  val nonEmptySetObject = new NonEmptySet[Number](five, emptySetObject.include(four), emptySetObject.include(one))

  "condition" should "check weather non empty set has value 5 " in {
    assert(nonEmptySetObject.contains(five))
  }
}

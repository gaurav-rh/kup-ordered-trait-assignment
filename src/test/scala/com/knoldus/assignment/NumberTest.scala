package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class NumberTest extends AnyFlatSpec {
  val one: Number = Number(1)
  val four: Number = Number(4)
  "condition" should "valid in small number" in {
    assert(one < four)
  }
  //assert(one < four == true)
  "condition" should "invalid in small number" in {
    assert(!(one > four))
  }
  "condition" should "invalid in equal number" in {
    assert(!(one > one))
  }
}

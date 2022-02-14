package com.knoldus.assignment

class NonEmptySet[A <: Ordered[A]](element: A, left: Set[A], right: Set[A]) extends Set[A] {
  def contains(value: A): Boolean = {
    if (value < element) left contains value
    else if (value > element) right contains value
    else value == element
  }


  def include(value: A): Set[A] = {
    if (value < element) new NonEmptySet(element, left include value, right)
    else if (value > element) new NonEmptySet(element, left, right include value)
    else this
  }
}


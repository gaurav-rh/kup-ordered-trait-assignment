package com.knoldus.assignment

class EmptySet[A <: Ordered[A]] extends Set[A] {
  def include(element: A): Set[A] = new NonEmptySet(element, new EmptySet[A], new EmptySet[A])

  def contains(value: A): Boolean = false
}

package com.knoldus.assignment

trait Set[A <: Ordered[A]] {
  def include(element: A): Set[A]

  def contains(value: A): Boolean
}
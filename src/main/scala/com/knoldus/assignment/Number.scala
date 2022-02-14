package com.knoldus.assignment

case class Number(element: Int) extends Ordered[Number] {
  def compare(that: Number): Int =
    if (this.element < that.element) -1
    else if (this.element > that.element) 1
    else 0
}
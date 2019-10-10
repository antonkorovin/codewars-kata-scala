package com.codewars.kyu7

import org.scalatest._

class HouseNumbersSumTest extends FlatSpec {
  private val Kata = HouseNumbersSum.Kata

  it should "work with example tests" in {
    assert(Kata.houseNumbersSum(Array[Int](5, 1, 2, 3, 0, 1, 5, 0, 2)) == 11)
    assert(Kata.houseNumbersSum(Array[Int](4, 2, 1, 6, 0)) == 13)
    assert(Kata.houseNumbersSum(Array[Int](4, 1, 2, 3, 0, 10, 2)) == 10)
    assert(Kata.houseNumbersSum(Array[Int](0, 1, 2, 3, 4, 5)) == 0)
  }
}
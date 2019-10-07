package com.codewars.kyu8

import org.scalatest.FunSuite

class SquareNSumTest extends FunSuite {

  private val Kata = SquareNSum.Kata

  test("Samples") {
    assert(Kata.squareSum(List(1, 2)) === 5)
    assert(Kata.squareSum(List(0, 3, 4, 5)) === 50)
  }
}
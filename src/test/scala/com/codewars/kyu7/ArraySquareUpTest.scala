package com.codewars.kyu7

import org.scalatest.FunSuite

class ArraySquareUpTest extends FunSuite {
  private val Kata = ArraySquareUp.Kata

  test("Example Tests") {
    assert(Kata.squareUp(2) == List(0, 1, 2, 1))
    assert(Kata.squareUp(3) == List(0, 0, 1, 0, 2, 1, 3, 2, 1))
    assert(Kata.squareUp(4) == List(0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1))
  }
}

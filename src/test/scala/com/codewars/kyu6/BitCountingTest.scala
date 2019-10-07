package com.codewars.kyu6

import org.scalatest.FunSuite

class BitCountingTest extends FunSuite {

  private val Kata = BitCounting.Kata

  test("Samples") {
    assert(Kata.countBits(0)  === 0)
    assert(Kata.countBits(4)  === 1)
    assert(Kata.countBits(7)  === 3)
    assert(Kata.countBits(9)  === 2)
    assert(Kata.countBits(10) === 2)
  }
}
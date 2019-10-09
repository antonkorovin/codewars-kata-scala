package com.codewars.kyu7

import org.scalatest.FunSuite

import com.codewars.kyu7.ForcingAnOption.Kata._

class ForcingAnOptionTest extends FunSuite {

  private def f(x: Int): Int = x + 5

  test("f is expecting an Int, but I have an Option[Int]...") {
    assert(f(Some(42)) === 47)
    assert(f(Some(-35)) === -30)
    assert(f(Option.empty[Int]) === 5)
  }
}
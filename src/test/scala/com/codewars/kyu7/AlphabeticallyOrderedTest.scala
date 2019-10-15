package com.codewars.kyu7

import org.scalatest._

class AlphabeticallyOrderedTest extends FlatSpec with Matchers {

  private val Solution = AlphabeticallyOrdered.Kata

  "isAlphabetic" should "return true for strings in alphabetical order" in {
    assert(!Solution.isAlphabetic("asd"))
    assert(!Solution.isAlphabetic("codewars"))
    assert(Solution.isAlphabetic("door"))
    assert(Solution.isAlphabetic("cell"))
    assert(Solution.isAlphabetic("z"))
    assert(Solution.isAlphabetic(""))
  }
}

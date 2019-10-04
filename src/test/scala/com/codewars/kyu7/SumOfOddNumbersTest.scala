package com.codewars.kyu7

import org.scalatest.{FlatSpec, Matchers}

class SumOfOddNumbersTest extends FlatSpec with Matchers {

  private val Solution = SumOfOddNumbers.Solution

  "rowSumOddNumbers(1)" should "return 1" in {
    Solution.rowSumOddNumbers(1) should be(1)
  }
  "rowSumOddNumbers(2)" should "return 8" in {
    Solution.rowSumOddNumbers(2) should be(8)
  }
  "rowSumOddNumbers(13)" should "return 2197" in {
    Solution.rowSumOddNumbers(13) should be(2197)
  }
  "rowSumOddNumbers(19)" should "return 6859" in {
    Solution.rowSumOddNumbers(19) should be(6859)
  }
  "rowSumOddNumbers(41)" should "return 68921" in {
    Solution.rowSumOddNumbers(41) should be(68921)
  }
}

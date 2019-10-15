package com.codewars.kyu7

import org.scalatest._

class MaximumLengthDifferenceTest extends FlatSpec with Matchers {

  private val Kata = MaximumLengthDifference.Kata

  val a1 = List("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
  val a2 = List("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
  val result = 13

  s"mxdiflg($a1, $a2)" should "return 13" in {
    Kata.mxdiflg(a1, a2) should be (13)
  }
}
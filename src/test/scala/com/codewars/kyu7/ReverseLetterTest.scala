package com.codewars.kyu7

import org.scalatest._


class ReverseLetterTest extends FlatSpec with Matchers {
  private val Letter = ReverseLetter.Kata

  "reverseLetter(\"krishan\")" should "\"nahsirk\"" in {
    Letter.reverseLetter("krishan") should be ("nahsirk")
  }
  "reverseLetter(\"ultr53o?n\")" should "\"nortlu\"" in {
    Letter.reverseLetter("ultr53o?n") should be ("nortlu")
  }
  "reverseLetter(\"ab23c\")" should "\"cba\"" in {
    Letter.reverseLetter("ab23c") should be ("cba")
  }
  "reverseLetter(\"krish21an\")" should "\"nahsirk\"" in {
    Letter.reverseLetter("krish21an") should be ("nahsirk")
  }
  "reverseLetter(\"1234\")" should "\"\"" in {
    Letter.reverseLetter("1234") should be ("")
  }
}
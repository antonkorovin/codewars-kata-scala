package com.codewars.kyu7

import org.scalatest.{FlatSpec, Matchers}

class GetTheMiddleCharacterTest extends FlatSpec with Matchers {

  private val Kata = GetTheMiddleCharacter.Kata

  val tests = List(
    ("test", "es"),
    ("testing", "t"),
    ("middle", "dd"),
    ("A", "A"),
    ("of", "of")
  )

  tests.foreach {
    case (input, expected) =>
      s"middle($input)" should s"return $expected" in {
        Kata.middle(input) should be(expected)
      }
  }
}
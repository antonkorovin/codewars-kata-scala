package com.codewars.kyu7

import org.scalatest._

class YouAreASquareTest extends FlatSpec with Matchers {
  private val Sol = YouAreASquare.Sol

  val tests = List(
    (-1,  false),
    (0,   true),
    (3,   false),
    (4,   true),
    (25,  true),
    (26,  false)
  )

  tests.foreach {
    case (input, expected) =>
      s"isSquare($input)" should s"return $expected" in {
        Sol.isSquare(input) should be (expected)
      }
  }
}
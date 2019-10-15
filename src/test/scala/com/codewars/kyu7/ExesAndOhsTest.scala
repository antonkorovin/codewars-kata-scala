package com.codewars.kyu7

import org.scalatest._

class ExesAndOhsTest extends FlatSpec with Matchers {

  private val Kata = ExesAndOhs.Kata

  val tests = List(
    ("xo", true),
    ("xo0", true),
    ("xxxoo", false)
  )

  tests.foreach {
    case (input, expected) =>
      s"xo($input)" should s"return $expected" in {
        Kata.xo(input) should be (expected)
      }
  }
}
package com.codewars.kyu7

import org.scalatest._

class CountingTotalOccurrenceOfSpecificDigitsTest extends FlatSpec with Matchers {

  private val Kata = CountingTotalOccurrenceOfSpecificDigits.Kata

  val tests = List(
    (List(1, 1, 2, 3, 1, 2, 3, 4), List(1, 3), List((1, 3), (3, 2))),
    (List(-18, -31, 81, -19, 111, -888), List(1, 8, 4), List((1, 7), (8, 5), (4, 0))),
    (List(-77, -65, 56, -79, 6666, 222), List(1, 8, 4), List((1, 0), (8, 0), (4, 0))),
    (List(), List(1, 8, 4), List((1, 0), (8, 0), (4, 0)))
  )

  tests.foreach {
    case (intsList, digitsList, expected) =>
      s"countSpecDigits($intsList, $digitsList)" should s"return $expected" in {
        Kata.countSpecDigits(intsList, digitsList) should be (expected)
      }
  }
}
package com.codewars.kyu7

import org.scalatest._

class AlphabeticalAdditionTest  extends FlatSpec with Matchers {
  private val Kata = AlphabeticalAddition.Kata

  List(
    (List('a', 'b', 'c'), 'f'),
    (List('z'), 'z'),
    (List('a', 'b'), 'c'),
    (List('c'), 'c'),
    (List('z', 'a'), 'a'),
    (List('y', 'c', 'b'), 'd'),
    (List[Char](), 'z')
  ).foreach {
    case (input, expected) =>
      s"addLetters($input)" should s"return $expected" in {
        Kata.addLetters(input) shouldBe expected
      }
  }
}
package com.codewars.kyu7

import org.scalatest.FunSuite

class SortByLastCharTest extends FunSuite {

  private val Kata = SortByLastChar.Kata

  test("Samples") {
    assert(Kata.last("man i need a taxi up to ubud") === List("a", "need", "ubud", "i", "taxi", "man", "to", "up"))
    assert(Kata.last("what time are we climbing up the volcano") === List("time", "are", "we", "the", "climbing", "volcano", "up", "what"))
    assert(Kata.last("take me to semynak") === List("take", "me", "semynak", "to"))
    assert(Kata.last("massage yes massage yes massage") === List("massage", "massage", "massage", "yes", "yes"))
    assert(Kata.last("take bintang and a dance please") === List("a", "and", "take", "dance", "please", "bintang"))
  }
}
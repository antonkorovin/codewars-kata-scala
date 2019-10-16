package com.codewars.kyu6

import org.scalatest.FunSuite

class BackspacesInStringTest extends FunSuite {

  private val Kata = BackspacesInString.Kata

  test("Samples") {
    assert(Kata.cleanString("abc#d##c")     === "ac")
    assert(Kata.cleanString("abc####d##c#") === "" )
    assert(Kata.cleanString("#######")      === "" )
    assert(Kata.cleanString("")             === "" )
  }
}
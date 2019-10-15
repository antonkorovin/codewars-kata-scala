package com.codewars.kyu7

import org.scalatest._

class PartsOfAListTest extends FunSuite {


  private val Kata = PartsOfAList.Kata

  test("Samples") {
    assert(
      Kata.partList(List("I", "wish", "I", "hadn't", "come"))
      ===
      List(("I", "wish I hadn't come"), ("I wish", "I hadn't come"), ("I wish I", "hadn't come"), ("I wish I hadn't", "come"))
    )
    assert(
      Kata.partList(List("cdIw", "tzIy", "xDu", "rThG"))
      ===
      List(("cdIw", "tzIy xDu rThG"), ("cdIw tzIy", "xDu rThG"), ("cdIw tzIy xDu", "rThG"))
    )
    assert(
      Kata.partList(List("vJQ", "anj", "mQDq", "sOZ"))
      ===
      List(("vJQ", "anj mQDq sOZ"), ("vJQ anj", "mQDq sOZ"), ("vJQ anj mQDq", "sOZ"))
    )
  }
}
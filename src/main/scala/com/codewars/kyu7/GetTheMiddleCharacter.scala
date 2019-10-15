package com.codewars.kyu7

object GetTheMiddleCharacter {

  object Kata {
    // You are going to be given a word.
    // Your job is to return the middle character of the word.
    // If the word's length is odd, return the middle character.
    // If the word's length is even, return the middle 2 characters.


    def middle(s: String): String = {
      s.length match {
        case n if n <= 2 => s
        case n if n % 2 == 0 => s.slice(n / 2 - 1, n / 2 + 1)
        case n => s.charAt(n / 2).toString
      }
    }
  }

}

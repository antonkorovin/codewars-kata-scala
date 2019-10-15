package com.codewars.kyu7

object ReverseLetter {
  object Kata {
    // Given a string str, reverse it omitting all non-alphabetic characters.
    //
    // Example
    // For str = "krishan", the output should be "nahsirk".
    // For str = "ultr53o?n", the output should be "nortlu".

    def reverseLetter(str: String): String = {
      str.filter(ch => Character.isAlphabetic(ch)).reverse
    }
  }
}

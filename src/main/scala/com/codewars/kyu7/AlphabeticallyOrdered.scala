package com.codewars.kyu7

object AlphabeticallyOrdered {

  object Kata {
    // Your task is very simple. Just write a function isAlphabetic(s),
    // which takes an input string s in lowercase and returns true/false
    // depending on whether the string is in alphabetical order or not.
    //
    // For example, isAlphabetic('kata') is False as 'a' comes after 'k', but isAlphabetic('ant') is True.

    def isAlphabetic(s: String): Boolean = {
      if (s.lengthCompare(1) <= 0) {
        true
      } else {
        s.toList.sliding(2).forall {
          case first :: second :: Nil =>
            first <= second

            // Handle "match may not be exhaustive" warning
          case _ => false
        }
      }
    }
  }

}

package com.codewars.kyu7

object VowelCount {

  // Return the number (count) of vowels in the given string.
  // We will consider a, e, i, o, and u as vowels for this Kata.
  // The input string will only consist of lower case letters and/or spaces.
  object Kata {
    def getCount(inputStr: String): Int = {
      inputStr.count(isVowel)
    }

    private def isVowel(ch: Char): Boolean = ch match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => true
      case _ => false
    }
  }

}

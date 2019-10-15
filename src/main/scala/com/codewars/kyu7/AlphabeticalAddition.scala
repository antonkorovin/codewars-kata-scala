package com.codewars.kyu7

object AlphabeticalAddition {

  object Kata {
    def addLetters(letters: List[Char]): Char = {
      def toCode(ch: Char): Int = ch - 'a' + 1
      def fromCode(i: Int): Char = ('a' + (i - 1)).toChar

      // ////////////////////

      val sum: Int = letters.map(toCode).sum

      val offset = sum % toCode('z')
      if (offset > 0) {
        fromCode(offset)
      } else {
        'z'
      }
    }
  }

}

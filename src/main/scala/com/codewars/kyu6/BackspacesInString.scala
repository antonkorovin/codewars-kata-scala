package com.codewars.kyu6

import scala.annotation.tailrec

object BackspacesInString {

  // Assume "#" is like a backspace in string.
  // This means that string "a#bc#d" actually is "bd"
  //
  // Your task is to process a string with "#" symbols.

  object Kata {
    def cleanString(s: String): String = {
      @tailrec
      def cleanRec(xs: List[Char], backspaces: Int, result: List[Char]): List[Char] = {
        xs match {
          case '#' :: tail =>
            cleanRec(tail, backspaces + 1, result)

          case c :: tail if backspaces == 0 =>
            cleanRec(tail, 0, c :: result)

          case _ :: tail =>
            cleanRec(tail, backspaces - 1, result)

          case Nil =>
            result
        }
      }

      // //////////////////////////////

      cleanRec(s.toList.reverse, 0, List.empty).mkString("")
    }
  }

}

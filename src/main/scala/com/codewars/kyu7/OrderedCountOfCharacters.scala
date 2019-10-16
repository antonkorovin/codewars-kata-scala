package com.codewars.kyu7

import scala.annotation.tailrec

object OrderedCountOfCharacters {
  // Count the number of occurrences of each character and return it as a list of tuples in order of appearance.
  // Example:
  // Kata.orderedCount("abracadabra") == List(('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1))

  object Kata {
    type ResultList = List[(Char, Int)]

    def orderedCount(chars: String): ResultList = {
      @tailrec
      def countRec(rest: List[Char], counted: ResultList): ResultList = {
        rest match {
          case head :: tail =>
            val count = 1 + tail.count(_ == head)
            val filtered = tail.filter(_ != head)

            countRec(
              filtered,
              (head, count) :: counted
            )

          case Nil =>
            counted
        }
      }

      // //////////////////////////////

      countRec(
        chars.toList,
        Nil
      ).reverse
    }
  }
}

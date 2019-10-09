package com.codewars.kyu7

import scala.annotation.tailrec

object CountingTotalOccurrenceOfSpecificDigits {
  // We need a method in the List Class that may count specific digits
  // from a given list of integers.
  // This marked digits will be given in a second list.
  // The method .count_spec_digits()/.countSpecDigits() will accept two arguments,
  // a list of an uncertain amount of integers integers_lists/integersLists
  // (and of an uncertain amount of digits, too) and a second list, digits_list/digitsList that
  // has the specific digits to count which length cannot be be longer than 10 (It's obvious, we've got ten digits).
  // The method will output a list of tuples, each tuple having two elements,
  // the first one will be a digit to count, and second one,
  // its corresponding total frequency in all the integers of the first list.
  // This list of tuples should be ordered with the same order that the digits have in digitsList


  object Kata {
    def countSpecDigits(intsList: List[Int], digitsList: List[Int]): List[(Int, Int)] = ???

    private def splitToDigits(n: Int): List[Int] = {

      // ////////////////////

      @tailrec
      def splitRec(d: Int, digits: List[Int]): List[Int] = {
        if (d == 0) {
          if (digits.isEmpty) {
            List(0)
          } else {
            digits
          }
        } else {
          val nextDigit = d % 10

          splitRec((d - nextDigit) / 10, nextDigit :: digits)
        }
      }

      // ////////////////////

      splitRec(n.abs, List.empty)
    }
  }

}

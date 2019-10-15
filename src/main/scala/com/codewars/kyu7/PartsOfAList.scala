package com.codewars.kyu7

import scala.annotation.tailrec

object PartsOfAList {

  // Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
  //
  // Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
  // Each part will be in a string
  // Elements of a pair must be in the same order as in the original array.
  // Examples of returns in different languages:
  // a = ["az", "toto", "picaro", "zone", "kiwi"] -->
  //
  // [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]

  object Kata {
    type ResultList = List[(String, String)]

    def partList(xs: List[String]): ResultList = {
      @tailrec
      def concatRec(previous: String, rest: List[String], result: ResultList): ResultList = {
        rest match {
          case head :: tail =>
            val next = s"$previous $head"
            concatRec(
              next,
              tail,
              (previous -> rest.mkString(" ")) :: result
            )

          case Nil =>
            result
        }
      }

      // //////////////////////////////

      concatRec(
        xs.head,
        xs.tail,
        List.empty
      ).reverse
    }
  }

}

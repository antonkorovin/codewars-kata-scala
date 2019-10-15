package com.codewars.kyu7

object MaximumLengthDifference {

  object Kata {

    def mxdiflg(a1: List[String], a2: List[String]): Int = {
      if (a1.nonEmpty && a2.nonEmpty) {
        val lengths = for {
          s1 <- a1
          s2 <- a2
        } yield {
          (s1.length - s2.length).abs
        }

        lengths.max
      } else {
        -1
      }
    }
  }

}

package com.codewars.kyu8

object SquareNSum {

  object Kata {

    def squareSum(xs: List[Int]): Int = xs.foldLeft(0) {
      (s, n) => s + n * n
    }
  }

}

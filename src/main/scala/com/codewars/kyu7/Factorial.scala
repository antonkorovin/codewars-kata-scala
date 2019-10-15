package com.codewars.kyu7

import scala.annotation.tailrec

object Factorial {
  object Kata {
    def !(n: Int): BigInt = {
      (BigInt(1) to BigInt(n)).product
    }
  }


  object Kata2 {
    def !(n: Int): BigInt = {
      @tailrec
      def factorial(i: Int, res: BigInt): BigInt = {
        if (i > 0) {
          factorial(i - 1, res * i)
        } else {
          res
        }
      }

      factorial(n, 1)
    }
  }
}

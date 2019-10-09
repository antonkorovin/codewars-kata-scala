package com.codewars.kyu7

object YouAreASquare {

  object Sol {

    def isSquare(x: Int): Boolean = {
      x match {
        case n if n < 0 => false

        case p =>
          val s = Math.sqrt(p).toInt
          s * s == p
      }
    }
  }

}

package com.codewars.kyu7

object ExesAndOhs {
  object Kata {
    def xo(str: String): Boolean = {
      str.count(_.toLower == 'x') == str.count(_.toLower == 'o')
    }
  }
}

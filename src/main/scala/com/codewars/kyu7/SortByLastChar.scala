package com.codewars.kyu7

object SortByLastChar {
  object Kata {
    def last(s: String): Array[String] = {
      s.split(' ')
       .sortWith(_.last < _.last)
    }
  }
}

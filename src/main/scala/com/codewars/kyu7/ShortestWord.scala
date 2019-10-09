package com.codewars.kyu7

object ShortestWord {

  object Shortest {

    def findShort(str: String): Int = {
      str.split(' ').map(_.length).min
    }
  }

}

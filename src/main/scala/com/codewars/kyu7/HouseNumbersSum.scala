package com.codewars.kyu7

object HouseNumbersSum {
  object Kata {
    def houseNumbersSum(inputArray: Array[Int]): Int = {
      inputArray.takeWhile(_ != 0).sum
    }
  }
}

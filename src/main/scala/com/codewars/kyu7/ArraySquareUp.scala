package com.codewars.kyu7

object ArraySquareUp {

  // Given an integer n greater than or equal to 0,
  // create and return an array with the following pattern:
  //
  // squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
  // squareUp(2) => [0, 1, 2, 1]
  // squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

  object Kata {
    def squareUp(n: Int): List[Int] = {
      (1 to n).flatMap {
        k =>
          List.fill(n - k)(0) ::: (k to 1 by -1).toList
      }.toList
    }
  }

}

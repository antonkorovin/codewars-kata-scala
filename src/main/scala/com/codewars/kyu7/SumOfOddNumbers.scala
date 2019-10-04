package com.codewars.kyu7

object SumOfOddNumbers {
  // Given the triangle of consecutive odd numbers:
  //
  //               1
  //            3     5
  //         7     9    11
  //     13    15    17    19
  //  21    23    25    27    29
  //  ...
  // Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
  //
  // rowSumOddNumbers(1) // 1
  // rowSumOddNumbers(2) // 3 + 5 = 8

  object Solution {
    def rowSumOddNumbers(n: Long): Long = {
      require(n >= 1)

      val first = firstInRow(n)
      val last = lastInRow(first, n)

      (first to(last, step = 2)).sum
    }

    private def firstInRow(rowNumber: Long): Long = {
      (rowNumber * (rowNumber - 1)) + 1
    }


    private def lastInRow(first: Long, rowNumber: Long): Long = {
      first + 2 * (rowNumber - 1)
    }
  }


}

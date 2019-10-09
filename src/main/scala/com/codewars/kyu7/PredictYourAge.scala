package com.codewars.kyu7

object PredictYourAge {
  object Predicter {
    def predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int = {
      predictAgeBySeq(
        age1
        , age2
        , age3
        , age4
        , age5
        , age6
        , age7
        , age8
      )
    }

    private def predictAgeBySeq(ages: Int*): Int = {
      val sum: Int = ages.map(x => x * x).sum

      Math.sqrt(
        sum
      ).toInt / 2
    }
  }
}

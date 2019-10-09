package com.codewars.kyu7

import org.scalatest._

class PredictYourAgeTest extends FlatSpec with Matchers {

  private val Predicter = PredictYourAge.Predicter

  "predictAge(65,60,75,55,60,63,64,45)" should "return 86" in {
    Predicter.predictAge(65,60,75,55,60,63,64,45) should be (86)
  }
  "predictAge(32,54,76,65,34,63,64,45)" should "return 79" in {
    Predicter.predictAge(32,54,76,65,34,63,64,45) should be (79)
  }

}
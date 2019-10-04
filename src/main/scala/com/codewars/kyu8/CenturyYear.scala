package com.codewars.kyu8

object CenturyYear {
  def centuryFromYear(year: Int): Int = {
    val additional = if ((year % 100) == 0) 0 else 1
    (year / 100) + additional
  }
}

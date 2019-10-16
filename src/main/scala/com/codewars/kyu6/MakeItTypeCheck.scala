package com.codewars.kyu6

import scala.language.implicitConversions

object MakeItTypeCheck {
  trait ImplicitConversations {
    implicit def int2boolean(i: Int): Boolean = i != 0

    implicit def boolean2int(b: Boolean): Int = if (b) 1 else 0
  }

  object Kata extends ImplicitConversations
}

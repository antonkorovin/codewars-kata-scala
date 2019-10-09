package com.codewars.kyu7

import scala.language.implicitConversions

object ForcingAnOption {

  object Kata extends ImplicitOptionExtraction


  trait ImplicitOptionExtraction {

    implicit def extractValue(t: Option[Int]): Int = {
      t match {
        case Some(value) => value
        case None => 0
      }
    }
  }

}

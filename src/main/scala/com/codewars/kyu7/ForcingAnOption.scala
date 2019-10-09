package com.codewars.kyu7

object ForcingAnOption {

  object Kata extends ImplicitOptionExtraction


  trait ImplicitOptionExtraction {

    import scala.languageFeature.implicitConversions

    implicit def extractValue(t: Option[Int]): Int = {
      t match {
        case Some(value) => value
        case None => 0
      }
    }
  }

}

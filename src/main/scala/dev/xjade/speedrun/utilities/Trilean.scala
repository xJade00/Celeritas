package dev.xjade.speedrun.utilities

sealed abstract class Trilean(private val value: Boolean) {
  def &&(that: Trilean): Trilean = (this, that) match {
    case (True, True) => True
    case (False, _) => False
    case (_, False) => False
    case _ => Unknown
  }

  def ||(that: Trilean): Trilean = (this, that) match {
    case (False, False) => False
    case (True, _) => True
    case (_, True) => True
    case _ => Unknown
  }

  def unary_! : Trilean = this match {
    case True => False
    case False => True
    case Unknown => Unknown
  }
}

case object True extends Trilean(true)
case object False extends Trilean(false)
case object Unknown extends Trilean(null)
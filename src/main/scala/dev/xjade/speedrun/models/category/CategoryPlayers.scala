package dev.xjade.speedrun.models.category

sealed abstract class CategoryPlayers(amount: Int)

case class UpTo(amount: Int) extends CategoryPlayers(amount)
case class Exact(amount: Int) extends CategoryPlayers(amount)

package dev.xjade.speedrun.models.run

/** Represents a Player */
sealed abstract class Player

/** Represents a guest Player with only a name */
case class Guest(name: String) extends Player

/** Represents a registered Player with a name and a link to their profile */
case class User(name: String, id: String, link: String) extends Player



package dev.xjade.speedrun.models.run

import dev.xjade.speedrun.models.IDs.{GuestID, UserID}

/** Represents a Player */
sealed abstract class Player

/** Represents a guest Player with only a name */
case class Guest(name: GuestID) extends Player

/** Represents a registered Player with a name and a link to their profile */
case class User(name: String, id: UserID, link: String) extends Player



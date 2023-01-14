package dev.xjade.speedrun.models.run

import dev.xjade.speedrun.models.IDs.UserID

import java.util.Date

/** Represents the Status of a  */
sealed abstract class Status

case object New extends Status
case class Verified(examiner: UserID, verifiedDate: Option[Date]) extends Status
case class Rejected(examiner: UserID, reason: String) extends Status

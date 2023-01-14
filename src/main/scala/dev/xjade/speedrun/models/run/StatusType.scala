package dev.xjade.speedrun.models.run

/** Represents a status type. */
sealed trait StatusType

/** Represents that the run is just submitted. */
case object New extends StatusType

/** Represents that the run has been verified. */
case object Verified extends StatusType

/** Represents that the run has been rejected. */
case object Rejected extends StatusType
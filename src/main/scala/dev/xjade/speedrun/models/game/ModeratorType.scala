package dev.xjade.speedrun.models.game

/** A moderator type. */
sealed trait ModeratorType

/** Represents that a user is a Super Moderator. */
case object SuperModerator extends ModeratorType

/** Represents that a user is a Moderator. */
case object Moderator extends ModeratorType

/** Represents that a user is a Verifier. */
case object Verifier extends ModeratorType

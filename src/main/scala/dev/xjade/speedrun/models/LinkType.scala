package dev.xjade.speedrun.models

/** Holds various link types. */
object LinkType {
  /** Another type to reference for a link. */
  type LinkType = String

  /** A self referential link. */
  val SelfLink = "self"
  /** A link to a user's runs. */
  val UserRunsLink = "runs"
  /** A link to the games that a user moderates. */
  val UserGamesLink = "games"
  /** A link to the user's personal bests. */
  val UserPersonalBestsLink = "personal-bests"
}

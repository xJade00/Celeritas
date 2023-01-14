package dev.xjade.speedrun.models.raw

/**
 * Represents the raw data of category players.
 *
 * @param `type` The type. Up-to or exact.
 * @param value The amount of players.
 */
case class RawCategoriesPlayers(
  `type`: String,
  value: Int
)

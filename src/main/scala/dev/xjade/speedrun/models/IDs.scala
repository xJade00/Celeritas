package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.game.Game
import dev.xjade.speedrun.models.user.User

/**
 * Represents a bunch of different IDs for easy fetching of data.
 */
case object IDs {

  /**
   * Represents a [[User]] id.
   */
  type UserID = String

  /** Represents a [[Game]] id. */
  type GameID = String

  // TODO: Make documentation
  type GametypeID = String

  // TODO: Make documentation
  type PlatformID = String

  // TODO: Make documentation
  type RegionID = String

  // TODO: Make documentation
  type GenreID = String

  // TODO: Make documentation
  type EngineID = String

  // TODO: Make documentation
  type DeveloperID = String

  // TODO: Make documentation
  type PublisherID = String

  // TODO: Make documentation
  type RunID = String

  //  TODO: Make documentation
  type LevelID = String

  // TODO: Make documentation
  type CategoryID = String

  // TODO: Make documentation
  type VariableID = String

  // TODO: Make documentation
  type ValueID = String

}

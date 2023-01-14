package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.user.User

/**
 * Represents a bunch of different IDs for easy fetching of data.
 */
case object IDs {
  /**
   * Represents a [[User]] id.
   */
  type UserID = String
}

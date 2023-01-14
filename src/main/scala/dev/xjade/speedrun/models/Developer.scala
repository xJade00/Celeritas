package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.IDs.DeveloperID
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

/**
 * A developer of a game.
 *
 * @param id    The ID of the developer.
 * @param name  The name of the developer.
 * @param links The relevant links.
 */
case class Developer(
  id: DeveloperID,
  name: String,
  links: ObjectLinks
)

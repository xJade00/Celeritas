package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.IDs.GametypeID
import dev.xjade.speedrun.models.LinkType.LinkType
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

/**
 * A game type.
 *
 * @param id    The ID of the game type.
 * @param name  The name of the game type.
 * @param links Relevant links
 */
case class GameType(
  id: GametypeID,
  name: String,
  links: ObjectLinks
)

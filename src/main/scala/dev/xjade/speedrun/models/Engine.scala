package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.IDs.EngineID
import dev.xjade.speedrun.models.LinkType.LinkType
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

/**
 * The data of game engines.
 *
 * @param id    The ID of the engines.
 * @param name  The name of the engines.
 * @param links The relevant links.
 */
case class Engine(
  id: EngineID,
  name: String,
  links: ObjectLinks
)

package dev.xjade.speedrun.models.category

import dev.xjade.speedrun.models.IDs.CategoryID
import dev.xjade.speedrun.models.LinkType.LinkType

/**
 * The category of a game.
 *
 * @param id The ID of the category.
 * @param name The name of the category.
 * @param `type` The type of the category.
 * @param link The link to the category.
 * @param rules The rules of the category.
 * @param players The number of players in the category.
 */
case class Category(
  id: CategoryID,
  name: String,
  `type`: CategoryType,
  link: String,
  rules: String,
  players: CategoryPlayers,
  miscellaneous: Boolean,
  links: Map[LinkType, String]
)

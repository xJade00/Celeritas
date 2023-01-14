package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.IDs.GenreID
import dev.xjade.speedrun.models.LinkType.LinkType
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

/**
 * A game genre.
 *
 * @param id    The ID of the genre.
 * @param name  The name of the genre.
 * @param links Relevant links
 */
case class Genre(
  id: GenreID,
  name: String,
  links: ObjectLinks
)

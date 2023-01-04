package dev.xjade.speedrun.models.raw

/**
 * Raw genre data.
 *
 * @param id    The ID of the genre.
 * @param name  The name of the genre.
 * @param links Relevant links
 */
case class RawGenre(
                     id: String,
                     name: String,
                     links: Seq[RawURI]
                   )
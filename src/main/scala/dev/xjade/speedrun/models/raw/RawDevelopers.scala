package dev.xjade.speedrun.models.raw

/**
 * The raw data of game developers.
 *
 * @param id    The ID of the developer.
 * @param name  The name of the developer.
 * @param links The relevant links.
 */
case class RawDevelopers(
                          id: String,
                          name: String,
                          links: Seq[RawURI]
                        )

package dev.xjade.speedrun.models.raw

/**
 * The raw game type data.
 *
 * @param id    The ID of the game type.
 * @param name  The name of the game type.
 * @param links Relevant links.
 */
case class RawGameType(
                        id: String,
                        name: String,
                        links: Seq[RawURI]
                      )

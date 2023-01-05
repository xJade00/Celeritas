package dev.xjade.speedrun.models.raw

/**
 * Raw video data.
 *
 * @param text The text.
 * @param links Relevant links.
 */
case class RawVideos(
                      text: String,
                      links: Seq[RawURI]
                    )

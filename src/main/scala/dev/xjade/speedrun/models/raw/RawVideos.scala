package dev.xjade.speedrun.models.raw

case class RawVideos(
                      text: Option[String],
                      links: Seq[RawURI]
                    )

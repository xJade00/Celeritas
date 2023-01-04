package dev.xjade.speedrun.models.raw

case class RawRegion(
                      id: String,
                      name: String,
                      links: Seq[RawURI]
                    )
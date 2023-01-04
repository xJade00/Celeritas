package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

case class RawSeries(
                      id: String,
                      names: RawNames,
                      abbreviation: String,
                      weblink: String,
                      moderators: Map[String, String],
                      created: String,
                      assets: RawAssets,
                      links: Seq[RawURI]
                    )

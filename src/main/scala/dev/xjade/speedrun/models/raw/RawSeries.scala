package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

/**
 * Raw series data.
 *
 * @param id           The ID of the series.
 * @param names        Names of the series.
 * @param abbreviation Abbreviation of the series.
 * @param weblink      Weblink to the series.
 * @param moderators   A list of moderators and their position.
 * @param created      When the series was created.
 * @param assets       Raw asset data.
 * @param links        Relevant links.
 */
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

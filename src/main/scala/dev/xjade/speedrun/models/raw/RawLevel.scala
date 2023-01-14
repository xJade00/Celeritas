package dev.xjade.speedrun.models.raw

/**
 * The raw level data.
 *
 * @param id      The ID of the level.
 * @param name    The name of the level.
 * @param weblink The weblink of the level.
 * @param rules   The rules of the level.
 * @param links   Relevant links.
 */
case class RawLevel(
  id: String,
  name: String,
  weblink: String,
  rules: String,
  links: Seq[RawURI]
)

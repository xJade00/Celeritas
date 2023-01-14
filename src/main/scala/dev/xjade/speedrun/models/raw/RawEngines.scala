package dev.xjade.speedrun.models.raw

/**
 * The raw data of game engines.
 *
 * @param id    The ID of the engines.
 * @param name  The name of the engines.
 * @param links The relevant links.
 */
case class RawEngines(
  id: String,
  name: String,
  links: Seq[RawURI]
)

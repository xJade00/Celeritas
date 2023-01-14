package dev.xjade.speedrun.models.raw

/**
 * The raw guest data.
 *
 * @param name  The name of the guest.
 * @param links Relevant links
 */
case class RawGuests(
  name: String,
  links: Seq[RawURI]
)

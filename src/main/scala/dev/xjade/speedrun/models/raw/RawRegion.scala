package dev.xjade.speedrun.models.raw

/**
 * Raw region data.
 *
 * @param id    The ID of the region.
 * @param name  The name of the reigon.
 * @param links Relevant links.
 */
case class RawRegion(
  id: String,
  name: String,
  links: Seq[RawURI]
)

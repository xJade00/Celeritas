package dev.xjade.speedrun.models.regions

/**
 * Represents the region data of a location.
 *
 * @param code The code of the region.
 * @param names The names of the region.
 */
case class RegionData(code: String, names: Map[String, String])

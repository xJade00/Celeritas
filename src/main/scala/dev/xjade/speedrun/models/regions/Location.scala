package dev.xjade.speedrun.models.regions

/**
 * The location of a [[dev.xjade.speedrun.models.user.User]].
 *
 * @param country The country of the user.
 * @param region The general region of the user.
 */
case class Location(
  country: RegionData,
  region: RegionData
)

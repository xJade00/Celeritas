package dev.xjade.speedrun.models.run

import dev.xjade.speedrun.models.IDs.RegionID

/**
 * System data.
 *
 * @param platform The platform name.
 * @param emulated If it's emulated.
 * @param region   The region ID of the system.
 */
case class System(
  platform: String,
  emulated: Boolean,
  region: Option[RegionID]
)

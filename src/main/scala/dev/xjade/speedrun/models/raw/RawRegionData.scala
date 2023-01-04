package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

/**
 * Even deeper region data.
 *
 * @param code  A region code.
 * @param names Various names of the region.
 */
case class RawRegionData(
                          code: String,
                          names: RawNames
                        )

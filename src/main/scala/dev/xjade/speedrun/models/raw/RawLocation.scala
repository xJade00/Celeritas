package dev.xjade.speedrun.models.raw

/**
 * Raw location data.
 *
 * @param country The country location data.
 * @param region  The region location data.
 */
case class RawLocation(
                        country: RawRegionData,
                        region: RawRegionData
                      )
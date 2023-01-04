package dev.xjade.speedrun.models.raw

/**
 * Raw system data.
 *
 * @param platform The platform.
 * @param emulated If it's emulated.
 * @param region   The region of the system.
 */
case class RawSystem(
                      platform: String,
                      emulated: Boolean,
                      region: String
                    )

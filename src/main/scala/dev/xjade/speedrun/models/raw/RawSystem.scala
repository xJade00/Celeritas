package dev.xjade.speedrun.models.raw

case class RawSystem(
                      platform: String,
                      emulated: Boolean,
                      region: Option[String]
                    )

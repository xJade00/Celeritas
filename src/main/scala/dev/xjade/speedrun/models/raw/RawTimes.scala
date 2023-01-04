package dev.xjade.speedrun.models.raw

case class RawTimes(
                     primary: Option[String],
                     primary_t: Int,
                     realtime: Option[String],
                     realtime_t: Int,
                     realtime_noloads: Option[String],
                     realtime_noloads_t: Int,
                     ingame: Option[String],
                     ingame_t: Int
                   )

package dev.xjade.speedrun.models.raw


/**
 * Raw timing data.
 *
 * @param primary            Primary timing.
 * @param primary_t          Primary timing int.
 * @param realtime           Realtime timing.
 * @param realtime_t         Realtime timing int.
 * @param realtime_noloads   Real time no loads timing.
 * @param realtime_noloads_t Realtime no loads timing int.
 * @param ingame             Ingame timing.
 * @param ingame_t           Ingame timing int.
 */
case class RawTimes(
                     primary: String,
                     primary_t: Int,
                     realtime: String,
                     realtime_t: Int,
                     realtime_noloads: String,
                     realtime_noloads_t: Int,
                     ingame: String,
                     ingame_t: Int
                   )

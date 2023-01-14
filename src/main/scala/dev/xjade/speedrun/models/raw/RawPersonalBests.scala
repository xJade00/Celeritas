package dev.xjade.speedrun.models.raw

/**
 * Raw data for personal bests.
 *
 * @param place The place of the run.
 * @param run   The raw run data.
 */
case class RawPersonalBests(
  place: Int,
  run: RawRun
)

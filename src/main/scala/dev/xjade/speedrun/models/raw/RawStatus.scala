package dev.xjade.speedrun.models.raw

/**
 * Raw status dat.a
 *
 * @param status        The status.
 * @param examiner      The examiner ID.
 * @param `verify-date` If verified/rejected, the date.
 */
case class RawStatus(
  status: String,
  examiner: String,
  `verify-date`: String
)

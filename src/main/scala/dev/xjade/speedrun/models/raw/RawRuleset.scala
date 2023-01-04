package dev.xjade.speedrun.models.raw

/**
 * Raw ruleset data.
 *
 * @param `show-milliseconds`    Whether or not to show milliseconds on the leaderboard.
 * @param `require-verification` Whether or not to require 2fa on the leaderboard.
 * @param `require-video`        Whether or not the leaderboard requires video.
 * @param `run-times`            All allowed run timings.
 * @param `default-time`         The default timing method/
 * @param `emulators-allowed`    If emulators are allowed or not.
 */
case class RawRuleset(
                       `show-milliseconds`: Boolean,
                       `require-verification`: Boolean,
                       `require-video`: Boolean,
                       `run-times`: Seq[String],
                       `default-time`: String,
                       `emulators-allowed`: Boolean
                     )

package dev.xjade.speedrun.models.raw

case class RawRuleset(
                       `show-milliseconds`: Boolean,
                       `require-verification`: Boolean,
                       `require-video`: Boolean,
                       `run-times`: Seq[String],
                       `default-time`: String,
                       `emulators-allowed`: Boolean
                     )

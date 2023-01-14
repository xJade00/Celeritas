package dev.xjade.speedrun.models.run

/** Represents a Timing method. */
trait TimingMethod

/** Represents the primary timing method. */
case object Primary extends TimingMethod

/** Represents the realtime timing method. */
case object Realtime extends TimingMethod

/** Represents the realtime timing method getting rid of loading times. */
case object RealtimeNoLoads extends TimingMethod

/** Represents the ingame timing method. */
case object Ingame extends TimingMethod
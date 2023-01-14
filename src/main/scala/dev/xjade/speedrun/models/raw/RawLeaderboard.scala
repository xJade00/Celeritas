package dev.xjade.speedrun.models.raw

/**
 * Raw leaderboard data.
 *
 * @param weblink      The weblink of the leaderboard.
 * @param game         The game this leaderboard belong to
 * @param category     The category this leaderboard belongs to.
 * @param level        The level (if any) this leaderboard belongs to.
 * @param platform     The platform this leaderboard is.
 * @param region       The region this leaderboard belongs to.
 * @param emulators    Whether or not it allows emulators.
 * @param `video-only` Whether or not it only accepts videos.
 * @param timing       What timing method it uses.
 * @param values       TODO
 * @param links        Relevant links
 */
case class RawLeaderboard(
  weblink: String,
  game: String,
  category: String,
  level: RawLevel,
  platform: String,
  region: String,
  emulators: Boolean,
  `video-only`: Boolean,
  timing: String,
  values: Map[String, String],
  links: Seq[RawURI]
)

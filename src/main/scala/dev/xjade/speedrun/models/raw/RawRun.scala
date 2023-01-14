package dev.xjade.speedrun.models.raw

/**
 * Raw run data.
 *
 * @param id        The ID of the run.
 * @param weblink   The weblink of the run.
 * @param game      The game that this run belongs to.
 * @param level     The level this run belongs to.
 * @param category  The category this run belongs to.
 * @param videos    Any videos this run has.
 * @param comment   Any comments on this run.
 * @param status    The status of this run.
 * @param players   Any players of this run.
 * @param date      The date this run was.
 * @param submitted The date this run was submitted to the leaderboard.
 * @param times     Raw timing data.
 * @param system    Raw system data.
 * @param values    Raw value data.
 * @param links     Relevant links.
 */
case class RawRun(
  id: String,
  weblink: String,
  game: String,
  level: String,
  category: String,
  videos: RawVideos,
  comment: String,
  status: RawStatus,
  players: Seq[RawPlayers],
  date: String,
  submitted: String,
  times: RawTimes,
  system: RawSystem,
  values: Map[String, String],
  links: Seq[RawURI]
)

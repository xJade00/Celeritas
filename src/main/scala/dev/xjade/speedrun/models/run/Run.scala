package dev.xjade.speedrun.models.run

import dev.xjade.speedrun.models.IDs._
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

import java.util.Date

/**
 * The Run case class represents a single speedrun of a specific game, level, and category.
 * @param id A unique identifier for this run.
 * @param link A link to the run's page or video.
 * @param game The ID of the game this run is for.
 * @param level The ID of the level this run is for.
 * @param category The ID of the category this run is for.
 * @param videos Data about any videos associated with the run.
 * @param comment A comment or description of the run.
 * @param status The current status of the run (e.g. "Verifying" or "Accepted").
 * @param players A sequence of players associated with the run.
 * @param date The date the run was completed.
 * @param submitted The date the run was submitted.
 * @param times A map of timing methods to the time achieved using that method.
 * @param system The system the run was completed on.
 * @param values A map of variable IDs to the value achieved in the run.
 * @param links A sequence of links related to the run.
 */
case class Run(
  id: RunID,
  link: String,
  game: GameID,
  level: LevelID,
  category: CategoryID,
  videos: VideoData,
  comment: String,
  status: Status,
  players: Seq[Player],
  date: Date,
  submitted: Date,
  times: Map[TimingMethod, Long],
  system: System,
  values: Map[VariableID, ValueID],
  links: ObjectLinks
)

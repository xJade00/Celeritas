package dev.xjade.speedrun.models

/** Holds various link types. */
object LinkType {

  /** Another type to reference for a link. */
  type LinkType = String

  /** A self referential link. */
  val SelfLink = "self"

  /** A link to a user's runs. */
  val UserRunsLink = "runs"

  /** A link to the games that a user moderates. */
  val UserGamesLink = "games"

  /** A link to the user's personal bests. */
  val UserPersonalBestsLink = "personal-bests"

  val CategoriesGameLink = "game"

  val CategoriesVariablesLink = "variables"

  val CategoriesRunsLink = "runs"


  /** A link pertaining to the games runs. */
  val GameRunsLink = "runs"

  /** A link pertaining to the games levels. */
  val GameLevelsLink = "levels"

  /** A link pertaining to the games categories. */
  val GameCategoriesLink = "categories"

  /** A link pertaining to the games variables. */
  val GameVariablesLink = "variables"

  /** A link pertaining to the games records. */
  val GameRecordsLink = "records"

  /** A link pertaining to the series. */
  val SeriesLink = "series"

  /** A link pertaining to the base game. */
  val GameBaseLink = "base-game"

  /** A link pertaining to the derived games. */
  val GameDerivedGamesLink = "derived-games"

  /** A link pertaining to the romhacks. */
  val GameRomhacksLink = "romhacks"

  /** A link pertaining to the leaderboard. */
  val GameLeaderboardLink = "leaderboard"

  /** A link to all games in this region. */
  val RegionGameLink = "games"

  /** A link to all runs in this region. */
  val RegionRunsLink = "runs"

  /** A link to the game this run is from. */
  val RunGameLink = "game"

  /** A link to the category this run is from. */
  val RunCategoryLink = "category"

  /** A link to the level this run is from. */
  val RunLevelLink = "level"

  /** A link to the platform this run was made on. */
  val RunPlatformLink = "platform"

  /** A link to the examiner of this run */
  val RunExaminerLink = "examiner"

}

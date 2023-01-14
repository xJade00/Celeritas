package dev.xjade.speedrun.models.game

import dev.xjade.speedrun.models.IDs._
import dev.xjade.speedrun.models.LinkType.LinkType
import dev.xjade.speedrun.models.NameType.NameType

import java.util.Date

/**
 * Represents a video game with its associated information
 * @param id The unique identifier for the game.
 * @param names The game name in different languages or formats.
 * @param abbreviation Abbreviation of the game name.
 * @param link The link to the game's webpage.
 * @param releaseYear The year the game was released.
 * @param releaseDate The date the game was released.
 * @param romhack A flag indicating whether the game is a ROM hack.
 * @param gametypes The types of game play offered by the game, represented by IDs.
 * @param platforms The platforms the game is available on, represented by IDs.
 * @param regions The regions the game is available in, represented by IDs.
 * @param genres The genre(s) of the game, represented by IDs.
 * @param engines The game engine(s) used to develop the game, represented by IDs.
 * @param developers The developer(s) of the game, represented by IDs.
 * @param publishers The publisher(s) of the game, represented by IDs.
 * @param moderators The moderators associated with the game, along with their moderator type. Please note that [[Verifier]] is not a possible moderator type yet, as the API does not distuingish between [[SuperModerator]] and [[Verifier]].
 * @param created The date the game was created on Speedrun.com.
 * @param assets The assets associated with the game, such as logo, cover art, etc.
 * @param links Additional links related to the game.
 */
case class Game(
  id: GameID,
  names: Map[NameType, String],
  abbreviation: String,
  link: String,
  releaseYear: Int,
  releaseDate: Date,
  romhack: Boolean,
  gametypes: Seq[GametypeID],
  platforms: Seq[PlatformID],
  regions: Seq[RegionID],
  genres: Seq[GenreID],
  engines: Seq[EngineID],
  developers: Seq[DeveloperID],
  publishers: Seq[PublisherID],
  moderators: Map[UserID, ModeratorType],
  created: Date,
  assets: Map[GameAsset, String],
  links: Map[LinkType, String]
)

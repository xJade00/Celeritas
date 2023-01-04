package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

/**
 * The raw game data.
 *
 * @param id             The ID of the game.
 * @param names          The names of the game.
 * @param abbreviation   The abbreviation of the games.
 * @param weblink        The weblink to the game.
 * @param released       The release year of the game.
 * @param `release-date` The datetime that the game was released.
 * @param ruleset        The ruleset of the game.
 * @param romhack        If the game is a romhack or not.
 * @param gametypes      TODO
 * @param platforms      TODO
 * @param regions        TODO
 * @param genres         TODO
 * @param engines        TODO
 * @param developers     TODO
 * @param publishers     TODO
 * @param moderators     A map of moderator IDs to
 * @param created        When the leaderboard was created.
 * @param assets         The assets of the game.
 * @param links          Relevant links.
 */
case class RawGame(
                    id: String,
                    names: RawNames,
                    abbreviation: String,
                    weblink: String,
                    released: Int,
                    `release-date`: String,
                    ruleset: RawRuleset,
                    romhack: Boolean,
                    // Below until the end comment this is a guess, love when documentation doesn't say
                    gametypes: Any,
                    platforms: Any,
                    regions: Any,
                    genres: Any,
                    engines: Any,
                    developers: Any,
                    publishers: Any,
                    // End comment
                    moderators: Map[String, String],
                    created: String,
                    assets: RawAssets,
                    links: Seq[RawURI]
                  )
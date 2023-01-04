package dev.xjade.speedrun.models.raw

/**
 * Raw data about a player.
 *
 * @param rel The relative link.
 * @param id  Player ID.
 * @param uri URL to the player.
 */
case class RawPlayers(
                       rel: String,
                       id: String,
                       uri: String
                     )

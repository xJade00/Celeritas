package dev.xjade.speedrun.models.user

import dev.xjade.speedrun.models.IDs.UserID
import dev.xjade.speedrun.models.LinkType.LinkType
import dev.xjade.speedrun.models.regions.Location

import java.util.Date

/**
 * Represents a speedrun.com user.
 *
 * @param id The ID of the user. See [[UserID]].
 * @param names The various names of the user. See [[dev.xjade.speedrun.models.NameType.NameType]]
 * @param link The link to the user's profile.
 * @param style The style of the username on the
 * @param role The role of the user. See [[Role]].
 * @param signup The signup date of the user. Might be empty for old users.
 * @param location The location data of the user.
 * @param twitch The optional twitch link of the user.
 * @param hitbox The optional hitbox link of the user.
 * @param youtube  The optional youtube link of the user.
 * @param twitter The optional twitter link of the user.
 * @param speedrunslive The optional speedruns live link of the user.
 * @param links Any other links of the user. See [[LinkType]].
 */
case class User(
  id: UserID,
  names: Map[String, String],
  link: String,
  style: NameStyle,
  role: Role,
  signup: Option[Date],
  location: Location,
  twitch: Option[String],
  hitbox: Option[String],
  youtube: Option[String],
  twitter: Option[String],
  speedrunslive: Option[String],
  links: Map[LinkType, String]
)

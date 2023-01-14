package dev.xjade.speedrun.models.user

import dev.xjade.speedrun.models.IDs.UserID
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks
import dev.xjade.speedrun.models.regions.Location

import java.util.Date

/**
 * Represents a user with associated information
 *
 * @param id The unique identifier for the user. [[UserID]]
 * @param names The user's name in different languages or formats.
 * @param link The link to the user's webpage or profile.
 * @param style The style of the user's name. [[NameStyle]]
 * @param role The role of the user. [[Role]]
 * @param signup The date the user signed up. This will be [[None]] for old users.
 * @param location The location of the user. [[Location]]
 * @param twitch The optional link to the user's Twitch account.
 * @param hitbox The optional link to the user's Hitbox account.
 * @param youtube The optional link to the user's YouTube account.
 * @param twitter The optional link to the user's Twitter account.
 * @param speedrunslive The optional link to the user's SpeedRunsLive account.
 * @param links The user's additional links.
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
  links: ObjectLinks
)

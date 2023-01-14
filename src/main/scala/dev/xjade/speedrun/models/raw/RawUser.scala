package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

/**
 * Raw user data.
 *
 * @param id The ID of the user.
 * @param names The names of the user.
 * @param weblink The link of the user.
 * @param `name-style` The style of the name.
 * @param role The role of the user.
 * @param signup The signup date of the user.
 * @param location The location of the user.
 * @param twitch The potential twitch of the user.
 * @param hitbox The potential hitbox of the user.
 * @param youtube The potential youtube of the user.
 * @param twitter The potential twitter of the user.
 * @param speedrunslive The potentail speedrunslive of the user.
 * @param links Relevant links
 * @param assets The assets of the user.
 */
case class RawUser(
  id: String,
  names: RawNames,
  weblink: String,
  `name-style`: RawNameStyle,
  role: String,
  signup: String,
  location: RawLocation,
  twitch: RawURI,
  hitbox: RawURI,
  youtube: RawURI,
  twitter: RawURI,
  speedrunslive: RawURI,
  links: Seq[RawURI],
  assets: RawAssets
)

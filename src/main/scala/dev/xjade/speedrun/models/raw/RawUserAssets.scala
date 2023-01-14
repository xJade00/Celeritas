package dev.xjade.speedrun.models.raw

/**
 * Represents raw user assets.
 *
 * @param icon The icon of the user.
 * @param supporterIcon The supporter icon of the user.
 * @param image The image of the user.
 */
case class RawUserAssets(
  icon: RawURI,
  supporterIcon: RawURI,
  image: RawURI
)

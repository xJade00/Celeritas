package dev.xjade.speedrun.models.raw

/**
 * Raw name style data.
 *
 * @param style        The style number.
 * @param color        The color data.
 * @param `color-from` For a gradiant, the color it starts with.
 * @param `color-to`   For a gradian, color it ends with.
 */
case class RawNameStyle(
  style: String,
  color: RawNameStyleColor,
  `color-from`: RawNameStyleColor,
  `color-to`: RawNameStyleColor
)

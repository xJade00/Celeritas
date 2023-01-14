package dev.xjade.speedrun.models.user

import java.awt.Color

/** The color of a name of a user. */
trait NameStyle

/**
 * A single username colour.
 *
 * @param light Color when the user is using lightmode.
 * @param dark Color when the user is using darkmode.
 */
case class SpeedrunColor(light: Color, dark: Color) extends NameStyle

/**
 * The colors of the gradient of a username colour.
 *
 * @param from The start color for dark or light mode.
 * @param to The end color for dark or light mode.
 */
case class Gradient(from: SpeedrunColor, to: SpeedrunColor) extends NameStyle

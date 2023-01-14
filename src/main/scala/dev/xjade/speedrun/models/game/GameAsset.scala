package dev.xjade.speedrun.models.game

/** Represents a game asset. */
sealed trait GameAsset

/**
 * Represents the Logo of a game.
 */
case object Logo extends GameAsset

/**
 * Represents the tiny cover image of a game.
 */
case object TinyCover extends GameAsset

/**
 * Represents the small cover image of a game.
 */
case object SmallCover extends GameAsset

/**
 * Represents the medium cover image of a game.
 */
case object MediumCover extends GameAsset

/**
 * Represents the large cover image of a game.
 */
case object LargeCover extends GameAsset

/**
 * Represents the icon of a game.
 */
case object Icon extends GameAsset

/**
 * Represents the first trophy of a game.
 */
case object FirstTrophy extends GameAsset

/**
 * Represents the second trophy of a game.
 */
case object SecondTrophy extends GameAsset

/**
 * Represents the third trophy of a game.
 */
case object ThirdTrophy extends GameAsset

/**
 * Represents the fourth trophy of a game.
 */
case object FourthTrophy extends GameAsset

/**
 * Represents the background image of a game.
 */
case object Background extends GameAsset

/**
 * Represents the foreground image of a game.
 */
case object Foreground extends GameAsset

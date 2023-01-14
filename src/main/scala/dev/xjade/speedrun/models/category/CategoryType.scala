package dev.xjade.speedrun.models.category

/** Represents a [[Category]] type. */
trait CategoryType

/** This category type is per game. */
case object PerGame extends CategoryType

/** This category type is per level. */
case object PerLevel extends CategoryType

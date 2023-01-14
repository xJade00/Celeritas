package dev.xjade.speedrun.models.raw

/**
 * A holder class.
 *
 * @param values Values.
 * @param default The default value.
 */
case class RawVariableValuesHolder(
  values: Map[String, RawVariableValue],
  default: String
)

package dev.xjade.speedrun.models.raw

case class RawVariableValuesHolder(
                                    values: Map[String, RawVariableValue],
                                    default: String
                                  )

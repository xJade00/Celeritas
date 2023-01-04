package dev.xjade.speedrun.models.raw

/**
 * Raw variable valued ata.
 *
 * @param label Label of the variable.
 * @param rules Rules for the variable.
 * @param flags Variable flags.
 */
case class RawVariableValue(
                             label: String,
                             rules: String,
                             flags: RawVariableFlags
                           )

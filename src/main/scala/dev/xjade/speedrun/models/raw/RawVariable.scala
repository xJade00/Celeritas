package dev.xjade.speedrun.models.raw

/**
 * Raw variable data.
 *
 * @param id The ID of the variable.
 * @param name The name of the variable.
 * @param category The category of the variable.
 * @param scope The scope of the variable.
 * @param mandatory If it's mandatory or not.
 * @param `user-defined` If it's user defined or not.
 * @param obsoletes If it's obsolete or not.
 * @param values The values.
 * @param `is-subcategory` Whether or not it's a subcategory.
 * @param links Relevant links.
 */
case class RawVariable(
                        id: String,
                        name: String,
                        category: String,
                        scope: RawVariableScope,
                        mandatory: Boolean,
                        `user-defined`: Boolean,
                        obsoletes: Boolean,
                        values: RawVariableValuesHolder,
                        `is-subcategory`: Boolean,
                        links: Seq[RawURI]
                      )

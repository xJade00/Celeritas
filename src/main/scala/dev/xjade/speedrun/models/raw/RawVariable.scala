package dev.xjade.speedrun.models.raw

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

package dev.xjade.speedrun.models.raw

/**
 * Represents the raw data of a category.
 *
 * @param id      The ID of the category.
 * @param name    The name of the category.
 * @param weblink The weblink to the category
 * @param `type`  The type of the category.
 * @param rules   The rules of the category
 */
case class RawCategories(
  id: String,
  name: String,
  weblink: String,
  `type`: String,
  rules: String
)

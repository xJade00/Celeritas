package dev.xjade.speedrun.models.raw

/**
 * A list of asset information
 *
 * @param logo           The logo.
 * @param `cover-tiny`   A tiny cover image.
 * @param `cover-small`  A small cover image.
 * @param `cover-medium` A medium cover image.
 * @param `cover-large`  A large cover image.
 * @param icon           The icon
 * @param `trophy-1st`   The first trophy.
 * @param `trophy-2nd`   The second trophy.
 * @param `trophy-3rd`   The third trophy.
 * @param `trophy-4th`   The fourth trophy.
 * @param background     The background image.
 * @param foreground     The foreground image.
 */
case class RawAssets(
  logo: RawAssetData,
  `cover-tiny`: RawAssetData,
  `cover-small`: RawAssetData,
  `cover-medium`: RawAssetData,
  `cover-large`: RawAssetData,
  icon: RawAssetData,
  `trophy-1st`: RawAssetData,
  `trophy-2nd`: RawAssetData,
  `trophy-3rd`: RawAssetData,
  `trophy-4th`: RawAssetData,
  background: RawAssetData,
  foreground: RawAssetData
)

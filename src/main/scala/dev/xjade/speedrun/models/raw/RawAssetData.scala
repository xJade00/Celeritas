package dev.xjade.speedrun.models.raw

/**
 * Represents the raw asset data of a picture.
 *
 * @param uri    The URL to the picture.
 * @param width  The picture's width.
 * @param height The picture's height.
 */
case class RawAssetData(
                         uri: String,
                         width: Int,
                         height: Int
                       )
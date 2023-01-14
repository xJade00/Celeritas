package dev.xjade.speedrun.models.run

/**
 * Video data.
 *
 * @param text The text related to the video.
 * @param links Relevant links.
 */
case class VideoData(
  text: String,
  links: Seq[String]
)

package dev.xjade.speedrun.models.raw

/**
 * The raw notification data.
 *
 * @param id      The ID for this notification.
 * @param created When it was created.
 * @param status  The status of the notification.
 * @param text    The text of the status.
 * @param item    The link to the status.
 * @param links   Relevant links.
 */
case class RawNotification(
  id: String,
  created: String,
  status: String,
  text: String,
  item: RawURI,
  links: Seq[RawURI]
)

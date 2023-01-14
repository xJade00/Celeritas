package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.IDs.GuestID
import dev.xjade.speedrun.models.UsefulTypes.ObjectLinks

/**
 * A guest player.
 *
 * @param name The name of the guest, this is also their ID.
 * @param links The relevant links.
 */
case class Guest(
  name: GuestID,
  links: ObjectLinks
)

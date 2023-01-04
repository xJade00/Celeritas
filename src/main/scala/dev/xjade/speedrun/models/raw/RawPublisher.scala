package dev.xjade.speedrun.models.raw

/**
 * Represents the raw publisher data.
 *
 * @param id    The ID of the publisher.
 * @param name  The name of the publisher.
 * @param links Relevant links.
 */
case class RawPublisher(
                         id: String,
                         name: String,
                         links: Seq[RawURI]
                       )

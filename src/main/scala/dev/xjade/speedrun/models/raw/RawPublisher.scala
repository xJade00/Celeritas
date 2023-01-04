package dev.xjade.speedrun.models.raw

case class RawPublisher(
                         id: String,
                         name: String,
                         links: Seq[RawURI]
                       )

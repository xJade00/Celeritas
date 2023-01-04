package dev.xjade.speedrun.models.raw

case class RawRun(
                   id: String,
                   weblink: String,
                   game: String,
                   level: Option[String],
                   category: String,
                   videos: RawVideos,
                   comment: Option[String],
                   status: RawStatus,
                   players: Seq[RawPlayers],
                   date: String,
                   submitted: String,
                   times: RawTimes,
                   system: RawSystem,
                   values: Map[String, String],
                   links: Seq[RawURI]
                 )

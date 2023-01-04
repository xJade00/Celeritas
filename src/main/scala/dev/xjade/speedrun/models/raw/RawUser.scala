package dev.xjade.speedrun.models.raw

import dev.xjade.speedrun.models.raw.OtherTypes.RawNames

case class RawUser(
                    id: String,
                    names: RawNames,
                    weblink: String,
                    `name-style`: RawNameStyle,
                    role: String,
                    signup: String,
                    location: RawLocation,
                    twitch: RawURI,
                    hitbox: RawURI,
                    youtube: RawURI,
                    twitter: RawURI,
                    speedrunslive: RawURI,
                    links: Seq[RawURI]
                  )

package dev.xjade.speedrun.models

import dev.xjade.speedrun.models.LinkType.LinkType

case object UsefulTypes {
  type ObjectLinks = Map[LinkType, String]
}

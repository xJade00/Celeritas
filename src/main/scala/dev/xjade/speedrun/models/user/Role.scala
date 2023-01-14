package dev.xjade.speedrun.models.user

/** A role that a [[User]] can have. */
trait Role

/** Represents that the [[User]] is a normal user. */
case object UserRole extends Role

/** Represents that the [[User]] is an admin user. */
case object AdminRole extends Role

/** Represents that the [[User]] is banned from the site. */
case object BannedRole extends Role

/** Represents that the [[User]] is a trusted member of the site. */
case object TrustedRole extends Role

/** Represents that the [[User]] is a moderator. */
case object ModeratorRole extends Role

/** Represents that the [[User]] is a programmer of the site. */
case object ProgrammerRole extends Role

/** An unknown role of the [[User]]. */
case class UnknownRole(role: String) extends Role

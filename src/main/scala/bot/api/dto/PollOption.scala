package bot.api.dto

/**
 *
 * @param text Option text, 1-100 characters
 * @param voter_count Number of users that voted for this option
 */
case class PollOption(
  text: Option[String],
  voter_count: Option[Int]
)

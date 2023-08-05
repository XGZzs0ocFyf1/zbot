package bot.api.dto

/**
 *
 * @param poll_id Unique poll identifier
 * @param user The user, who changed the answer to the poll
 * @param option_ids 0-based identifiers of answer options, chosen by the user. May be empty if the user retracted their vote.
 */
case class PollAnswer(
  poll_id: String,
  user: User,
  option_ids: Array[Int],
)

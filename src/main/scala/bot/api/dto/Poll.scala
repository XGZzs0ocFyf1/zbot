package bot.api.dto

/**
 *
 * @param id Unique poll identifier
 * @param question Poll question, 1-300 characters
 * @param options List of poll options
 * @param total_voter_count Total number of users that voted in the poll
 * @param is_closed True, if the poll is closed
 * @param is_anonymous True, if the poll is anonymous
 * @param `type` Poll type, currently can be “regular” or “quiz”
 * @param allows_multiple_answers True, if the poll allows multiple answers
 * @param correct_option_id Optional. 0-based identifier of the correct answer option. Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
 * @param explanation Optional. Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
 * @param explanation_entities Optional. Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
 * @param open_period Optional. Amount of time in seconds the poll will be active after creation
 * @param close_date Optional. Point in time (Unix timestamp) when the poll will be automatically closed
 */
case class Poll(
  id: String,
  question: String,
  options: Array[PollOption] ,
  total_voter_count: Integer,
  is_closed: Boolean,
  is_anonymous: Boolean,
  `type`: String,
  allows_multiple_answers: Boolean,
  correct_option_id: Option[Integer],
  explanation: Option[String],
  explanation_entities: Option[Array[MessageEntity]],
  open_period: Option[Integer],
  close_date: Option[Integer],
  )

package bot.api.dto

case class ChosenInlineResult(
  result_id: String,
  from: User,
  location: Option[Location],
  inline_message_id: Option[String],
  query: String,
)

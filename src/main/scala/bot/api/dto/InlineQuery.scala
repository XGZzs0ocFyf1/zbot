package bot.api.dto

case class InlineQuery(
  id: String,
  from: User,
  query: String,
  offset: String,
  chat_type: Option[String] = None,
  location: Option[Location] = None,
)
package bot.api.dto


//посмотреть что там в чатике накопилось
case class GetUpdatesRs(
  offset: Option[Int],
  limit: Option[Int],
  timeout: Option[Int],
  result: Option[Update]
)

case class Chat(
  id: Long,
  first_name: String,
  last_name: String,
  username: String,
  `type`: String
)










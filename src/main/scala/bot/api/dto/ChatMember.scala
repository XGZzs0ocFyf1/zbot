package bot.api.dto

/**
 *
 * @param status       The member's status in the chat, always “creator”
 * @param user         Information about the user
 * @param is_anonymous True, if the user's presence in the chat is hidden
 * @param custom_title Optional. Custom title for this user
 */
case class ChatMember(
  status: String,
  user: User,
  is_anonymous: Boolean,
  custom_title: Option[String],
)

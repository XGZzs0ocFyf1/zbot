package bot.api.dto

/**
 * This object represents an inline button that switches the current user to inline mode in a chosen chat, with an optional default inline query.
 *
 * @param query               Optional. The default inline query to be inserted in the input field. If left empty, only the bot's username will be inserted
 * @param allow_user_chats    Optional. True, if private chats with users can be chosen
 * @param allow_bot_chats     Optional. True, if private chats with bots can be chosen
 * @param allow_group_chats   Optional. True, if group and supergroup chats can be chosen
 * @param allow_channel_chats Optional. True, if channel chats can be chosen
 */
class SwitchInlineQueryChosenChat(
  query: Option[String],
  allow_user_chats: Option[Boolean],
  allow_bot_chats: Option[Boolean],
  allow_group_chats: Option[Boolean],
  allow_channel_chats: Option[Boolean],
)

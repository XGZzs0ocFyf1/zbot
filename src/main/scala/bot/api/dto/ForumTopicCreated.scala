package bot.api.dto

/**
 * This object represents a service message about a new forum topic created in the chat.
 *
 * @param name                 Name of the topic
 * @param icon_color           Color of the topic icon in RGB format
 * @param icon_custom_emoji_id Optional. Unique identifier of the custom emoji shown as the topic icon
 */
case class ForumTopicCreated(
  name: String,
  icon_color: Integer,
  icon_custom_emoji_id: String,
)

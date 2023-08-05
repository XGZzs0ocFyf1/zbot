package bot.api.dto

/**
 * This object represents a service message about an edited forum topic.
 *
 * @param name                 Optional. New name of the topic, if it was edited
 * @param icon_custom_emoji_id Optional. New identifier of the custom emoji shown as the topic icon, if it was edited; an empty string if the icon was removed
 */
case class ForumTopicEdited(
  name: Option[String],
  icon_custom_emoji_id: Option[String],
)

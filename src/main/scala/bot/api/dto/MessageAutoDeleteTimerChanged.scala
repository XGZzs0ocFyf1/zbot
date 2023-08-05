package bot.api.dto

/**
 *
 * @param message_auto_delete_time New auto-delete time for messages in the chat; in seconds
 */
case class MessageAutoDeleteTimerChanged(
  message_auto_delete_time: Int
)

package bot.api.dto

/**
 *
 * @param request_id Identifier of the request
 * @param chat_id    Identifier of the shared chat. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier. The bot may not have access to the chat and could be unable to use this identifier, unless the chat is already known to the bot by some other means.
 */
case class ChatShared(
  request_id: Integer,
  chat_id: Integer,
)
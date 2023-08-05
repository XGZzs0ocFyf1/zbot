package bot.api.dto

/**
 *
 * @param request_id Identifier of the request
 * @param user_id    Identifier of the shared user. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier. The bot may not have access to the user and could be unable to use this identifier, unless the user is already known to the bot by some other means.
 */
case class UserShared(
  request_id: Long,
  user_id: Long,
)

package bot.api.dto

/**
 *
 * @param chat         Chat to which the request was sent
 * @param from         User that sent the join request
 * @param user_chat_id Identifier of a private chat with the user who sent the join request. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier. The bot can use this identifier for 24 hours to send messages until the join request is processed, assuming no other administrator contacted the user.
 * @param date         Date the request was sent in Unix time
 * @param bio          Optional. Bio of the user.
 * @param invite_link  Optional. Chat invite link that was used by the user to send the join request
 */
case class ChatJoinRequest(
  chat: Chat,
  from: User,
  user_chat_id: Integer,
  date: Integer,
  bio: Option[String],
  invite_link: Option[ChatInviteLink],
)

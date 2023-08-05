package bot.api.dto

/**
 *
 * @param chat                        Chat the user belongs to
 * @param from                        Performer of the action, which resulted in the change
 * @param date                        Date the change was done in Unix time
 * @param old_chat_member             Previous information about the chat member
 * @param new_chat_member             New information about the chat member
 * @param invite_link                 Optional. Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
 * @param via_chat_folder_invite_link Optional. True, if the user joined the chat via a chat folder invite link
 */
case class ChatMemberUpdated(
  chat: Chat,
  from: User,
  date: Integer,
  old_chat_member: ChatMember,
  new_chat_member: ChatMember,
  invite_link: Option[ChatInviteLink],
  via_chat_folder_invite_link: Option[Boolean],
)

package bot.api.dto

//This object represents a service message about new members invited to a video chat.
case class VideoChatParticipantsInvited(
  users: Array[User]
)

package bot.api.dto

/**
 * This object represents a message.
 * @param message_id                        Unique message identifier inside this chat
 * @param message_thread_id                 Optional. Unique identifier of a message thread to which the message belongs; for supergroups only
 * @param from                              Optional. Sender of the message; empty for messages sent to channels. For backward compatibility, the field contains a fake sender user in non-channel chats, if the message was sent on behalf of a chat.
 * @param sender_chat                       Optional. Sender of the message, sent on behalf of a chat. For example, the channel itself for channel posts, the supergroup itself for messages from anonymous group administrators, the linked channel for messages automatically forwarded to the discussion group. For backward compatibility, the field from contains a fake sender user in non-channel chats, if the message was sent on behalf of a chat.
 * @param date                              Date the message was sent in Unix time
 * @param chat                              Conversation the message belongs to
 * @param forward_from                      Optional. For forwarded messages, sender of the original message
 * @param forward_from_chat                 Optional. For messages forwarded from channels or from anonymous administrators, information about the original sender chat
 * @param forward_from_message_id           Optional. For messages forwarded from channels, identifier of the original message in the channel
 * @param forward_signature                 Optional. For forwarded messages that were originally sent in channels or by an anonymous chat administrator, signature of the message sender if present
 * @param forward_sender_name               Optional. Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages
 * @param forward_date                      Optional. For forwarded messages, date the original message was sent in Unix time
 * @param is_topic_message                  Optional. True, if the message is sent to a forum topic
 * @param is_automatic_forward              Optional. True, if the message is a channel post that was automatically forwarded to the connected discussion group
 * @param reply_to_message                  Optional. For replies, the original message. Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
 * @param via_bot                           Optional. Bot through which the message was sent
 * @param edit_date                         Optional. Date the message was last edited in Unix time
 * @param has_protected_content             Optional. True, if the message can't be forwarded
 * @param media_group_id                    Optional. The unique identifier of a media message group this message belongs to
 * @param author_signature                  Optional. Signature of the post author for messages in channels, or the custom title of an anonymous group administrator
 * @param text                              Optional. For text messages, the actual UTF-8 text of the message
 * @param entities                          Optional. For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
 * @param animation                         Optional. Message is an animation, information about the animation. For backward compatibility, when this field is set, the document field will also be set
 * @param audio                             Optional. Message is an audio file, information about the file
 * @param document                          Optional. Message is a general file, information about the file
 * @param photo                             Optional. Message is a photo, available sizes of the photo
 * @param sticker                           Optional. Message is a sticker, information about the sticker
 * @param video                             Optional. Message is a video, information about the video
 * @param video_note                        Optional. Message is a video note, information about the video message
 * @param voice                             Optional. Message is a voice message, information about the file
 * @param caption                           Optional. Caption for the animation, audio, document, photo, video or voice
 * @param caption_entities                  Optional. For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
 * @param has_media_spoiler                 Optional. True, if the message media is covered by a spoiler animation
 * @param contact                           Optional. Message is a shared contact, information about the contact
 * @param dice                              Optional. Message is a dice with random value
 * @param game                              Optional. Message is a game, information about the game. More about games »
 * @param poll                              Optional. Message is a native poll, information about the poll
 * @param venue                             Optional. Message is a venue, information about the venue. For backward compatibility, when this field is set, the location field will also be set
 * @param location                          Optional. Message is a shared location, information about the location
 * @param new_chat_members                  Optional. New members that were added to the group or supergroup and information about them (the bot itself may be one of these members)
 * @param left_chat_member                  Optional. A member was removed from the group, information about them (this member may be the bot itself)
 * @param new_chat_title                    Optional. A chat title was changed to this value
 * @param new_chat_photo                    Optional. A chat photo was change to this value
 * @param delete_chat_photo                 Optional. Service message: the chat photo was deleted
 * @param group_chat_created                Optional. Service message: the group has been created
 * @param supergroup_chat_created           Optional. Service message: the supergroup has been created. This field can't be received in a message coming through updates, because bot can't be a member of a supergroup when it is created. It can only be found in reply_to_message if someone replies to a very first message in a directly created supergroup.
 * @param channel_chat_created              Optional. Service message: the channel has been created. This field can't be received in a message coming through updates, because bot can't be a member of a channel when it is created. It can only be found in reply_to_message if someone replies to a very first message in a channel.
 * @param message_auto_delete_timer_changed Optional. Service message: auto-delete timer settings changed in the chat
 * @param migrate_to_chat_id                Optional. The group has been migrated to a supergroup with the specified identifier. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
 * @param migrate_from_chat_id              Optional. The supergroup has been migrated from a group with the specified identifier. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
 * @param pinned_message                    Optional. Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message fields even if it is itself a reply.
 * @param invoice                           Optional. Message is an invoice for a payment, information about the invoice. More about payments »
 * @param successful_payment                Optional. Message is a service message about a successful payment, information about the payment. More about payments »
 * @param user_shared                       Optional. Service message: a user was shared with the bot
 * @param chat_shared                       Optional. Service message: a chat was shared with the bot
 * @param connected_website                 Optional. The domain name of the website on which the user has logged in. More about Telegram Login »
 * @param write_access_allowed              Optional. Service message: the user allowed the bot added to the attachment menu to write messages
 * @param passport_data                     Optional. Telegram Passport data
 * @param proximity_alert_triggered         Optional. Service message. A user in the chat triggered another user's proximity alert while sharing Live Location.
 * @param forum_topic_created               Optional. Service message: forum topic created
 * @param forum_topic_edited                Optional. Service message: forum topic edited
 * @param forum_topic_closed                Optional. Service message: forum topic closed
 * @param forum_topic_reopened              Optional. Service message: forum topic reopened
 * @param general_forum_topic_hidden        Optional. Service message: the 'General' forum topic hidden
 * @param general_forum_topic_unhidden      Optional. Service message: the 'General' forum topic unhidden
 * @param video_chat_scheduled              Optional. Service message: video chat scheduled
 * @param video_chat_started                Optional. Service message: video chat started
 * @param video_chat_ended                  Optional. Service message: video chat ended
 * @param video_chat_participants_invited   Optional. Service message: new participants invited to a video chat
 * @param web_app_data                      Optional. Service message: data sent by a Web App
 * @param reply_markup                      Optional. Inline keyboard attached to the message. login_url buttons are represented as ordinary url buttons.
 */
case class Message(
  message_id: Long,
  message_thread_id: Option[Long],
  from: Option[User],
  sender_chat: Option[Chat],
  date: Long,
  chat: Chat,
  forward_from: Option[User],
  forward_from_chat: Option[Chat],
  forward_from_message_id: Option[Long],
  forward_signature: Option[String],
  forward_sender_name: Option[String],
  forward_date: Option[Long],
  is_topic_message: Option[Boolean],
  is_automatic_forward: Option[Boolean],
  reply_to_message: Option[Message],
  via_bot: Option[User],
  edit_date: Option[Long],
  has_protected_content: Option[Boolean],
  media_group_id: Option[String],
  author_signature: Option[String],
  text: Option[String],
  entities: List[MessageEntity],
  animation: Option[Animation],
  audio: Option[Audio],
  document: Option[Document],
  photo: Option[List[PhotoSize]],
  sticker: Option[Sticker],
  video: Option[Video],
  video_note: Option[VideoNote],
  voice: Option[Voice],
  caption: Option[String],
  caption_entities: Option[List[MessageEntity]],
  has_media_spoiler: Option[Boolean] = Some(true),
  contact: Option[Contact],
  dice: Option[Dice],
  game: Option[Game],
  poll: Option[Poll],
  venue: Option[Venue],
  location: Option[Location],
  new_chat_members: Option[List[User]],
  left_chat_member: Option[User],
  new_chat_title: Option[String],
  new_chat_photo: Option[List[PhotoSize]],
  delete_chat_photo: Option[Boolean] = Some(false),
  group_chat_created: Option[Boolean] = Some(false),
  supergroup_chat_created: Option[Boolean] = Some(false),
  channel_chat_created: Option[Boolean] = Some(false),
  message_auto_delete_timer_changed: Option[MessageAutoDeleteTimerChanged],
  migrate_to_chat_id: Option[Long],
  migrate_from_chat_id: Option[Long],
  pinned_message: Option[Message],
  invoice: Option[Invoice],
  successful_payment: Option[SuccessfulPayment],
  user_shared: Option[UserShared],
  chat_shared: Option[ChatShared],
  connected_website: Option[String],
  write_access_allowed: Option[WriteAccessAllowed],
  passport_data: Option[PassportData],
  proximity_alert_triggered: Option[ProximityAlertTriggered],
  forum_topic_created: Option[ForumTopicCreated],
  forum_topic_edited: Option[ForumTopicEdited],
  forum_topic_closed: Option[ForumTopicClosed] = None,
  forum_topic_reopened: Option[ForumTopicReopened] = None,
  general_forum_topic_hidden: Option[GeneralForumTopicHidden] = None,
  general_forum_topic_unhidden: Option[GeneralForumTopicUnhidden] = None,
  video_chat_scheduled: Option[VideoChatScheduled],
  video_chat_started: Option[VideoChatStarted],
  video_chat_ended: Option[VideoChatEnded],
  video_chat_participants_invited: Option[VideoChatParticipantsInvited],
  web_app_data: Option[WebAppData],
  reply_markup: Option[InlineKeyboardMarkup],
)

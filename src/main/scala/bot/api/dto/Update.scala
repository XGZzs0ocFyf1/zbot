package bot.api.dto

/**
 *
 * @param update_id            The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially. This ID becomes especially handy if you're using webhooks, since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order. If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
 * @param message              Optional. New incoming message of any kind - text, photo, sticker, etc.
 * @param edited_message       Optional. New version of a message that is known to the bot and was edited
 * @param channel_post         Optional. New incoming channel post of any kind - text, photo, sticker, etc.
 * @param edited_channel_post  Optional. New version of a channel post that is known to the bot and was edited
 * @param inline_query         Optional. New incoming inline query
 * @param chosen_inline_result Optional. The result of an inline query that was chosen by a user and sent to their chat partner. Please see our documentation on the feedback collecting for details on how to enable these updates for your bot.
 * @param callback_query       Optional. New incoming callback query
 * @param shipping_query       Optional. New incoming shipping query. Only for invoices with flexible price
 * @param pre_checkout_query   Optional. New incoming pre-checkout query. Contains full information about checkout
 * @param poll                 Optional. New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot
 * @param poll_answer          Optional. A user changed their answer in a non-anonymous poll. Bots receive new votes only in polls that were sent by the bot itself.
 * @param my_chat_member       Optional. The bot's chat member status was updated in a chat. For private chats, this update is received only when the bot is blocked or unblocked by the user.
 * @param chat_member          Optional. A chat member's status was updated in a chat. The bot must be an administrator in the chat and must explicitly specify “chat_member” in the list of allowed_updates to receive these updates.
 * @param chat_join_request    Optional. A request to join the chat has been sent. The bot must have the can_invite_users administrator right in the chat to receive these updates.
 */
case class Update(
  update_id: Long,
  message: Option[Message],
  edited_message: Option[Message],
  channel_post: Option[Message],
  edited_channel_post: Option[Message],
  inline_query: Option[InlineQuery],
  chosen_inline_result: Option[ChosenInlineResult],
  callback_query: Option[CallbackQuery],
  shipping_query: Option[ShippingQuery],
  pre_checkout_query: Option[PreCheckoutQuery],
  poll: Option[Poll],
  poll_answer: Option[PollAnswer],
  my_chat_member: Option[ChatMemberUpdated],
  chat_member: Option[ChatMemberUpdated],
  chat_join_request: Option[ChatJoinRequest],
)


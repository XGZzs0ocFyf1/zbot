package bot.api.dto


case class InlineKeyboardButton(
  text: String,
  url: Option[String],
  callback_data: Option[String],
  web_app: Option[WebAppInfo],
  login_url: Option[LoginUrl],
  switch_inline_query: Option[String],
  switch_inline_query_current_chat: Option[String],
  switch_inline_query_chosen_chat: Option[SwitchInlineQueryChosenChat],
  callback_game: Option[CallbackGame] = None,
  pay: Option[Boolean],
)

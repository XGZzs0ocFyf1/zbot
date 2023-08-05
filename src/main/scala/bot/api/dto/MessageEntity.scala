package bot.api.dto

/**
 *
 * @param `type` Type of the entity. Currently, can be “mention” (@username), “hashtag” (#hashtag), “cashtag” ($USD), “bot_command” (/start@jobs_bot), “url” (https://telegram.org), “email” (do-not-reply@telegram.org), “phone_number” (+1-212-555-0123), “bold” (bold text), “italic” (italic text), “underline” (underlined text), “strikethrough” (strikethrough text), “spoiler” (spoiler message), “code” (monowidth string), “pre” (monowidth block), “text_link” (for clickable text URLs), “text_mention” (for users without usernames), “custom_emoji” (for inline custom emoji stickers)
 * @param offset Offset in UTF-16 code units to the start of the entity
 * @param length Length of the entity in UTF-16 code units
 * @param url Optional. For “text_link” only, URL that will be opened after user taps on the text
 * @param user Optional. For “text_mention” only, the mentioned user
 * @param language Optional. For “pre” only, the programming language of the entity text
 * @param custom_emoji_id Optional. For “custom_emoji” only, unique identifier of the custom emoji. Use getCustomEmojiStickers to get full information about the sticker
 */
case class MessageEntity(
  `type`: String,
  offset: Integer,
  length: Integer,
  url: Option[String],
  user: Option[User],
  language: Option[String],
  custom_emoji_id: Option[String],
)

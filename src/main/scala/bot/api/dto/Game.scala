package bot.api.dto

/**
 *
 * @param title         Title of the game
 * @param description   Description of the game
 * @param photo         Photo that will be displayed in the game message in chats.
 * @param text          Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore, or manually edited using editMessageText. 0-4096 characters.
 * @param text_entities Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
 * @param animation     Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
 */
case class Game(
  title: String,
  description: String,
  photo: Array[PhotoSize],
  text: Option[String],
  text_entities: Option[Array[MessageEntity]],
  animation: Option[Animation],
)

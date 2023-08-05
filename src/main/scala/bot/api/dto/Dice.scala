package bot.api.dto

/**
 *
 * @param emoji Emoji on which the dice throw animation is based
 * @param value Value of the dice, 1-6 for “”, “” and “” base emoji, 1-5 for “” and “” base emoji, 1-64 for “” base emoji
 */
case class Dice(
  emoji: String,
  value: Integer
)
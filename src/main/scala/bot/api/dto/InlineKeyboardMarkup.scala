package bot.api.dto

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to
 *
 * @param inline_keyboard Array of button rows, each represented by an Array of InlineKeyboardButton objects
 */
case class InlineKeyboardMarkup(inline_keyboard: List[InlineKeyboardButton])

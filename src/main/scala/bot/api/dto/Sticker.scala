package bot.api.dto

/**
 *
 * @param file_id           Identifier for this file, which can be used to download or reuse the file
 * @param file_unique_id    Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param `type`            Type of the sticker, currently one of “regular”, “mask”, “custom_emoji”. The type of the sticker is independent from its format, which is determined by the fields is_animated and is_video.
 * @param width             Sticker width
 * @param height            Sticker height
 * @param is_animated       True, if the sticker is animated
 * @param is_video          True, if the sticker is a video sticker
 * @param thumbnail         Optional. Sticker thumbnail in the .WEBP or .JPG format
 * @param emoji             Optional. Emoji associated with the sticker
 * @param set_name          Optional. Name of the sticker set to which the sticker belongs
 * @param premium_animation Optional. For premium regular stickers, premium animation for the sticker
 * @param mask_position     Optional. For mask stickers, the position where the mask should be placed
 * @param custom_emoji_id   Optional. For custom emoji stickers, unique identifier of the custom emoji
 * @param needs_repainting  Optional. True, if the sticker must be repainted to a text color in messages, the color of the Telegram Premium badge in emoji status, white color on chat photos, or another appropriate color in other places
 * @param file_size         Optional. File size in bytes
 */
case class Sticker(
  file_id: String,
  file_unique_id: String,
  `type`: String,
  width: Integer,
  height: Integer,
  is_animated: Boolean,
  is_video: Boolean,
  thumbnail: Option[PhotoSize],
  emoji: Option[String],
  set_name: Option[String],
  premium_animation: Option[File],
  mask_position: Option[MaskPosition],
  custom_emoji_id: Option[String],
  needs_repainting: Option[Boolean],
  file_size: Option[Integer],
)

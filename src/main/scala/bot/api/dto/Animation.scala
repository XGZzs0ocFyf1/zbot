package bot.api.dto

/**
 *
 * @param file_id        Identifier for this file, which can be used to download or reuse the file
 * @param file_unique_id Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param width          Video width as defined by sender
 * @param height         Video height as defined by sender
 * @param duration       Duration of the video in seconds as defined by sender
 * @param thumbnail      Optional. Animation thumbnail as defined by sender
 * @param file_name      Optional. Original animation filename as defined by sender
 * @param mime_type      Optional. MIME type of the file as defined by sender
 * @param file_size      Optional. File size in bytes. It can be bigger than 2^31 and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this value.
 */
case class Animation(
  file_id: String,
  file_unique_id: String,
  width: Integer,
  height: Integer,
  duration: Integer,
  thumbnail: Option[PhotoSize],
  file_name: Option[String],
  mime_type: Option[String],
  file_size: Option[Integer],
)

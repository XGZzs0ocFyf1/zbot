package bot.api.dto

/**
 *
 * @param file_id        Identifier for this file, which can be used to download or reuse the file
 * @param file_unique_id Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param length         Video width and height (diameter of the video message) as defined by sender
 * @param duration       Duration of the video in seconds as defined by sender
 * @param thumbnail      Optional. Video thumbnail
 * @param file_size      Optional. File size in bytes
 */
case class VideoNote(
  file_id: String,
  file_unique_id: String,
  length: Integer,
  duration: Integer,
  thumbnail: Option[PhotoSize],
  file_size: Option[Integer],
)

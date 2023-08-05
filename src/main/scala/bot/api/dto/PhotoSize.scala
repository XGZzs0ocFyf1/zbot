package bot.api.dto

/**
 *
 * @param file_id        Identifier for this file, which can be used to download or reuse the file
 * @param file_unique_id Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param width          Photo width
 * @param height         Photo height
 * @param file_size      Optional. File size in bytes
 */
case class PhotoSize(
  file_id: String,
  file_unique_id: String,
  width: Integer,
  height: Integer,
  file_size: Option[Integer],
)

package bot.api.dto

/**
 *This object represents a file uploaded to Telegram Passport. Currently all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
 * @param file_id Identifier for this file, which can be used to download or reuse the file
 * @param file_unique_id Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param file_size File size in bytes
 * @param file_date Unix time when the file was uploaded
 */
case class PassportFile (
  file_id: String,
  file_unique_id: String,
  file_size: Integer,
  file_date: Integer,
)

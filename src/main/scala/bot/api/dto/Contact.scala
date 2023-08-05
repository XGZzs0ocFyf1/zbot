package bot.api.dto

/**
 *
 * @param phone_number Contact's phone number
 * @param first_name   Contact's first name
 * @param last_name    Optional. Contact's last name
 * @param user_id      Optional. Contact's user identifier in Telegram. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
 * @param vcard        Optional. Additional data about the contact in the form of a vCard
 */
case class Contact(
  phone_number: String,
  first_name: String,
  last_name: Option[String],
  user_id: Option[Long],
  vcard: Option[String],
)

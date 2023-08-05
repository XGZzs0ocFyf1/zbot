package bot.api.dto

case class Invoice(
  title: String,
  description: String,
  start_parameter: String,
  currency: String,
  total_amount: Long,
)

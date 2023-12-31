package bot.api.dto

case class SuccessfulPayment (
  currency: String,
  total_amount: Integer,
  invoice_payload: String,
  shipping_option_id: Option[String],
  order_info: Option[OrderInfo],
  telegram_payment_charge_id: String,
  provider_payment_charge_id: String,
)

package bot.api.dto

case class PreCheckoutQuery(
  id: String,
  from: User,
  currency: String,
  total_amount: Integer,
  invoice_payload: String,
  shipping_option_id: String,
  order_info: OrderInfo,
)

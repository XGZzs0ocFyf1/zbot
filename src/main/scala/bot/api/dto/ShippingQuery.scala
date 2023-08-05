package bot.api.dto

case class ShippingQuery(
  id: String,
  from: User,
  invoice_payload: String,
  shipping_address: ShippingAddress,
)

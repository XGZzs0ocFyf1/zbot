package bot.api.dto

case class OrderInfo(
  name: String,
  phone_number: String,
  email: String,
  shipping_address: ShippingAddress,
)
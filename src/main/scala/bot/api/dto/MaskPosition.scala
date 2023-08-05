package bot.api.dto

/**
 *
 * @param point   The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
 * @param x_shift Shift by X-axis measured in widths of the mask scaled to the face size, from left to right. For example, choosing -1.0 will place mask just to the left of the default mask position.
 * @param y_shift Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom. For example, 1.0 will place the mask just below the default mask position.
 * @param scale   Mask scaling coefficient. For example, 2.0 means double size.
 */
case class MaskPosition(
  point: String,
  x_shift: Float,
  y_shift: Float,
  scale: Float,
)
package bot.api.dto

/**
 * Видеочат закончился. Этот объект представляет служебное сообщение о завершении видеочата в чате.
 * @param duration Длительность видеочата в секундах.
 */
case class VideoChatEnded(duration: Int)
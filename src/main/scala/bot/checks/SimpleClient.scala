import bot.api.dto.GetUpdatesRs
import zio._
import zio.http.Client
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._

object SimpleClient extends ZIOAppDefault {
  private val Token = "6483871476:AAHkpAG2lwoaVHVcrC4KnG6ahVL33J7sVbk"
  private val BaseUrl = s"https://api.telegram.org/bot$Token"
  private val GetUpdates = s"$BaseUrl/getUpdates"


  val program = for {
    res <- Client.request(GetUpdates)
    data <- res.body.asString
    _ <- {
      Console.printLine(data)
      val decoded = decode[GetUpdatesRs](data)
      Console.printLine(decoded)
    }
  } yield ()

  override val run = program.provide(Client.default)
}
import zio._

import zio.http.Client

object SimpleClient extends ZIOAppDefault {
  private val Token = "6483871476:AAHkpAG2lwoaVHVcrC4KnG6ahVL33J7sVbk"
  private val BaseUrl = s"https://api.telegram.org/bot$Token"
  private val GetUpdates = "/getUpdates"


  val program = for {
    res <- Client.request(GetUpdates)
    data <- res.body.asString
    _ <- Console.printLine(data)
  } yield ()

  override val run = program.provide(Client.default)
}
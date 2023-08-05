package bot.api.dto

/**
 *
 * @param location          Venue location. Can't be a live location
 * @param title             Name of the venue
 * @param address           Address of the venue
 * @param foursquare_id     Optional. Foursquare identifier of the venue
 * @param foursquare_type   Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
 * @param google_place_id   Optional. Google Places identifier of the venue
 * @param google_place_type Optional. Google Places type of the venue. (See supported types.)
 */
case class Venue(
  location: Location,
  title: String,
  address: String,
  foursquare_id: Option[String],
  foursquare_type: Option[String],
  google_place_id: Option[String],
  google_place_type: Option[String],
)

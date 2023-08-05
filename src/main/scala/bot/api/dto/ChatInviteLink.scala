package bot.api.dto

/**
 *
 * @param invite_link                The invite link. If the link was created by another chat administrator, then the second part of the link will be replaced with “…”.
 * @param creator                    Creator of the link
 * @param creates_join_request       True, if users joining the chat via the link need to be approved by chat administrators
 * @param is_primary                 True, if the link is primary
 * @param is_revoked                 True, if the link is revoked
 * @param name                       Optional. Invite link name
 * @param expire_date                Optional. Point in time (Unix timestamp) when the link will expire or has been expired
 * @param member_limit               Optional. The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
 * @param pending_join_request_count Optional. Number of pending join requests created using this link
 */
case class ChatInviteLink(
  invite_link: String,
  creator: User,
  creates_join_request: Boolean,
  is_primary: Boolean,
  is_revoked: Boolean,
  name: Option[String],
  expire_date: Option[Integer],
  member_limit: Option[Integer],
  pending_join_request_count: Option[Integer],
)

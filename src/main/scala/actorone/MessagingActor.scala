package actorone

import akka.actor.Actor
import models.{AuthorizedUser, UnAuthorizedUser}

class MessagingActor extends Actor {
  override def receive = {
    case user: AuthorizedUser => println(s"Welcome ${user.name}")
    case UnAuthorizedUser => {
      println("Unauthorized user")
      sender ! "WTH"
    }
  }
}

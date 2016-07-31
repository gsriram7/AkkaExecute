package actorone

import akka.actor.{Actor, ActorRef}
import models.{AuthorizedUser, UnAuthorizedUser}

class HelloActor(name: String, messagingActor: ActorRef) extends Actor {
  override def receive = {
    case user: String if "Selvaram".equals(user) => messagingActor ! AuthorizedUser(user)
    case message: String if "WTH".equals(message) => println("Oh crap!")
    case _ => messagingActor ! UnAuthorizedUser
  }
}





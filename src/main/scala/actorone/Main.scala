package actorone

import akka.actor._

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val messagingActor = system.actorOf(Props[MessagingActor], name = "messagingactor")
  val helloActor = system.actorOf(Props(new HelloActor("Selvaram", messagingActor)), name = "helloactor")

  helloActor ! "Selvaram"
  helloActor ! "Hii"
}

package sample.camel

import akka.actor.{ActorSystem, Props, actorRef2Scala}
import akka.camel.{CamelMessage, Consumer}

object SoapExample {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("some-system")
    val soapConsumer = system.actorOf(Props(classOf[SoapConsumer]))
  }

  class SoapConsumer() extends Consumer {
    def endpointUri = "cxf:http://0.0.0.0:8865/services/users?wsdlURL=wsdls/HelloService.wsdl&dataFormat=PAYLOAD"

    def receive = {
      case msg: CamelMessage => sender() ! "pong"
    }
  }
}

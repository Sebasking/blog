import train.{BMT, IRT}
import tunnel.Tunnel

object Application {
  def main(args: Array[String]): Unit = {
    val bmt = new BMT
    val irt = new IRT
    val trains = List(bmt, irt) //BMT
    val irtTrains = List(irt)
    val bmtTunnel = new Tunnel[BMT](trains = trains)
    val bmtTunnel2 = new Tunnel[BMT](trains = irtTrains)
    val irtTunnel = new Tunnel[IRT](trains = irtTrains)

    println("Tunnel 1")
    bmtTunnel.schedule.foreach(_.travel)
    println("Tunnel 2")
    bmtTunnel2.schedule.foreach(_.travel)
    println("Tunnel 3")
    irtTunnel.schedule.foreach(_.travel)
  }
}
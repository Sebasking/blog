import train.Train

package tunnel {
   class Tunnel[T <: Train](trains: List[T]) {
    def schedule = {
      trains
    }
  }
}
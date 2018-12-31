package train {
  abstract class Train {
    def travel = {}
  }

  class BMT extends Train {
    override def travel = {
      println("Traveling on the BMT")
    }
  }

  class IRT extends BMT {
    override def travel = {
      println("Traveling on the BMT or the IRT")
    }
  }
}


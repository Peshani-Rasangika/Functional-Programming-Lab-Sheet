object Sphere{
    def volumeOfSphere(r:Double):Double={
        val pi = scala.math.Pi;
        var volume:Double = (4.0/3.0)*pi*r*r*r;
        return volume;
    }

    def main(args: Array[String])={
        println("Volume of the sphere with radius 5 : " + volumeOfSphere(5));
    }

}
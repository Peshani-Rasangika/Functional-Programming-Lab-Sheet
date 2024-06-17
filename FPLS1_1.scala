object Disk{
    def area(r:Double):Double={
        val pi = scala.math.Pi;
        var area:Double = pi*r*r;
        return area;
    }

    def main(args: Array[String])={
        println("Area of the disk : " + area(5));
    }
}
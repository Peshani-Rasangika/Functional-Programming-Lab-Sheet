object Run{
    def easyPace(d:Int):Int = d*8;

    def tempo(d:Int):Int = d*7;

    def main(args: Array[String])={
        println("Total running time: " + (easyPace(2) + tempo(3) + easyPace(2)) + "min");
    }
}
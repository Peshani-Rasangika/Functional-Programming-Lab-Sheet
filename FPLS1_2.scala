object Temperature{
    def celsiusToFahrenheit(celsius:Double):Double={
        var fahrenheit:Double = celsius*1.8000 + 32.00;
        return fahrenheit;
    }

    def main(args: Array[String])={
        println("35Celsius = " + celsiusToFahrenheit(35) + "Fahrenheit");
    }
}
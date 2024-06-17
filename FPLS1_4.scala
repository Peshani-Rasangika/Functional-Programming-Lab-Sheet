object Book{
    def costForBooks(n:Int):Double = n*24.95;

    def discount(n:Int):Double = n*24.95*0.40;

    def shippingCost(n:Int):Double={
        if(n <= 50){
            n*3;
        }else{
            (50*3) + ((n - 50)*0.75);
        }
        
    }

    def wholeSaleCost(n:Int) = costForBooks(n) - discount(n) + shippingCost(n);

    def main(args: Array[String])={
        println("Total wholesale cost for 60 copies: Rs. " + wholeSaleCost(60));
    }
}
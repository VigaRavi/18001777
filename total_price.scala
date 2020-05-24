object price {
   def main(args: Array[String]) {
     val n:Int=60;
     val Total_amo:Double=n*24.95;
     val Discount:Double=Total_amo*0.4;
     val ship_cost:Double=3*n+(n-50)*0.75;
     val whole_sale:Double=Total_amo-Discount+ship_cost;
     println("total:"+whole_sale);
   }
}
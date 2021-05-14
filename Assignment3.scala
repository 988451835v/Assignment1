object Assignment3 extends App{
  def cost(x:Int):Double={
    var totalcp:Double=x*24.95;
    var discount:Double=(totalcp*40.00)/100.0;
    var shipcost:Double=if(x>50){3+0.75*(x-50)}else 3;
    return totalcp-discount+shipcost;
  }

  println("Total wholesale cost for all copies = "+cost(60));
}

/**
 * Created by tarekray on 8/29/2015.
 */
public class CoffeeMachine {

    private static  CoffeeMachine coffeeMachineInstance ;
    public static CoffeeMachine getInstance()
    {
        if(coffeeMachineInstance==null)
        {
             coffeeMachineInstance = new CoffeeMachine() ;
        }
        return coffeeMachineInstance ;
    }


    public String process(IRequest request, double price) {
       String output = "" ;

        request.test() ;
        double correctPrice = request.visitPrice(new PriceVisitor()) ;

        if(price<correctPrice) {
            output = "Need more" + (correctPrice-price ) ;
        }
        else {
            output = request.print(output) + "change + " + (price-correctPrice);
        }


        return  output ;
        }


}

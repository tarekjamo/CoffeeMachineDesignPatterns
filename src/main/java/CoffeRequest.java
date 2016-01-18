/**
 * Created by tarekray on 8/29/2015.
 */
public class CoffeRequest extends IRequest{




    public CoffeRequest()
    {
        this.type = "Coffe" ;
    }

    public double visitPrice(PriceVisitor priceVisitor) {
        return priceVisitor.visit(this) ;
    }
}

/**
 * Created by tarekray on 8/29/2015.
 */
public class ChocolateRequest  extends IRequest {



    public ChocolateRequest()
    {
        this.type = "Chocolate" ;
    }

    public double visitPrice(PriceVisitor priceVisitor) {
        return priceVisitor.visit(this) ;
    }
}

/**
 * Created by tarekray on 8/29/2015.
 */
public class TeaRequest  extends IRequest{


    public TeaRequest()
    {
        this.type = "Tea" ;
    }
    public double visitPrice(PriceVisitor priceVisitor) {
        return priceVisitor.visit(this) ;
    }


}

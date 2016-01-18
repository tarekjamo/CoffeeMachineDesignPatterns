/**
 * Created by tarekray on 8/29/2015.
 */
public class ExtraHotRequestDecorator extends  TemperatureRequestDecorator {

    public ExtraHotRequestDecorator(IRequest request) {

        super(request) ;
    }


    public String print(String output) {
        output+="Extra hot " ;
        return request.print(output) ;
    }

    public double visitPrice(PriceVisitor priceVisitor) {
        return priceVisitor.visit(this) ;
    }

}

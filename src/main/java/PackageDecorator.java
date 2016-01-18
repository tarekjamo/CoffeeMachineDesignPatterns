/**
 * Created by tarekray on 9/7/2015.
 */

public abstract class PackageDecorator extends IRequest {
    protected IRequest request ;

    public PackageDecorator(IRequest request)
    {
        this.request = request ;
    }

    public double visitPrice(PriceVisitor priceVisitor) {
        return priceVisitor.visit(this) ;
    }

    public void test() {
        System.out.println("Package");
    }

}
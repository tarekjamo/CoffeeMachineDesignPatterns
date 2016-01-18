/**
 * Created by tarekray on 8/29/2015.
 */
public   class PriceVisitor {

     double  visit(ChocolateRequest request) {
        return 0.5;

    }
     double  visit(TeaRequest request) {
        return 0.4;

    }
     double  visit(CoffeRequest request) {
        return 0.6;

    }

    double  visit(ExtraHotRequestDecorator request) {

        if(request.request instanceof  TeaRequest) {
            return visit((TeaRequest)request.request);
        }
        if(request.request instanceof  CoffeRequest) {
            return visit((CoffeRequest)request.request);
        }
        return 0 ;
    }
    double  visit(PackageDecorator request) {
        if (request.request instanceof TeaRequest) {
            return visit((TeaRequest) request.request);
        }
        if (request.request instanceof CoffeRequest) {
            return visit((CoffeRequest) request.request);
        }
        return 0;
    }

  // double  visit(PackageDecorator request) {
   //     return  visit(request.request) ;
    //}

    double  visit(IRequest request) {

        return 0;

    }
}

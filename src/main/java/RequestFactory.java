/**
 * Created by tarekray on 8/29/2015.
 */
public class RequestFactory {

    private static RequestFactory INSTANCE = new RequestFactory() ;

    private RequestFactory() {

    }

    public static RequestFactory getInstance() {
        return INSTANCE ;
    }
    public static IRequest newTeaRequestBuilder() {
        return new TeaRequest().build() ;
    }
    public static IRequest newCoffeeRequestBuilder() {
        return new CoffeRequest().build() ;
    }
    public static IRequest newChocolateRequestBuilder() {
        return new ChocolateRequest().build() ;
    }
}

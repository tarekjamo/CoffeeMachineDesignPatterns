/**
 * Created by tarekray on 9/7/2015.
 */
public class CartoonRequestDecorator extends PackageDecorator {

    public CartoonRequestDecorator(IRequest request) {

        super(request) ;
    }


    public String print(String output) {
        output+="Cartoon package" ;
        return request.print(output) ;
    }

   // public void test() {
     //   System.out.println("Cartoon");
    //}


}

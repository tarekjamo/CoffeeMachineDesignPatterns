/**
 * Created by tarekray on 8/29/2015.
 */
public  abstract class IRequest implements IRequestBuilder{

    public int sugar ;
    public String type ;


    public IRequest(){
        this.type = "drink" ;
        this.sugar = 0 ;
    }
    public IRequest(IRequest request) {
        this.type = request.type ;
        this.sugar = request.sugar ;
    }
    public double visitPrice(PriceVisitor priceVisitor) {
       return priceVisitor.visit(this) ;
    }

    public IRequest build() {
        return this ;
    }

    public  IRequest withSugar(int count)
    {

        this.sugar = count ;
        return this ;
    }

    public String print(String output) {

        output+=this.type+" "+ this.sugar+" ";

        if(this.sugar==0) {
            output+="no stick";
        }
        else {
            output+="with stick" ;
        }

        output = output + visitPrice(new PriceVisitor());
        return output ;
    }

    public void test() {
        System.out.println("IREQUEST") ;
    }
}

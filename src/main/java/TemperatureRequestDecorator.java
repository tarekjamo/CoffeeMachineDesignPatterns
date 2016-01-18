/**
 * Created by tarekray on 8/29/2015.
 */
public abstract class TemperatureRequestDecorator extends IRequest {
    public IRequest request ;

    public TemperatureRequestDecorator(IRequest request)
    {
        this.request = request ;
    }


    public void print() {
        System.out.println("Temperatur Request");
    }

}

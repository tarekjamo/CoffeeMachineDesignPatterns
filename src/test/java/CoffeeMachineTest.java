/**
 * Created by tarekray on 8/29/2015.
 */
import junit.framework.TestCase;
import org.junit.Test ;


import static org.fest.assertions.api.Assertions.assertThat;

public class CoffeeMachineTest extends TestCase {
    @Test
    public void coffee_machine_test_chocolate_without_sugar()
    {

        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        IRequest request = RequestFactory.getInstance().newCoffeeRequestBuilder().build().withSugar(0) ;
        //String output = "chocolate 0 no stick";
        String output = "Coffe 0 no stick0.6" ;
        System.out.println(coffeeMachine.process(request, 0.6));
        assertThat(coffeeMachine.process(request, 0.6).equals(output));

    }

    @Test
         public void coffee_machine_test_tea_with_two_sugar()
    {

        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        IRequest request = RequestFactory.getInstance().newTeaRequestBuilder().build().withSugar(2) ;
        TemperatureRequestDecorator temperatureRequestDecorator = new ExtraHotRequestDecorator(request) ;
        String output = "Extra hot Tea 2 with stick0.4" ;
        System.out.println(coffeeMachine.process(temperatureRequestDecorator, 0.5));
        assertThat(coffeeMachine.process(temperatureRequestDecorator, 0.5).equals(output));

    }


    @Test
    public void coffee_machine_test_tea_with_two_sugar_extra_hot_in_cartoon()
    {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        IRequest request = RequestFactory.getInstance().newTeaRequestBuilder().build().withSugar(2) ;
        TemperatureRequestDecorator  temperatureRequestDecorator= new ExtraHotRequestDecorator(request) ;
        CartoonRequestDecorator cartoonRequestDecorator = new CartoonRequestDecorator(temperatureRequestDecorator);
        String output = "Cartoon Extra hot Tea 2 with stick0.4" ;
        System.out.println(coffeeMachine.process(cartoonRequestDecorator, 0.3));
        assertThat(coffeeMachine.process(temperatureRequestDecorator, 0.3).equals(output));

    }
    @Test
    public void test_all()
    {

        coffee_machine_test_chocolate_without_sugar() ;
        coffee_machine_test_tea_with_two_sugar() ;
        coffee_machine_test_tea_with_two_sugar_extra_hot_in_cartoon() ;
    }

}

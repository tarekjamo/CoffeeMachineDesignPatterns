/**
 * Created by tarekray on 8/29/2015.
 */
public interface IRequestBuilder {

    IRequestBuilder withSugar(int sugar);
    public IRequest build();
}


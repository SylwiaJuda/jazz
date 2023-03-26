package pll.pjatk.zjaz2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class IGetBean {


    public IGetBean(  @Value("${first.value:uh oh}") String valueFromProperties) {

        System.out.println(valueFromProperties);
    }
}


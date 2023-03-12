package pl.pjatk.syljud;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class three {
    public three(ApplicationContext context) {
    One one= context.getBean("one", One.class);
    Two two = context.getBean("two", Two.class);

    }
}

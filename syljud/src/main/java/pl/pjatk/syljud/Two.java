package pl.pjatk.syljud;

import org.springframework.stereotype.Component;

@Component

public class Two {
    public Two() {
    }

    public void printTwo(One one){
    one.printOne();
    System.out.printf("second2");

    }
}


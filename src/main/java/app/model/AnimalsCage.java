package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class AnimalsCage {
    private Timer time = new Timer();
    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    public Timer getTimer() {
        return time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
}

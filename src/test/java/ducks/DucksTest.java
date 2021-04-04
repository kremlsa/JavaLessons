package ducks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DucksTest {
    static List<Duck> ducks = new ArrayList<>();

    @BeforeAll
    @DisplayName("Create ducks")
    public static void createDucks() {
        ducks.add(new MallardDuck());
        ducks.add(new ModelDuck());
        ducks.add(new RubberDuck());
    }

    @Test
    @DisplayName("Duck fly")
    public void testFly() {
        for (Duck d : ducks) {
            System.out.print(d.getClass().getName() + " ");
            d.performFly();
        }
    }

    @Test
    @DisplayName("Duck quack")
    public void testQuack() {
        for (Duck d : ducks) {
            System.out.print(d.getClass().getName() + " ");
            d.performQuack();
        }
    }

    @Test
    @DisplayName("Duck swim")
    public void testSwim() {
        for (Duck d : ducks) {
            System.out.print(d.getClass().getName() + " ");
            d.swim();
        }
    }

}
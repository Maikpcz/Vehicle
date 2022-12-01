package de.neueFische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void fahrradErhoehtDieGeschwindigkeit() {
        //given
        Bike bike1 = new Bike();
        //when
        int actual = bike1.accelerate(20);
        //then
        assertEquals(20,actual);
    }
    @Test
    void fahrradErhoehtDieGeschwindigkeitBis35Kmh() {
        //given
        Bike bike1 = new Bike();
        bike1.setVelocity(10);
        //when
        int actual = bike1.accelerate(20);
        //then
        assertEquals(34,actual);
    }
  @Test
    void wennGeschwindigkeitMehrAls35KmhIstFehler() {
        //given
        Bike bike1 = new Bike();
        bike1.setVelocity(20);
        //when //then
        try { bike1.accelerate(20);
            Assertions.fail();
        }catch (IllegalArgumentException a){

        }
    }


}
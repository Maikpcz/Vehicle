package de.neueFische;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CarTest {

    @Test
    void accelerate() {
        //given
        Car carTest = new Car();
        //when
        int actual = carTest.accelerate(20);
        //then
        assertEquals(20,actual);
    }
    @Test
    void geschwindigkeitWirdErhoet() {
        //given
        Car carTest = new Car();
        carTest.accelerate(20);
        //when
        int actual = carTest.getVelocity();
        //then
        assertEquals(20,actual);

}

    @Test
     void geschwindigkeitWirdErhoehtInBewegung() {
        //given
        Car carTest = new Car();
        carTest.setVelocity(14);
        //when
        int actual = carTest.accelerate(30);
        //then
        assertEquals(50,actual);
}

}
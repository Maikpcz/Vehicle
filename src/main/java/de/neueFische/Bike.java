package de.neueFische;

public class Bike extends Vehicle {

    @Override
    public int accelerate(int kmh) {

        if ((getVelocity() + kmh) < 35) {
            setVelocity(getVelocity()+kmh);
            System.out.println(getVelocity());
            return getVelocity();
        }
       else throw new IllegalArgumentException("That Bike can not higher speed as 35 Kmh");

    }
}
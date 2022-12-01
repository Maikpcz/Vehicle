package de.neueFische;


public class Car extends Vehicle{



        @Override
        public int accelerate(int kmh) {
            setVelocity(getVelocity() + kmh);
            System.out.println(getVelocity());
            return getVelocity();
        };
    };




/*
 *    Copyright &copy; Flagstar Bank 2012.
 *
 *    Copyright in the application source code, and in the information and
 *    material therein and in their arrangement, is owned by Flagstar Bank, FSB
 *    unless otherwise indicated.
 *
 *    You shall not remove or obscure any copyright, trademark or other notices.
 *    You may not copy, republish, redistribute, transmit, participate in the
 *    transmission of, create derivatives of, alter edit or exploit in any
 *    manner any material including by storage on retrieval systems, without the
 *    express written permission of Flagstar Bank.
 */

package com.training.java.core.polymorphism;

/**
 * Traveller.
 *
 * @author  Ram
 */

public class Traveller
{
    private final Car car;

    public Traveller(final Car car)
    {
        this.car = car;
    }

    public void travel()
    {
        System.out.println("Traveller is travelling in a car");
        car.start();
        System.out.println("Current speed = " + car.getCurrentSpeed());
        car.accelerate(50);
        System.out.println("Current speed = " + car.getCurrentSpeed());
        car.applyBrakes(20);
        System.out.println("Current speed = " + car.getCurrentSpeed());
        car.stop();
    }

}

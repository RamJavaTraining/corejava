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
 * RaceCar.
 *
 * @author  Ram
 */

public class RaceCar extends Car
{
    /**
     * {@inheritDoc}
     */
    @Override
    public void accelerate(final int byHowMuch)
    {
        System.out.println("Race car is accelerating");
        int tempSpeed = getCurrentSpeed() + (byHowMuch * 2);
        if (tempSpeed > getMaximumSpeed())
        {
            setCurrentSpeed(getMaximumSpeed());
        }
        else
        {
            setCurrentSpeed(tempSpeed);
        }
    }
}

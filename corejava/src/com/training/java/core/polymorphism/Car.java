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
 * Car.
 *
 * @author  Ram
 */

public class Car
{
    private int currentSpeed;
    private final int maximumSpeed = 140;
    private int numberOfTires;
    private boolean started;

    /**
     * @return	currentSpeed
     */
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    /**
     * @param currentSpeed sets currentSpeed
     */
    public void setCurrentSpeed(final int currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }

    /**
     * @return	numberOfTires
     */
    public int getNumberOfTires()
    {
        return numberOfTires;
    }

    /**
     * @param numberOfTires sets numberOfTires
     */
    public void setNumberOfTires(final int numberOfTires)
    {
        this.numberOfTires = numberOfTires;
    }

    /**
     * @return	started
     */
    public boolean isStarted()
    {
        return started;
    }

    /**
     * @param started sets started
     */
    public void setStarted(final boolean started)
    {
        this.started = started;
    }

    /**
     * @return	maximumSpeed
     */
    public int getMaximumSpeed()
    {
        return maximumSpeed;
    }

    public void start()
    {
        System.out.println("Car is starting");
        started = true;
    }

    public void stop()
    {
        System.out.println("Car is stopping");
        started = false;
    }

    public void accelerate(final int byHowMuch)
    {
        int tempSpeed = currentSpeed + byHowMuch;
        currentSpeed = (tempSpeed > maximumSpeed) ? maximumSpeed : tempSpeed;
    }

    public void applyBrakes(final int byHowMuch)
    {
        int tempSpeed = currentSpeed - byHowMuch;
        currentSpeed = (tempSpeed < 0) ? 0 : tempSpeed;
    }
}

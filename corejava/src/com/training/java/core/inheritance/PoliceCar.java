/*
 *    Copyright &copy; Flagstar Bank 2011.
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

package com.training.java.core.inheritance;

/**
 * PoliceCar.
 *
 * @author  Ram
 */

public class PoliceCar extends Car
{
    private boolean sirenOn;
    private boolean ledLightsOn;
    
    public void turnOnSiren()
    {
        System.out.println("Turning on siren for PoliceCar");
        sirenOn = true;
    }
    
    public void turnOffSiren()
    {
        System.out.println("Turning off siren for PoliceCar");
        sirenOn = false;
    }

    public void turnOnLedLights()
    {
        System.out.println("Turning on LED lights for PoliceCar");
        ledLightsOn = true;
    }
    
    public void turnOffLedLights()
    {
        System.out.println("Turning off LED lights for PoliceCar");
        ledLightsOn = false;
    }
}

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
 * CarDemo.
 * 
 * @author Ram
 */

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        // Car can call all of his methods, no surprise
        Car aCar = new Car();

        System.out.println("************Car BEGIN*************");
        aCar.start();
        aCar.accelerate(50);
        aCar.applyBrakes(10);
        aCar.printInformation();
        aCar.stop();
        System.out.println("************Car END*************");
        System.out.println();
        
        // Now, we will instantiate PoliceCar and we will be able to call all the methods from Car without duplicating
        // the code into PoliceCar
        PoliceCar aPoliceCar = new PoliceCar();
        
        System.out.println("************PoliceCar BEGIN*************");
        aPoliceCar.start();
        aPoliceCar.accelerate(90);
        aPoliceCar.applyBrakes(40);
        aPoliceCar.accelerate(20);
        aPoliceCar.turnOnSiren();
        aPoliceCar.turnOnLedLights();
        aPoliceCar.printInformation();
        aPoliceCar.stop();
        System.out.println("************PoliceCar BEGIN*************");
    }

}

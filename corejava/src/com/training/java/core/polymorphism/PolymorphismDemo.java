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
 * PolymorphismDemo.
 *
 * @author  Ram
 */

public class PolymorphismDemo
{
    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        Car car = new Suv();

        Traveller traveller = new Traveller(car);
        traveller.travel();
    }
}

package org.ezo;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Main.class.getName());

        Calculator calculator = new Calculator();
        logger.info(()->calculator.calculate("1 + 2"));
        logger.info(()->calculator.calculate("2 + 2 * 5 + 5"));
        logger.info(()->calculator.calculate("sqrt(4)"));
        logger.info(()->calculator.calculate("2^8"));
        logger.info(()->calculator.calculate("1 / 0"));
        logger.info(()->calculator.calculate("(2+5)*3"));
        logger.info(()->calculator.calculate("-1--1"));
        logger.info(()->calculator.calculate("1+-2"));


    }
}
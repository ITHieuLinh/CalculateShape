package controller;

import Repository.CalculatorRepository;

public class Calculator {

    CalculatorRepository program;

    public Calculator() {
        program = new CalculatorRepository();
    }

    public void run() {
        System.out.println("\nCalculator Shape Program");
        program.inputandcalculatorShape();
    }
}

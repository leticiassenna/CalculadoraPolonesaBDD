package br.ifes.leticia.CalculadoraPolonesaBDD.model;

import java.util.Stack;

import br.ifes.leticia.CalculadoraPolonesaBDD.control.Expressao;


public class Subtracao implements Expressao  {
    private Stack<Double> stack;
    public Subtracao(Stack<Double> stack) {
        this.stack = stack;
    }

    
    public Double interpret() {
        Double result = null;
        if( stack.size() > 1) {
            Double n1 = stack.pop();
            Double n2 = stack.pop();
            result = n2 - n1;
        }
        return result;
    }

}

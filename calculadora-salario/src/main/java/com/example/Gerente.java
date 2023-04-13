package com.example;

class Gerente implements RegraCalculo {
    @Override
    public double calculaDesconto(double salarioBase) {
        if (salarioBase >= 5000) {
            return salarioBase * 0.3;
        } else {
            return salarioBase * 0.2;
        }
    }
}

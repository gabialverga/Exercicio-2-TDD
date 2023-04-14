package com.example;

class Desenvolvedor implements RegraCalculo {
    @Override
    public double calculaDesconto(double salarioBase) {
        if (salarioBase >= 3000) {
            return salarioBase * 0.2;
        } else {
            return salarioBase * 0.1;
        }
    }
}

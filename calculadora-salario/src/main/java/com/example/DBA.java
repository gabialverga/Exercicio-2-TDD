package com.example;

class DBA implements RegraCalculo {
    @Override
    public double calculaDesconto(double salarioBase) {
        if (salarioBase >= 2000) {
            return salarioBase * 0.25;
        } else {
            return salarioBase * 0.15;
        }
    }
}
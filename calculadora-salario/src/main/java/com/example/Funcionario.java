package com.example;

public class Funcionario {
    private String nome;
    private String email;
    private double salarioBase;
    private RegraCalculo regraCalculo;

    public Funcionario(String nome, String email, double salarioBase, RegraCalculo regraCalculo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.regraCalculo = regraCalculo;
    }

    public double getSalarioLiquido() {
        return salarioBase - regraCalculo.calculaDesconto(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public RegraCalculo getRegraCalculo() {
        return regraCalculo;
    }

    public void setRegraCalculo(RegraCalculo regraCalculo) {
        this.regraCalculo = regraCalculo;
    }
}
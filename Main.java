package com.company;

public class Main {

    public static void main(String[] args) {

        Psiquiatra doutor = new Psiquiatra();
        HappyObject pacienteFeliz = new HappyObject();
        SadObject sujeitoInfeliz = new SadObject();

        System.out.println("Examinando paciente 1:\n");
        doutor.examinar(pacienteFeliz);
        doutor.observar(pacienteFeliz);


        System.out.println("Examinando paciente 2:\n");
        doutor.examinar(sujeitoInfeliz);
        doutor.observar(sujeitoInfeliz);

    }
}
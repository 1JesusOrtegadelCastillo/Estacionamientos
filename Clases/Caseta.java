package com.company.Clases;

public class Caseta extends Estacionamiento {
    private int precio = 10;
    int total;

    public Caseta(String slots, int horaEntrada, int horaSalida, int precio){
        super(slots, horaEntrada, horaSalida);
    }

    public void cobrar(){
        total = precio * (getHoraEntrada() + getHoraSalida());
        System.out.println("El monto a pagar es: " + total);
    }

    public void imprimirTicket(){
        System.out.println("Estacionamiento: "+ getSlots() + " Hora de entrada: " + getHoraEntrada() + " Hora de salida: " + getHoraSalida() + " Total: ");
    }

}

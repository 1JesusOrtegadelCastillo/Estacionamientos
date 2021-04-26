package com.company.Clases;

import java.util.Date;

public class Estacionamiento {
    private String slots;
    private int horaEntrada;
    private int horaSalida;

    public Estacionamiento(String slots, int horaEntrada, int horaSalida){
        this.slots = slots;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getSlots() {
        return slots;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }
}

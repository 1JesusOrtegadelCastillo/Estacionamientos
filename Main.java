package com.company;

import com.company.Clases.Caseta;

public class Main {

    public static void main(String[] args) {
        Caseta caseta1 = new Caseta("[SL001]", 1, 2, 10);
        caseta1.imprimirTicket();
        caseta1.cobrar();
    }
}

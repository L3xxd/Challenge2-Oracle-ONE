package com.l3xxd.conversormulti;

public class Operations {

    private double input_value;
    private int chbox_values_1,chbox_values_2;
    private  double final_value;

    public double getInput_value() {
        return input_value;
    }

    public void setInput_value(double input_value) {
        this.input_value = input_value;
    }

    public int getChbox_values_1() {
        return chbox_values_1;
    }

    public void setChbox_values_1(int chbox_values_1) {
        this.chbox_values_1 = chbox_values_1;
    }

    public int getChbox_values_2() {
        return chbox_values_2;
    }

    public void setChbox_values_2(int chbox_values_2) {
        this.chbox_values_2 = chbox_values_2;
    }

    public double getFinal_value() {
        return final_value;
    }

    public void setFinal_value(double final_value) {
        this.final_value = final_value;
    }

    public Operations() {
    }

    // Logica segun el tipo de moneda Agosto de 2023.

    //             0 -> Dolar
    // ---- Dolar a Euro = .92 ----
    // ---- Dolar a Dolar = 1 ----
    // ---- Dolar a Peso Mexicano = 17.06 ----
    // ---- Dolar a Yen = 145.42 ----

    //             1 -> Euro
    // ---- Euro a Dolar = 1.09 ----
    // ---- Euro a Euro = 1 ----
    // ---- Euro a Peso Mexicano = 18.55 ----
    // ---- Euro a Yen = 158.37 ----

    //             2 -> Peso Mexicano
    // ---- Peso Mexicano a Dolar = 0.059    ----
    // ---- Peso Mexicano a Peso Mexicano = 1 ----
    // ---- Peso Mexicano a Peso Euro = 18.55 ----
    // ---- Peso Mexicano a Yen = 158.37 ----

    //             3 -> Yen
    // ---- Yen a Dolar = 0.0069  ----
    // ---- Yen a Peso Mexicano = 0.12 ----
    // ---- Yen a Peso Euro = 0.0063 ----
    // ---- Yen a Yen = 1 ----

    public  double convertir(){
        switch (chbox_values_1){
//             0 -> Dolar
            case 0:
                switch (chbox_values_2){
                    case 0:final_value = ((input_value) * (1));break;
                    case 1:final_value = ((input_value) * (0.92)) ;break;
                    case 2:final_value = ((input_value) * (17.06)) ;break;
                    case 3:final_value = ((input_value) * (145.42)) ;break;
                }
                break;

//             1 -> Euro
            case 1:
                switch (chbox_values_2){
                    case 0:final_value = ((input_value) * (1.09));break;
                    case 1:final_value = ((input_value) * (1)) ;break;
                    case 2:final_value = ((input_value) * (18.55)) ;break;
                    case 3:final_value = ((input_value) * (158.37)) ;break;
                }break;

//             2 -> Peso Mexicano
            case 2:
                switch (chbox_values_2){
                    case 0:final_value = ((input_value) * ( 0.059));break;
                    case 1:final_value = ((input_value) * (0.054)) ;break;
                    case 2:final_value = ((input_value) * (1)) ;break;
                    case 3:final_value = ((input_value) * (8.52)) ;break;
            }
                break;

//             3 -> Yen
            case 3:
                switch (chbox_values_2){
                    case 0:final_value = ((input_value) * (0.0069));break;
                    case 1:final_value = ((input_value) * (0.0063)) ;break;
                    case 2:final_value = ((input_value) * (0.12)) ;break;
                    case 3:final_value = ((input_value) * (1)) ;break;
                }
                break;
        }
        return final_value;
    }
}

package com.sol.model;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private static int contadorIdTrans= 0;
    private int idTrans;
    private double monto;
    private LocalDateTime fecha;
    private LocalTime time;
    private String concepto;
    private int huespedDNI;
    private String tipoServicio;

    public Transaction(int idTrans, double monto, LocalDateTime fecha, LocalTime time, String concepto, int huespedDNI, String tipoServicio) {
        this.idTrans = ++contadorIdTrans;
        this.monto = monto;
        LocalDateTime ahora = LocalDateTime.now();
        this.fecha = ahora;
        this.time = ahora.toLocalTime();
        this.concepto = concepto;
        this.huespedDNI = huespedDNI;
        this.tipoServicio = tipoServicio;
    }

    


}

package com.projectDIO.BusOperationPPO.domain;

import java.time.format.DateTimeFormatter;

/**
 * @author Fellipe Toledo
 * @created 24/11/2021
 */
public class Conventional extends Bus{

    private int line;

    public Conventional() {
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return  "\nInicio da operação: " + getOperationStartTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")) +
                "\nNúmero de Ordem: " + getOrderNumber() +
                "\nConsórcio: " + getConsortium() +
                "\nEmpresa: " + getCompany() +
                "\nLinha: " + line +
                "\n------------------------";
    }
}

package com.projectDIO.BusOperationPPO.domain;

/**
 * @author Fellipe Toledo
 * @created 24/11/2021
 */
public class Brt extends Bus{

    private String busLane;

    public Brt(){
    }

    public Brt(String busLane) {
        this.busLane = busLane;
    }

    public String getBusLane() {
        return busLane;
    }

    public void setBusLane(String busLane) {
        this.busLane = busLane;
    }

    @Override
    public String toString() {
        return  "\nNumero de Ordem: " + getOrderNumber() +
                "\nConsórcio: " + getConsortium() +
                "\nEmpresa: " + getCompany() +
                "\nCorredor: " + busLane +
                "\n------------------------";
    }
}

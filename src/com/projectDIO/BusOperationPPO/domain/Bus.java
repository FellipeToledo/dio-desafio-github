package com.projectDIO.BusOperationPPO.domain;

import java.time.LocalTime;

/**
 * @author Fellipe Toledo
 * @created 24/11/2021
 */
public abstract class Bus {

    private String consortium;
    private String company;
    private String orderNumber;
    private LocalTime operationStartTime;
    private LocalTime operationEndTime;

    public String getConsortium() {
        return consortium;
    }

    public void setConsortium(String consortium) {
        this.consortium = consortium;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalTime getOperationStartTime() {
        return operationStartTime;
    }

    public void setOperationStartTime(LocalTime operationStartTime) {
        this.operationStartTime = operationStartTime;
    }

    public LocalTime getOperationEndTime() {
        return operationEndTime;
    }

    public void setOperationEndTime(LocalTime operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

}

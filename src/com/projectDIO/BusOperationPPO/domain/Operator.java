package com.projectDIO.BusOperationPPO.domain;

import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * @author Fellipe Toledo
 * @created 26/11/2021
 */
public class Operator {

    private String name;
    private Set<Bus> standByBus = new LinkedHashSet<>();
    private Set<Bus> busInOperation = new LinkedHashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Bus> getStandByBus() {
        return standByBus;
    }

    public void setStandByBus(Set<Bus> standByBus) {
        this.standByBus = standByBus;
    }

    public Set<Bus> getBusInOperation() {
        return busInOperation;
    }

    public void setBusInOperation(Set<Bus> busInOperation) {
        this.busInOperation = busInOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return Objects.equals(name, operator.name) &&
                Objects.equals(standByBus, operator.standByBus) &&
                Objects.equals(busInOperation, operator.busInOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, standByBus, busInOperation);
    }

    @Override
    public String toString() {
        return  "\nDados do operador:" +
                "\nNome: " + name +
                "\nÔnibus em standby: " + standByBus +
                "\nÔnibus em operação: " + busInOperation +
                "\n-------------------------" + "\n";
    }

    public void linkOperatorToOperation(Operation linkOperator) {
        linkOperator.getLinkedOperators().add(this);

    }

    public void putBusIntoStandby(Operation busInto){
        Optional<Bus> bus = busInto.getBusInGarage().stream().findFirst();
        if (bus.isPresent()){
            this.standByBus.add(bus.get());
            busInto.getBusInGarage().remove(bus.get());
        }else {
            System.out.println("Não há Ônibus na Garagem!!");
        }
    }

    public void putBusIntoOperation() {
        Optional<Bus> bus = this.standByBus.stream().findFirst();
        if (bus.isPresent()) {
            this.busInOperation.add(bus.get());
            this.standByBus.remove(bus.get());
            bus.get().setOperationStartTime(LocalTime.now());
        }else {
            System.out.println("Não há ônibus em standby!!");
        }
    }

    public void removeBusFromOperation(){
        Optional<Bus> bus = this.busInOperation.stream().findFirst();
        if (bus.isPresent()) {
            this.standByBus.add(bus.get());
            this.busInOperation.remove(bus.get());
        }else {
            System.out.println("Não há ônibus em operação!!");
        }
    }
}

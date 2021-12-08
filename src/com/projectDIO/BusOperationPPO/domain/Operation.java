package com.projectDIO.BusOperationPPO.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Fellipe Toledo
 * @created 24/11/2021
 */
public class Operation {

    private String description;
    private final LocalDateTime initialTime = LocalDateTime.now();
    private Set<Operator> linkedOperators = new LinkedHashSet<>();
    private Set<Bus> busInGarage = new LinkedHashSet<>();


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getInitialTime() {
        return initialTime;
    }

    public Set<Operator> getLinkedOperators() {
        return linkedOperators;

    }
        public void setLinkedOperators(Set<Operator> linkedOperators) {
        this.linkedOperators = linkedOperators;
    }

    public Set<Bus> getBusInGarage() {
        return busInGarage;
    }

    public void setBusInGarage(Set<Bus> busInGarage) {
        this.busInGarage = busInGarage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return Objects.equals(description, operation.description) &&
                Objects.equals(initialTime, operation.initialTime) &&
                Objects.equals(linkedOperators, operation.linkedOperators)
                && Objects.equals(busInGarage, operation.busInGarage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, initialTime, linkedOperators, busInGarage);
    }

    @Override
    public String toString() {
        return  "Dados da Operação:\n" +
                "Descrição: " + description +
                "\nData e hora de inicio: " + initialTime.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss"))  +
                "\nOperadores vinculados:\n " + linkedOperators +
                "\n-------------------------" ;
    }
}

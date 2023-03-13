package com.mardoqueu.helpdeskv3.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mardoqueu.helpdeskv3.domain.enums.Priority;
import com.mardoqueu.helpdeskv3.domain.enums.Status;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Call implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataOpen = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataClose;
    private Priority priority;
    private Status status;
    private String title;
    private String observations;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technician;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Call() {
        super();
    }

    public Call(Integer id, Priority priority, Status status, String title, String observations, Technician technician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.observations = observations;
        this.technician = technician;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataOpen() {
        return dataOpen;
    }

    public void setDataOpen(LocalDate dataOpen) {
        this.dataOpen = dataOpen;
    }

    public LocalDate getDataClose() {
        return dataClose;
    }

    public void setDataClose(LocalDate dataClose) {
        this.dataClose = dataClose;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Call call)) return false;
        return getId().equals(call.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

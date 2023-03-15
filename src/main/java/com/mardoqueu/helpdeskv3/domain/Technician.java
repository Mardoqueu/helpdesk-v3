package com.mardoqueu.helpdeskv3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Technician extends People{
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "technician")
    private List<Call> call = new ArrayList<>();

    public Technician() {
        super();
    }

    public Technician(Integer id, String name, String cpf, String email, String password) {
        super(id, name, cpf, email, password);
    }

    public List<Call> getCall() {
        return call;
    }

    public void setCall(List<Call> call) {
        this.call = call;
    }
}

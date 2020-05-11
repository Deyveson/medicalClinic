package com.br.medicalClinic.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Doctor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @Column(name = "specialization", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specialization;

    @OneToMany(mappedBy = "doctor", targetEntity = Appointment.class)
    private List<Appointment> appointment = new ArrayList<Appointment>();

    public Doctor(Long id, String name, String specialization, List<Appointment> appointment) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.appointment = appointment;
    }

    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(List<Appointment> appointment) {
        this.appointment = appointment;
    }
}

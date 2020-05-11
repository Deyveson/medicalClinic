package com.br.medicalClinic.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @Column(name = "password", columnDefinition = "VARCHAR(50)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    @OneToMany(mappedBy = "user", targetEntity = Appointment.class)
    private List<Appointment> appointments = new ArrayList<>();

    public User(Long id, String name, String password, List<Appointment> appointments) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.appointments = appointments;
    }

    public User() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}

package com.br.medicalClinic.controller;

import com.br.medicalClinic.domain.Appointment;
import com.br.medicalClinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    private ClinicService clinicaService;

    @RequestMapping(value = "/registerAppointment", method = RequestMethod.POST)
    public Appointment registerAppointment(@RequestBody Appointment appointment) {
        return clinicaService.registerAppointment(appointment);
    }

    @CrossOrigin
    @RequestMapping(value = "/allAppointment", method = RequestMethod.GET)
    public List<Appointment> allAppointment() {
        return clinicaService.allAppointment();
    }

}

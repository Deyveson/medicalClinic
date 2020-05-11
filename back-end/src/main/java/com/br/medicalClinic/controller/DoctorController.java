package com.br.medicalClinic.controller;

import com.br.medicalClinic.domain.Doctor;
import com.br.medicalClinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    private ClinicService clinicaService;

    @RequestMapping(value = "/registerDoctor", method = RequestMethod.POST)
    public Doctor registerDoctor(@RequestBody Doctor doctor) {
        return clinicaService.registerDoctor(doctor);
    }

    @CrossOrigin
    @RequestMapping(value = "/allDoctor", method = RequestMethod.GET)
    public List<Doctor> allDoctor() {
        return clinicaService.allDoctor();
    }
}

package com.br.medicalClinic.service;
import com.br.medicalClinic.domain.Appointment;
import com.br.medicalClinic.domain.Doctor;
import com.br.medicalClinic.domain.User;

import java.util.List;

public interface ClinicService {
    Doctor registerDoctor(Doctor doctor);
    User registerClient(User user);
    List <User> allClient();
    List <Doctor> allDoctor();
    Appointment registerAppointment(Appointment appointment);
    List <Appointment> allAppointment();
    Boolean loginClient(String nick, String senha);
}

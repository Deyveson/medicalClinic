package com.br.medicalClinic.service.impl;

import com.br.medicalClinic.domain.Appointment;
import com.br.medicalClinic.domain.Doctor;
import com.br.medicalClinic.domain.User;
import com.br.medicalClinic.repository.AppointmentRepository;
import com.br.medicalClinic.repository.DoctorRepository;
import com.br.medicalClinic.repository.UserRepository;
import com.br.medicalClinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ClinicService")
public class ClinicaServiceImpl implements ClinicService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Doctor registerDoctor(Doctor doctor){

        doctorRepository.save(doctor);

        return doctor;
    }

    @Override
    public List<Doctor> allDoctor(){
        return doctorRepository.findAll();
    }


    @Override
    public User registerClient(User user) {

        userRepository.save(user);

        return user;
    }

    public Object[] loginClient(String nick, String senha){
        Object[] user = userRepository.findClient(nick, senha);
        return user;
    }

    @Override
    public List<User> allClient(){
        return userRepository.findAll();
    }

    @Override
    public Appointment registerAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
        return  appointment;
    }

    @Override
    public List<Appointment> allAppointment(){
        return appointmentRepository.findAll();
    }

}

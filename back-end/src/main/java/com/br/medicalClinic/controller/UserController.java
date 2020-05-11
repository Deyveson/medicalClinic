package com.br.medicalClinic.controller;

import com.br.medicalClinic.domain.User;
import com.br.medicalClinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private ClinicService clinicaService;

    @RequestMapping(value = "/registerClient", method = RequestMethod.POST)
    public User registerClient(@RequestBody User user) {
        return clinicaService.registerClient(user);
    }

    @CrossOrigin
    @RequestMapping(value = "/allClient", method = RequestMethod.GET)
    public List<User> allClient() {
        return clinicaService.allClient();
    }

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login(@RequestParam(value = "nick", defaultValue = "", required = true) String nick,
                               @RequestParam(value = "senha", defaultValue = "", required = true) String senha){
        return clinicaService.loginClient(nick, senha);
    }

}

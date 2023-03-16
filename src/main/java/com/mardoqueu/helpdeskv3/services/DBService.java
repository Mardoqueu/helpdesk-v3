package com.mardoqueu.helpdeskv3.services;

import com.mardoqueu.helpdeskv3.Repositories.CallRepository;
import com.mardoqueu.helpdeskv3.Repositories.ClientRepository;
import com.mardoqueu.helpdeskv3.Repositories.TechnicianRepository;
import com.mardoqueu.helpdeskv3.domain.Call;
import com.mardoqueu.helpdeskv3.domain.Client;
import com.mardoqueu.helpdeskv3.domain.Technician;
import com.mardoqueu.helpdeskv3.domain.enums.Priority;
import com.mardoqueu.helpdeskv3.domain.enums.Profile;
import com.mardoqueu.helpdeskv3.domain.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    TechnicianRepository technicianRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CallRepository callRepository;

    public void instanceDB(){
        Technician tec1 = new Technician(null, "Mardoqueu sousa", "41495741974",  "mdq767@gmail.com", "123");
        tec1.addProfile(Profile.ADMIN);

        Client cli1 = new Client(null, "Maria Sara da Mata", "80527954780", "maria.sara.damata@poolrescue.com.br", "123");

        Call c1 = new Call(null, Priority.MEDIUM, Status.PROGRESS, "Call 01", "First call", tec1, cli1);

        technicianRepository.saveAll(Arrays.asList(tec1));
        clientRepository.saveAll(Arrays.asList(cli1));
        callRepository.saveAll(Arrays.asList(c1));
    }
}

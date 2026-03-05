package com.exemplo.biosense.controller;

import com.exemplo.biosense.model.SensorData;
import com.exemplo.biosense.repository.SensorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")// permite que o Flutter acesse a API sem bloqueio de segurança (CORS)
public class SensorController {

    private final SensorRepository repository;

    public SensorController(SensorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/atual")
    public SensorData getDadosAtuais() {
        return repository.findFirstByOrderByDataLeituraDesc();
    }
}
package com.exemplo.biosense.service;

import com.exemplo.biosense.model.SensorData;
import com.exemplo.biosense.repository.SensorRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service // Isso avisa ao Spring que esta classe é um serviço
public class ArduinoMockService {

    private final SensorRepository repository;
    private final Random random = new Random();

    // Construtor para o Spring injetar o repositório automaticamente
    public ArduinoMockService(SensorRepository repository) {
        this.repository = repository;
    }

    @Scheduled(fixedRate = 5000) // Faz o código rodar a cada 5 segundos
    public void simularEnvioDados() {
        SensorData data = new SensorData();

        // Simulando valores realistas
        data.setTemperatura(20 + random.nextDouble() * 23); // Gera entre 20°C e 43°C
        data.setHumidade(20 + random.nextDouble() * 40);    // Gera entre 40% e 80%
        data.setLuminosidade(random.nextDouble() * 1023);  // Padrão analógico do Arduino

        // Salva no banco de dados H2
        repository.save(data);

        // Exibe no console para você ver que está funcionando
        System.out.println("Recebendo dados do Arduino : " + data);
    }
}
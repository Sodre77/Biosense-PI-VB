package com.exemplo.biosense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;

@Data // Gera automaticamente Getters, Setters e o método toString
@Entity // Transforma a classe em uma tabela no banco de dados
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double temperatura;
    private Double humidade;
    private Double luminosidade;
    private LocalDateTime dataLeitura = LocalDateTime.now();
}
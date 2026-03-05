package com.exemplo.biosense.repository;

import com.exemplo.biosense.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<SensorData, Long> {
    // Busca o dado mais recente baseado na data de leitura
    SensorData findFirstByOrderByDataLeituraDesc();
}
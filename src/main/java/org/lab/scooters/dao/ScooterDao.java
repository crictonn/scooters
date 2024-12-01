package org.lab.scooters.dao;

import org.lab.scooters.models.Scooter;

import java.util.List;
import java.util.Optional;

public interface ScooterDao {
    void saveScooter(Scooter scooter);
    void updateScooter(Scooter scooter);
    void deleteScooter(Scooter scooter);
    Scooter getScooterByID(Long id);
    List<Scooter> getAllScooters();
}

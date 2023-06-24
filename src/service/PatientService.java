package service;

import model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> addPatient(List<Patient> patients);

    Optional<Patient> getPatientByfirstName(String name);

    void groupingByGender();

    List<Patient> filterByAge();
}

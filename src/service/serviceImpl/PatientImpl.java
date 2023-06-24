package service.serviceImpl;

import dao.DataBase;
import enums.Gender;
import model.Patient;
import service.PatientService;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PatientImpl  implements PatientService {
     private DataBase dataBase;
    List<Patient>patientsList;
    @Override
    public List<Patient> addPatient(List<Patient> patients) {
        return dataBase.getPatients();
    }

    @Override
    public Optional<Patient> getPatientByfirstName(String name) {
       return patientsList.stream()
                .filter(patient -> patient.getFirstName().equalsIgnoreCase(name))
                .findFirst();




    }

    @Override
    public void groupingByGender() {
        Map<Gender, List<Patient>> patientsByGender = patientsList.stream()
                .collect(Collectors.groupingBy(Patient::getGender));


        patientsByGender.forEach((gender, patientList) -> {
            System.out.println("Gender: " + gender);
            for (Patient patient : patientList) {
                System.out.println(patient.getFirstName() + " " + patient.getLastName());
            }
            System.out.println();
        });

    }

    @Override
    public List<Patient> filterByAge() {
        return patientsList.stream()
                .filter(patient -> patient.getAge() > 30)
                .collect(Collectors.toList());
    }
}

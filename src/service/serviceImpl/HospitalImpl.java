package service.serviceImpl;

import dao.DataBase;
import model.Hospital;
import service.HospitalService;

import java.util.List;
import java.util.stream.Collectors;

public class HospitalImpl implements HospitalService  {
    DataBase dataBase;

     private List <Hospital> hospitals;

    @Override
    public List<Hospital> addHospitals(List<Hospital> hospitals) {
        return dataBase.getHospitals();
    }

    @Override
    public Hospital getHospitalById(Long id) {
        Hospital hospital= new Hospital();
        hospital.getId().equals(getHospitalById(id));

        return null;
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        for (int i = 0; i < hospitals.size(); i++) {
            Hospital hospital1 = hospitals.get(i);
            if (hospital1.getId().equals(id)) {
                hospital1.setName(hospital.getName());
                hospital1.setAddress(hospital.getAddress());
                hospital1.setDoctors(hospital.getDoctors());
                hospital1.setPatients(hospital.getPatients());
                break;
            }
        }
    }











    @Override
    public List<Hospital> sortHospitalByName(String sort) {
        return hospitals.stream()
                .sorted((hospital, hospital1) -> {
                    if (sort.equalsIgnoreCase("Detskiy bolnisa")) {
                        return hospital.getName().compareTo(hospital1.getName());
                    } else if (sort.equalsIgnoreCase("Osh bolnisa ")) {
                        return hospital.getName().compareTo(hospital1.getName());
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }



}

package service.serviceImpl;

import model.Doctor;
import service.DoctorService;

import java.util.List;
import java.util.stream.Collectors;


public class DoctorImpl implements DoctorService {


     private List<Doctor>doctors;
    public Doctor getDoctorById(Long id) {
        return doctors.stream()
                .filter(doctors -> doctors.getId().equals(id))
                .findFirst()
                .orElse(null);
    }




    @Override
    public List<Doctor> filterByGender(String gender) {
        return doctors.stream()
                .filter(doctor -> doctor.getGender().equals(gender))
                .collect(Collectors.toList());


    }
}

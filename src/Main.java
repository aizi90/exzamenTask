import enums.Gender;
import model.Doctor;
import model.Hospital;
import model.Patient;
import service.DoctorService;
import service.HospitalService;
import service.PatientService;
import service.serviceImpl.DoctorImpl;
import service.serviceImpl.HospitalImpl;
import service.serviceImpl.PatientImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients= new ArrayList<>(List.of(new Patient(1L,"Dastan","Ergeshov",
                "077345670",Gender.MALE,34),
        new Patient(2L,"Aizada","Kanybekova",
                "0220017746",Gender.FEMALE,23)));
       List<Doctor>doctors = new ArrayList<>(List.of(
               new Doctor(1L,
                       "Maksat","Ergeshov", "maksat@gmail.com",patients,Gender.MALE),
               new Doctor(1L,
                       "Farida","Janybekova", "farida@gmail.com",patients,Gender.FEMALE),
               new Doctor(1L,
                       "Aibek","Alihanov", "aibek@gmail.com",patients,Gender.MALE)));

       List<Hospital>hospitals= new ArrayList<>(List.of(
               new Hospital(1L,"Bishkek B", "Chyi22",doctors,patients),
               new Hospital(2L,"Batken B", "Leilek23",doctors,patients),
               new Hospital(3L,"Nookat B", "Nookat24",doctors,patients)));
       HospitalService hospitalService= new HospitalImpl();

        System.out.println(hospitalService.getHospitalById(1L));
        PatientService  patientService = new PatientImpl();
        System.out.println(patientService.addPatient(patients));
        System.out.println(patientService.getPatientByfirstName("A"));
        patientService.groupingByGender();
        DoctorService doctorService = new DoctorImpl();
        System.out.println(doctorService.getDoctorById(1L));
        doctorService.filterByGender("Female");



    }
        }












package dao;

import model.Doctor;
import model.Hospital;
import model.Patient;

import java.util.List;

public class DataBase {
    private List<Hospital>hospitals;
    private List<Patient>patients;
    private List<Doctor>doctors;

    public DataBase(List<Hospital> hospitals, List<Patient> patients, List<Doctor> doctors) {
        this.hospitals = hospitals;
        this.patients = patients;
        this.doctors = doctors;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "hospitals=" + hospitals +
                ", patients=" + patients +
                ", doctors=" + doctors +
                '}';
    }
}

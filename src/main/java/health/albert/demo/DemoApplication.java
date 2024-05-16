package health.albert.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostConstruct
    void init() {
        System.out.println("Application started");
        Patient patient = new Patient();
        patient.setId(1L);
        patient.setName("John Doe");
        patient.setAddress("123 Main St");
        patient.setPhoneNumber("123-456-7890");
        patientRepository.save(patient);
    }
}

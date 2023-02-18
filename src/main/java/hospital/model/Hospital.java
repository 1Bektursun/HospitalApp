package hospital.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "hospitals")
@Setter
@Getter
@NoArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "company_id_gen")
    @SequenceGenerator(name = "company_id_gen",sequenceName = "company_id_seq",allocationSize = 1,initialValue = 1)
    private Long id;

    private String name;

    @Column(name = "addresses")
    private String address;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctors;

    @OneToMany(mappedBy = "hospital")
    private List<Patient> patients;
}

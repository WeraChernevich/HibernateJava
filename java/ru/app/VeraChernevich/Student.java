package ru.app.VeraChernevich;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "student")
    private List<LinkedPurchaseList> linkedPurchaseList;

    @Column(name = "name")
    private String studentName;

    @OneToMany(mappedBy = "student")
    private Set<PurchaseList> purchaseLists;

    @Column(name = "age")
    private Integer age;

    @Column(name = "registration_date")
    private Date registrationDate;

}

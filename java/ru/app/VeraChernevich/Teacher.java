package ru.app.VeraChernevich;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses = new ArrayList<>();

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private Float salary;

    @Column(name = "age")
    private Integer age;

        public Teacher() {
    }
}

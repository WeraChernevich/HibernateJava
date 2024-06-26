package ru.app.VeraChernevich;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LinkedPurchaseList {

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany
    private List<PurchaseList> purchaseLists;

    public LinkedPurchaseList(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}

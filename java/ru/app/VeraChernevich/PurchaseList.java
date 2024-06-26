package ru.app.VeraChernevich;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PurchaseList {

    @EmbeddedId
    private PurchaseListKey purchaseListKey;

    @ManyToOne
    @JoinColumn(name = "student_name", referencedColumnName = "name")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_name", referencedColumnName = "name")
    private Course course;

    @Column(name = "price")
    private int price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;


}

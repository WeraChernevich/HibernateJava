package ru.app.VeraChernevich;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PurchaseListKey {

    @Column(name = "student_name", insertable=false, updatable=false)
    private String studentName;

    @Column(name = "course_name", insertable=false, updatable=false)
    private String courseName;

}

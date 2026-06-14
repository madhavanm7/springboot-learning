package com.springboot.app.springbootbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empsalary")
public class EmpSalary {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  long sal_id;

    @Column(name = "salary", nullable = false)
    private long salary;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

package com.springboot.app.springbootbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SalaryRequestDTO {

    private Long employeeId;
    private Long salary;

}
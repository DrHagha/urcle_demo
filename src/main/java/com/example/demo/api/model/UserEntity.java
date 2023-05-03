package com.example.demo.api.model;

import java.time.LocalDate;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class UserEntity {
    private Integer pk;
    private String school_email;
    private String password;
    private String name;
    private LocalDate reg_date;
    private LocalDate del_date;
    private String token;
}

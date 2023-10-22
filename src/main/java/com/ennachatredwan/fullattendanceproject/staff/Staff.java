package com.ennachatredwan.fullattendanceproject.staff;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "full_name",nullable = false,columnDefinition = "varchar(255)")
    private String fullName;
}

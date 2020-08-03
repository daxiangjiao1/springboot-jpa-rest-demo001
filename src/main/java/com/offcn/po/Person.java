package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "age", nullable = false, length = 4)
    private Integer age;
    @Column(name = "password", nullable = true, length = 18)
    private String password;

}

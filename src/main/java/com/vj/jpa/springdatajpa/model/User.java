package com.vj.jpa.springdatajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {

    @Id
    private Integer id;
    private String name;
    private String profession;
    private int age;

}

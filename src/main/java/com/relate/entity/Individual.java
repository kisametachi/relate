package com.relate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String indName;

    @Column
    private String address;

    @Column
    private Integer age;

    @Column
    private Integer work;

    @Column
    private Character gender;

    @Column
    private String otherInfo;

}

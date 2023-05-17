package com.kevinbooms.teammanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}

/*
 * @Data: This annotation is part of the Lombok library and automatically generates boilerplate code for common data-related methods, such as getters, setters, equals(), hashCode(), and toString(). By applying @Data, you don't have to manually write these methods, reducing code verbosity.
 *
 * @Entity: This annotation indicates that the Employee class is an entity, meaning it represents a table in the database.
 *
 * @Table(name="employees"): This annotation specifies the table name for the Employee entity. In this case, the table name is "employees".
 *
 * @GeneratedValue(strategy = GenerationType.IDENTITY): This annotation indicates that the id field's value will be automatically generated by the database upon insertion. The strategy used here is identity-based, which typically relies on an auto-incrementing column in the database.
 *
 * @Column(name = "first_name", nullable = false): This annotation specifies the mapping for the firstName field to the "first_name" column in the "employees" table. It also indicates that the firstName column cannot be nullable (i.e., it must have a value).
 *
 * @Column(name = "last_name"): This annotation specifies the mapping for the lastName field to the "last_name" column in the "employees" table.
 *
 * @Column(name = "email"): This annotation specifies the mapping for the email field to the "email" column in the "employees" table.
*/
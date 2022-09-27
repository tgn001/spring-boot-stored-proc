package com.techgeeknext.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "employees")
/*
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "getAllEmployees",
				procedureName = "get_employees",
				resultClasses = Employee.class)
})
*/
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;
}

package com.example.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee() {}

    public Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return this.firstName + " " + this.lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Employee)) {
            return false;
        } else {
            Employee employee = (Employee) obj;

            boolean isIdEqual = this.id == employee.id;
            boolean isNameEqual = this.firstName == employee.firstName
                    && this.lastName == employee.lastName;
            boolean isRoleEqual = this.role == employee.role;
            return isIdEqual && isNameEqual && isRoleEqual;
        }
    }

    @Override
    public String toString() {
        String str =
                String.format("Employee{id=%d, firstName=\'%s\', lastName=\'%s\', role=\'%s\'}",
                this.id, this.firstName, this.lastName, this.role);

        return str;
    }
}

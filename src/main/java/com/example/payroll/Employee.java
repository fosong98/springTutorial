package com.example.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
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
            boolean isNameEqual = this.name == employee.name;
            boolean isRoleEqual = this.role == employee.role;

            return isIdEqual && isNameEqual && isRoleEqual;
        }
    }

    @Override
    public String toString() {
        String str =
                String.format("Employee{id=%d, name=\'%s\', role=\'%s\'}",
                this.id, this.name, this.role);

        return str;
    }
}

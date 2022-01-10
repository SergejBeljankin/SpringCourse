package hibernate_test2.entity;

import javax.persistence.*;

@Entity
@Table (name = "employees")
public class Emploeyy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String departmen;

    @Column(name = "salary")
    private int salary;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Emploeyy() {
    }

    public Emploeyy(String name, String surname, String departmen, int salary) {
        this.name = name;
        this.surname = surname;
        this.departmen = departmen;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploeyy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", departmen='" + departmen + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartmen() {
        return departmen;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}

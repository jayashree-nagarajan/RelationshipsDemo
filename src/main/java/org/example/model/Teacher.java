package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int tit;
    private String salary;
    private String Teachername;

    @OneToOne(cascade = CascadeType.ALL)
    private Address adress;

    public Teacher(int tit, String salary, String teachername) {
        super();
        this.tit = tit;
        this.salary = salary;
        Teachername = teachername;
    }
    public Teacher()
    {}


    public Address getAdress() {
        return adress;
    }
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public int getTit() {
        return tit;
    }
    public void setTit(int tit) {
        this.tit = tit;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getTeachername() {
        return Teachername;
    }
    public void setTeachername(String teachername) {
        Teachername = teachername;
    }
}
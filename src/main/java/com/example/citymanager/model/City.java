package com.example.citymanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    @Column(nullable = false, updatable = false)
    private String cityCode;

    public City(){}

    public City(String name, String cityCode){
        this.name = name;
        this.cityCode = cityCode;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCityCode(){
        return cityCode;
    }

    public void setCityCode(String cityCode){
        this.cityCode =cityCode;
    }

    @Override
    public String toString(){
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityCode='" + cityCode +'\'' +
                '}';
    }


}

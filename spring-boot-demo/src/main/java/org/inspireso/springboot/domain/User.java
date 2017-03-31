package org.inspireso.springboot.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by lanxe on 2017/3/28.
 */
@Entity
@Table(name="USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "UUIDGen")
    @GenericGenerator(name = "UUIDGen", strategy = "uuid")
    @Column(name = "id", unique = true, length = 32, nullable = false)
    private String id;

    private String name;

    private String tel;

    private String sex;

    private String address;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

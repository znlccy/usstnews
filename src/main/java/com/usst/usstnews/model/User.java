package com.usst.usstnews.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_user", catalog = "db_usstnews")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Long u_id;

    @Column(name = "u_name")
    private String u_name;

    @Column(name = "u_password")
    private String u_password;

    @Column(name = "u_email")
    private String u_email;

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }
}

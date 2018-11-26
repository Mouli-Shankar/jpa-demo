package com.emptypocket.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_data")
public class JpaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_mobile")
    private Long mobile;
}

package com.neep.holo.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name="userholo")
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class UserHolo {

    @Id @GeneratedValue
    private int user_id;

    private String user_name;
    private String user_password;
    private int mart_id;
}

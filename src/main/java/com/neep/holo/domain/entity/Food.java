package com.neep.holo.domain.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name="food")
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Food {
    @Id @GeneratedValue
    private Long food_id;
    @Column(name = "food_name")
    private String food_name;
    @Column(name="food_img")
    private String food_img;
    @Column(name="food_summary")
    private String food_summary;
    @Column(name="food_time")
    private String food_time;
    @Column(name="food_level")
    private String food_level;


//    public Long getId(){
//        return food_id;
//    }
//    public String getName(){
//        return food_name;
//    }
//    public String getImg(){
//        return food_img;
//    }
//    public String getSummary(){
//        return food_summary;
//    }
//    public String getTime(){
//        return food_time;
//    }
//    public String getLevel(){
//        return food_level;
//    }


}

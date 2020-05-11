package com.neep.holo.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FoodDto {
    @Autowired
    private Long food_id;
    private String food_name;
    private String food_img;
    private String food_summary;
    private String food_time;
    private String food_level;

    /*
    public Food toEntity(){
        Food build = Food.builder()
                .food_id(food_id)
                .food_name(food_name)
                .food_img(food_img)
                .food_summary(food_summary)
                .food_time(food_time)
                .food_level(food_level)
                .build();
        return build;

    }*/

//    @Builder
//    public FoodDto(Long food_id, String food_name, String food_img, String food_summary, String food_time, String food_level){
//        this.food_id = food_id;
//        this.food_name = food_name;
//        this.food_img = food_img;
//        this.food_summary = food_summary;
//        this.food_time = food_time;
//        this.food_level = food_level;
//    }
}

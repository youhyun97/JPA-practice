package com.neep.holo.controller;

import com.neep.holo.domain.entity.Food;
import com.neep.holo.domain.repository.FoodRepository;
import com.neep.holo.dto.FoodDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/food")
@RestController
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/select") // READ
    public List<Food> selectAll(){
        return foodRepository.findAll();
    }

    @GetMapping("/select/{food_id}") // READ
    public Food selectOne(@PathVariable("food_id") Long id){
        return foodRepository.findById(id).orElse(null);
    }


}

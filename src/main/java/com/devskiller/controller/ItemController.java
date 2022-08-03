package com.devskiller.controller;

import com.devskiller.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/titles")
public class ItemController {
    @Autowired
    ItemService service;
    @GetMapping("/{rating}")
    public List<String> getTitles(@PathVariable("rating") Double rating) {
        //TODO
        return service.getTitlesWithAverageRatingLowerThan(rating);
    }
}

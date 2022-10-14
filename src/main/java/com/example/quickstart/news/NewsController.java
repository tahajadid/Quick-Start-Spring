package com.example.quickstart.news;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/news")
public class NewsController {

    @GetMapping("/")
    public List<News> listOfNews() {
        return Arrays.asList(
                new News(0,"es","fr","test","test no yamlk loin","01-08-2022"),
                new News(1,"en","fr","test","test no yamlk loin","01-08-2022")
        );
    }
}

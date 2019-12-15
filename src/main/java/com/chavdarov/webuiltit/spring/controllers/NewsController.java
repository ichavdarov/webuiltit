package com.chavdarov.webuiltit.spring.controllers;

import com.chavdarov.webuiltit.model.New;
import com.chavdarov.webuiltit.spring.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController @RequestMapping( //
        produces = APPLICATION_JSON_UTF8_VALUE, //
        path = "/news" //
) public class NewsController {

    @Autowired NewsService newsService;

    @GetMapping public Map<String, New> getAll() {
        return newsService.getAllNews();
    }

    @GetMapping("{title}") public New getByTitle( //
            @PathVariable String title) {
        return newsService.getByTitle(title);
    }

    @PostMapping() public New addNew(//
            @RequestBody New newss) {
        return newsService.addNew(newss);
    }

    @PutMapping() public New editNew(//
            @RequestBody New newss) {
        return newsService.addNew(newss);
    }

    @DeleteMapping("{title}") public void delete(@PathVariable String title) {
        newsService.delete(title);
    }
}

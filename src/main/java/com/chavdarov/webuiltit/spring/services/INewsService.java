package com.chavdarov.webuiltit.spring.services;

import com.chavdarov.webuiltit.model.New;

import java.util.List;
import java.util.Map;

public interface INewsService {

    Map<String,New> getAllNews();

    New getByTitle(String title);

    New addNew(New news);

    void delete(String title);
}

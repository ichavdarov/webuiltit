package com.chavdarov.webuiltit.spring.services;


import com.chavdarov.webuiltit.model.New;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class NewsService implements INewsService {
//private ArrayList<New> news=new ArrayList<>();
private HashMap<String,New> news=new HashMap();
public  NewsService(){
    news.put("test1",new New("test1","content1"));
    news.put("test2",new New("test2","content2"));

    /*news.add(new New("test1","content1"));
    news.add(new New("test2","content2"));*/
}
    @Override public Map<String,New> getAllNews() {
        return news;
    }

    @Override public New getByTitle(final String title) {
        return news.get(title);
    }

    @Override public New addNew(New newss) {
        news.put(newss.getTitle(),newss);
        return news.get(newss.getTitle());
    }

    @Override public void delete(String title) {
        news.remove(title);
    }
}

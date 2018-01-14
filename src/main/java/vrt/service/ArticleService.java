package vrt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vrt.domain.Article;
import vrt.repository.ArticleRepository;


@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;


    public Article findById(long id) {
        System.out.println("article service find by id " + id);
        return articleRepository.findById(id);
    }
}


package vrt.repository;


//import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Repository;
import vrt.domain.Article;
import vrt.domain.DataClass;


@Repository
public class ArticleRepository {

    public Article findById(long id) {
        return DataClass.getInstance().findById(id);
    }


}
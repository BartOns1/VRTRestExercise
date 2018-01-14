package vrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vrt.domain.Article;
import vrt.domain.DataClass;
import vrt.service.ArticleService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ArticleApp {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ArticleApp.class, args);
        List<Article> articles = new ArrayList<>();
        ArticleService articleService = new ArticleService();


        Article article1 = new Article(1,2017,12,8,"Zomerakkoord opgedrongen", "Het parlement heeft 7 dagen om duizenden pagina's te lezen en te discussiëren. Dat is te weinig om van een democratisch proces te spreken");
        Article article2 = new Article(2,2018,1,11,"Brand in Leuven", "In het centrum van Leuven is de bliksem ingeslagen op een boom van het park. De boom vatte vuur.");


        articles.add(article1);
        articles.add(article2);
        DataClass.getInstance().setArticles(articles);

    }

}

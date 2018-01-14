package vrt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vrt.domain.Article;
import vrt.domain.DataClass;
import vrt.service.ArticleService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTest {
    @Autowired(required = false)
    private ArticleService articleService = new ArticleService();

    @Test
    public void ArticleServiceExists() {
        assertNotNull("You should create an article service in the application context", articleService);
    }

    @Test
    public void findArticleByIdIsCorrect() throws Exception {

        List<Article> articles = new ArrayList<Article>();
        Article article1 = new Article(1,2017,12,8,"Zomerakkoord opgedrongen", "Het parlement heeft 7 dagen om duizenden pagina's te lezen en te discussiëren. Dat is te weinig om van een democratisch proces te spreken");
        Article article2 = new Article(2,2018,1,11,"Brand in Leuven", "In het centrum van Leuven is de bliksem ingeslagen op een boom van het park. De boom vatte vuur.");
        articles.add(article1);
        articles.add(article2);
        DataClass.getInstance().setArticles(articles);

        String title = articleService.findById(1).getTitle();
        int month = articleService.findById(2).getMonthOfYear();
        assertEquals("Zomerakkoord opgedrongen", title);
        assertEquals(1, month);
    }

}
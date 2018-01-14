package vrt;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import vrt.domain.Article;

import static org.junit.Assert.assertEquals;

public class ArticleServicerRestClientTest {
/**
 * This test requires the web server to be started.
 */

    private static final String URL_PREFIX = "http://localhost:8080/";

    private RestTemplate restTemplate = new RestTemplate();


    @Test
    public void restServiceToRetrieveASingleArticleCanBeCalled() throws Exception {
        Article article = restTemplate.getForObject(URL_PREFIX + "api/v1?id=2", Article.class);
        assertEquals("Brand in Leuven", article.getTitle());
        assertEquals(Integer.valueOf(11) , article.getDayOfMonth());
    }

    @Test
    public void restServiceToRetrieveASingleArticleV2CanBeCalled() throws Exception {
        Article article = restTemplate.getForObject(URL_PREFIX + "api/v2?id=6", Article.class);
        assertEquals("Brand in Leuven", article.getTitle());
        assertEquals("Belga" , article.getSource());
    }

}

package vrt.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


public class ArticleTest {


    private Article article1;
    private Article article2;
    private Article article3;
    private Article article4;
    private Article article5;


    @Before
    public void init(){
        article1 = new Article(1,2017,12,8,"Zomerakkoord opgedrongen", "Het parlement heeft 7 dagen om duizenden pagina's te lezen en te discussiëren. Dat is te weinig om van een democratisch proces te spreken");
        article2 = new Article(2,2018,1,11,"Brand in Leuven", "In het centrum van Leuven is de bliksem ingeslagen op een boom van het park. De boom vatte vuur.");
        article3 = new Article(3,2018,1,14,"Club Brugge verliest voor de eerste keer", "test content");
        article4 = new Article(4,2017,12,23,"Lang article", "heel lang article.");
        article5 = new Article(4,2017,12,23,"Lang article", "heel lang article.", "NewsMonkey");
    }
    public ArticleTest() {
    }

    @Test
    public void constructorTest(){
        assertNotNull(article1);
        assertNotNull(article2);
        assertNotNull(article4);
        assertNotNull(article5);
        assertEquals(1,article1.getId());
        assertEquals(Integer.valueOf(2017) ,  article1.getTheYear());
        assertEquals("Lang article", article4.getTitle());
        assertThat(article2.getContent(),both(startsWith("In")).and(containsString("Leuven")).and(endsWith("vuur.")));
        assertEquals("NewsMonkey", article5.getSource());
    }


    @Test
    public void setTheYearTest(){
        assertNotNull(article3);
        article3.setTheYear(2000);
        assertEquals(Integer.valueOf(2000), article3.getTheYear());
    }


    @Test(expected = IllegalArgumentException.class)
    public void constructorWrongYearTest(){
        new Article(5,2019,12,10,"titlestring","contentstring");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorWrongDayTest(){
        new Article(5,2018,12,32,"titlestring","contentstring");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorWrongTitleTest(){
        new Article(5,2018,12,10,null,"contentstring");
    }

}

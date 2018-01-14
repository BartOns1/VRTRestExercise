package vrt.domain;

import java.util.ArrayList;
import java.util.List;

// deze klasse zorgt dat er 1 instantie is voor de data waaronder de arraylist van articles. Die blijft zo uniek gerefereerd.
// deze klasse wordt gebruikt in plaats van een database. Voor een echte newsapp_server moet nog wel een geschikte database gekoppeld worden (voor volgende sprint).
public class DataClass {
    private List<Article> articles = new ArrayList<>();
    private static DataClass instance = new DataClass();

    public static synchronized DataClass getInstance(){return instance;}

    public List<Article> getArticles() {return articles;}
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    public void addArticle(Article article) {articles.add(article);}


    public Article findById (long id){
        Article theArticle=null;
            for (Article a:articles){
            if (a.getId()==id){
                theArticle = articles.get(articles.indexOf(a));
            }
        }
        if (theArticle != null) {
                return theArticle;
            }   else {
                return null;
            }
        }

    }



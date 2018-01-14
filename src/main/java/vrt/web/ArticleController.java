package vrt.web;

import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicLong;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vrt.domain.Article;
import vrt.service.ArticleService;

import javax.websocket.server.PathParam;

@RestController
public class ArticleController {
    @Autowired
    ArticleService as;

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1", produces = "application/json")
    public String articleToJson(@RequestParam(value="id", defaultValue="1") long id) throws JSONException {
        Article article =as.findById(id);
        System.out.println("VERZONDEN:  " + article.getTitle().toString());
        JSONObject obj= new JSONObject();
        try{
        obj.put("id", article.getId());
        obj.put("theYear", article.getTheYear()).put("monthOfYear",article.getMonthOfYear()).put("dayOfMonth", article.getDayOfMonth());
        obj.put("title",article.getTitle());
        obj.put("content", article.getContent());


        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

}
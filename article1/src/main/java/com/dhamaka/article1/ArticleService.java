package com.dhamaka.article1;


import com.dhamaka.article1.model.Article;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService
{
    List<Article> articleList=new ArrayList<Article>(Arrays.asList(

            new Article("1","name 1","des 1"),
            new Article("2","name 2","des 2"),
            new Article("3","name 3","des 3")
    ));

    public List<Article> getArticleList()
    {
        return articleList;
    }
    public Article getArticle(String id)
    {
        return articleList.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public void addArticle(Article article) {
        articleList.add(article);
    }

    public void updateArt(Article art,String id) {
        for(int i=0;i<articleList.size();i++)
        {
            Article article=articleList.get(i);
            if(article.getId().equals(id))
            {
                articleList.set(i,art);
            }
        }
    }

    public void deleteArt(String id) {
        articleList.removeIf(t->t.getId().equals(id));
    }
}


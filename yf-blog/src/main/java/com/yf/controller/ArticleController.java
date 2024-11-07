package com.yf.controller;

import com.yf.domain.ResponseResult;
import com.yf.domain.entity.Article;
import com.yf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 13:24
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }

    @GetMapping("/hotArticleList")
    public ResponseResult<List<Article>> hotArticleList() {
        // 查询热门文章，封装成ResponseResult返回
        ResponseResult<List<Article>> responseResult = new ResponseResult<>();
        List<Article> articles = articleService.hotArticleList();
        responseResult.setData(articles);
        return responseResult;
    }

}

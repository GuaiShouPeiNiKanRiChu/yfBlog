package com.yf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.domain.entity.Article;

import java.util.List;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 13:18
 **/
public interface ArticleService  extends IService<Article> {
    List<Article> hotArticleList();
}

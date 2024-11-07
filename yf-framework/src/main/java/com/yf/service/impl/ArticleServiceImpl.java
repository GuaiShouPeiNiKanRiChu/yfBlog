package com.yf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yf.domain.entity.Article;
import com.yf.mapper.ArticleMapper;
import com.yf.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 13:19
 **/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {


    @Override
    public List<Article> hotArticleList() {
        // 查询热门文章
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        // 必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);
        // 按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        // 最多只查询10条
        Page<Article> page = new Page<>(1, 10);
        page(page, queryWrapper);
        return page.getRecords();
    }
}

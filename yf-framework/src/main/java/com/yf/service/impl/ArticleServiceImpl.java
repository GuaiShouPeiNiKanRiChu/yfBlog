package com.yf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yf.domain.entity.Article;
import com.yf.mapper.ArticleMapper;
import com.yf.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 13:19
 **/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}

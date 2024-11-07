package com.yf.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: biyunfei3
 * @create: 2024-11-07 11:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("yf_article")
public class Article {

    private Long id;

    private String title;

    private String content;

    private String  summary;

    private String  categoryId;

    private String thumbnail;

    private String isTop;

    private String status;

    private Long viewCount;

    private String isComment;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private int delFlag;
}

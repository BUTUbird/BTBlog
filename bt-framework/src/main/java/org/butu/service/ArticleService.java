package org.butu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.butu.domain.ResponseResult;
import org.butu.domain.entity.Article;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/2/7 21:57
 * FileName: ArticService
 */
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}

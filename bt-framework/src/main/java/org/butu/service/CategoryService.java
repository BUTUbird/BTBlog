package org.butu.service;

import org.butu.domain.ResponseResult;
import org.butu.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author BUTUbird
 * @since 2022-02-08
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

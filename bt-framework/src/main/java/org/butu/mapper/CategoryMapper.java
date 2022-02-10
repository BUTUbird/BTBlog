package org.butu.mapper;

import org.butu.domain.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 分类表 Mapper 接口
 * </p>
 *
 * @author BUTUbird
 * @since 2022-02-08
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}

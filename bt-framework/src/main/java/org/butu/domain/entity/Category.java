package org.butu.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author BUTUbird
 * @since 2022-02-08
 */
@Getter
@Setter
@TableName("bt_category")
@ApiModel(value = "Category对象", description = "分类表")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("分类名")
    @TableField("name")
    private String name;

    @ApiModelProperty("父分类id，如果没有父分类为-1")
    @TableField("pid")
    private Long pid;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("状态0:正常,1禁用")
    @TableField("status")
    private String status;

    @TableField("create_by")
    private Long createBy;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_by")
    private Long updateBy;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    @TableField("del_flag")
    private Integer delFlag;


}

package com.haibaraai.goods;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 品牌
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "brand")
public class Brand {

    //id (主键)
    @TableId
    private String id ;
    //名字
    private String name ;
    //图片
    private String image;
    //品牌的首字母
    private String initial;
    //排序
    private String sort;


}

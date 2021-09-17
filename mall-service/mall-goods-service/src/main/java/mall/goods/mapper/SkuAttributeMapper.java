package mall.goods.mapper;

import mall.goods.domain.SkuAttribute;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @Entity mall.goods.domain.SkuAttribute
 */

public interface SkuAttributeMapper extends BaseMapper<SkuAttribute> {


    /****
     * 1、根据分类ID查询属性ID集合
     * 2、根据属性ID集合查询属性集合
     */
    @Select("select * from sku_attribute where id IN(SELECT attr_id FROM category_attr WHERE category_id=#{id})")
    List<SkuAttribute> queryByCategoryId(Integer id);

}





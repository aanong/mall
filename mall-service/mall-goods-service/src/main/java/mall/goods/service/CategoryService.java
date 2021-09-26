package mall.goods.service;


import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import mall.goods.domain.Category;
/**
 *
 */
public interface CategoryService extends IService<Category> {

    public List<Category> findByParentId(Integer pid);

}

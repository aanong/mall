package mall.goods.service;

import mall.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface CategoryService extends IService<Category> {

    public List<Category> findByParentId(Integer pid);

}

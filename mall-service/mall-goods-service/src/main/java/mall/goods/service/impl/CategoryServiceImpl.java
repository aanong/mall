package mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mall.domain.Category;
import mall.goods.service.CategoryService;
import mall.goods.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{


    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> findByParentId(Integer pid) {
        QueryWrapper<Category> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",pid);
        return categoryMapper.selectList(queryWrapper);
    }
}





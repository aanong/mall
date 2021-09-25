package mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mall.domain.Brand;
import mall.goods.service.BrandService;
import mall.goods.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService{


    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",brand.getName());
        queryWrapper.eq("initial",brand.getInitial());
        return brandMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Integer page, Integer size) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",brand.getName());
        queryWrapper.eq("initial",brand.getInitial());

        return brandMapper.selectPage(new Page<Brand>(page,size),queryWrapper);
    }

    @Override
    public List<Brand> queryByCategoryId(Integer pid) {
        //根据分类ID查询品牌ID集合
        List<Integer> brandIds = brandMapper.queryBrandIds(pid);
        //根据品牌ID集合查询品牌集合
        if(brandIds!=null && brandIds.size()>0){
            return brandMapper.selectList(new QueryWrapper<Brand>().in("id",brandIds));
        }
        return null;
    }
}





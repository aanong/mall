package mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mall.domain.Brand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface BrandService extends IService<Brand> {

    List<Brand> queryList(Brand brand);

    Page<Brand> queryPageList(Brand brand,Integer page,Integer size);

    List<Brand> queryByCategoryId(Integer pid);
}

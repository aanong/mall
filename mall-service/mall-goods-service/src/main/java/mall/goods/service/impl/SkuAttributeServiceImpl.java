package mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mall.domain.SkuAttribute;
import mall.goods.service.SkuAttributeService;
import mall.goods.mapper.SkuAttributeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeMapper, SkuAttribute>
    implements SkuAttributeService{

    @Autowired
    private SkuAttributeMapper skuAttributeMapper;



    @Override
    public List<SkuAttribute> queryList(Integer id) {
        return skuAttributeMapper.queryByCategoryId(id);
    }
}





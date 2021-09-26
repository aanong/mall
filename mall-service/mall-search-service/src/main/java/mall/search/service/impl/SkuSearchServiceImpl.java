package mall.search.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import io.netty.util.internal.StringUtil;
import mall.search.mapper.SkuSearchMapper;
import mall.search.model.SkuEs;
import mall.search.service.SkuSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class SkuSearchServiceImpl implements SkuSearchService {
    @Autowired
    private SkuSearchMapper skuSearchMapper;

    @Override
    public void add(SkuEs skuEs) {
        //属性转换
        String skuAttribute = skuEs.getSkuAttribute();
        if(!StringUtils.isEmpty(skuAttribute)){
            skuEs.setAttrMap(JSON.parseObject(skuAttribute, Map.class));
        }
        skuSearchMapper.save(skuEs);
    }

    @Override
    public void del(String id) {
        skuSearchMapper.deleteById(id);
    }
}

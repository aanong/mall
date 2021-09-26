package mall.search.service;

import mall.search.model.SkuEs;

public interface SkuSearchService {
    //添加索引
    void add(SkuEs skuEs);
    //删除索引
    void del(String id);
}

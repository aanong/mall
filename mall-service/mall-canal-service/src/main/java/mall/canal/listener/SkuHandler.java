package mall.canal.listener;

import com.alibaba.fastjson.JSON;
import mall.goods.domain.Sku;
import mall.search.feign.SkuSearchFeign;
import mall.search.model.SkuEs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@CanalTable(value = "sku")
@Component
public class SkuHandler implements EntryHandler<Sku> {
    @Autowired
    private SkuSearchFeign skuSearchFeign;
    /***
     * 增加产品
     * @param sku
     */
    @Override
    public void insert(Sku sku) {
        if(sku.getStatus().intValue()==1){
            //导入索引
            skuSearchFeign.add(JSON.parseObject(JSON.toJSONString(sku),
                    SkuEs.class));
        }
    }

}

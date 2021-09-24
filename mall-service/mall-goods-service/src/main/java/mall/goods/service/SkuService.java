package mall.goods.service;

import mall.goods.domain.Sku;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@CacheConfig(cacheNames = "ad-items-skus")
@Service
public interface SkuService extends IService<Sku> {

    List<Sku> typeSkuItems(Integer id);

    void delTypeSkuItems(Integer id);

    List<Sku> updateTypeSkuItems(Integer id);
}

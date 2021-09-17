package mall.goods.service;

import mall.goods.domain.SkuAttribute;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface SkuAttributeService extends IService<SkuAttribute> {

    public List<SkuAttribute> queryList(Integer id);

}

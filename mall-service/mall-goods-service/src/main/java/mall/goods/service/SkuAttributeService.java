package mall.goods.service;


import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import mall.goods.domain.SkuAttribute;

/**
 *
 */
public interface SkuAttributeService extends IService<SkuAttribute> {

    public List<SkuAttribute> queryList(Integer id);

}

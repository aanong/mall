package mall.search.feign;

import mall.search.model.SkuEs;
import mall.util.RespResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "mall-search")
public interface SkuSearchFeign {
    /****
     * 单个导入
     * @param skuEs
     * @return
     */
    @PostMapping(value = "/search/add")
    RespResult add(@RequestBody SkuEs skuEs);
    /***
     * 根据ID删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/search/del/{id}")
    RespResult del(@PathVariable("id")String id);
}

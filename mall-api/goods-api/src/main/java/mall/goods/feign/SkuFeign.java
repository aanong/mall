package mall.goods.feign;


import mall.goods.domain.Sku;
import mall.util.RespResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@FeignClient(value = "mall-goods")
@RequestMapping("/sku")
public interface SkuFeign {

    /***
     * 根据ID查询商品详情
     * @return
     */
    @GetMapping(value = "/{id}")
    public RespResult<Sku> one(@PathVariable(value = "id")String id);

    /****
     * 根据推广分类查询推广产品列表
     *
     */
    @GetMapping(value = "/aditems/type")
    public List<Sku> typeItems(@RequestParam(value = "id")Integer id);

    /****
     * 根据推广分类查询推广产品列表
     */
    @DeleteMapping(value = "/aditems/type")
    public RespResult delTypeItems(@RequestParam(value = "id")Integer id);

    /****
     * 根据推广分类查询推广产品列表
     *
     */

    @PutMapping(value = "/aditems/type")
    public RespResult updateTypeItems(@RequestParam(value = "id")Integer id);
}

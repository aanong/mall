package mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haibaraai.mall.util.RespResult;
import mall.goods.domain.Brand;
import mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;
    /****
     * 增加方法
     */
    @PostMapping("/save")
    public RespResult save(@RequestBody Brand brand){
        brandService.save(brand);
        return RespResult.ok();
    }

    /****
     * 修改方法
     */
    @PostMapping("/update")
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /****
     * 删除方法
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id")String id){
        brandService.removeById(id);
        return RespResult.ok();
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    /**
     * 按条件分页查询
     */
    @PostMapping("/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(@RequestBody Brand brand,
                                                 @PathVariable(value = "page") Integer page,
                                                 @PathVariable(value = "size") Integer size){
        return RespResult.ok(brandService.queryPageList(brand,page,size));

    }

    /****
     * 根据分类ID查询品牌集合
     */

    /****
     * 根据分类ID查询品牌集合
     */
    @GetMapping(value = "/category/{pid}")
    public RespResult<List<Brand>>  categoryBrands(@PathVariable(value = "pid")Integer pid){
        List<Brand> brands = brandService.queryByCategoryId(pid);
        return RespResult.ok(brands);
    }
}

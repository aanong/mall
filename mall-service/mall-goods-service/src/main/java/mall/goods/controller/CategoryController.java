package mall.goods.controller;

import com.haibaraai.mall.util.RespResult;
import mall.goods.domain.Category;
import mall.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    /****
     * 根据分类父ID查询子分类
     */
    @GetMapping("/parent/{id}")
    public RespResult<List<Category>> findByParentId(@PathVariable(value = "id") Integer id){

        List<Category> categories = categoryService.findByParentId(id);

        return RespResult.ok(categories);
    }


    /****
     * 根据分类id查询分类信息
     */

    @GetMapping("/{id}")
    public RespResult<Category> category(@PathVariable(value = "id") Integer id){
        Category category = categoryService.getById(id);

        return RespResult.ok(category);
    }
}

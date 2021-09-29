package mall.search;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(value = "/web/search")
public class SkuSearchController {
//    @Autowired
//    private SkuSearchFeign skuSearchFeign;
//
//    @GetMapping
//    public String search(@RequestParam(required = false)Map<String,Object> searchMap, Model model){
//        RespResult<Map<String, Object>> resultMap = skuSearchFeign.search(searchMap);
//        model.addAttribute("result",resultMap);
//
//        return "search";
//    }
}

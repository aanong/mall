//package mall.goods;
//
//import com.alibaba.fastjson.JSON;
//import mall.MallGoodsApplication;
//import mall.domain.Sku;
//import mall.goods.service.SkuService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes= MallGoodsApplication.class)
//public class SkuTest {
//
//    @Autowired
//    private SkuService skuService;
//    @Test
//    public void typeSkuItems(){
//        List<Sku> skus = skuService.typeSkuItems(11159);
//        System.out.println(JSON.toJSON(skus));
//    }
//}

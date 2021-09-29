//package mall.canal;
//
//import com.alibaba.fastjson.JSON;
//import mall.goods.domain.Sku;
//import mall.goods.feign.SkuFeign;
//import mall.search.feign.SkuSearchFeign;
//import mall.search.model.SkuEs;
//import mall.util.RespResult;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes= MallCanalApplication.class)
//public class SkuTest {
//    @Autowired
//    private SkuSearchFeign skuSearchFeign;
//
//    @Autowired
//    private SkuFeign skuFeign;
//    @Test
//    public void skuTest(){
//        SkuEs sku = new SkuEs();
//        sku.setId("12");
//
//        RespResult respResult = skuSearchFeign.add(sku);
//        System.out.println(JSON.toJSON(respResult));
//
//    }
//}

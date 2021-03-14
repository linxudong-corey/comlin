package cn.com.yg.controller;


import cn.com.yg.util.HttpClient;
import cn.com.yg.util.WxPayUtils;
import com.github.wxpay.sdk.WXPayUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/wxpay")
public class WxPayController {

//    @RequestMapping("/pay")
//    public String createPayQRcode(Model model) throws Exception {
//
//        String price = "0.01";
//        String no = getOrderNo();
//        Map m = new HashMap();
//        m.put("appid", WxPayUtils.WX_PAY_APP_ID);
//        m.put("mch_id", WxPayUtils.WX_PAY_PARTNER);
//        m.put("nonce_str", WXPayUtil.generateNonceStr());
//        m.put("body", "微信支付测试"); //主体信息
//        m.put("out_trade_no", no); //订单唯一标识
//        m.put("total_fee", getMoney(price));//金额
//        m.put("spbill_create_ip", "127.0.0.1");//项目的域名
//        m.put("notify_url", WxPayUtils.WX_OPEN_NOTIFY_URL);//回调地址
//        m.put("trade_type", "NATIVE");//生成二维码的类型
//
//        //3 发送httpclient请求，传递参数xml格式，微信支付提供的固定的地址
//        HttpClient client = new HttpClient("https://api.mch.weixin.qq.com/pay/unifiedorder");
//        //设置xml格式的参数
//        //把xml格式的数据加密
//        client.setXmlParam(WXPayUtil.generateSignedXml(m, WxPayUtils.WX_PAY_PARTNER_KEY));
//        client.setHttps(true);
//        //执行post请求发送
//        client.post();
//        //4 得到发送请求返回结果
//        //返回内容，是使用xml格式返回
//        String xml = client.getContent();
//        //把xml格式转换map集合，把map集合返回
//        Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
//        //最终返回数据 的封装
//        Map map = new HashMap();
//        map.put("no", no);
//        map.put("price", price);
//        map.put("result_code", resultMap.get("result_code"));
//        map.put("code_url", resultMap.get("code_url"));
//
//        model.addAttribute("map", map);
//        return "pay";
//
//    }
//
//    @GetMapping("queryorder/{no}")
//    @ResponseBody
//    public String queryPayStatus(@PathVariable String no) throws Exception {
//        //1、封装参数
//        Map m = new HashMap<>();
//        m.put("appid", WxPayUtils.WX_PAY_APP_ID);
//        m.put("mch_id", WxPayUtils.WX_PAY_PARTNER);
//        m.put("out_trade_no", no);
//        m.put("nonce_str", WXPayUtil.generateNonceStr());
//
//        //2 发送httpclient
//        HttpClient client = new HttpClient("https://api.mch.weixin.qq.com/pay/orderquery");
//        client.setXmlParam(WXPayUtil.generateSignedXml(m, WxPayUtils.WX_PAY_PARTNER_KEY));
//        client.setHttps(true);
//        client.post();
//
//        //3.得到订单数据
//        String xml = client.getContent();
//        Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
//
//        //4.判断是否支付成功
//        if (resultMap.get("trade_state").equals("SUCCESS")) {
//            /*
//                  改变数据库中的数据等操作
//             */
//            return "支付成功";
//        }
//        return "支付中";
//    }
//
//    @GetMapping("success")
//    public String success(){
//        return "success";
//    }
//
//    @RequestMapping("test")
//    public String test(){
//        return "pay";
//    }
//    /**
//     * 生成订单号
//     * @return
//     */
//    public static String getOrderNo() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//        String newDate = sdf.format(new Date());
//        String result = "";
//        Random random = new Random();
//        for (int i = 0; i < 3; i++) {
//            result += random.nextInt(10);
//        }
//        return newDate + result;
//    }
//    /**
//     * 元转换成分
//     * @param amount
//     * @return
//     */
//    public static String getMoney(String amount) {
//        if(amount==null){
//            return "";
//        }
//        // 金额转化为分为单位
//        // 处理包含, ￥ 或者$的金额
//        String currency =  amount.replaceAll("\\$|\\￥|\\,", "");
//        int index = currency.indexOf(".");
//        int length = currency.length();
//        Long amLong = 0l;
//        if(index == -1){
//            amLong = Long.valueOf(currency+"00");
//        }else if(length - index >= 3){
//            amLong = Long.valueOf((currency.substring(0, index+3)).replace(".", ""));
//        }else if(length - index == 2){
//            amLong = Long.valueOf((currency.substring(0, index+2)).replace(".", "")+0);
//        }else{
//            amLong = Long.valueOf((currency.substring(0, index+1)).replace(".", "")+"00");
//        }
//        return amLong.toString();
//    }
}
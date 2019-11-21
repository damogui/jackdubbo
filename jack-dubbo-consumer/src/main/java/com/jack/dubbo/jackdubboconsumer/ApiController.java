package com.jack.dubbo.jackdubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jack.dubbo.DubboResult;
import com.jack.dubbo.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 郭佳
 * @ClassName: ApiController
 * @Description:
 * @Date: 2019-11-21 上午 11:09
 */
@RestController
public class ApiController {
    @Reference(version = "1.0.0",timeout = 300)
    private TestService testService;
    @GetMapping("findJson")
    public DubboResult findJson(){
      return   testService.findJson();
    }
}

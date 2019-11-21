package com.jack.dubbo.jackdubboprovder.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jack.dubbo.DubboResult;
import com.jack.dubbo.TestService;

/**
 * @Author: 郭佳
 * @ClassName: TestServiceImpl
 * @Description:
 * @Date: 2019-11-21 上午 11:06
 */

@Service(version = "1.0.0",timeout = 3000)
public class TestServiceImpl implements TestService {
    @Override
    public void testDubbo() {

    }

    @Override
    public DubboResult findJson() {
        DubboResult result=new DubboResult();
        result.setCode(0);
        result.setMsg("dubbo success");
        result.setType(8);
        return result;
    }
}

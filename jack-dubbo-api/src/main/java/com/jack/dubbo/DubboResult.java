package com.jack.dubbo;
//
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 郭佳
 * @ClassName: DubboResult
 * @Description:
 * @Date: 2019-11-20 下午 15:52
 */
@Data
public class DubboResult implements Serializable {
    private int code;
    private String msg;
    public int  type;
}

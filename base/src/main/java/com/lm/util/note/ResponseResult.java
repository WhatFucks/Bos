package com.lm.util.note;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 后台返回给前台的值
 */
@Data
public class ResponseResult {
    private Integer code=20000;//返回一个状态码，20000表示成功
    private Map<String,Object>data=new HashMap<String,Object>();
    private String message= "";
}

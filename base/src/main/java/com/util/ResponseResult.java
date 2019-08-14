package com.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于返回前台Json数据的实体
 */
@Data
public class ResponseResult {
    private Integer code = 20000;//状态码
    private Map<String,Object> data = new HashMap<>();//返回前台的数据
    private String message;
}

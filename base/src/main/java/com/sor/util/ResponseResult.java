package com.sor.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class ResponseResult {
    private Integer code=20000;
    private Map<String,Object> data=new HashMap<>();
    private String message;
}

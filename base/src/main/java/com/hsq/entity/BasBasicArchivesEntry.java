package com.hsq.entity;

import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
/**
 * 基础档案条目表
 */
public class BasBasicArchivesEntry implements Serializable {

    //用户
    private SysUser user;

    //部门
    private SysDept dept;

    private Integer id;

    private String name;

    private Integer parentid;

    private String mnemoniccode;

    private Boolean available;

    private String remarks;

    private Integer operatorid;

    private Integer operationunitid;

    private Date operationtime;

    private static final long serialVersionUID = 1L;
}

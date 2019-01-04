package com.adc.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2019-01-03
 */
@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {
    private String deptno; // 主键
    private String dname; // 部门名称
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}

package com.elementui.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author wpq
 * @date 2018/10/12 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "city_select")
public class City implements Serializable {

    private static final long serialVersionUID = 1091396363372042691L;

    @Id
    @KeySql(sql = "select replace(uuid(), '-', '')", order = ORDER.BEFORE)
    private String id;


    @Column(name = "city")
    private String city;
}

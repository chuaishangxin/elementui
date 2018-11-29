package com.elementui.springboot.controller;

import com.elementui.springboot.entity.City;
import com.elementui.springboot.service.CityService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wpq
 * @date 2018/10/12 13:28
 */
@RestController
@RequestMapping("/city")
public class CityController {

    private final static Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityService cityService;

    @ApiOperation(value = "获取城市列表", notes = "获取城市列表")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
//    })
    @RequestMapping("/getList")
    public List<City> getCity(){

        cityService.insertSelective(City.builder().city("hehe").build());

        // 分页查询
        PageHelper.offsetPage(0, 5);
        // 条件查询
        Example example = new Example(City.class);
        example.and().andLike("id","1%");
        example.orderBy("id").desc();
        return cityService.selectByExample(example);
    }

}

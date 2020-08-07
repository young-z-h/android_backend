package com.example.demo.controller;

import com.common.resformat.CommonResult;
import com.example.demo.service.RegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;

@RestController
@CrossOrigin
@Api(value = "公司种类")
public class RegionController extends HttpServlet {
    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/region/findAllRegion")
    @ApiOperation(value = "查找所有企业类型")
    public CommonResult findAll(){
        CommonResult result = new CommonResult();
        try {
            result.setData(regionService.findAll());
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setState(500);
            result.setMsg("获取失败");
            return result;
        }
    }


    @GetMapping(value = "/region/findById")
    @ApiOperation(value = "根据id查找企业类型")
    public CommonResult findById(@RequestBody String id){
        CommonResult result = new CommonResult();
        try {
            System.out.println(id);
            String[] ag = id.split(":");
            result.setData(regionService.findById(Integer.parseInt(ag[1])));
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setState(500);
            result.setMsg("获取失败");
            return result;
        }
    }
}

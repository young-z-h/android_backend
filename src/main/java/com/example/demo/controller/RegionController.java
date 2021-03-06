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
@Api(value = "地区")
public class RegionController extends HttpServlet {
    @Autowired
    private RegionService regionService;

    @GetMapping(value = "/region/findAllRegion")
    @ApiOperation(value = "查找所有")
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
    @ApiOperation(value = "根据id查找")
    public CommonResult findById(@RequestParam(value = "id") int id) {
        CommonResult result = new CommonResult();
        try {
            result.setData(regionService.findById(id));
            return result;
        } catch (Exception e){
            e.printStackTrace();
            result.setState(500);
            result.setMsg("获取失败");
            return result;
        }
    }
}

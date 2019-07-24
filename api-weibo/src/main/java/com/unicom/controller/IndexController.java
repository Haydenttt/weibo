package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.IndexService;
import com.unicom.service.vo.IndexIntroVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: weibo
 * @description: 首页
 * @author: Hayden TONG
 * @create: 2019-07-22 08:41
 **/
@CrossOrigin
@RestController
@RequestMapping("index")
public class IndexController extends BaseController{

    @Autowired
    private IndexService indexService;

    @PostMapping(value = "/rmIndex")
    @ResponseBody
    public ApiResult rmIndex(){
        indexService.deleteIndexIntro();
        return ApiResult.success();
    }

    @PostMapping(value = "/indexIntro")
    public ApiResult indexIntro(){
        List<IndexIntroVO> indexIntro = indexService.getIndexIntro();
        ApiResult apiResult;
        apiResult = ApiResult.success();
        apiResult.setData(indexIntro);
        return apiResult;
    }

}

package com.unicom.controller;

import com.unicom.http.ApiResult;
import com.unicom.service.SearchService;
import com.unicom.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: weibo
 * @description: 搜索
 * @author: Hayden TONG
 * @create: 2019-07-22 08:42
 **/

@CrossOrigin
@RestController
@RequestMapping("search")
public class SearchController extends BaseController {

    @Autowired
    SearchService searchService;

    @PostMapping(value = "/searchResult")
    public ApiResult search(@RequestParam Map<String, Object> map){
        String keyword = CommonUtil.getStringFromMap(map,"keyword");
        Integer page = Integer.valueOf(CommonUtil.getStringFromMap(map,"page"));
        searchService.deleteSearchResult();
        searchService.updateSearchResult(keyword,page);
        Map<String ,Object> resultMap = searchService.getSearchResult();
        ApiResult apiResult;
        apiResult = ApiResult.success();
        apiResult.setData(resultMap);
        return apiResult;
    }
}

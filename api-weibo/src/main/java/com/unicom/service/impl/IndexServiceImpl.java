package com.unicom.service.impl;

import com.unicom.mapper.IndexIntroMapper;
import com.unicom.mapper.IndexStatsMapper;
import com.unicom.model.IndexIntro;
import com.unicom.model.IndexIntroExample;
import com.unicom.service.IndexService;
import com.unicom.service.vo.IndexIntroVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-22 08:52
 **/
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexIntroMapper indexIntroMapper;
    @Autowired
    IndexStatsMapper indexStatsMapper;

//    删除index_intro表历史数据
    @Override
    public void deleteIndexIntro(){
        IndexIntroExample example = new IndexIntroExample();
        IndexIntroExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        indexIntroMapper.deleteByExample(example);
    }

//    获得源数据并插入index_intro表
    @Override
    public void updateIndexIntro(){
//        获得json
//        计算7日热度均值
//        插入数据库
    }

//    获得index_intro表所有数据
    @Override
    public List<IndexIntroVO> getIndexIntro(){
        IndexIntroExample example = new IndexIntroExample();
        IndexIntroExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<IndexIntro> indexIntroList = indexIntroMapper.selectByExample(example);
//        自生成属性转为VO格式return
        List<IndexIntroVO> indexIntroVOList = new ArrayList<>();
        for (IndexIntro indexIntro : indexIntroList){
            IndexIntroVO indexIntroVO = new IndexIntroVO();
            BeanUtils.copyProperties(indexIntro,indexIntroVO);
            indexIntroVOList.add(indexIntroVO);
        }
        return indexIntroVOList;
    }


}

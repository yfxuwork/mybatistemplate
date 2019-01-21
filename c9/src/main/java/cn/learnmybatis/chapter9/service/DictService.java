package cn.learnmybatis.chapter9.service;

import cn.learnmybatis.chapter9.model.Dict;

import java.util.List;

/**
 * Created by Administrator on 2018/11/8 0008.
 */
public interface DictService {

    Dict findById(Long id);

    List<Dict> findBySysDict(Dict dict,Integer offset,Integer limit);

    boolean saveOrUpdate(Dict dict);

    boolean deleteById(Long id);

}

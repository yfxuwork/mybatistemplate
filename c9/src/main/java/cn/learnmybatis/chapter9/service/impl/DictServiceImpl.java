package cn.learnmybatis.chapter9.service.impl;

import cn.learnmybatis.chapter9.dao.mapper.DictMapper;
import cn.learnmybatis.chapter9.model.Dict;
import cn.learnmybatis.chapter9.service.DictService;

import com.sun.istack.internal.NotNull;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/8 0008.
 */

@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public Dict findById(@NotNull Long id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dict> findBySysDict(Dict dict, Integer offset, Integer limit) {
        RowBounds rowBounds = RowBounds.DEFAULT;
        if (offset != null && limit != null)
            rowBounds = new RowBounds(offset, limit);

        return dictMapper.selectBySysDict(dict, rowBounds);
    }

    @Override
    public boolean saveOrUpdate(Dict dict) {
        if (dict.getId() == null)
            return dictMapper.insert(dict) == 1;
        else return dictMapper.updateByPrimaryKey(dict) == 1;
    }

    @Override
    public boolean deleteById(Long id) {
        return dictMapper.deleteByPrimaryKey(id) == 1;
    }
}

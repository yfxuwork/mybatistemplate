package cn.learnmybatis.chapter5.mapper;

import cn.learnmybatis.chapter5.model.Country;
import cn.learnmybatis.chapter5.model.CountryExample;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public class CountryMapperTest extends BaseMapperTest{

    @Test
    public void testExample(){
        SqlSession sqlSession=getSqlSession();

        CountryMapper countryMapper=sqlSession.getMapper(CountryMapper.class);

        //创建Example对象
        CountryExample example=new CountryExample();
        //设置排序规则
        example.setOrderByClause("id desc, countryname asc");
        //设置是否distinct去重
        example.setDistinct(true);
        //创建条件
        CountryExample.Criteria criteria=example.createCriteria();
        //id >= 1
        criteria.andIdGreaterThanOrEqualTo(1);
        //id < 4
        criteria.andIdLessThan(4);

        //countrycode like '%U%'
        //最容易出错的地方,注意 like 必须自己写上通配符的位置
        criteria.andCountrycodeLike("%U%");

        //or的情况
        CountryExample.Criteria or=example.or();
        //countryname=中国
        or.andCountrycodeEqualTo("中国");
        //执行查询
        List<Country> countryList=countryMapper.selectByExample(example);
        printCountryList(countryList);

        sqlSession.close();
    }


    @Test
    public void testUpdateByExampleSelective(){
        SqlSession sqlSession=getSqlSession();
        CountryMapper countryMapper=sqlSession.getMapper(CountryMapper.class);

        //创建Example对象
        CountryExample example=new CountryExample();
        //创建条件, 只能有一个createCriteria
        CountryExample.Criteria criteria=example.createCriteria();
        //更新所有id > 2的国家
        criteria.andIdGreaterThan(5);
        //创建一个要设置的对象
        Country country=new Country();
        //将国家名字设置为China
        country.setCountryname("China");
        //执行查询
        countryMapper.updateByExampleSelective(country,example);

        printCountryList(countryMapper.selectByExample(example));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testDeleteByExample(){
        SqlSession sqlSession=getSqlSession();
        CountryMapper countryMapper=sqlSession.getMapper(CountryMapper.class);

        CountryExample example=new CountryExample();
        // 创建条件  只能有一个createCriteria
        CountryExample.Criteria criteria=example.createCriteria();
        //删除所有id>5的国家
        criteria.andIdGreaterThan(5);
        //执行查询
        countryMapper.deleteByExample(example);
        //使用countByExample查询符合条件的数量,因为已删除,所以这里应该是0
        Assert.assertEquals(0,countryMapper.countByExample(example));

        sqlSession.commit();
        sqlSession.close();

    }


    private void printCountryList(List<Country> countryList) {
        for (Country country : countryList) {
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }

}

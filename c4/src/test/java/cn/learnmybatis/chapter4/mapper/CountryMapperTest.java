package cn.learnmybatis.chapter4.mapper;

import cn.learnmybatis.chapter4.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public class CountryMapperTest extends BaseMapperTest{

    @Test
    public void testSelectAll2(){
        SqlSession sqlSession=getSqlSession();
        List<Country> countryList=sqlSession.selectList("cn.learnmybatis.chapter4.mapper.CountryMapper.selectAll");
        printCountryList(countryList);

        sqlSession.close();
    }

    private void printCountryList(List<Country> countryList){
        for (Country country:countryList){
            System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }

}

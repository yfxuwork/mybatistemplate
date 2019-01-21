package cn.learnmybatis.chapter3.mapper;

import cn.learnmybatis.chapter3.model.Country;
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
        List<Country> countryList=sqlSession.selectList("CountryMapper.selectAll");
        printCountryList(countryList);

        sqlSession.close();
    }

    private void printCountryList(List<Country> countryList){
        for (Country country:countryList){
            System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }

}

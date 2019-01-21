package cn.learnmybatis.chapter1.mapper;

import cn.learnmybatis.chapter1.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by Administrator on 2018/9/19 0019.
 */
public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException iOE){
            iOE.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<Country> countryList=sqlSession.selectList("selectAll");
        printCountryList(countryList);

        sqlSession.close();
    }

    private void printCountryList(List<Country> countryList){
        for (Country country:countryList){
            System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }

}

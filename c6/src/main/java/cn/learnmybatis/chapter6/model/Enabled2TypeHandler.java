package cn.learnmybatis.chapter6.model;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/6 0006.
 */
public class Enabled2TypeHandler implements TypeHandler<Enabled2>{

    private final Map<Integer,Enabled2> enabled2Map=new HashMap<Integer,Enabled2>();

    public Enabled2TypeHandler(){
        for (Enabled2 enabled2:Enabled2.values()){
            enabled2Map.put(enabled2.getValue(),enabled2);
        }
    }


    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Enabled2 enabled2, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,enabled2.getValue());
    }

    @Override
    public Enabled2 getResult(ResultSet resultSet, String s) throws SQLException {
        Integer value=resultSet.getInt(s);
        return enabled2Map.get(value);
    }

    @Override
    public Enabled2 getResult(ResultSet resultSet, int i) throws SQLException {
        Integer value=resultSet.getInt(i);
        return enabled2Map.get(value);
    }

    @Override
    public Enabled2 getResult(CallableStatement callableStatement, int i) throws SQLException {
        Integer value=callableStatement.getInt(i);
        return enabled2Map.get(value);
    }
}

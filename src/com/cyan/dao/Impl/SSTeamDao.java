package com.cyan.dao.Impl;

import com.cyan.dao.SSITeamDao;
import com.cyan.entity.SSTeam;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.HashMap;
import java.util.Map;

public class SSTeamDao extends SqlSessionDaoSupport implements SSITeamDao{
    private static final String SQL_NAMESPACE = "Team";

    @Override
    public void insert(SSTeam team) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insert", team);
    }

    @Override
    public void update(SSTeam team) {
        this.getSqlSession().update(SQL_NAMESPACE + ".update", team);
    }

    @Override
    public void delete(@Param("id")String id) {
        this.getSqlSession().delete(SQL_NAMESPACE + ".delete", id);
    }

    @Override
    public SSTeam selectById(@Param("id")String id) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("id",id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectById", map);
    }
}

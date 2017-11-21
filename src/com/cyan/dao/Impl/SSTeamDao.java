package com.cyan.dao.Impl;

import com.cyan.dao.SSITeamDao;
import com.cyan.entity.SSTeam;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SSTeamDao extends SqlSessionDaoSupport implements SSITeamDao{
    private static final String SQL_NAMESPACE = "Team";

    @Override
    public void insert(SSTeam team) {
        
    }
}

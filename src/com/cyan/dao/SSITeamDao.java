package com.cyan.dao;

import com.cyan.entity.SSTeam;

public interface SSITeamDao {
    public void insert(SSTeam team);

    public void update(SSTeam team);

    public void delete(String id);

    public SSTeam selectById(String id);
}

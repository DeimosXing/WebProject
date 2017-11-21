package com.cyan.dao.Impl;

import com.cyan.dao.SSIAdminDao;
import com.cyan.entity.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:
 *
 * @Author cyan
 * @Date 16/7/8.
 */

@Repository
public class SSAdminDao extends SqlSessionDaoSupport implements SSIAdminDao {

    private static final String SQL_NAMESPACE = "Admin";
/**
 * admin
 **/
    @Override
    public Admin selectById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectById", map);
    }
/**
 * team
 * */
    @Override
    public List<SSTeam> selectAllSSTeams() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllSSTeams");
    }

    @Override
    public void updateSSTeam(SSTeam ssteam) {
        Map<String, SSTeam> map = new HashMap<String, SSTeam>();
        map.put("s", ssteam);
        this.getSqlSession().update(SQL_NAMESPACE + ".updateSSTeam", map);
    }

    @Override
    public SSTeam selectSSTeamById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectSSTeamById", map);
    }

    @Override
    public void addSSTeam(SSTeam ssteam) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertSSTeam", ssteam);
    }

    @Override
    public void delSSTeam(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delSSTeam", map);

    }


    /**
     * project
     * */
    @Override
    public List<SSProject> selectAllSSProjects() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllSSProjects");
    }
    @Override
    public SSProject selectSSProjById(String id){
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selecSSProjById", map);

    }

    @Override
    public void addSSProject(SSProject ssproject) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertClz", ssproject);
    }
    @Override
    public void updateSSProject(SSProject ssproject){
        Map<String, SSProject> map = new HashMap<String, SSProject>();
        map.put("s", ssproject);
        this.getSqlSession().update(SQL_NAMESPACE + ".updateSSJudge", map);

    }
    @Override
    public void delSSProject(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delSSProject", map);
    }
    /**
     * judge
     * */
    @Override
    public void updateSSJudge(SSJudge ssjudge){
        Map<String, SSJudge> map = new HashMap<String, SSJudge>();
        map.put("s", ssjudge);
        this.getSqlSession().update(SQL_NAMESPACE + ".updateSSJudge", map);

    }
    @Override
    public List<SSJudge> selectAllSSJudges() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllSSJudges");
    }

    @Override
    public SSJudge selectSSJudgeById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selecSSJudgetById", map);
    }

    @Override
    public void addSSJudge(SSJudge ssjudge) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertSSJudge", ssjudge);
    }


    @Override
    public void delSSJudgeById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delSSJudgeById", map);
    }
    
    
    
    
    
    
    /**
     * athlete
     * */

    @Override
    public void updateSSAthlete(SSAthlete ssathlete){
        Map<String, SSAthlete> map = new HashMap<String, SSAthlete>();
        map.put("s", ssathlete);
        this.getSqlSession().update(SQL_NAMESPACE + ".updateSSAthlete", map);

    }
    @Override
    public List<SSAthlete> selectAllSSAthletes() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllSSAthletes");
    }

    @Override
    public SSAthlete selectSSAthleteById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selecSSAthletetById", map);
    }

    @Override
    public void addSSAthlete(SSAthlete ssathlete) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertSSAthlete", ssathlete);
    }


    @Override
    public void delSSAthleteById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delSSAthleteById", map);
    }




}

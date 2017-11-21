package com.cyan.dao;

import com.cyan.entity.Admin;
import com.cyan.entity.SSProject;
import com.cyan.entity.SSTeam;
import com.cyan.entity.SSAthlete;
import com.cyan.entity.SSJudge;
import java.util.List;

/**
 * 功能描述:
 *
 * @Author jifeng
 * * @Date 17/11/21.
 */
public interface SSIAdminDao {

    public Admin selectById(String id);
    public List<SSTeam> selectAllSSTeams();
    public List<SSAthlete> selectAllSSAthletes();
    public List<SSProject> selectAllSSProjects();
    public List<SSJudge> selectAllSSJudges();


   public void updateSSTeam(SSTeam ssteam);
    public SSTeam selectSSTeamById(String id);
    public void addSSTeam(SSTeam ssteam);
    public void delSSTeam(String id);

    public void updateSSProject(SSProject ssproject);
    public SSProject selectSSProjById(String id);
    public void addSSProject(SSProject ssproject);
    public void delSSProject(String id);


    public void updateSSAthlete(SSAthlete ssathlete);
    public SSAthlete selectSSAthleteById(String id);
    public void addSSAthlete(SSAthlete ssathlete);
    public void delSSAthleteById(String id);

    public void updateSSJudge(SSJudge ssjudge);
    public SSJudge selectSSJudgeById(String id);
    public void addSSJudge(SSJudge ssjudge);
    public void delSSJudgeById(String id);

}

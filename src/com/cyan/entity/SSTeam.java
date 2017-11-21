package com.cyan.entity;

public class SSTeam {
    private String id;
    private String teamName;
    private String leaderName;
    private String leaderIdentity;
    private String leaderPhone;
    private String doctorName;
    private String doctorPhone;
    private String coachName;
    private String coachPhone;
    private String coachSex;
    private String coachId;
    private String pwd;

    public String getCoachSex() {
        return coachSex;
    }

    public void setCoachSex(String coachSex) {
        this.coachSex = coachSex;
    }

    public String getCoachId() {
        return coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderIdentity() {
        return leaderIdentity;
    }

    public void setLeaderIdentity(String leaderIdentity) {
        this.leaderIdentity = leaderIdentity;
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachPhone() {
        return coachPhone;
    }

    public void setCoachPhone(String coachPhone) {
        this.coachPhone = coachPhone;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

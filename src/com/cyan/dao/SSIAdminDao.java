package com.cyan.dao;

import com.cyan.entity.*;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author cyan
 * @Date 16/7/8.
 */
public interface SSIAdminDao {

    public Admin selectById(String id);

    public List<SSTeam> selectAllTeams();

    public List<Course> selectAllCourses();

    public void updateStudent(Student student);

    public void updateTeam(SSTeam team);

    public Student selectStuById(String id);

    public void addStudent(Student student);

    public void delStudent(String id);

    public void addCourse(Course course);

    public void delCourse(Integer id);

    public List<StudyInfo> selectAllStudyInfo();

    public void addStudyInfo(StudyInfo studyInfo);

    public void delStudyInfo(Integer id);

    public StudyInfo selectById(Integer id);

    public void delStudyInfoByCId(Integer id);

    public void delStudyInfoBySId(String id);
}


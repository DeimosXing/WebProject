package com.cyan.dao.Impl;

import com.cyan.dao.IAdminDao;
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

    private static final String SQL_NAMESPACE = "SSAdmin";

    @Override
    public Admin selectById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectById", map);
    }

    @Override
    public List<SSTeam> selectAllTeams() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllTeams");
    }

    @Override
    public List<Course> selectAllCourses() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllCourses");
    }

    @Override
    public void updateStudent(Student student) {
        Map<String, Student> map = new HashMap<String, Student>();
        map.put("s", student);
        this.getSqlSession().update(SQL_NAMESPACE + ".updateStudent", map);
    }

    @Override
    public Student selectStuById(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectStuById", map);
    }

    @Override
    public void addStudent(Student student) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertStudent", student);
    }

    @Override
    public void delStudent(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delStudent", map);

    }

    @Override
    public void addCourse(Course course) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertClz", course);
    }

    @Override
    public void delCourse(Integer id) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delCourse", map);
    }

    @Override
    public List<StudyInfo> selectAllStudyInfo() {
        return this.getSqlSession().selectList(SQL_NAMESPACE + ".selectAllStudyInfo");
    }

    @Override
    public void addStudyInfo(StudyInfo studyInfo) {
        this.getSqlSession().insert(SQL_NAMESPACE + ".insertStudyInfo", studyInfo);
    }

    @Override
    public void delStudyInfo(Integer id) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delStudyInfo", map);
    }

    @Override
    public StudyInfo selectById(Integer id) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("id", id);
        return this.getSqlSession().selectOne(SQL_NAMESPACE + ".selectByStudyId", map);
    }

    @Override
    public void delStudyInfoByCId(Integer id) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + ".delStudyInfoByCId", map);
    }

    @Override
    public void delStudyInfoBySId(String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", id);
        this.getSqlSession().delete(SQL_NAMESPACE + "delStudyInfoBySId", map);
    }
}

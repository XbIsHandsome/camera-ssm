package com.camera.model;

import java.io.Serializable;

public class ClassCourse implements Serializable {
    private Integer ccid;

    private String semester;

    private String weekTime;

    private Integer time;

    private String place;

    private String teacher;

    private Integer week;

    private Integer cid;

    private Integer csid;

    private static final long serialVersionUID = 1L;

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getWeekTime() {
        return weekTime;
    }

    public void setWeekTime(String weekTime) {
        this.weekTime = weekTime == null ? null : weekTime.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ccid=").append(ccid);
        sb.append(", semester=").append(semester);
        sb.append(", weekTime=").append(weekTime);
        sb.append(", time=").append(time);
        sb.append(", place=").append(place);
        sb.append(", teacher=").append(teacher);
        sb.append(", week=").append(week);
        sb.append(", cid=").append(cid);
        sb.append(", csid=").append(csid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ClassCourse other = (ClassCourse) that;
        return (this.getCcid() == null ? other.getCcid() == null : this.getCcid().equals(other.getCcid()))
            && (this.getSemester() == null ? other.getSemester() == null : this.getSemester().equals(other.getSemester()))
            && (this.getWeekTime() == null ? other.getWeekTime() == null : this.getWeekTime().equals(other.getWeekTime()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getTeacher() == null ? other.getTeacher() == null : this.getTeacher().equals(other.getTeacher()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCsid() == null ? other.getCsid() == null : this.getCsid().equals(other.getCsid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCcid() == null) ? 0 : getCcid().hashCode());
        result = prime * result + ((getSemester() == null) ? 0 : getSemester().hashCode());
        result = prime * result + ((getWeekTime() == null) ? 0 : getWeekTime().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getTeacher() == null) ? 0 : getTeacher().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCsid() == null) ? 0 : getCsid().hashCode());
        return result;
    }
}
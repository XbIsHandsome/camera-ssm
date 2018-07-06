package com.camera.model;

import java.io.Serializable;

public class Stuclass implements Serializable {
    private Integer cid;

    private String department;

    private String major;

    private String grade;

    private String number;

    private String lastWeekNattend;

    private String className;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getLastWeekNattend() {
        return lastWeekNattend;
    }

    public void setLastWeekNattend(String lastWeekNattend) {
        this.lastWeekNattend = lastWeekNattend == null ? null : lastWeekNattend.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", department=").append(department);
        sb.append(", major=").append(major);
        sb.append(", grade=").append(grade);
        sb.append(", number=").append(number);
        sb.append(", lastWeekNattend=").append(lastWeekNattend);
        sb.append(", className=").append(className);
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
        Stuclass other = (Stuclass) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getLastWeekNattend() == null ? other.getLastWeekNattend() == null : this.getLastWeekNattend().equals(other.getLastWeekNattend()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getLastWeekNattend() == null) ? 0 : getLastWeekNattend().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        return result;
    }
}
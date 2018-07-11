package com.camera.model;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer csid;

    private String coursename;

    private String warning;

    private static final long serialVersionUID = 1L;

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning == null ? null : warning.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", csid=").append(csid);
        sb.append(", coursename=").append(coursename);
        sb.append(", warning=").append(warning);
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
        Course other = (Course) that;
        return (this.getCsid() == null ? other.getCsid() == null : this.getCsid().equals(other.getCsid()))
            && (this.getCoursename() == null ? other.getCoursename() == null : this.getCoursename().equals(other.getCoursename()))
            && (this.getWarning() == null ? other.getWarning() == null : this.getWarning().equals(other.getWarning()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCsid() == null) ? 0 : getCsid().hashCode());
        result = prime * result + ((getCoursename() == null) ? 0 : getCoursename().hashCode());
        result = prime * result + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return result;
    }
}
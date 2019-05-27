package com.then.pojo;

import com.then.entity.Grade;

public class StudentScore {
    private String sno;
    private String cno;
    private String cname;
    private float score;

    public StudentScore() {
    }
    public StudentScore(Grade grade){
        sno=grade.getSno();
        score=grade.getScore();
        cno=grade.getCno();
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String sname) {
        this.cname = sname;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}

package com.ltp.gradesubmission;

public class Grade {

    private String name;
    private String subject;
    private String score;

    // spring boot uses this to make empty grade objects!!`
    public Grade() {
    }



    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", subject='" + getSubject() + "'" +
            ", score='" + getScore() + "'" +
            "}";
    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }



    
}

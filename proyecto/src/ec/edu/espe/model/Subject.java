/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Chicaiza Jaya Cristopher Jennsy <cjchicaiza2@espe.edu.ec>
 */
public class Subject {
    String className;
    String nrc;
    int credits;
    int semester;
    String hours;
    String days;
    char scheduleFlag[];

    @Override
    public String toString() {
        return "Subject{" + "className=" + className + ", nrc=" + nrc + ", credits=" + credits + ", semester=" + semester + ", days=" + days + '}';
    }

 

 


    public Subject() {
    }

    public Subject(String className, String nrc, int credits, int semester) {
        this.className = className;
        this.nrc = nrc;
        this.credits = credits;
        this.semester = semester;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public char[] getScheduleFlag() {
        return scheduleFlag;
    }

    public void setScheduleFlag(char[] scheduleFlag) {
        this.scheduleFlag = scheduleFlag;
    }

    

}

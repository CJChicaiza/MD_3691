/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author COMPUTRONCEIBOS
 */
public class SubjectM {
    String className;
    String nrc;
    int credits;
    int semester;
    String hours;
    String days;
    char scheduleFlag[];
    String dominio;
    
    @Override
    public String toString() {
        return "Materia: " + className + ", NRC: " + nrc + ", Creditos: " + credits + ", Semestre: " + semester + ", \n \t Horario: " + days +'\n';
    }

    public SubjectM(String className, String nrc, int credits, int semester,String dominio) {
        this.className = className;
        this.nrc = nrc;
        this.credits = credits;
        this.semester = semester;
        this.dominio= dominio;
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

 
    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    

}


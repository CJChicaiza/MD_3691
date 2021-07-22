/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Chicaiza Jaya Cristopher Jennsy <cjchicaiza2@espe.edu.ec>
 */
public class Subject {
    String className;
    String nrc;
    String credits;

    public Subject() {
    }

    public Subject(String className, String nrc, String credits) {
        this.className = className;
        this.nrc = nrc;
        this.credits = credits;
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

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
    
    
}

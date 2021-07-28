/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Subject;
import java.util.ArrayList;

/**
 *
 * @author Chicaiza Jaya Cristopher Jennsy <cjchicaiza2@espe.edu.ec>
 */
// Subjects COMPUTER SCIENCES DEP

public class SubjectsCSD {

    public ArrayList<Subject> GetSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();
        Subject subjectFP = new Subject("Fundamentos de Programacion", "1243", 6, 1,"Programacion");
        Subject subjectFIS = new Subject("Fundamentos de Ingenieria de Software", "1534", 4, 1);
        Subject subjectPOO = new Subject("Programación Orientada a Objetos", "2837", 8, 2,"Programacion");
        Subject subjectEDD = new Subject("Estructura de Datos", "3612", 6, 3,"Programacion");
        Subject subjectMDS = new Subject("Modelos Discretos para Ingenieria SO", "3621", 6, 3);
        Subject subjectCD = new Subject("Computación Digital", "4527", 6, 4);
        Subject subjectPW = new Subject("Programación Web", "4762", 6, 4,"Desarrollo Web");//-> deberia ser web
        Subject subjectMPDS = new Subject("Modelos de Procesos de Desarrollo de Software", "4526", 4, 4);
        Subject subjectSBD = new Subject("Sistemas de Bases de Datos", "4162", 6, 4,"Bases de datos");
        Subject subjectIU = new Subject("Ingenieria de Usabilidad", "4213", 4, 4);
        Subject subjectCP = new Subject("Computación Paralela", "4619", 4, 4,"Programacion");
        //---------
        Subject subjectSABD = new Subject("Sistemas Avanzados de Bases de Datos", "5987", 6, 5);//Bases de datos
        Subject subjectDWA = new Subject("Desarrollo Web Avanzado", "5812", 6, 5,"Desarrollo Web");
        Subject subjectRS = new Subject("Ingenieria de Requisitos de Software", "5253", 6, 5);
        Subject subjectCG = new Subject("Computacion Grafica", "5000", 4, 5,"App Graficas");
        Subject subjectIIS = new Subject("Investigacion en la Ingenieria de Software", "5803", 4, 5);
        Subject subjectRC = new Subject("Redes de Computadores", "5209", 4, 5,"Redes");
        Subject subjectABC = new Subject("Aplicaciones Basadas en el Conocimiento", "6890", 6, 6);
        Subject subjectPS = new Subject("Pruebas de Software", "6127", 4, 6,"Programacion");
        Subject subjectADS = new Subject("Analisis y diseno de Software", "6699", 4, 6);
        Subject subjectSO = new Subject("Sistemas Operativos", "6070", 4, 6);
        Subject subjectLETA = new Subject("Lectura y Escritura de Textos Academicos", "6329", 4, 6);
        Subject subjectDAM = new Subject("Desarrollo de Aplicaciones Moviles", "6336", 4, 6,"App Moviles");
        //---------
        Subject subjectACS = new Subject("Aseguramiento de la Calidad de software", "7410", 4, 7);
        Subject subjectAD = new Subject("Aplicaciones Distribuidas", "7852", 4, 7);
        Subject subjectISS = new Subject("Ingenieria de la seguridad del Software", "7963", 4, 7);
        Subject subjectDV = new Subject("Desarrollo de Videojuegos", "7123", 4, 7);
        Subject subjectDSS = new Subject("Desarrollo de Software Seguro", "7456", 4, 7);
        Subject subjectCES = new Subject("Construccion y Evolución del software", "8410", 4, 8);
        Subject subjectAS = new Subject("Arquitectura de software", "8789", 4, 8);
        Subject subjectDSADI = new Subject("Desarrollo de software aplicado al Dominio de la Interculturalidad", "7531", 4, 8);
        Subject subjectGPS = new Subject("Gestion de Proyectos de Software", "8412", 4, 8);
        //**************************
        subjects.add(subjectFP);
        subjects.add(subjectFIS);
        subjects.add(subjectPOO);
        subjects.add(subjectEDD);
        subjects.add(subjectMDS);
        subjects.add(subjectCD);
        subjects.add(subjectPW);
        subjects.add(subjectMPDS);
        subjects.add(subjectSBD);
        subjects.add(subjectIU);
        subjects.add(subjectCP);
        //-----------
        subjects.add(subjectSABD);
        subjects.add(subjectDWA);
        subjects.add(subjectRS);
        subjects.add(subjectCG);
        subjects.add(subjectIIS);
        subjects.add(subjectRC);
        subjects.add(subjectABC);
        subjects.add(subjectPS);
        subjects.add(subjectADS);
        subjects.add(subjectSO);
        subjects.add(subjectLETA);
        subjects.add(subjectDAM);
        //----------
        subjects.add(subjectACS);
        subjects.add(subjectAD);
        subjects.add(subjectISS);
        subjects.add(subjectDV);
        subjects.add(subjectDSS);
        subjects.add(subjectCES);
        subjects.add(subjectAS);
        subjects.add(subjectDSADI);
        subjects.add(subjectGPS);
        
        
        
        return subjects;
    }
}

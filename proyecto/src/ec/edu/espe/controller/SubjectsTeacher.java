package ec.edu.espe.controller;


import ec.edu.espe.model.SubjectM;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTRONCEIBOS
 */
public class SubjectsTeacher {
    
     public ArrayList<SubjectM> GetSubjectsM() {
        ArrayList<SubjectM> subjects = new ArrayList<>();
        SubjectM subjectFP = new SubjectM("Fundamentos de Programacion", "1243", 6, 1,"Programacion");
        SubjectM subjectAL = new SubjectM("Algebra Lineal", "1343", 6, 1,"Tecnica");
        SubjectM subjectFIS = new SubjectM("Fundamentos de Ingenieria de Software", "1534", 4, 1,"IngenieriaRequisitos");
        SubjectM subjectPOO = new SubjectM("Programación Orientada a Objetos", "2837", 8, 2,"Programacion");
        SubjectM subjectCV = new SubjectM("CalculoVectorial", "2857", 4, 2,"Tecnica");
        SubjectM subjectED = new SubjectM("Ecuaciones Diferenciales", "2871", 4, 2,"Tecnica");
        SubjectM subjectEDD = new SubjectM("Estructura de Datos", "3612", 6, 3,"Programacion");
        SubjectM subjectMDS = new SubjectM("Modelos Discretos para Ingenieria SO", "3621", 6, 3,"IngenieriaRequisitos");
        SubjectM subjectCD = new SubjectM("Computación Digital", "4527", 6, 4,"Programacion");
        SubjectM subjectMN = new SubjectM("Metodos Numericos", "4537", 6, 4,"Programacion");
        SubjectM subjectL = new SubjectM("Liderazgo", "4237", 6, 4,"IngenieriaRequisitos");
        SubjectM subjectPW = new SubjectM("Programación Web", "4762", 6, 4,"Programacion");
        SubjectM subjectMPDS = new SubjectM("Modelos de Procesos de Desarrollo de Software", "4526", 4, 4,"IngenieriaRequisitos");
        SubjectM subjectSBD = new SubjectM("Sistemas de Bases de Datos", "4162", 6, 4,"DesarrolloAplicaciones");
        SubjectM subjectIU = new SubjectM("Ingenieria de Usabilidad", "4213", 4, 4,"IngenieriaRequisitos");
        SubjectM subjectCP = new SubjectM("Computación Paralela", "4619", 4, 4,"Programacion");
        //---------
        SubjectM subjectSABD = new SubjectM("Sistemas Avanzados de Bases de Datos", "5987", 6, 5,"DesarrolloAplicaiones");
        SubjectM subjectDWA = new SubjectM("Desarrollo Web Avanzado", "5812", 6, 5,"Programacion");
        SubjectM subjectRS = new SubjectM("Ingenieria de Requisitos de Software", "5253", 6, 5,"IngenieriaRequisitos");
        SubjectM subjectCG = new SubjectM("Computacion Grafica", "5000", 4, 5,"Programacion");
        SubjectM subjectIIS = new SubjectM("Investigacion en la Ingenieria de Software", "5803", 4, 5,"IngenieriaRequisitos");
        SubjectM subjectRC = new SubjectM("Redes de Computadores", "5209", 4, 5,"DesarrolloAplicaciones");
        SubjectM subjectABC = new SubjectM("Aplicaciones Basadas en el Conocimiento", "6890", 6, 6,"DesarrolloAplicaciones");
        SubjectM subjectPS = new SubjectM("Pruebas de Software", "6127", 4, 6,"ArquitecturaSoftware");
        SubjectM subjectADS = new SubjectM("Analisis y diseno de Software", "6699", 4, 6,"ArquitecturaSoftware");
        SubjectM subjectSO = new SubjectM("Sistemas Operativos", "6070", 4, 6,"DesarrolloAplicaciones");
        SubjectM subjectLETA = new SubjectM("Lectura y Escritura de Textos Academicos", "6329", 4, 6,"IngenieriaRequisitos");
        SubjectM subjectDAM = new SubjectM("Desarrollo de Aplicaciones Moviles", "6336", 4, 6,"DesarrolloAplicaciones");
        //---------
        SubjectM subjectACS = new SubjectM("Aseguramiento de la Calidad de software", "7410", 4, 7,"ArquitecturaSoftware");
        SubjectM subjectAD = new SubjectM("Aplicaciones Distribuidas", "7852", 4, 7,"DesarrolloAplicaciones");
        SubjectM subjectISS = new SubjectM("Ingenieria de la seguridad del Software", "7963", 4, 7,"ArquitecturaSoftware");
        SubjectM subjectDV = new SubjectM("Desarrollo de Videojuegos", "7123", 4, 7,"DesarrolloAplicaciones");
        SubjectM subjectDSS = new SubjectM("Desarrollo de Software Seguro", "7456", 4, 7,"ArquitecturaSoftware");
        SubjectM subjectCES = new SubjectM("Construccion y Evolución del software", "8410", 4, 8,"ArquitecturaSoftware");
        SubjectM subjectAS = new SubjectM("Arquitectura de software", "8789", 4, 8,"ArquitecturaSoftware");
        SubjectM subjectDSADI = new SubjectM("Desarrollo de software aplicado al Dominio de la Interculturalidad", "7531", 4, 8,"ArquitecturaSoftware");
        SubjectM subjectGPS = new SubjectM("Gestion de Proyectos de Software", "8412", 4, 8,"ArquitecturaSoftware");
        //**************************
        subjects.add(subjectFP);
        subjects.add(subjectL);
        subjects.add(subjectMN);
        subjects.add(subjectAL);
        subjects.add(subjectFIS);
        subjects.add(subjectCV);
        subjects.add(subjectED);
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

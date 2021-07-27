/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.SubjectM;
import java.util.ArrayList;

/**
 *
 * @author COMPUTRONCEIBOS
 */
public class ScheduleMakerT {
    
       public ArrayList<SubjectM> TeachersSchedule(String dominio) {
           
        //System.out.print(dominio);
        ArrayList<SubjectM> subjects = new ArrayList<>();
        ArrayList<SubjectM> fSchedule = new ArrayList<>();
        subjects = getDominioSubjects(dominio);
        char scheduleFlag[];
        scheduleFlag = new char[15];
        scheduleFlag = waxScheduleFlag();
        int credits = 0;

       /* for (int i = 0; i < scheduleFlag.length; i++) {
            //System.out.print(scheduleFlag[i]);
        }*/
        for (SubjectM subject : subjects) {
            credits = subject.getCredits();
            if (credits == 8) {
                char flagfc[];
                flagfc = new char[4];
                boolean ffc = true;
                int i = 0;
                do {
                    if (scheduleFlag[5 * i] != 0 && scheduleFlag[5 * i + 1] != 0 && scheduleFlag[5 * i + 2] != 0 && scheduleFlag[5 * i + 3] != 0) {
                        int a = 0;
                        for (int z = 0; z < 4; z++) {
                            flagfc[a] = scheduleFlag[5 * i + z];
                            scheduleFlag[5 * i + z] = 0;
                            a++;
                        }

                        subject.setScheduleFlag(flagfc);
                        ffc = false;
                    }
                    i++;
                    if (i > 2) {
                        ffc = false;
                    }
                } while (ffc == true);
                fSchedule.add(subject);
            } else if (credits == 6) {
                try {
                    char flagsc[];
                    flagsc = new char[3];
                    boolean fsc = true;
                    int j = 0;
                    do {
                        if (scheduleFlag[5 * j] != 0 && scheduleFlag[5 * j + 2] != 0 && scheduleFlag[5 * j + 4] != 0) {
                            int a = 0;
                            for (int z = 0; z < 5; z = z + 2) {

                                flagsc[a] = scheduleFlag[5 * j + z];
                                scheduleFlag[5 * j + z] = 0;
                                a++;
                            }

                            subject.setScheduleFlag(flagsc);
                            fsc = false;
                        }
                        j++;
                        if (j > 2) {
                            fsc = false;
                        }
                    } while (fsc == true);
                    fSchedule.add(subject);
                } catch (Exception e) {

                }
            } else if (credits == 4) {
                   //System.out.println(subject.toString());
                char flagtc[];
                flagtc = new char[2];
                boolean ftc = true;
                int k = 0;
                int fa = 0;
                int fb = 0;
                do {
                    if (scheduleFlag[5 * k + 1] != 0 && scheduleFlag[5 * k + 3] != 0) {
                        int a = 0;
                        for (int z = 1; z < 4; z = z + 2) {

                            flagtc[a] = scheduleFlag[5 * k + z];
                            scheduleFlag[5 * k + z] = 0;
                            a++;
                        }

                        subject.setScheduleFlag(flagtc);
                        ftc = false;
                        fa = 1;
                    }
                    k++;

                    if (k > 2) {
                        ftc = false;
                        fb = 1;
                    }

                } while (ftc == true);
                //
                k = 0;
                ftc = true;
                ///////////////////prueba 2
                if (fa == 0) {

                    do {
                        if (scheduleFlag[5 * k] != 0 && scheduleFlag[5 * k + 2] != 0) {
                            int a = 0;
                            for (int z = 0; z < 3; z = z = z + 2) {

                                flagtc[a] = scheduleFlag[5 * k + z];
                                scheduleFlag[5 * k + z] = 0;
                                a++;
                            }

                            subject.setScheduleFlag(flagtc);
                            ftc = false;
                        }
                        k++;
                        if (k > 2) {
                            ftc = false;
                        }

                    } while (ftc == true);
                }

                /*   if( flag2==1){
                        
                    }else{*/
                fSchedule.add(subject);
                //    }

            } else if (credits == 2) {
                try {
                    char flaglc[];
                    flaglc = new char[4];
                    boolean flc = true;
                    int l = 0;
                    do {
                        if (scheduleFlag[l] != 0) {

                            flaglc[0] = scheduleFlag[l];
                            scheduleFlag[l] = 0;

                            subject.setScheduleFlag(flaglc);
                            flc = false;
                        }
                        l++;
                        if (l > 14) {
                            flc = false;
                        }
                    } while (flc == true);
                    fSchedule.add(subject);
                } catch (Exception e) {

                }
            }

        }

        return fSchedule;
    }
     
      public ArrayList<SubjectM> ordeyByArea(ArrayList<SubjectM> subjects){
          
          int i = 0;
        ArrayList<SubjectM> subjectsF = new ArrayList<>();
        try {
            for (SubjectM subject : subjects) {
                if (subject.getDominio().equals("Programacion")) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getDominio().equals("IngenieraRequisitos")) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getDominio().equals("DesarrolloAplicaciones")) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getDominio().equals("ArquitecturaSoftware")) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }

        return subjectsF;
        
       
    }         
       
     public ArrayList<SubjectM> getDominioSubjects(String dominio){
        SubjectsTeacher subjectsTC = new SubjectsTeacher();
        ArrayList<SubjectM> allSubjects = new ArrayList<>();
        ArrayList<SubjectM> dominioSubjects = new ArrayList<>();
        
        allSubjects = subjectsTC.GetSubjectsM();
        String t="";
        
        for(SubjectM subject : allSubjects){
            if(subject.getDominio().equals(dominio)){
                dominioSubjects.add(subject);
            }
        }
        dominioSubjects = orderByCredits(dominioSubjects);
        return dominioSubjects;
       
    }    
     public ArrayList<SubjectM> getSemesterSubjects(int semester) {

        SubjectsTeacher subjectsM = new SubjectsTeacher();
        ArrayList<SubjectM> allSubjects = new ArrayList<>();
        ArrayList<SubjectM> semesterSubjects = new ArrayList<>();

        allSubjects = subjectsM.GetSubjectsM();
        String t = "";

        for (SubjectM subject : allSubjects) {
            if (subject.getSemester() == semester) {
                semesterSubjects.add(subject);
            }

        }
        semesterSubjects = orderByCredits(semesterSubjects);
        return semesterSubjects;
    }
     
     public ArrayList<SubjectM> orderByCredits(ArrayList<SubjectM> subjects) {
        int i = 0;
        ArrayList<SubjectM> subjectsF = new ArrayList<>();
        try {
            for (SubjectM subject : subjects) {
                if (subject.getCredits() == 8) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getCredits() == 6) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getCredits() == 4) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }
        i = 0;
        try {
            for (SubjectM subject : subjects) {
                if (subject.getCredits() == 2) {
                    subjectsF.add(subject);
                }
                i++;
            }
        } catch (Exception e) {

        }

        return subjectsF;
    }

   
            
    public char[] waxScheduleFlag() {
        char array[];
        array = new char[15];
        char flag = 97;
        for (int i = 0; i < 15; i++) {
            array[i] = flag;
            flag++;
        }
        return array;
    }

}

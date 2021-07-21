using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScheduleWApp
{
    class Class
    {
        private String className = "";
        private String classNRC = "";
        private int classCredit = 0;
        private String classTeacher = "";
        private String classSchedule = "";

        public Class(string className, string classNRC, int classCredit, string classTeacher, string classSchedule)
        {
            this.className = className;
            this.classNRC = classNRC;
            this.classCredit = classCredit;
            this.classTeacher = classTeacher;
            this.classSchedule = classSchedule;
        }

        public string ClassSchedule { get => classSchedule; set => classSchedule = value; }
        public string ClassTeacher { get => classTeacher; set => classTeacher = value; }
        public int ClassCredit { get => classCredit; set => classCredit = value; }
        public string ClassNRC { get => classNRC; set => classNRC = value; }
        public string ClassName { get => className; set => className = value; }

        public override bool Equals(object obj)
        {
            return base.Equals(obj);
        }

        public override int GetHashCode()
        {
            return base.GetHashCode();
        }

        public override string ToString()
        {
            return "Nombre: "+className+"\n NRC: "+classNRC+"\nCreditos: "+classCredit+"\nProfesor: "+classTeacher+
                "\nHorario: "+classSchedule;
        }
    }
}

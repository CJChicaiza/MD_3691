using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ScheduleWApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Bitmap img = new Bitmap(Application.StartupPath + @"\img\fondoazul3.jpg");
            this.BackgroundImage = img;
            this.BackgroundImageLayout = ImageLayout.Stretch;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnTeacher_Click(object sender, EventArgs e)
        {
            profesor teacher = new profesor();
            this.Hide();
            teacher.Show();
        }

        private void btnStudent_Click(object sender, EventArgs e)
        {
            student students = new student();
            this.Hide();
            students.Show();
        }
    }
}

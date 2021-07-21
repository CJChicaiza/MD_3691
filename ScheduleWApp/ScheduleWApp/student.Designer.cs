
namespace ScheduleWApp
{
    partial class student
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.btnCancel = new System.Windows.Forms.Button();
            this.btnMostrar = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.lblNombre = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.chbCalcDif = new System.Windows.Forms.CheckBox();
            this.chbQuimica = new System.Windows.Forms.CheckBox();
            this.chbFundProg = new System.Windows.Forms.CheckBox();
            this.chbAlgebra = new System.Windows.Forms.CheckBox();
            this.chbFundSoft = new System.Windows.Forms.CheckBox();
            this.chbMetInv = new System.Windows.Forms.CheckBox();
            this.chbCalculoVec = new System.Windows.Forms.CheckBox();
            this.chbFisica = new System.Windows.Forms.CheckBox();
            this.chbEDO = new System.Windows.Forms.CheckBox();
            this.chbLiderazgo = new System.Windows.Forms.CheckBox();
            this.chbEstructura = new System.Windows.Forms.CheckBox();
            this.chbPOO = new System.Windows.Forms.CheckBox();
            this.chbDiscretos = new System.Windows.Forms.CheckBox();
            this.chbEstadistica = new System.Windows.Forms.CheckBox();
            this.chbMetNum = new System.Windows.Forms.CheckBox();
            this.SuspendLayout();
            // 
            // listBox1
            // 
            this.listBox1.FormattingEnabled = true;
            this.listBox1.ItemHeight = 20;
            this.listBox1.Location = new System.Drawing.Point(74, 458);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(630, 364);
            this.listBox1.TabIndex = 15;
            // 
            // btnCancel
            // 
            this.btnCancel.BackColor = System.Drawing.Color.DarkRed;
            this.btnCancel.BackgroundImage = global::ScheduleWApp.Properties.Resources.fondorojo;
            this.btnCancel.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnCancel.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCancel.ForeColor = System.Drawing.SystemColors.ButtonFace;
            this.btnCancel.Location = new System.Drawing.Point(74, 339);
            this.btnCancel.Name = "btnCancel";
            this.btnCancel.Size = new System.Drawing.Size(174, 91);
            this.btnCancel.TabIndex = 14;
            this.btnCancel.Text = "Cancelar";
            this.btnCancel.UseVisualStyleBackColor = false;
            this.btnCancel.Click += new System.EventHandler(this.btnCancel_Click);
            // 
            // btnMostrar
            // 
            this.btnMostrar.BackColor = System.Drawing.Color.MidnightBlue;
            this.btnMostrar.BackgroundImage = global::ScheduleWApp.Properties.Resources.fondo5;
            this.btnMostrar.FlatAppearance.BorderColor = System.Drawing.Color.White;
            this.btnMostrar.FlatAppearance.BorderSize = 10;
            this.btnMostrar.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnMostrar.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMostrar.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnMostrar.Location = new System.Drawing.Point(521, 339);
            this.btnMostrar.Margin = new System.Windows.Forms.Padding(1);
            this.btnMostrar.Name = "btnMostrar";
            this.btnMostrar.Size = new System.Drawing.Size(183, 91);
            this.btnMostrar.TabIndex = 13;
            this.btnMostrar.Text = "Mostrar Horario";
            this.btnMostrar.UseVisualStyleBackColor = false;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(244, 31);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(376, 26);
            this.textBox1.TabIndex = 10;
            // 
            // lblNombre
            // 
            this.lblNombre.AutoSize = true;
            this.lblNombre.BackColor = System.Drawing.Color.Transparent;
            this.lblNombre.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F);
            this.lblNombre.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblNombre.Location = new System.Drawing.Point(107, 27);
            this.lblNombre.Name = "lblNombre";
            this.lblNombre.Size = new System.Drawing.Size(113, 28);
            this.lblNombre.TabIndex = 9;
            this.lblNombre.Text = "Nombre:";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F);
            this.label1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label1.Location = new System.Drawing.Point(277, 68);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(121, 28);
            this.label1.TabIndex = 16;
            this.label1.Text = "Materias:";
            // 
            // chbCalcDif
            // 
            this.chbCalcDif.AutoSize = true;
            this.chbCalcDif.BackColor = System.Drawing.Color.Transparent;
            this.chbCalcDif.ForeColor = System.Drawing.Color.White;
            this.chbCalcDif.Location = new System.Drawing.Point(74, 108);
            this.chbCalcDif.Name = "chbCalcDif";
            this.chbCalcDif.Size = new System.Drawing.Size(206, 24);
            this.chbCalcDif.TabIndex = 17;
            this.chbCalcDif.Text = "Calculo Diferencial e Int.";
            this.chbCalcDif.UseVisualStyleBackColor = false;
            // 
            // chbQuimica
            // 
            this.chbQuimica.AutoSize = true;
            this.chbQuimica.BackColor = System.Drawing.Color.Transparent;
            this.chbQuimica.ForeColor = System.Drawing.Color.White;
            this.chbQuimica.Location = new System.Drawing.Point(74, 148);
            this.chbQuimica.Name = "chbQuimica";
            this.chbQuimica.Size = new System.Drawing.Size(101, 24);
            this.chbQuimica.TabIndex = 18;
            this.chbQuimica.Text = "Quimica I";
            this.chbQuimica.UseVisualStyleBackColor = false;
            // 
            // chbFundProg
            // 
            this.chbFundProg.AutoSize = true;
            this.chbFundProg.BackColor = System.Drawing.Color.Transparent;
            this.chbFundProg.ForeColor = System.Drawing.Color.White;
            this.chbFundProg.Location = new System.Drawing.Point(74, 191);
            this.chbFundProg.Name = "chbFundProg";
            this.chbFundProg.Size = new System.Drawing.Size(200, 24);
            this.chbFundProg.TabIndex = 19;
            this.chbFundProg.Text = "Fund. de Programacion";
            this.chbFundProg.UseVisualStyleBackColor = false;
            // 
            // chbAlgebra
            // 
            this.chbAlgebra.AutoSize = true;
            this.chbAlgebra.BackColor = System.Drawing.Color.Transparent;
            this.chbAlgebra.ForeColor = System.Drawing.Color.White;
            this.chbAlgebra.Location = new System.Drawing.Point(74, 236);
            this.chbAlgebra.Name = "chbAlgebra";
            this.chbAlgebra.Size = new System.Drawing.Size(136, 24);
            this.chbAlgebra.TabIndex = 20;
            this.chbAlgebra.Text = "Algebra Lineal";
            this.chbAlgebra.UseVisualStyleBackColor = false;
            // 
            // chbFundSoft
            // 
            this.chbFundSoft.AutoSize = true;
            this.chbFundSoft.BackColor = System.Drawing.Color.Transparent;
            this.chbFundSoft.ForeColor = System.Drawing.Color.White;
            this.chbFundSoft.Location = new System.Drawing.Point(74, 280);
            this.chbFundSoft.Name = "chbFundSoft";
            this.chbFundSoft.Size = new System.Drawing.Size(167, 24);
            this.chbFundSoft.TabIndex = 21;
            this.chbFundSoft.Text = "Fund. Ing. de Soft.";
            this.chbFundSoft.UseVisualStyleBackColor = false;
            // 
            // chbMetInv
            // 
            this.chbMetInv.AutoSize = true;
            this.chbMetInv.BackColor = System.Drawing.Color.Transparent;
            this.chbMetInv.ForeColor = System.Drawing.Color.White;
            this.chbMetInv.Location = new System.Drawing.Point(301, 108);
            this.chbMetInv.Name = "chbMetInv";
            this.chbMetInv.Size = new System.Drawing.Size(164, 24);
            this.chbMetInv.TabIndex = 22;
            this.chbMetInv.Text = "Met. Inv. Cientifica";
            this.chbMetInv.UseVisualStyleBackColor = false;
            // 
            // chbCalculoVec
            // 
            this.chbCalculoVec.AutoSize = true;
            this.chbCalculoVec.BackColor = System.Drawing.Color.Transparent;
            this.chbCalculoVec.ForeColor = System.Drawing.Color.White;
            this.chbCalculoVec.Location = new System.Drawing.Point(301, 148);
            this.chbCalculoVec.Name = "chbCalculoVec";
            this.chbCalculoVec.Size = new System.Drawing.Size(153, 24);
            this.chbCalculoVec.TabIndex = 23;
            this.chbCalculoVec.Text = "Calculo Vectorial";
            this.chbCalculoVec.UseVisualStyleBackColor = false;
            // 
            // chbFisica
            // 
            this.chbFisica.AutoSize = true;
            this.chbFisica.BackColor = System.Drawing.Color.Transparent;
            this.chbFisica.ForeColor = System.Drawing.Color.White;
            this.chbFisica.Location = new System.Drawing.Point(301, 191);
            this.chbFisica.Name = "chbFisica";
            this.chbFisica.Size = new System.Drawing.Size(85, 24);
            this.chbFisica.TabIndex = 24;
            this.chbFisica.Text = "Fisica I";
            this.chbFisica.UseVisualStyleBackColor = false;
            // 
            // chbEDO
            // 
            this.chbEDO.AutoSize = true;
            this.chbEDO.BackColor = System.Drawing.Color.Transparent;
            this.chbEDO.ForeColor = System.Drawing.Color.White;
            this.chbEDO.Location = new System.Drawing.Point(301, 236);
            this.chbEDO.Name = "chbEDO";
            this.chbEDO.Size = new System.Drawing.Size(180, 24);
            this.chbEDO.TabIndex = 25;
            this.chbEDO.Text = "Ecuaciones Dif. Ord.";
            this.chbEDO.UseVisualStyleBackColor = false;
            // 
            // chbLiderazgo
            // 
            this.chbLiderazgo.AutoSize = true;
            this.chbLiderazgo.BackColor = System.Drawing.Color.Transparent;
            this.chbLiderazgo.ForeColor = System.Drawing.Color.White;
            this.chbLiderazgo.Location = new System.Drawing.Point(301, 280);
            this.chbLiderazgo.Name = "chbLiderazgo";
            this.chbLiderazgo.Size = new System.Drawing.Size(105, 24);
            this.chbLiderazgo.TabIndex = 26;
            this.chbLiderazgo.Text = "Liderazgo";
            this.chbLiderazgo.UseVisualStyleBackColor = false;
            // 
            // chbEstructura
            // 
            this.chbEstructura.AutoSize = true;
            this.chbEstructura.BackColor = System.Drawing.Color.Transparent;
            this.chbEstructura.ForeColor = System.Drawing.Color.White;
            this.chbEstructura.Location = new System.Drawing.Point(506, 148);
            this.chbEstructura.Name = "chbEstructura";
            this.chbEstructura.Size = new System.Drawing.Size(178, 24);
            this.chbEstructura.TabIndex = 27;
            this.chbEstructura.Text = "Estructura de Datos";
            this.chbEstructura.UseVisualStyleBackColor = false;
            // 
            // chbPOO
            // 
            this.chbPOO.AutoSize = true;
            this.chbPOO.BackColor = System.Drawing.Color.Transparent;
            this.chbPOO.ForeColor = System.Drawing.Color.White;
            this.chbPOO.Location = new System.Drawing.Point(506, 108);
            this.chbPOO.Name = "chbPOO";
            this.chbPOO.Size = new System.Drawing.Size(283, 24);
            this.chbPOO.TabIndex = 28;
            this.chbPOO.Text = "Programacion Orientada a Objetos ";
            this.chbPOO.UseVisualStyleBackColor = false;
            // 
            // chbDiscretos
            // 
            this.chbDiscretos.AutoSize = true;
            this.chbDiscretos.BackColor = System.Drawing.Color.Transparent;
            this.chbDiscretos.ForeColor = System.Drawing.Color.White;
            this.chbDiscretos.Location = new System.Drawing.Point(506, 191);
            this.chbDiscretos.Name = "chbDiscretos";
            this.chbDiscretos.Size = new System.Drawing.Size(141, 24);
            this.chbDiscretos.TabIndex = 29;
            this.chbDiscretos.Text = "Mod. Discretos";
            this.chbDiscretos.UseVisualStyleBackColor = false;
            // 
            // chbEstadistica
            // 
            this.chbEstadistica.AutoSize = true;
            this.chbEstadistica.BackColor = System.Drawing.Color.Transparent;
            this.chbEstadistica.ForeColor = System.Drawing.Color.White;
            this.chbEstadistica.Location = new System.Drawing.Point(506, 236);
            this.chbEstadistica.Name = "chbEstadistica";
            this.chbEstadistica.Size = new System.Drawing.Size(113, 24);
            this.chbEstadistica.TabIndex = 30;
            this.chbEstadistica.Text = "Estadistica";
            this.chbEstadistica.UseVisualStyleBackColor = false;
            // 
            // chbMetNum
            // 
            this.chbMetNum.AutoSize = true;
            this.chbMetNum.BackColor = System.Drawing.Color.Transparent;
            this.chbMetNum.ForeColor = System.Drawing.Color.White;
            this.chbMetNum.Location = new System.Drawing.Point(506, 280);
            this.chbMetNum.Name = "chbMetNum";
            this.chbMetNum.Size = new System.Drawing.Size(176, 24);
            this.chbMetNum.TabIndex = 31;
            this.chbMetNum.Text = "Metodos Numericos";
            this.chbMetNum.UseVisualStyleBackColor = false;
            // 
            // student
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 867);
            this.Controls.Add(this.chbMetNum);
            this.Controls.Add(this.chbEstadistica);
            this.Controls.Add(this.chbDiscretos);
            this.Controls.Add(this.chbPOO);
            this.Controls.Add(this.chbEstructura);
            this.Controls.Add(this.chbLiderazgo);
            this.Controls.Add(this.chbEDO);
            this.Controls.Add(this.chbFisica);
            this.Controls.Add(this.chbCalculoVec);
            this.Controls.Add(this.chbMetInv);
            this.Controls.Add(this.chbFundSoft);
            this.Controls.Add(this.chbAlgebra);
            this.Controls.Add(this.chbFundProg);
            this.Controls.Add(this.chbQuimica);
            this.Controls.Add(this.chbCalcDif);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.listBox1);
            this.Controls.Add(this.btnCancel);
            this.Controls.Add(this.btnMostrar);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.lblNombre);
            this.ForeColor = System.Drawing.Color.White;
            this.MaximumSize = new System.Drawing.Size(823, 924);
            this.MinimumSize = new System.Drawing.Size(821, 922);
            this.Name = "student";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Estudiante";
            this.Load += new System.EventHandler(this.student_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox listBox1;
        private System.Windows.Forms.Button btnCancel;
        private System.Windows.Forms.Button btnMostrar;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label lblNombre;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.CheckBox chbCalcDif;
        private System.Windows.Forms.CheckBox chbQuimica;
        private System.Windows.Forms.CheckBox chbFundProg;
        private System.Windows.Forms.CheckBox chbAlgebra;
        private System.Windows.Forms.CheckBox chbFundSoft;
        private System.Windows.Forms.CheckBox chbMetInv;
        private System.Windows.Forms.CheckBox chbCalculoVec;
        private System.Windows.Forms.CheckBox chbFisica;
        private System.Windows.Forms.CheckBox chbEDO;
        private System.Windows.Forms.CheckBox chbLiderazgo;
        private System.Windows.Forms.CheckBox chbEstructura;
        private System.Windows.Forms.CheckBox chbPOO;
        private System.Windows.Forms.CheckBox chbDiscretos;
        private System.Windows.Forms.CheckBox chbEstadistica;
        private System.Windows.Forms.CheckBox chbMetNum;
    }
}
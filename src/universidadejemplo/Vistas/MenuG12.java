/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

/**
 *
 * @author Celia
 */
public class MenuG12 extends javax.swing.JFrame {

    /**
     * Creates new form UniversidadG12
     */
    public MenuG12() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        JMBOpc = new javax.swing.JMenuBar();
        JMAlumno = new javax.swing.JMenu();
        JMIFormAlumno = new javax.swing.JMenuItem();
        JMMateria = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        JMIAltaMateria = new javax.swing.JMenuItem();
        JMIEditarMateria = new javax.swing.JMenuItem();
        JMAdmin = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        JMIInscripcion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMICalificacionFinal = new javax.swing.JMenuItem();
        JMConsultas = new javax.swing.JMenu();
        JMIListarXAlumno = new javax.swing.JMenuItem();
        jMIListarXMateria = new javax.swing.JMenuItem();
        JMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Alumnos");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        JMAlumno.setText("Alumno");

        JMIFormAlumno.setText("Formulario de Alumno");
        JMIFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFormAlumnoActionPerformed(evt);
            }
        });
        JMAlumno.add(JMIFormAlumno);

        JMBOpc.add(JMAlumno);

        JMMateria.setText("Materia");

        jMenu1.setText("Formulario de Materias...");

        JMIAltaMateria.setText("Alta Materia");
        JMIAltaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAltaMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(JMIAltaMateria);

        JMIEditarMateria.setText("Editar/Eliminar Materia");
        JMIEditarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIEditarMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(JMIEditarMateria);

        JMMateria.add(jMenu1);

        JMBOpc.add(JMMateria);

        JMAdmin.setText("Administracion");

        jMenu2.setText("Manejo de Inscripciones...");

        JMIInscripcion.setText("Gestionar Inscripcion");
        JMIInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIInscripcionActionPerformed(evt);
            }
        });
        jMenu2.add(JMIInscripcion);

        JMAdmin.add(jMenu2);

        jMenu3.setText("Manipulacion de Notas");

        JMICalificacionFinal.setText("Registrar Calificaciones");
        JMICalificacionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICalificacionFinalActionPerformed(evt);
            }
        });
        jMenu3.add(JMICalificacionFinal);

        JMAdmin.add(jMenu3);

        JMBOpc.add(JMAdmin);

        JMConsultas.setText("Consultas");

        JMIListarXAlumno.setText("Listar por alumno...");
        JMIListarXAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListarXAlumnoActionPerformed(evt);
            }
        });
        JMConsultas.add(JMIListarXAlumno);

        jMIListarXMateria.setText("Listar por Materia...");
        jMIListarXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarXMateriaActionPerformed(evt);
            }
        });
        JMConsultas.add(jMIListarXMateria);

        JMBOpc.add(JMConsultas);

        JMSalir.setText("Salir");
        JMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMSalirActionPerformed(evt);
            }
        });
        JMBOpc.add(JMSalir);

        setJMenuBar(JMBOpc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIListarXAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListarXAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListarPorAlumno lpa=new ListarPorAlumno();
        lpa.setVisible(true);
        escritorio.add(lpa);
        escritorio.moveToFront(lpa);
    }//GEN-LAST:event_JMIListarXAlumnoActionPerformed

    private void JMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSalirActionPerformed
        
    }//GEN-LAST:event_JMSalirActionPerformed

    private void JMIFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFormAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumno ba=new FormularioAlumno();
        ba.setVisible(true);
        escritorio.add(ba);
        escritorio.moveToFront(ba);
    }//GEN-LAST:event_JMIFormAlumnoActionPerformed

    private void JMIAltaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAltaMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaMateria am=new AltaMateria();
        am.setVisible(true);
        escritorio.add(am);
        escritorio.moveToFront(am);
    }//GEN-LAST:event_JMIAltaMateriaActionPerformed

    private void JMIEditarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIEditarMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EditarEliminarMateria eem=new EditarEliminarMateria();
        eem.setVisible(true);
        escritorio.add(eem);
        escritorio.moveToFront(eem);
    }//GEN-LAST:event_JMIEditarMateriaActionPerformed

    private void JMICalificacionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICalificacionFinalActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Calificaciones cf=new Calificaciones();
        cf.setVisible(true);
        escritorio.add(cf);
        escritorio.moveToFront(cf);
    }//GEN-LAST:event_JMICalificacionFinalActionPerformed

    private void JMIInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionInscripcion gi=new GestionInscripcion();
        gi.setVisible(true);
        escritorio.add(gi);
        escritorio.moveToFront(gi);
    }//GEN-LAST:event_JMIInscripcionActionPerformed

    private void jMIListarXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarXMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListarPorMateria lpm=new ListarPorMateria();
        lpm.setVisible(true);
        escritorio.add(lpm);
        escritorio.moveToFront(lpm);
    }//GEN-LAST:event_jMIListarXMateriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuG12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuG12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuG12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuG12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuG12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAdmin;
    private javax.swing.JMenu JMAlumno;
    private javax.swing.JMenuBar JMBOpc;
    private javax.swing.JMenu JMConsultas;
    private javax.swing.JMenuItem JMIAltaMateria;
    private javax.swing.JMenuItem JMICalificacionFinal;
    private javax.swing.JMenuItem JMIEditarMateria;
    private javax.swing.JMenuItem JMIFormAlumno;
    private javax.swing.JMenuItem JMIInscripcion;
    private javax.swing.JMenuItem JMIListarXAlumno;
    private javax.swing.JMenu JMMateria;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMIListarXMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables

    
    
}

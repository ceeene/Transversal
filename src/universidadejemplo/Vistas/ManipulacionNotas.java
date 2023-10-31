
package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;


public class ManipulacionNotas extends javax.swing.JInternalFrame {
    
    private List<Alumno> listaA;
    private List<Inscripcion> listaInscripcion;
    private DefaultTableModel modelo;
    private AlumnoData aData; 
    private InscripcionData inscData; 
    private MateriaData mData; 
    
    
    public ManipulacionNotas() {
        initComponents();
        
        
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo=new DefaultTableModel();
        cargaAlumnos(); 
        armarCabeceraTabla(); 
        inscData = new InscripcionData(); 
        mData = new MateriaData();
        
        
    }

    private void armarCabeceraTabla(){
        ArrayList<Object> filaCab=new ArrayList<>();
        filaCab.add("Codigo");
        filaCab.add("Asignatura");
        filaCab.add("Nota");
        for (Object it: filaCab){
            modelo.addColumn(it);
        }
        JTMateria.setModel(modelo);
        
    }
    
    private void borrarFila(){
        int ind = modelo.getRowCount()-1;
        for (int i =ind; i>=0;i--){
            modelo.removeRow(i);
        }
        
    }
    
    private void cargaAlumnos(){
        for(Alumno item: listaA){
            JCBAlumno.addItem(item);
        }
    }
        
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLSeleccione = new javax.swing.JLabel();
        JCBAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTMateria = new javax.swing.JTable();
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 204));
        setTitle("Carga de Notas");

        JLSeleccione.setText("Seleccione un alumno");

        JCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAlumnoActionPerformed(evt);
            }
        });

        JTMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTMateria);

        JBGuardar.setText("Guardar");

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JLSeleccione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(JBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSalir)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSeleccione)
                    .addComponent(JCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBSalir))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAlumnoActionPerformed
       /* Alumno elegido= (Alumno)JCBAlumno.getSelectedItem();
        listaInscripcion= inscData.obtenerInscripcionesPorAlumno(elegido.getIdAlumno());
        if(listaInscripcion.size()>0){
            for(Inscripcion insc:listaInscripcion){
                modelo.addRow(new Object[]{
                    insc.getMateria().getIdMateria(),
                    insc.getMateria().getAsignatura(),
                    insc.getNota()
                });
            }
        }*/
    }//GEN-LAST:event_JCBAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Alumno> JCBAlumno;
    private javax.swing.JLabel JLSeleccione;
    private javax.swing.JTable JTMateria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

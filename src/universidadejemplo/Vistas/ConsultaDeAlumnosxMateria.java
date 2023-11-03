/*PROFE, ME HA VUELTO LOCO EL CODIGO, TENGO UN MINIMO ERROR QUE NO LO PUEDO ENCONTRAR, MAÑAANA SEGUIRE BUSCANDO, VI MUCHOS
VIDEOS, CLASES, ETC Y NO LOGRO DAR CON ESE PEQUEÑO DETALLE, ESTA EL 99% TERMINADO ESTE ITEM, PERO NO LE PUEDO ENCONTRAR
EL ERROR. REALIZARE EL COMMING DE TODOS MODOS PARA DEJAR CONSTANCIA*/


package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

public class ConsultaDeAlumnosxMateria extends javax.swing.JInternalFrame {

    private List <Materia> listaM;
    private List <Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    
    /** Creates new form ConsultaDeAlumnosxMateria */
    public ConsultaDeAlumnosxMateria() {
        initComponents();
        modelo= new DefaultTableModel();
        mData = new MateriaData();
        listaM = mData.ListaMaterias();
        inscData = new InscripcionData();
        aData= new AlumnoData();
        CargarMaterias();
        ArmarCabecera();
        
    }

    private void CargarMaterias (){
       
        for (Materia item: listaM) {
        
        Jcombomaterias.addItem(item);
        }
    }
    
    private void ArmarCabecera(){
    
    ArrayList <Object> filacabecera= new ArrayList<>();
    
    filacabecera.add("ID");
    filacabecera.add("DNI");
    filacabecera.add("Apellido");
    filacabecera.add("Nombre");
    
    for (Object it: filacabecera ) {
      modelo.addColumn(it);
    }
    jtablamaterias.setModel(modelo);
    
    }
   private void borrarFilaTabla(){
   
   int indice= modelo.getRowCount() -1;
   for (int i = indice;i>=0;i--) {
       modelo.removeRow(i);
   }
   
   }
    private void CargarAlumnos (){
    borrarFilaTabla();
    Materia selec= (Materia)Jcombomaterias.getSelectedItem();
    listaA= inscData.obtenerAlumnosXMateria(selec.getIdMateria());
    
    for (Alumno a: listaA) {
    
      modelo.addRow(new Object []{a.getIdAlumno(),a.getDni(),a.getApellido(),a.getNombre()});
    }
    
    
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlseleccionador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablamaterias = new javax.swing.JTable();
        Jcombomaterias = new javax.swing.JComboBox<>();
        jButonsalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 153));
        setTitle("Listado de Materias por Alumno");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlseleccionador.setText("seleccione materia");

        jtablamaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtablamaterias);

        Jcombomaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcombomateriasActionPerformed(evt);
            }
        });

        jButonsalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlseleccionador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jcombomaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButonsalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlseleccionador)
                    .addComponent(Jcombomaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButonsalir)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcombomateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcombomateriasActionPerformed
     CargarAlumnos();        // TODO add your handling code here:
    }//GEN-LAST:event_JcombomateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> Jcombomaterias;
    private javax.swing.JButton jButonsalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlseleccionador;
    private javax.swing.JTable jtablamaterias;
    // End of variables declaration//GEN-END:variables
}

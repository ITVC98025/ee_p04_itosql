
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import static base.sql.base;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alejandro
 */
public class mostrar extends javax.swing.JFrame {
DefaultComboBoxModel modelotablas,modelocampos;
ordenar order= new ordenar();
int z=0;
    /**
     * Creates new form mostrar
     */
    public mostrar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("MOSTRAR");
        cargartablas();
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/tribal.jpg")); 
        JLabel fondo= new JLabel(); fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JTable();
        combot = new javax.swing.JComboBox<>();
        ordenar = new javax.swing.JButton();
        metodos = new javax.swing.JComboBox<>();
        combocampos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("MOSTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("regresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablas);

        combot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotActionPerformed(evt);
            }
        });

        ordenar.setText("ORDENAR");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        metodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quick Sort", "Burbuja", "Sharker", "SeleccionD", "InsercionB" }));

        jLabel1.setText("Campo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(combot, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combocampos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordenar)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordenar)
                    .addComponent(metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       sql p=new sql();
       p.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mostrarmatriz();      
    }//GEN-LAST:event_jButton1ActionPerformed
    public String[][] prueba(){
     String [][]t=new String [4][3];
     t[0][0]="ID";t[0][1]="NOMBRE";t[0][2]="EDAD";
     t[1][0]="423"; t[1][1]="PEDRO"; t[1][2]="13";
     t[2][0]="3456";t[2][1]="GINA";t[2][2]="34";
     t[3][0]="6345";t[3][1]="VALE";t[3][2]="1";
     return t;
    }
    
    public void mostrarmatriz(){
     DefaultTableModel model = (DefaultTableModel)tablas.getModel();
     String [][]t=base.vaciar(combot.getSelectedItem().toString());
     //String[][] t=prueba();
     model.setRowCount(t.length);
     //model.setColumnCount(t[0].length);
     if(z==0){
     for(int d=0;d<t[0].length;d++){
      model.addColumn(t[0][d]);
      z++;
     }
     }
     //model.addColumn("TABLA");
     for (int i = 1; i <t.length; i++) { 
            for (int j = 0; j <t[i].length; j++) {
                //System.out.print(datos[i][j] + " ");
                tablas.setValueAt(t[i][j], i-1, j);
            }
         //System.out.println();
    }
    }
    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        //RECIBE TODO LO NECESARIO PARA ORDENAR
        String [][] tabla=base.vaciar(combot.getSelectedItem().toString());
        Listasimple campos=base.regresacampos(tabla);
        Listasimple datos=base.regresadatos(tabla);
        String d[]=order.crearMatriz(campos,datos,combocampos.getSelectedItem().toString(),metodos.getSelectedItem().toString());
        String n[]=order.crearTN(campos,combocampos.getSelectedItem().toString());
        refreshTable(n,d);
        
    }//GEN-LAST:event_ordenarActionPerformed
    public void refreshTable(String [] titulo, String [] datos){
        String [] encabezado = titulo;
        DefaultTableModel modelo = new DefaultTableModel(encabezado,0);
        tablas.setModel(new DefaultTableModel());
        for(int i=0;i<datos.length;i++){
        String palabra = datos[i];
        String [] array = palabra.split(",");
        Object [] d = array;
        modelo.addRow(d);
       }
        tablas.setModel(modelo);
    }


   
    private void combotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotActionPerformed
       cargarcampos();
    }//GEN-LAST:event_combotActionPerformed
    public void cargartablas(){
     String []tab=base.rtablas();
     modelotablas=new DefaultComboBoxModel(tab);
     combot.setModel(modelotablas);
    }
    public void cargarcampos(){
     String []camp=base.rcampos(combot.getSelectedItem().toString());
     modelocampos=new DefaultComboBoxModel(camp);
     combocampos.setModel(modelocampos);
    }
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
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocampos;
    private javax.swing.JComboBox<String> combot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> metodos;
    private javax.swing.JButton ordenar;
    private javax.swing.JTable tablas;
    // End of variables declaration//GEN-END:variables
}

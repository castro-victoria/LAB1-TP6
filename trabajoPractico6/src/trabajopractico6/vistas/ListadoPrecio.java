
package trabajopractico6.vistas;

import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajopractico6.entidades.Producto;
import trabajopractico6.entidades.Rubro;

public class ListadoPrecio extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo =new DefaultTableModel(){
        public boolean isCellEditable(int fila, int col){
            return false;
        } 
    };
    private TreeSet<Producto> productos;

    public ListadoPrecio(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTprecio1 = new javax.swing.JTextField();
        jTprecio2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtablaPrecio = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Listado por Precio");

        jLabel2.setText("Entre $:");

        jLabel3.setText("y");

        jTprecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTprecio1KeyReleased(evt);
            }
        });

        jTprecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTprecio2KeyReleased(evt);
            }
        });

        jTtablaPrecio.setForeground(new java.awt.Color(102, 255, 0));
        jTtablaPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTtablaPrecio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jTprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTprecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecio1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTprecio1KeyReleased

    private void jTprecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecio2KeyReleased
        // TODO add your handling code here:
       borrarFila();
       
       
       if(!(jTprecio1.getText().isEmpty()) && !(jTprecio2.getText().isEmpty())){
           Double min = Double.parseDouble(jTprecio1.getText());
           Double max = Double.parseDouble(jTprecio2.getText());
                   
        
            for(Producto prod:productos){

                if((prod.getPrecio() >=min) && (prod.getPrecio() <=max )){

                    Vector renglon=new Vector();
                    renglon.add(prod.getCodigo());
                    renglon.add(prod.getDescripcion());
                    renglon.add(prod.getPrecio());
                    renglon.add(prod.getStock());
                    renglon.add(prod.getRubro());
                    modelo.addRow(renglon); 
                }
            }  
       }else{
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jTprecio1.requestFocus();
            jTprecio2.requestFocus();
            return;
       }
        
        
    }//GEN-LAST:event_jTprecio2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTprecio1;
    private javax.swing.JTextField jTprecio2;
    private javax.swing.JTable jTtablaPrecio;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jTtablaPrecio.setModel(modelo);
    }
    
    private void borrarFila(){
        int filas=modelo.getRowCount()-1;
         
        for(int f= filas; filas>0;f--){
            modelo.removeRow(f);
        }
    }
}

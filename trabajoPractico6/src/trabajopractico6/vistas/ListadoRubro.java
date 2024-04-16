package trabajopractico6.vistas;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajopractico6.entidades.Producto;
import trabajopractico6.entidades.Rubro;

public class ListadoRubro extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int col){
            return false;
        } 
    };
    private TreeSet<Producto> productos;
    
    public ListadoRubro(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRubro = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel2.setText("Elija Rubro:");

        jcRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRubroActionPerformed(evt);
            }
        });

        jtRubro.setForeground(new java.awt.Color(102, 255, 0));
        jtRubro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRubroActionPerformed
        // TODO add your handling code here:
        borrarFila();
        Rubro rubro=(Rubro)jcRubro.getSelectedItem();
        
        for(Producto prod:productos){
            if(rubro.equals(prod.getRubro())){
                //jcRubro.setSelectedIndex(-1);
                Vector<Object> renglon=new Vector<>();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                
                modelo.addRow(renglon);
                //modelo.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.getPrecio(),prod.getStock()});
            }
        }
    }//GEN-LAST:event_jcRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Rubro> jcRubro;
    private javax.swing.JTable jtRubro;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtRubro.setModel(modelo);
    }
    
    private void llenarCombo(){
    
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jcRubro.addItem(comestible);
        jcRubro.addItem(limpieza);
        jcRubro.addItem(perfumeria);    
    }
     
    private void borrarFila(){
         int filas=modelo.getRowCount()-1;
         
         for(int f= filas; filas>0;f--){
            modelo.removeRow(f);
         }
    }
}
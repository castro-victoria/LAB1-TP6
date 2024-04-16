package trabajopractico6.vistas;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import trabajopractico6.entidades.Producto;
import trabajopractico6.entidades.Rubro;

public class ListadoNombre extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo=new DefaultTableModel(){
        public boolean isCellEditable(int fila, int col){
            return false;
        } 
    };
    private TreeSet<Producto> productos;
    
    public ListadoNombre(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTcaracteres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtablaNombre = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Listado por Nombre");

        jLabel2.setText("Escriba los primeros caracteres:");

        jTcaracteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcaracteresKeyReleased(evt);
            }
        });

        jTtablaNombre.setForeground(new java.awt.Color(102, 255, 0));
        jTtablaNombre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTtablaNombre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTcaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTcaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcaracteresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcaracteresKeyReleased
        // TODO add your handling code here:
        borrarFila();
        String encontrar = jTcaracteres.getText().toLowerCase();
        for(Producto prod:productos){
            
            if(prod.getDescripcion().toLowerCase().startsWith(encontrar)){
                
                Vector renglon=new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon); 
            }
        }  
    }//GEN-LAST:event_jTcaracteresKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcaracteres;
    private javax.swing.JTable jTtablaNombre;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jTtablaNombre.setModel(modelo);
    }
    
    private void borrarFila(){
        int filas=modelo.getRowCount()-1;
         
        for(int f= filas; filas>0;f--){
            modelo.removeRow(f);
        }
    }
}
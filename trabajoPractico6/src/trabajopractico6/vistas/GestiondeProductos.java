package trabajopractico6.vistas;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import trabajopractico6.entidades.Producto;
import trabajopractico6.entidades.Rubro;

public class GestiondeProductos extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    private Producto auxiliar=null;

    public GestiondeProductos(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        llenarCombo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jBlupa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcRubro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jBnuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Código:");

        jBlupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajopractico6/vistas/imagen/icons8-m.png"))); // NOI18N
        jBlupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlupaActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.setEnabled(false);
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jcRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtStock, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jBlupa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jBnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jBguardar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBlupa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed

        int codigo;
        String descripcion;
        double precio;
        Rubro rubro;
        int stock;
        
        if(validarEntero(jtCodigo.getText())){
            codigo = Integer.parseInt(jtCodigo.getText());
        }else{
            JOptionPane.showInternalMessageDialog(this, "codigo");
            jtCodigo.requestFocus();
            return;
        }
        
        if(validarEntero(jtStock.getText())){
            stock = Integer.parseInt(jtStock.getText());
        }else{
            JOptionPane.showInternalMessageDialog(this, "stock");
            jtStock.requestFocus();
            return;
        }
        
        if(validarReal(jtPrecio.getText())){
            precio = Double.parseDouble(jtPrecio.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jtPrecio.requestFocus();
            return;
        }
        
        if(!jtDescripcion.getText().isEmpty()){
            descripcion = jtDescripcion.getText();
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese una descripcion");
            jtDescripcion.requestFocus();
            return;
        }
        
       rubro = (Rubro)jcRubro.getSelectedItem();
      
       Producto nvoProd=new Producto(codigo,descripcion,precio,rubro,stock);
       if(productos.add(nvoProd)){
           JOptionPane.showMessageDialog(this, "Producto Agregado");
           limpiar();
       }else {
       
           JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
       }  
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        limpiar();  
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBlupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlupaActionPerformed

        int codigo;
        if(validarEntero(jtCodigo.getText())){
            codigo = Integer.parseInt(jtCodigo.getText());
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese un nro");
            jtCodigo.requestFocus();
            return;
        }
        
        for(Producto prod:productos){
            if(codigo==prod.getCodigo()){
                jtDescripcion.setText(prod.getDescripcion());
                jtPrecio.setText(prod.getPrecio()+"");
                jtStock.setText(prod.getStock()+"");
                jcRubro.setSelectedItem(prod.getRubro());
                jBeliminar.setEnabled(true);
                auxiliar=prod;
                return;  
            }
        }
        JOptionPane.showMessageDialog(this, "Codigo Inexistente");
    }//GEN-LAST:event_jBlupaActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        
                int opcion=JOptionPane.showConfirmDialog(this, "Confirma eliminacion?S/N", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                    productos.remove(auxiliar);
                    JOptionPane.showMessageDialog(this, "Producto eliminado");
                    limpiar();
                    auxiliar=null;
                }  
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private boolean validarReal(String nro){
        Pattern patron=Pattern.compile("^[0-9]+.[0-9]{2}$");   
        Matcher m=patron.matcher(nro);
        return m.matches();
    }
    private boolean validarEntero(String nro){
        Pattern patron=Pattern.compile("^[0-9]+$");   
        Matcher m=patron.matcher(nro);
        return m.matches();
    }
    
    private void llenarCombo(){
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jcRubro.addItem(comestible);
        jcRubro.addItem(limpieza);
        jcRubro.addItem(perfumeria);
    }
    
    private void limpiar(){
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcRubro.setSelectedIndex(-1);
        jBeliminar.setEnabled(false);
        auxiliar=null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlupa;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<Rubro> jcRubro;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
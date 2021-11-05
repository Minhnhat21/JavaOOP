/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.subframe;

import JavaOOP_SWING.Bai13.Coffeshop;
import JavaOOP_SWING.Bai13.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class MyCoffee extends javax.swing.JInternalFrame {

    /**
     * Creates new form MyCoffee
     */
    Manager[] manager1;
            
    public MyCoffee() throws ParseException {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

        Coffeshop[] a = new Coffeshop[] {new Coffeshop("HighLand Coffee","01 Chu Van An"),
                                         new Coffeshop("Kha Coffee","02 Nguyễn Huệ")};
        
        manager1 = new Manager[] {new Manager(a, 20000, "Nguyen Van B", 0, df.parse("20-11-1994")),
                                            new Manager(new Coffeshop[] {new Coffeshop("Hai Lua","03 Chu Van An")},
                                                        20000, "Nguyen Van C", 0, df.parse("20-10-1996"))};
        
        for (int i = 0; i < manager1.length; i++) {
            cbManager.addItem(manager1[i].getName());       
        }
        
        DefaultTableModel model = (DefaultTableModel) tbCoffee.getModel();
        model.setRowCount(0);
        
        Coffeshop[] ashop = manager1[0].getCoffeshop();
        for (int i = 0; i < ashop.length; i++) {
            model.insertRow(model.getRowCount(),
                            new Object[] {model.getRowCount() + 1,
                                          ashop[i].getName(),
                                          ashop[i].getAddress()});
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbManager = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCoffee = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CoffeeShopForm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tên quản lý:");

        cbManager.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbManagerItemStateChanged(evt);
            }
        });

        tbCoffee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên quán", "Đia chỉ"
            }
        ));
        jScrollPane1.setViewportView(tbCoffee);
        if (tbCoffee.getColumnModel().getColumnCount() > 0) {
            tbCoffee.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbManager, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbManagerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbManagerItemStateChanged
        DefaultTableModel model = (DefaultTableModel) tbCoffee.getModel();
        model.setRowCount(0);
        int index = cbManager.getSelectedIndex();
        Coffeshop[] ashop = manager1[index].getCoffeshop();
        for (int i = 0; i < ashop.length; i++) {
            model.insertRow(model.getRowCount(),
                            new Object[] {model.getRowCount() + 1,
                                          ashop[i].getName(),
                                          ashop[i].getAddress()});
            
        }
    }//GEN-LAST:event_cbManagerItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCoffee;
    // End of variables declaration//GEN-END:variables
}

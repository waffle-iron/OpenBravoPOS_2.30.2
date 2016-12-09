/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.basic.BasicException;
import com.openbravo.data.user.DirtyManager;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.AppView;
import java.awt.Component;
import java.util.UUID;

/**
 * @author <a href="dixon.22martinez@gmail.com" >Dixon Martinez</a>
 * @see 
 *      <a href="https://github.com/dixon22ma/OpenBravoPOS_2.30.2/issues/13"> FR [13] Add support for multi-currency transactions</a>      
 */
public final class CurrencyView extends javax.swing.JPanel implements EditorRecord{
    
    /** ID Currency         */
    private Object m_Currency_ID;
    
    /**
     * Creates new form CurrencyView
     */
    public CurrencyView() {
        initComponents();
    }

    /**
     * Creates new form CurrencyView
     * @param app
     * @param dirty 
     */
    public CurrencyView(AppView app, DirtyManager dirty) {
        this();
        
        jTxtISO_Code.getDocument().addDocumentListener(dirty);
        jTADescription.getDocument().addDocumentListener(dirty);
        jTxtCostingPrecision.getDocument().addDocumentListener(dirty);
        jTxtStdPrecision.getDocument().addDocumentListener(dirty);
        jChBIsActive.addActionListener(dirty);
        jTxtCurSymbol.getDocument().addDocumentListener(dirty);
        
        writeValueEOF();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtISO_Code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtCurSymbol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jChBIsActive = new javax.swing.JCheckBox();
        jTxtStdPrecision = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtCostingPrecision = new javax.swing.JTextField();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
        jLabel1.setText(bundle.getString("Label.Currency.ISO_CODE")); // NOI18N

        jLabel2.setText(bundle.getString("Label.Currency.CurSymbol")); // NOI18N

        jLabel3.setText(bundle.getString("Label.Description")); // NOI18N

        jTADescription.setColumns(20);
        jTADescription.setRows(5);
        jScrollPane1.setViewportView(jTADescription);

        jLabel4.setText(bundle.getString("Label.Currency.StdPrecision")); // NOI18N

        jChBIsActive.setText(bundle.getString("Label.IsActive")); // NOI18N

        jTxtStdPrecision.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setText(bundle.getString("Label.Currency.CostingPrecision")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtCurSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtISO_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jChBIsActive))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTxtStdPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTxtCostingPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtISO_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBIsActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCurSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTxtCostingPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStdPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void writeValueEOF() {
        initDefaultComponents(null);
        enableComponents(false);
    }
    
    @Override
    public void writeValueInsert() {
        initDefaultComponents(null);
        enableComponents(true);
    }
    
    @Override
    public void writeValueEdit(Object value) {
        Object[] currency = (Object[]) value;
        m_Currency_ID = currency[0];
        jTxtCostingPrecision.setText(currency[1].toString());
        jTxtCurSymbol.setText((String)currency[2]);
        jTADescription.setText((String)currency[3]);
        jChBIsActive.setSelected(currency[4].equals("Y"));
        jTxtISO_Code.setText((String)currency[5]);
        jTxtStdPrecision.setText(currency[6].toString());
        
        enableComponents(true);
    }
    
    @Override
    public void writeValueDelete(Object value) {
        Object[] currency = (Object[]) value;
        m_Currency_ID = currency[0];
        jTxtCostingPrecision.setText(currency[1].toString());
        jTxtCurSymbol.setText((String)currency[2]);
        jTADescription.setText((String)currency[3]);
        jChBIsActive.setSelected(currency[4].equals("Y"));
        jTxtISO_Code.setText((String)currency[5]);
        jTxtStdPrecision.setText(currency[6].toString());
        
        enableComponents(false);
    }

    @Override
    public void refresh() {
        
    }

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public Object createValue() throws BasicException {
        Object[] currency = new Object[7];
        currency[0] = m_Currency_ID == null ? UUID.randomUUID().toString() : m_Currency_ID; 
        currency[1] = Formats.INT.parseValue(jTxtCostingPrecision.getText());
        currency[2] = jTxtCurSymbol.getText();
        currency[3] = jTADescription.getText();
        currency[4] = jChBIsActive.isSelected() ? "Y" : "N";
        currency[5] = jTxtISO_Code.getText();
        currency[6] = Formats.INT.parseValue(jTxtStdPrecision.getText());
        
       
        return currency;
    }

    public void activate() {
        
    }
    
    private void initDefaultComponents(String value) {
        m_Currency_ID = value;
        jTxtISO_Code.setText(value);
        jTADescription.setText(value);
        jTxtCostingPrecision.setText(value);
        jTxtStdPrecision.setText(value);
        jChBIsActive.setSelected(true);
        jTxtCurSymbol.setText(value);
    }
    
    private void enableComponents(boolean value) {
        jTxtISO_Code.setEnabled(value);
        jTADescription.setEnabled(value);
        jTxtCostingPrecision.setEnabled(value);
        jTxtStdPrecision.setEnabled(value);
        jChBIsActive.setEnabled(value);
        jTxtCurSymbol.setEnabled(value);
    }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jChBIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescription;
    private javax.swing.JTextField jTxtCostingPrecision;
    private javax.swing.JTextField jTxtCurSymbol;
    private javax.swing.JTextField jTxtISO_Code;
    private javax.swing.JTextField jTxtStdPrecision;
    // End of variables declaration//GEN-END:variables
}

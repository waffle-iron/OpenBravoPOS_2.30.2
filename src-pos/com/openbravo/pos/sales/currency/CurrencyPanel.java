/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ListCellRendererBasic;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.ListProvider;
import com.openbravo.data.user.ListProviderCreator;
import com.openbravo.data.user.SaveProvider;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.panels.JPanelTable;
import javax.swing.ListCellRenderer;

/**
 * @author <a href="dixon.22martinez@gmail.com" >Dixon Martinez</a>
 * @see 
 *      <a href="https://github.com/dixon22ma/OpenBravoPOS_2.30.2/issues/13"> FR [13] Add support for multi-currency transactions</a>      
 */
public class CurrencyPanel extends JPanelTable{

    private TableDefinition t_Currency;
    private CurrencyView jEditor;

    /**
     * Create new Instance of CurrencyPanel
     */
    public CurrencyPanel() {
    
    }

    @Override
    public void activate() throws BasicException {
        jEditor.activate();
        super.activate(); 
    }
    
    @Override
    protected void init() {
        DataLogicCurrency dlCurrency = (DataLogicCurrency) app.getBean(DataLogicCurrency.class.getName());
        t_Currency = dlCurrency.getTableCurrency();
        jEditor = new CurrencyView(app, dirty);
    }

    @Override
    public EditorRecord getEditor() {
        return jEditor;
    }

    @Override
    public ListProvider getListProvider() {
        return new ListProviderCreator(t_Currency);
    }

    @Override
    public SaveProvider getSaveProvider() {
        return new SaveProvider(t_Currency, new int[] {0,1,2,3,4,5,6});
    }

    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.CurrencyManagment");
    }
   
    @Override
    public ListCellRenderer getListCellRenderer() {
        return new ListCellRendererBasic(t_Currency.getRenderStringBasic(new int[]{5,2}));
    }
    
    
}

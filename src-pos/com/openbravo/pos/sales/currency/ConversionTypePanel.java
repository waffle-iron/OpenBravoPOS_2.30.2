/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

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
 *      <a href="https://github.com/dixon22ma/OpenBravoPOS_2.30.2/issues/16"> FR [16] Add window Conversion Type</a>      
 */
public class ConversionTypePanel extends JPanelTable{
    
    /** Editor Conversion Type  */
    private ConversionTypeView jEditor;
    /** Table Conversion Type   */
    private TableDefinition t_ConversionType;
    
    @Override
    protected void init() {
        DataLogicConversionType dlConvType = (DataLogicConversionType) app.getBean(DataLogicConversionType.class.getName());
        t_ConversionType = dlConvType.getTableConversionType();
        jEditor = new ConversionTypeView(app, dirty);
        
    }

    @Override
    public EditorRecord getEditor() {
        return jEditor;
    }

    @Override
    public ListProvider getListProvider() {
        return new ListProviderCreator(t_ConversionType);
    }

    @Override
    public SaveProvider getSaveProvider() {
        return new SaveProvider(t_ConversionType, new int[] {0,1,2,3,4,5});
    }

    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.Currency.ConversionType");
    }
    
     @Override
    public ListCellRenderer getListCellRenderer() {
        return new ListCellRendererBasic(t_ConversionType.getRenderStringBasic(new int[]{1,2}));
    }
    
}

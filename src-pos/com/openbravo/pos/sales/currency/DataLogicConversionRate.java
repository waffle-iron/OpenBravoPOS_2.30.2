/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.pos.forms.BeanFactoryDataSingle;

/**
 *
 * @author tt-01
 */
public class DataLogicConversionRate extends BeanFactoryDataSingle{

    private TableDefinition t_ConversionRate;
    
    @Override
    public void init(Session s) {
        
    }
    
    public TableDefinition getTableConversionRate() {
        return t_ConversionRate;
    }
    
}

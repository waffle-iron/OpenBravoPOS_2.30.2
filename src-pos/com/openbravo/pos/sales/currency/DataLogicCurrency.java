/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.BeanFactoryDataSingle;

/**
 * @author <a href="dixon.22martinez@gmail.com" >Dixon Martinez</a>
 * @see 
 *      <a href="https://github.com/dixon22ma/OpenBravoPOS_2.30.2/issues/13"> FR [13] Add support for multi-currency transactions</a>      
 */
public class DataLogicCurrency extends BeanFactoryDataSingle {

    /** Session                 */
    protected Session m_Session;
    /** Table Currency          */
    private TableDefinition t_Currency;
    /** Currency Data           */
    private static final Datas[] CURRENCY_DATAS = 
            new Datas[] {
                Datas.STRING,
                Datas.INT,
                Datas.STRING,
                Datas.STRING,
                Datas.STRING,
                Datas.STRING,
                Datas.INT               
            
            };
    
    /** Currency Field Name     */
    private static final String [] CURRENCY_FIELD_NAMES = 
            new String[] {
                "CURRENCY_ID",
                "COSTINGPRECISION",
                "CURSYMBOL",
                "DESCRIPTION",
                "ISACTIVE",
                "ISO_CODE",
                "STDPRECISION"
            };
    
    /** Currency Field Formats  */
    private static final Formats[] CURRENCY_FIELD_FORMATS =
            new Formats[] {
                Formats.STRING,
                Formats.INT,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.INT    
            };
    
    @Override
    public void init(Session s) {
        this.m_Session = s;
        t_Currency = new TableDefinition(s, "CURRENCY", CURRENCY_FIELD_NAMES, CURRENCY_DATAS, CURRENCY_FIELD_FORMATS, new int[] {0});        
    }
    
    public TableDefinition getTableCurrency() {
        return t_Currency;
    }
    
}

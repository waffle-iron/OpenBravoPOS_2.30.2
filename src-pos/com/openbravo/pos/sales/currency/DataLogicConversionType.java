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
 *      <a href="https://github.com/dixon22ma/OpenBravoPOS_2.30.2/issues/16"> FR [16] Add window Conversion Type</a>      
 */
public class DataLogicConversionType extends BeanFactoryDataSingle{
    
    /** Table Conversion Type   */
    private TableDefinition t_ConversionType;
    
    /** Session                 */
    protected Session m_Session;
    
    public final static String TABLE_NAME = "CONVERSIONTYPE";
    
    /** Data           */
    private static final Datas[] DATAS = 
            new Datas[] {
                Datas.STRING,
                Datas.STRING,
                Datas.STRING,
                Datas.STRING,
                Datas.STRING,
                Datas.STRING              
            
            };
    
    /** Field Name     */
    private static final String [] FIELD_NAMES = 
            new String[] {
                "CONVERSIONTYPE_ID",
                "VALUE",
                "NAME",
                "DESCRIPTION",
                "ISACTIVE",
                "ISDEFAULT"
            };
    
    /** Field Formats  */
    private static final Formats[] FIELD_FORMATS =
            new Formats[] {
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING 
            };
    
    /**
     * Get Table Conversion Type
     * @return 
     */
    public TableDefinition getTableConversionType() {
        return t_ConversionType;
    }

    @Override
    public void init(Session s) {
        this.m_Session = s;
        
        t_ConversionType = new TableDefinition(s, TABLE_NAME, FIELD_NAMES, DATAS, FIELD_FORMATS, new int[] {1});
    }
    
}

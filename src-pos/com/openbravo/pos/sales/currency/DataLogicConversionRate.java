/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.loader.Session;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.format.Formats;
import com.openbravo.pos.forms.BeanFactoryDataSingle;

/**
 *
 * @author tt-01
 */
public class DataLogicConversionRate extends BeanFactoryDataSingle{

    /** Session                 */
    protected Session m_Session;
    /** Table Currency          */
    private TableDefinition t_ConversionRate;
    /** Table Name              */
    public final static String TABLE_NAME = "CONVERSIONRATE";
    /** ConversionRate Data           */
    private static final Datas[] FIELD_DATAS = 
            new Datas[] {
                Datas.STRING,
                Datas.OBJECT,
                Datas.OBJECT,
                Datas.OBJECT,
                Datas.DOUBLE,
                Datas.STRING,
                Datas.DOUBLE,
                Datas.TIMESTAMP,
                Datas.TIMESTAMP
            
            };  
    
    /** ConversionRate Field Name     */
    private static final String [] FIELD_NAMES = 
            new String[] {
                "CONVERSIONRATE_ID",
                "CONVERSIONTYPE_ID",
                "CURRENCY_ID",
                "CURRENCYTO_ID",
                "DIVIDERATE",
                "ISACTIVE",
                "MULTIPLYRATE",
                "VALIDFROM",
                "VALIDTO"
            };
    
    /** ConversionRate Field Formats  */
    private static final Formats[] FIELD_FORMATS =
            new Formats[] {
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.STRING,
                Formats.DOUBLE,
                Formats.STRING,
                Formats.DOUBLE,
                Formats.TIMESTAMP,
                Formats.TIMESTAMP
            };
    
    @Override
    public void init(Session s) {
        this.m_Session = s;
        
        t_ConversionRate = new TableDefinition(s, TABLE_NAME, FIELD_NAMES, FIELD_DATAS, FIELD_FORMATS, new int[] {1});
                
    }
    /**
     * Get TableDefinition
     * @return 
     */
    public TableDefinition getTableConversionRate() {
        return t_ConversionRate;
    }
    
    public SentenceList getCurrencyList() {
        String sql = "SELECT CURRENCY_ID, COSTINGPRECISION, CURSYMBOL, DESCRIPTION, ISACTIVE, ISO_CODE, STDPRECISION FROM CURRENCY";
        
        return new StaticSentence(
                m_Session, 
                sql,
                null,
                (DataRead dr) -> new CurrencyInfo(
                        dr.getString(1),
                        dr.getInt(2),
                        dr.getString(3),
                        dr.getString(4),
                        dr.getString(5),
                        dr.getString(6),
                        dr.getInt(7)                        
                )
        );
    }
    
    public SentenceList getConversionType() {
        String sql = "SELECT ConversionType_ID, Value, Name, Description, IsActive, isDefault FROM ConversionType";
        
        return new StaticSentence(
                m_Session, 
                sql, 
                null,
                (DataRead dr) -> new ConversionTypeInfo(
                        dr.getString(1), 
                        dr.getString(2), 
                        dr.getString(3), 
                        dr.getString(4), 
                        dr.getString(5),
                        dr.getString(6)
                )
        );
    }
    
    /*
    
    public SentenceList getConversionRate() {
        String sql = "SELECT ConversionRate_ID, CONVERSIONTYPE_ID, CURRENCY_ID, CURRENCYTO_ID, DIVIDERATE, ISACTIVE, MULTIPYRATE, VALIDFROM, VALIDTO FROM ConversionRate";
        
        return new StaticSentence(
                m_Session, 
                sql, 
                null,
                (DataRead dr) -> new ConversionRateInfo(
                        dr.getString(1), 
                        dr.getString(2), 
                        dr.getString(3), 
                        dr.getString(4), 
                        dr.getDouble(5), 
                        dr.getString(6), 
                        dr.getDouble(7), 
                        dr.getTimestamp(8), 
                        dr.getTimestamp(9)
                )
        );
    }*/
}

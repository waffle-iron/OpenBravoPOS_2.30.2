/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import com.openbravo.data.loader.IKeyed;
import java.io.Serializable;

/**
 *
 * @author dixon
 */
public class CurrencyInfo implements Serializable, IKeyed{

    private String m_Currency_ID;
    private int m_CositngPrecision;
    private String m_CurSymbol;
    private String m_Description;
    private String m_IsActive;
    private String m_IsoCode;
    private int m_StdPrecision;

    CurrencyInfo(
            String m_Currency_ID, Integer m_CositngPrecision, String m_CurSymbol, 
            String m_Description, String m_IsActive, String m_IsoCode, Integer m_StdPrecision) {
        this.m_Currency_ID = m_Currency_ID;
        this.m_CositngPrecision = m_CositngPrecision;
        this.m_CurSymbol = m_CurSymbol;
        this.m_Description = m_Description;
        this.m_IsActive = m_IsActive;
        this.m_IsoCode = m_IsoCode;
        this.m_StdPrecision = m_StdPrecision;
    }   
    
    @Override
    public Object getKey() {
        return getM_Currency_ID();
    }

    /**
     * @return the m_Currency_ID
     */
    public String getM_Currency_ID() {
        return m_Currency_ID;
    }

    /**
     * @param m_Currency_ID the m_Currency_ID to set
     */
    public void setM_Currency_ID(String m_Currency_ID) {
        this.m_Currency_ID = m_Currency_ID;
    }

    /**
     * @return the m_CositngPrecision
     */
    public int getM_CositngPrecision() {
        return m_CositngPrecision;
    }

    /**
     * @param m_CositngPrecision the m_CositngPrecision to set
     */
    public void setM_CositngPrecision(int m_CositngPrecision) {
        this.m_CositngPrecision = m_CositngPrecision;
    }

    /**
     * @return the m_CurSymbol
     */
    public String getM_CurSymbol() {
        return m_CurSymbol;
    }

    /**
     * @param m_CurSymbol the m_CurSymbol to set
     */
    public void setM_CurSymbol(String m_CurSymbol) {
        this.m_CurSymbol = m_CurSymbol;
    }

    /**
     * @return the m_Description
     */
    public String getM_Description() {
        return m_Description;
    }

    /**
     * @param m_Description the m_Description to set
     */
    public void setM_Description(String m_Description) {
        this.m_Description = m_Description;
    }

    /**
     * @return the m_IsActive
     */
    public String getM_IsActive() {
        return m_IsActive;
    }

    /**
     * @param m_IsActive the m_IsActive to set
     */
    public void setM_IsActive(String m_IsActive) {
        this.m_IsActive = m_IsActive;
    }

    /**
     * @return the m_IsoCode
     */
    public String getM_IsoCode() {
        return m_IsoCode;
    }

    /**
     * @param m_IsoCode the m_IsoCode to set
     */
    public void setM_IsoCode(String m_IsoCode) {
        this.m_IsoCode = m_IsoCode;
    }

    /**
     * @return the m_StdPrecision
     */
    public int getM_StdPrecision() {
        return m_StdPrecision;
    }

    /**
     * @param m_StdPrecision the m_StdPrecision to set
     */
    public void setM_StdPrecision(int m_StdPrecision) {
        this.m_StdPrecision = m_StdPrecision;
    }

    @Override
    public String toString() {
        return m_IsoCode;
    }
    
    
    
}

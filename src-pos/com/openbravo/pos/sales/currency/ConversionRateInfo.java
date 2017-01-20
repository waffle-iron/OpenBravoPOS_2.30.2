/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

import java.util.Date;

/**
 *
 * @author tt-01
 */
public class ConversionRateInfo {

	private String ConversionRate_ID;
	private ConversionTypeInfo m_ConversionType;
	private CurrencyInfo m_Currency;
	private CurrencyInfo m_CurrencyTo;
	private double m_DivideRate;
	private String m_IsActive;
	private double m_MultipyRate;
	private Date m_ValidFrom;
	private Date m_ValidTo;
	
	/**
	 * Create Instance Conversion Rate Info
	 * @param conversionRate_ID
	 * @param m_ConversionType
	 * @param m_Currency
	 * @param m_CurrencyTo
	 * @param m_DivideRate
	 * @param m_IsActive
	 * @param m_MultipyRate
	 * @param m_ValidFrom
	 * @param m_ValidTo
	 */
	public ConversionRateInfo(String conversionRate_ID,
			ConversionTypeInfo m_ConversionType, CurrencyInfo m_Currency,
			CurrencyInfo m_CurrencyTo, double m_DivideRate, String m_IsActive,
			double m_MultipyRate, Date m_ValidFrom, Date m_ValidTo) {
		super();
		ConversionRate_ID = conversionRate_ID;
		this.m_ConversionType = m_ConversionType;
		this.m_Currency = m_Currency;
		this.m_CurrencyTo = m_CurrencyTo;
		this.m_DivideRate = m_DivideRate;
		this.m_IsActive = m_IsActive;
		this.m_MultipyRate = m_MultipyRate;
		this.m_ValidFrom = m_ValidFrom;
		this.m_ValidTo = m_ValidTo;
	}

	/**
	 * @return the conversionRate_ID
	 */
	public String getConversionRate_ID() {
		return ConversionRate_ID;
	}

	/**
	 * @param conversionRate_ID the conversionRate_ID to set
	 */
	public void setConversionRate_ID(String conversionRate_ID) {
		ConversionRate_ID = conversionRate_ID;
	}

	/**
	 * @return the m_ConversionType
	 */
	public ConversionTypeInfo getM_ConversionType() {
		return m_ConversionType;
	}

	/**
	 * @param m_ConversionType the m_ConversionType to set
	 */
	public void setM_ConversionType(ConversionTypeInfo m_ConversionType) {
		this.m_ConversionType = m_ConversionType;
	}

	/**
	 * @return the m_Currency
	 */
	public CurrencyInfo getM_Currency() {
		return m_Currency;
	}

	/**
	 * @param m_Currency the m_Currency to set
	 */
	public void setM_Currency(CurrencyInfo m_Currency) {
		this.m_Currency = m_Currency;
	}

	/**
	 * @return the m_CurrencyTo
	 */
	public CurrencyInfo getM_CurrencyTo() {
		return m_CurrencyTo;
	}

	/**
	 * @param m_CurrencyTo the m_CurrencyTo to set
	 */
	public void setM_CurrencyTo(CurrencyInfo m_CurrencyTo) {
		this.m_CurrencyTo = m_CurrencyTo;
	}

	/**
	 * @return the m_DivideRate
	 */
	public double getM_DivideRate() {
		return m_DivideRate;
	}

	/**
	 * @param m_DivideRate the m_DivideRate to set
	 */
	public void setM_DivideRate(double m_DivideRate) {
		this.m_DivideRate = m_DivideRate;
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
	 * @return the m_MultipyRate
	 */
	public double getM_MultipyRate() {
		return m_MultipyRate;
	}

	/**
	 * @param m_MultipyRate the m_MultipyRate to set
	 */
	public void setM_MultipyRate(double m_MultipyRate) {
		this.m_MultipyRate = m_MultipyRate;
	}

	/**
	 * @return the m_ValidFrom
	 */
	public Date getM_ValidFrom() {
		return m_ValidFrom;
	}

	/**
	 * @param m_ValidFrom the m_ValidFrom to set
	 */
	public void setM_ValidFrom(Date m_ValidFrom) {
		this.m_ValidFrom = m_ValidFrom;
	}

	/**
	 * @return the m_ValidTo
	 */
	public Date getM_ValidTo() {
		return m_ValidTo;
	}

	/**
	 * @param m_ValidTo the m_ValidTo to set
	 */
	public void setM_ValidTo(Date m_ValidTo) {
		this.m_ValidTo = m_ValidTo;
	}
	
	

	
	

}

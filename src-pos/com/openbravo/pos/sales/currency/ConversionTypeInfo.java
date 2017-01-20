/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.sales.currency;

/**
 *
 * @author tt-01
 */
public class ConversionTypeInfo {
    private String ConversionType_ID;
    private String Value;
    private String Name; 
    private String Description; 
    private String IsActive; 
    private String isDefault;

    public ConversionTypeInfo(String ConversionType_ID, String Value, String Name, String Description, String IsActive, String isDefault) {
        this.ConversionType_ID = ConversionType_ID;
        this.Value = Value;
        this.Name = Name;
        this.Description = Description;
        this.IsActive = IsActive;
        this.isDefault = isDefault;
    }

    public String getConversionType_ID() {
        return ConversionType_ID;
    }

    public void setConversionType_ID(String ConversionType_ID) {
        this.ConversionType_ID = ConversionType_ID;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    
    
}

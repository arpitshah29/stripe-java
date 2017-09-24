package com.stripe.model;

import java.util.Map;

public interface HasTypeData {
    public Map<String, String> getTypeData();
    public void setTypeData(Map<String, String> typeData);
}

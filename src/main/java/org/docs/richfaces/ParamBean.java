package org.docs.richfaces;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ParamBean implements Serializable {

    private Integer screenWidth;
    
    private Integer screenHeight;
    
    public Integer getScreenWidth() {
        return this.screenWidth;
    }
    
    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }
    
    public Integer getScreenHeight() {
        return this.screenHeight;
    }
    
    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }
}
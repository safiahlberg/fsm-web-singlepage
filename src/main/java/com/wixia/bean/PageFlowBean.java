package com.wixia.bean;

import com.wixia.state.WebState;
import com.wixia.toolbox.fsm.FSMBuilder;
import com.wixia.toolbox.fsm.FSMControl;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;

/**
 *
 * @author safi
 */
@ManagedBean(name="pageFlow")
@SessionScoped
public class PageFlowBean implements Serializable {

  private static final Logger LOGGER = Logger.getLogger(PageFlowBean.class.getName());
  private final WebState state = FSMBuilder.buildFSM(WebState.class);
  private final FSMControl control = (FSMControl) state;
  
  public WebState getState() {
    return state;
  }

  public void shiftOne(ActionEvent event) {
      state.shiftOne();
  }
  
  public void shiftZero(ActionEvent event) {
      state.shiftZero();
  }
  
  public String getDate() {
      SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
      return date.format(new Date());
  }
  
  public void preRenderView(ComponentSystemEvent event) {
    LOGGER.info("PageFlowBean.preRenderView");    
  }
  
  private void navigate() {
    ConfigurableNavigationHandler navigationHandler = (ConfigurableNavigationHandler) FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
    navigationHandler.performNavigation(state.getClass().getName());
  }
}

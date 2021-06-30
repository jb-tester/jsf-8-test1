package com.mytests.jakarta.jsf.test1;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.New;
import javax.inject.Inject;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
@Model
public class ABean {
   String p1 ="abean";

   
   @Inject DBean dBean;
   @Inject @MyQualifier3 String qq;
   
   
   public String getP1() {
      return p1+"_"+dBean.getId()+"_"+qq;
   }

   public void setP1(String p1) {
      this.p1 = p1;
   }

   
}

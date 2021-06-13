package com.sun.jna;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.c;
import com.sun.jna.m;
import com.sun.jna.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.xn;

public class cy implements q {
   private List r = new ArrayList();
   private List g = new ArrayList();

   private Class F(Class var1) {
      return var1 == Boolean.class?Boolean.TYPE:(var1 == Boolean.TYPE?Boolean.class:(var1 == Byte.class?Byte.TYPE:(var1 == Byte.TYPE?Byte.class:(var1 == Character.class?Character.TYPE:(var1 == Character.TYPE?Character.class:(var1 == Short.class?Short.TYPE:(var1 == Short.TYPE?Short.class:(var1 == Integer.class?Integer.TYPE:(var1 == Integer.TYPE?Integer.class:(var1 == Long.class?Long.TYPE:(var1 == Long.TYPE?Long.class:(var1 == Float.class?Float.TYPE:(var1 == Float.TYPE?Float.class:(var1 == Double.class?Double.TYPE:(var1 == Double.TYPE?Double.class:null)))))))))))))));
   }

   public void t(Class var1, ToNativeConverter var2) {
      this.r.add(new cy.f(var1, var2));
      Class var3 = this.F(var1);
      this.r.add(new cy.f(var3, var2));
   }

   public void s(Class var1, FromNativeConverter var2) {
      this.g.add(new cy.f(var1, var2));
      Class var3 = this.F(var1);
      this.g.add(new cy.f(var3, var2));
   }

   public void A(Class var1, m var2) {
      this.s(var1, var2);
      this.t(var1, var2);
   }

   private Object u(Class var1, Collection var2) {
      c.F();
      Iterator var4 = var2.iterator();
      if(var4.hasNext()) {
         cy.f var5 = (cy.f)var4.next();
         if(var5.i.isAssignableFrom(var1)) {
            return var5.r;
         }
      }

      return null;
   }

   public FromNativeConverter L(Class var1) {
      return (FromNativeConverter)this.u(var1, this.g);
   }

   public ToNativeConverter U(Class var1) {
      return (ToNativeConverter)this.u(var1, this.r);
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static class f {
      public Class i;
      public Object r;

      public f(Class var1, Object var2) {
         this.i = var1;
         this.r = var2;
      }
   }
}

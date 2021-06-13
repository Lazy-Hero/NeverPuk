package com.sun.jna;

import com.sun.jna.Pointer;
import com.sun.jna.c;
import com.sun.jna.q;
import com.sun.jna.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class g extends s {
   private s.g a;

   protected g() {
   }

   protected g(Pointer var1) {
      super(var1);
   }

   protected g(Pointer var1, int var2) {
      super(var1, var2);
   }

   protected g(q var1) {
      super(var1);
   }

   protected g(Pointer var1, int var2, q var3) {
      super(var1, var2, var3);
   }

   protected List R() {
      List var1 = this.u();
      ArrayList var2 = new ArrayList(var1.size());

      for(Field var4 : var1) {
         var2.add(var4.getName());
      }

      return var2;
   }

   public void R(Class var1) {
      this.l();
      c.F();
      Iterator var3 = this.H().values().iterator();
      if(var3.hasNext()) {
         s.g var4 = (s.g)var3.next();
         if(var4.v == var1) {
            this.a = var4;
            return;
         }
      }

      throw new IllegalArgumentException("No field of type " + var1 + " in " + this);
   }

   public void B(String var1) {
      this.l();
      s.g var2 = (s.g)this.H().get(var1);
      this.a = var2;
   }

   public Object G(String var1) {
      this.l();
      this.B(var1);
      return super.G(var1);
   }

   public void s(String var1) {
      this.l();
      this.B(var1);
      super.s(var1);
   }

   public void S(String var1, Object var2) {
      this.l();
      this.B(var1);
      super.S(var1, var2);
   }

   public Object S(Class var1) {
      this.l();
      c.F();
      Iterator var3 = this.H().values().iterator();
      if(var3.hasNext()) {
         s.g var4 = (s.g)var3.next();
         if(var4.v == var1) {
            this.a = var4;
            this.b();
            return this.K(this.a.z);
         }
      }

      throw new IllegalArgumentException("No field of type " + var1 + " in " + this);
   }

   public Object M(Object var1) {
      s.g var2 = this.r(var1.getClass());
      this.a = var2;
      this.D(var2.z, var1);
      return this;
   }

   private s.g r(Class var1) {
      this.l();

      for(s.g var3 : this.H().values()) {
         if(var3.v.isAssignableFrom(var1)) {
            return var3;
         }
      }

      return null;
   }

   protected void l(s.g var1) {
      if(var1 == this.a) {
         super.l(var1);
      }

   }

   protected Object m(s.g var1) {
      return var1 != this.a && (s.class.isAssignableFrom(var1.v) || String.class.isAssignableFrom(var1.v) || c.class.isAssignableFrom(var1.v))?null:super.m(var1);
   }

   protected int E(Class var1, Object var2, boolean var3) {
      return super.E(var1, var2, true);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}

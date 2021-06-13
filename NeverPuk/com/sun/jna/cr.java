package com.sun.jna;

import com.sun.jna.Pointer;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.r;

public abstract class cr implements b {
   private Pointer Z;

   protected cr() {
      this.Z = Pointer.o;
   }

   protected cr(Pointer var1) {
      this.Z = var1;
   }

   public Class Q() {
      return Pointer.class;
   }

   public Object E() {
      return this.o();
   }

   public Pointer o() {
      return this.Z;
   }

   public void R(Pointer var1) {
      this.Z = var1;
   }

   public Object c(Object var1, r var2) {
      net.u.d[] var3 = c.F();
      if(var1 == null) {
         return null;
      } else {
         cr var4 = (cr)this.getClass().newInstance();
         var4.Z = (Pointer)var1;
         return var4;
      }
   }

   public int hashCode() {
      return this.Z != null?this.Z.hashCode():0;
   }

   public boolean equals(Object var1) {
      net.u.d[] var2 = c.F();
      if(var1 == this) {
         return true;
      } else if(var1 instanceof cr) {
         Pointer var3 = ((cr)var1).o();
         return this.Z == null?true:this.Z.equals(var3);
      } else {
         return false;
      }
   }

   public String toString() {
      return this.Z == null?"NULL":this.Z.toString() + " (" + super.toString() + ")";
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}

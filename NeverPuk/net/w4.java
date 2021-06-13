package net;

import java.lang.reflect.Constructor;
import net.i6;
import net.m3;
import net.mf;

public class w4 {
   private m3 A = null;
   private Class[] k = null;
   private boolean G = false;
   private Constructor K = null;

   public w4(m3 var1, Class[] var2) {
      this.A = var1;
      this.k = var2;
      this.p();
   }

   public Constructor p() {
      if(this.G) {
         return this.K;
      } else {
         this.G = true;
         Class var1 = this.A.J();
         return null;
      }
   }

   private static Constructor i(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if(i6.f(var1, var5)) {
            return var4;
         }
      }

      return null;
   }

   public boolean Z() {
      String var1 = mf.O();
      return this.G?this.K != null:this.p() != null;
   }

   public void d() {
      this.G = true;
      this.K = null;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}

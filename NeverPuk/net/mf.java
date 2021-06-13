package net;

import java.lang.reflect.Field;
import net.i3;
import net.i6;
import net.m3;
import net.m7;
import net.m9;
import net.xn;
import net.xp;

public class mf {
   private i3 x;
   private boolean s;
   private Field U;
   private static String O;

   public mf(m3 var1, String var2) {
      this((i3)(new xp(var1, var2)));
   }

   public mf(m3 var1, String var2, boolean var3) {
      this(new xp(var1, var2), var3);
   }

   public mf(m3 var1, Class var2) {
      this(var1, var2, 0);
   }

   public mf(m3 var1, Class var2, int var3) {
      this((i3)(new m9(var1, var2, var3)));
   }

   public mf(Field var1) {
      this((i3)(new m7(var1)));
   }

   public mf(i3 var1) {
      this(var1, false);
   }

   public mf(i3 var1, boolean var2) {
      this.x = null;
      this.s = false;
      this.U = null;
      this.x = var1;
      this.H();
   }

   public Field H() {
      if(this.s) {
         return this.U;
      } else {
         this.s = true;
         this.U = this.x.q();
         if(this.U != null) {
            this.U.setAccessible(true);
         }

         return this.U;
      }
   }

   public Object z() {
      return i6.G((Object)null, (mf)this);
   }

   public void a(Object var1) {
      i6.t((Object)null, this, var1);
   }

   public void U(Object var1, Object var2) {
      i6.t(var1, this, var2);
   }

   public boolean I() {
      return this.H() != null;
   }

   public static void u(String var0) {
      O = var0;
   }

   public static String O() {
      return O;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(O() == null) {
         u("oTUxec");
      }

   }
}

package com.sun.jna;

import com.sun.jna.Function;
import com.sun.jna.Pointer;
import com.sun.jna.c;
import com.sun.jna.f;
import com.sun.jna.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.xn;

public class n extends f implements Function.o {
   private String C;
   private List X;
   private Object[] Y;

   public n(String[] var1) {
      this(var1, false);
   }

   public n(String[] var1, boolean var2) {
      this((Object[])var1, "--WIDE-STRING--");
   }

   public n(String[] var1, String var2) {
      this((Object[])var1, var2);
   }

   public n(c[] var1) {
      this((Object[])var1, "--WIDE-STRING--");
   }

   private n(Object[] var1, String var2) {
      c.F();
      super((long)((var1.length + 1) * Pointer.i));
      this.X = new ArrayList();
      this.Y = var1;
      this.C = var2;
      int var4 = 0;
      if(var4 < var1.length) {
         Pointer var5 = null;
         if(var1[var4] != null) {
            x var6 = new x(var1[var4].toString(), var2);
            this.X.add(var6);
            var5 = var6.k();
         }

         this.U((long)(Pointer.i * var4), var5);
         ++var4;
      }

      this.U((long)(Pointer.i * var1.length), (Pointer)null);
   }

   public void G() {
      boolean var2 = this.Y instanceof c[];
      c.F();
      boolean var3 = "--WIDE-STRING--".equals(this.C);
      int var4 = 0;
      if(var4 < this.Y.length) {
         Pointer var5 = this.f((long)(var4 * Pointer.i));
         String var6 = null;
         var6 = var5.Z(0L);
         c var9 = new c((String)var6);
         this.Y[var4] = var9;
         ++var4;
      }

   }

   public String toString() {
      boolean var1 = "--WIDE-STRING--".equals(this.C);
      String var2 = "const wchar_t*[]";
      var2 = var2 + Arrays.asList(this.Y);
      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

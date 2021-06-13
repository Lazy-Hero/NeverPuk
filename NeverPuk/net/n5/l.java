package net.n5;

import java.util.Set;
import net.xn;
import net.n5.m;
import net.u.d;
import net.yz.aq;

public class l {
   private static final int x = aq.values().length;
   private long j;

   public void l(Set var1) {
      for(aq var3 : var1) {
         for(aq var5 : var1) {
            this.j(var3, var5, true);
         }
      }

   }

   public void j(aq var1, aq var2, boolean var3) {
      this.b(var1.ordinal() + var2.ordinal() * x, var3);
      this.b(var2.ordinal() + var1.ordinal() * x, var3);
   }

   public void T(boolean var1) {
      this.j = -1L;
   }

   public boolean i(aq var1, aq var2) {
      return this.q(var1.ordinal() + var2.ordinal() * x);
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      m.t();
      var2.append(' ');
      aq[] var3 = aq.values();
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         aq var6 = var3[var5];
         var2.append(' ').append(var6.toString().toUpperCase().charAt(0));
         ++var5;
      }

      var2.append('\n');
      var3 = aq.values();
      var4 = var3.length;
      var5 = 0;
      if(var5 < var4) {
         aq var17 = var3[var5];
         var2.append(var17.toString().toUpperCase().charAt(0));
         aq[] var7 = aq.values();
         int var8 = var7.length;
         int var9 = 0;
         if(var9 < var8) {
            aq var10 = var7[var9];
            if(var17 == var10) {
               var2.append("  ");
            }

            boolean var11 = this.i(var17, var10);
            var2.append(' ').append((char)(var11?'Y':'n'));
            ++var9;
         }

         var2.append('\n');
         ++var5;
      }

      String var10000 = var2.toString();
      if(d.y() == null) {
         m.w(new int[3]);
      }

      return var10000;
   }

   private boolean q(int var1) {
      return (this.j & (long)(1 << var1)) != 0L;
   }

   private void b(int var1, boolean var2) {
      this.f(var1);
   }

   private void f(int var1) {
      this.j |= (long)(1 << var1);
   }

   private void S(int var1) {
      this.j &= (long)(~(1 << var1));
   }

   private static xn a(xn var0) {
      return var0;
   }
}

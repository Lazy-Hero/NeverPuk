package net.nr;

import java.util.ArrayList;
import net.xn;
import net.n0.ks;
import net.nr.d;
import net.r.i;

public class f extends ArrayList {
   public static final int I = i.d();

   public f() {
      this.ensureCapacity(I);
      d.u();
      int var2 = 0;
      if(var2 < I) {
         this.add(ks.a);
         ++var2;
      }

   }

   public net.nj.h J() {
      d.u();
      net.nj.h var2 = new net.nj.h();
      int var3 = 0;
      if(var3 < I) {
         var2.m(((ks)this.get(var3)).Z(new net.nj.f()));
         ++var3;
      }

      return var2;
   }

   public void k(net.nj.h var1) {
      for(int var2 = 0; var2 < I; ++var2) {
         this.set(var2, new ks(var1.i(var2)));
      }

   }

   public boolean isEmpty() {
      for(int var1 = 0; var1 < I; ++var1) {
         if(!((ks)this.get(var1)).B()) {
            return false;
         }
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

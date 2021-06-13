package net.y;

import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Iterator;
import net.xn;
import net.y.d;
import net.y.p;

public abstract class s extends net.c2.n {
   protected boolean lY;

   public s(net.nl.v var1) {
      super(var1);
   }

   public void L() {
      super.L();
      this.N();
   }

   protected void N() {
      if(this.A.sf.o().isEmpty()) {
         this.Y = (q - this.s) / 2;
         this.lY = false;
      } else {
         this.Y = 160 + (q - this.s - 200) / 2;
         this.lY = true;
      }

   }

   public void v(int var1, int var2, float var3) {
      super.v(var1, var2, var3);
      if(this.lY) {
         this.Q();
      }

   }

   private void Q() {
      int var2 = this.Y - 124;
      int var3 = this.F;
      int var10000 = 166;
      p.S();
      Collection var5 = this.A.sf.o();
      if(!var5.isEmpty()) {
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.i();
         int var6 = 33;
         if(var5.size() > 5) {
            var6 = 132 / (var5.size() - 1);
         }

         Iterator var7 = Ordering.natural().sortedCopy(var5).iterator();
         if(var7.hasNext()) {
            net.n_.i var8 = (net.n_.i)var7.next();
            net.n_.f var9 = var8.i();
            d.T(1.0F, 1.0F, 1.0F, 1.0F);
            this.A.n().E(K);
            this.g(var2, var3, 0, 166, 140, 32);
            if(var9.x()) {
               int var10 = var9.b();
               this.g(var2 + 6, var3 + 7, 0 + var10 % 8 * 18, 198 + var10 / 8 * 18, 18, 18);
            }

            String var12 = net.c9.b.x(var9.s(), new Object[0]);
            if(var8.d() == 1) {
               var12 = var12 + " " + net.c9.b.x("enchantment.level.2", new Object[0]);
            }

            if(var8.d() == 2) {
               var12 = var12 + " " + net.c9.b.x("enchantment.level.3", new Object[0]);
            }

            if(var8.d() == 3) {
               var12 = var12 + " " + net.c9.b.x("enchantment.level.4", new Object[0]);
            }

            this.O.U(var12, (float)(var2 + 10 + 18), (float)(var3 + 6), 16777215);
            String var11 = net.n_.f.q(var8, 1.0F);
            this.O.U(var11, (float)(var2 + 10 + 18), (float)(var3 + 6 + 10), 8355711);
            var10000 = var3 + var6;
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}

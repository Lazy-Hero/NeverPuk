package net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import net._6;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.c1.y;
import net.c2.n;
import net.n0.ks;
import net.nb.u;
import net.ne.j;
import net.nl.c;
import net.r.i;
import net.y.s;

public class ml extends mk {
   private final mc Q;
   _6 G = new _6();

   public ml() {
      super("AutoArmor", or.Combat);
      gn.Q.J.d(this.Q = new mc("Equip Delay", this, 1.0D, 0.0D, 10.0D, 1.0D));
   }

   public static boolean L(ks var0) {
      return var0.B();
   }

   @mr
   public void p(zn var1) {
      j.D();
      this.t("" + this.Q.e());
      if(!(p.s5 instanceof n) || p.s5 instanceof s) {
         i var3 = p.sf.a8;
         int[] var4 = new int[4];
         int[] var5 = new int[4];
         int var6 = 0;
         var4[var6] = -1;
         ks var7 = var3.Q(var6);
         if(!L(var7) && var7.Z() instanceof net.n0.j) {
            net.n0.j var8 = (net.n0.j)var7.Z();
            var5[var6] = this.f(var8, var7);
         }

         ++var6;
         var6 = 0;
         var7 = var3.A(var6);
         if(!L(var7) && var7.Z() instanceof net.n0.j) {
            net.n0.j var17 = (net.n0.j)var7.Z();
            int var9 = var17.Q.l();
            int var10 = this.f(var17, var7);
            if(var10 > var5[var9]) {
               var4[var9] = var6;
               var5[var9] = var10;
            }
         }

         ++var6;
         ArrayList var14 = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)}));
         Collections.shuffle(var14);
         Iterator var16 = var14.iterator();
         if(var16.hasNext()) {
            int var18 = ((Integer)var16.next()).intValue();
            int var19 = var4[var18];
            if(var19 == -1) {
               ;
            }

            ks var20 = var3.Q(var18);
            if(!L(var20) && var3.o() == -1) {
               ;
            }

            if(var19 < 9) {
               var19 += 36;
            }

            if(this.G.Z((double)(this.Q.e() * 100.0F))) {
               if(!L(var20)) {
                  p.sE.K(0, 8 - var18, 0, c.QUICK_MOVE, p.sf);
               }

               p.sE.K(0, var19, 0, c.QUICK_MOVE, p.sf);
               this.G.B();
            }
         }

      }
   }

   private int f(net.n0.j var1, ks var2) {
      int var3 = var1.x;
      int var4 = 0;
      int var5 = (int)var1.G;
      int var6 = var1.R().l(net.nl.z2.LEGS);
      net.c1.c var7 = u.H;
      int var8 = y.g(var7, var2);
      net.yz.z var9 = net.yz.z.Q(p.sf);
      var4 = var7.U(var8, var9);
      return var3 * 5 + var4 * 3 + var5 + var6;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

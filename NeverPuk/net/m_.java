package net;

import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xh;
import net.xn;
import net.xs;
import net.zn;
import net.n0.ks;
import net.nb.j;
import net.ne.l;
import net.nl.c;

public class m_ extends mk {
   public mc o;
   public mc i;
   public mc G;
   public mc f;

   public m_() {
      super("AutoTotem", or.Combat);
      gn.Q.J.d(this.o = new mc("Health", this, 10.0D, 1.0D, 20.0D, 1.0D));
      gn.Q.J.d(this.i = new mc("Count Totem", this, true));
      gn.Q.J.d(this.G = new mc("Check Crystal", this, true));
      gn.Q.J.d(this.f = new mc("Distance to Crystal", this, 6.0D, 1.0D, 8.0D, 1.0D));
   }

   @mr
   public void H(db var1) {
      if(this.a() > 0 && this.i.Q()) {
         p.sq.i(this.a() + "", (float)var1.x().u() / 2.0F + 19.0F, (float)var1.x().v() / 2.0F, -1);

         for(int var2 = 0; var2 < p.sf.a8.e(); ++var2) {
            ks var3 = p.sf.a8.A(var2);
            if(var3.Z() == j.YJ) {
               xh.x(var3, var1.x().u() / 2 + 4, var1.x().v() / 2 - 7);
            }
         }
      }

   }

   public int a() {
      int var1 = 0;

      for(int var2 = 0; var2 < p.sf.a8.e(); ++var2) {
         ks var3 = p.sf.a8.A(var2);
         if(var3.Z() == j.YJ) {
            ++var1;
         }
      }

      return var1;
   }

   @mr
   public void d(zn var1) {
      String var2 = net.ne.j.D();
      if(p.sf.L().Z() != j.YJ && xs.p() != -1 && Double.compare((double)p.sf.h(), this.o.p()) <= 0) {
         p.sE.K(0, xs.p(), 1, c.PICKUP, p.sf);
         p.sE.K(0, 45, 1, c.PICKUP, p.sf);
      }

      if(this.j() && this.G.Q() && p.sf.L().Z() != j.YJ && xs.p() != -1) {
         p.sE.K(0, xs.p(), 1, c.PICKUP, p.sf);
         p.sE.K(0, 45, 1, c.PICKUP, p.sf);
      }

   }

   private boolean j() {
      for(l var2 : p.s8.J) {
         if(var2 instanceof net.nm.j && p.sf.d(var2) <= this.f.e()) {
            return true;
         }
      }

      return false;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

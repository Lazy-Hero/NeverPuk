package net;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import net._v;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.uy;
import net.xn;
import net.zg;
import net.ne.l;
import net.r.r;
import net.yz.k;
import net.z.m;

public class vo extends mk {
   public static ArrayList Y = new ArrayList();
   public float N = 0.0F;

   public vo() {
      super("FakeHack", or.World);
      gn.Q.J.d(new mc("Hacker Attack Distance", this, 3.0D, 1.0D, 7.0D, 1.0D));
      gn.Q.J.d(new mc("Hacker Sneak", this, false));
      gn.Q.J.d(new mc("Hacker Spin", this, false));
   }

   public static boolean X(r var0) {
      for(String var2 : Y) {
         r var3 = p.s8.k(var2);
      }

      return false;
   }

   public static void y(r var0) {
      Iterator var1 = Y.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         if(p.s8.k(var2) != null && var0.Z((l)Objects.requireNonNull(p.s8.k(var2)))) {
            ((r)Objects.requireNonNull(p.s8.k(var2))).K(false);
            var1.remove();
         }
      }

   }

   public void H() {
      for(String var2 : Y) {
         if(gn.Q.J.S("Hacker Sneak").Q()) {
            r var3 = p.s8.k(var2);

            assert false;

            var3.K(false);
            var3.j(false);
         }
      }

      super.H();
   }

   public void c() {
      int var1 = 0;

      while(true) {
         _v.A("To use this function write - .fakehack (nick)");
         ++var1;
      }
   }

   @mr
   public void i(zg var1) {
      m.a();
      Iterator var3 = Y.iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         r var5 = p.s8.k(var4);
         if(gn.Q.J.S("Hacker Sneak").Q()) {
            var5.K(true);
            var5.j(true);
         }

         float var7;
         label86: {
            var5.K(false);
            var5.j(false);
            float[] var6 = uy.i(var5, p.sf);
            var7 = (float)gn.Q.J.S("Hacker Attack Distance").W();
            if(!gn.Q.J.S("Hacker Spin").Q()) {
               if(var5.d((l)p.sf) > var7) {
                  break label86;
               }

               var5.hN = var6[0];
               var5.A3 = var6[0];
               var5.V = var6[1];
            }

            float var8 = 30.0F;
            float var9 = (float)Math.floor((double)this.d(var8));
            var5.hN = var9;
            var5.A3 = var9;
         }

         if(p.sf.x % 4 == 0 && Float.compare(var5.d((l)p.sf), var7) <= 0) {
            var5.N(k.MAIN_HAND);
            if(Float.compare(p.sf.d(var5), var7) <= 0) {
               p.sf.I(net.nb.l.HA, 1.0F, 1.0F);
            }
         }

         if(Float.compare(p.sf.d(var5), var7) > 0 && !gn.Q.J.S("Hacker Sneak").Q() && !gn.Q.J.S("Hacker Spin").Q()) {
            float var10 = 75.0F;
            var5.hN = var10;
            var5.V = 0.0F;
            var5.A3 = var10;
         }
      }

   }

   public float d(float var1) {
      this.N += var1;
      return this.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

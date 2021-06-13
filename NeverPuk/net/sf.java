package net;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import net._6;
import net.db;
import net.gn;
import net.mk;
import net.mr;
import net.mw;
import net.or;
import net.sr;
import net.su;
import net.w9;
import net.x7;
import net.xg;
import net.xh;
import net.xk;
import net.xn;
import net.c9.b;
import net.n_.f;
import net.n_.i;
import net.nn.j;
import net.u.d;
import net.z.t;
import net.z.tg;

public class sf extends mk {
   public static String z = "NeverHook";
   public static float u = 0.0F;
   public static float R;
   public _6 F = new _6();
   float y = 0.0F;

   public sf() {
      super("HUD", or.Hud);
   }

   private static mk q(ArrayList var0, int var1) {
      for(int var2 = var1; var2 < var0.size(); ++var2) {
         mk var3 = (mk)var0.get(var2);
         if(var3.v() && var3.m && !var3.R().equals("ClickGui") && var3.m) {
            return var3;
         }
      }

      return null;
   }

   public static void B(t var0) {
      float var1 = R;
      float var2 = -2.0F;
      ArrayList var3 = new ArrayList(p.sf.o());
      var3.sort(Comparator.comparingDouble((var0) -> {
         return (double)p.sO.r(((f)Objects.requireNonNull(f.Q(x7.v(var0.V())))).s());
      }));

      for(i var5 : var3) {
         f var6 = f.Q(x7.v(var5.V()));

         assert false;

         String var7 = b.x(var6.s(), new Object[0]);
         String var8 = "";
         if(var5.d() == 1) {
            var7 = var7 + " 2";
         } else if(var5.d() == 2) {
            var7 = var7 + " 3";
         } else if(var5.d() == 3) {
            var7 = var7 + " 4";
         }

         if(var5.S() < 600 && var5.S() > 300) {
            var8 = var8 + " " + f.U(var5);
         } else if(var5.S() < 300) {
            var8 = var8 + " " + f.U(var5);
         } else if(var5.S() > 600) {
            var8 = var8 + " " + f.U(var5);
         }

         int var9 = -1;
         if(var5.S() < 200) {
            var9 = (new Color(215, 59, 59)).getRGB();
         } else if(var5.S() < 400) {
            var9 = (new Color(231, 143, 32)).getRGB();
         } else if(var5.S() > 400) {
            var9 = (new Color(172, 171, 171)).getRGB();
         }

         if(sr.a.Q()) {
            p.sO.U(var7, (float)(var0.u() - p.sO.r(var7 + var8) - 3), (float)(var0.v() - 28) + var2 - var1, var6.t());
            p.sO.U(var8, (float)(var0.u() - p.sO.r(var8) - 2), (float)(var0.v() - 28) + var2 - var1, var9);
         } else {
            gn.y().i(var7, (float)(var0.u() - gn.y().s(var7 + var8) - 3), (float)(var0.v() - 28) + var2 - var1, var6.t());
            gn.y().i(var8, (float)(var0.u() - gn.y().s(var8) - 2), (float)(var0.v() - 28) + var2 - var1, var9);
         }

         var2 -= 11.0F;
      }

   }

   public static void F(t var0) {
      d[] var1 = net.y.d.t();
      double var2 = (double)(var0.u() - (su.o.Q()?1:0));
      float var4 = 1.0F;
      boolean var10000 = false;
      if(gn.Q.j.d(su.class).v()) {
         gn.Q.j.X().sort(Comparator.comparing((var0) -> {
            return Integer.valueOf(!sr.a.Q()?-gn.y().s(var0.R()):-p.sO.r(var0.R()));
         }));
         Iterator var6 = gn.Q.j.X().iterator();
         if(var6.hasNext()) {
            mk var7 = (mk)var6.next();
            if(!var7.R().equals("ClickGui")) {
               xk var8 = var7.P();
               String var9 = var7.R();
               float var10 = su.W.e();
               float var11 = !sr.a.Q()?(float)gn.y().s(var9):(float)p.sO.r(var9);
               float var12 = (float)(var2 - (double)var11);
               boolean var13 = var7.v() && var7.m;
               var8.S(var12, var4, (float)(0.10000000149011612D * j.Y) / 6.0F, (float)(0.30000001192092896D * j.Y) / 6.0F);
               var8.S((float)var2, var4, (float)(0.10000000149011612D * j.Y) / 6.0F, (float)(0.30000001192092896D * j.Y) / 6.0F);
               byte var14 = 0;
               Iterator var15 = p.sf.o().iterator();
               if(var15.hasNext()) {
                  i var16 = (i)var15.next();
                  if(var16.i().T()) {
                     var14 = 26;
                  }

                  if(var16.i().d()) {
                     var14 = 52;
                  }
               }

               double var34 = var8.p() + (double)var14;
               double var17 = var8.T() - (su.o.Q()?2.5D:1.5D);
               byte var19 = 0;
               su.N.T();
               su.H.T();
               su.f.p();
               String var24 = gn.Q.J.S("ArrayList Color").M();
               boolean var25 = Double.compare(var8.T(), var2) < 0;
               String var26 = var24.toLowerCase();
               int var27 = -1;
               switch(var26.hashCode()) {
               case 973576630:
                  if(!var26.equals("rainbow")) {
                     break;
                  }

                  var27 = (boolean)0;
               case -703561496:
                  if(!var26.equals("astolfo")) {
                     break;
                  }

                  var27 = (boolean)1;
               case 107027353:
                  if(!var26.equals("pulse")) {
                     break;
                  }

                  var27 = (boolean)2;
               case -1349088399:
                  if(!var26.equals("custom")) {
                     break;
                  }

                  var27 = (boolean)3;
               case 3387192:
                  if(!var26.equals("none")) {
                     break;
                  }

                  var27 = (boolean)4;
               case 50511102:
                  if(var26.equals("category")) {
                     var27 = (boolean)5;
                  }
               }

               net.y.d.c();
               net.y.d.J(-su.i.p(), su.G.p(), 1.0D);
               int var35 = (int)gn.Q.J.S("BackgroundAplha").p();
               var27 = (int)gn.Q.J.S("BackgroundBright").p();
               if(su.K.Q()) {
                  xh.J(var17 - 2.0D, var34 - 1.0D, var2, var34 + (double)var10 - 1.0D, xg.m(var35, var27));
               }

               if(su.x.Q()) {
                  xh.J(var17 - 2.6D, var34 - 1.0D, var17 - 2.0D, var34 + (double)var10 - 1.0D, var19);
               }

               mk var28 = null;
               int var29 = gn.Q.j.X().indexOf(var7) + 1;
               if(gn.Q.j.X().size() > var29) {
                  var28 = q(gn.Q.j.X(), var29);
               }

               double var30 = !sr.a.Q()?(double)gn.y().s(var28.R()):(double)p.sO.r(var28.R());
               double var32 = (double)var11 - var30;
               if(su.x.Q()) {
                  xh.J(var17 - 2.6D, var34 + (double)var10 - 1.0D, var17 - 2.6D + var32, var34 + (double)var10 - 0.6D, var19);
               }

               if(su.x.Q()) {
                  xh.J(var17 - 2.6D, var34 + (double)var10 - 1.0D, var2, var34 + (double)var10 - 0.6D, var19);
               }

               if(!sr.a.Q()) {
                  String var43 = gn.Q.J.S("FontList").M();
                  float var31 = var43.equalsIgnoreCase("Verdana")?0.5F:(var43.equalsIgnoreCase("SF UI")?1.3F:(var43.equalsIgnoreCase("Bebas")?3.5F:2.1F));
                  if(!sr.a.Q()) {
                     gn.y().E(var9, var17, var34 + (double)var31, var19);
                  }
               }

               p.sO.U(var9, (float)var17, (float)var34 + 1.0F, var19);
               if(su.o.Q()) {
                  xh.J(var2, var34 - 1.0D, var2 + 1.0D, var34 + (double)var10 - 1.0D, var19);
               }

               float var44 = var4 + var10;
               net.y.d.Y();
            }
         }
      }

   }

   @mr
   public void i(db var1) {
      float var2 = p.s5 instanceof tg?15.0F:0.0F;
      float var3 = R - var2;
      R -= var3 / (float)Math.max(1, j.w()) * 10.0F;
      if(!Double.isFinite((double)R)) {
         R = 0.0F;
      }

      if(R > 15.0F) {
         R = 15.0F;
      }

      if(R < 0.0F) {
         R = 0.0F;
      }

      this.q();
      this.F();
      B(var1.x());
   }

   public void q() {
      p.s3.l("N", 3.0D, 3.0D, gn.M().brighter().getRGB());
      p.s3.l("ever", 10.0D, 3.0D, -1);
      p.s3.l("H", 30.0D, 3.0D, gn.M().brighter().getRGB());
      p.s3.l("ook", 37.0D, 3.0D, -1);
   }

   public void F() {
      t var1 = new t(p);
      this.y = mw.w(this.y, p.s5 instanceof tg?(float)(var1.v() - 22):(float)(var1.v() - 9), 1.0E-4F);
      String var2 = String.format("%.2f blocks/sec", new Object[]{Float.valueOf(w9.k() * 16.0F)});
      String var3 = "§7Build §7-§f " + gn.w;
      int var4 = p.T()?0:((net.yp.v)Objects.requireNonNull(p.d())).f(p.sf.O()).g();
      if(sr.a.Q()) {
         p.sO.U("" + Math.round(p.sf.b) + ", " + Math.round(p.sf.hS) + ", " + Math.round(p.sf.hr), 2.0F, (float)((int)this.y), -1);
         p.sO.U("Ping: §7" + var4 + "ms", (float)(var1.u() - p.sO.r("Ping: §7" + var4 + "ms") - 2), this.y + -10.0F, -1);
         p.sO.U("FPS: §7" + j.w(), 2.0F, this.y + -18.0F, -1);
         p.sO.U(var2, 2.0F, this.y + -9.0F, -1);
         p.sO.U(var3, (float)(var1.u() - p.sO.r(var3) - 2), this.y, -1);
      } else {
         gn.y().i("" + Math.round(p.sf.b) + ", " + Math.round(p.sf.hS) + ", " + Math.round(p.sf.hr), 2.0F, (float)((int)this.y), -1);
         gn.y().i("Ping: §7" + var4 + "ms", (float)(var1.u() - gn.y().s("Ping: §7" + var4 + "ms") - 2), this.y + -10.0F, -1);
         gn.y().i("FPS: §7" + j.w(), 2.0F, this.y + -18.0F, -1);
         gn.y().i(var2, 2.0F, this.y + -9.0F, -1);
         gn.y().i(var3, (float)(var1.u() - gn.y().s(var3) - 2), this.y, -1);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}

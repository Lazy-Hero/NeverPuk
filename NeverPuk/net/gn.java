package net;

import java.awt.Color;
import java.net.SocketException;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net._2;
import net._3;
import net._x;
import net.bi;
import net.d8;
import net.dt;
import net.g6;
import net.ij;
import net.iv;
import net.mk;
import net.mr;
import net.pd;
import net.su;
import net.u0;
import net.w9;
import net.xg;
import net.xi;
import net.xn;
import net.z2;
import net.zf;
import net.zt;
import net.m.i;
import net.nn.j;
import net.u.d;
import net.u.t;
import org.lwjgl.input.Keyboard;

public class gn {
   public static String K = "NeverHook";
   public static String w = "Free-Build #09";
   public static gn Q = new gn();
   public static boolean k = false;
   public static float i;
   public static float d;
   public static float f;
   public static float H;
   public static float q;
   public static float a;
   public static float m;
   public static float C;
   public static int r;
   private static String T;
   private static boolean D;
   public _2 h;
   public iv J;
   public _3 j;
   public zt z;
   public pd Z;
   public dt A;
   public u0 L;
   public g6 M;
   public xi W;
   public boolean P = true;
   private static d[] F;

   public static void j() {
      j var0 = j.b();
      double var1 = var0.sf.b - var0.sf.h;
      double var3 = var0.sf.hr - var0.sf.l;
      if(var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         m = h((float)w9.K(), d, 50.0F);
         r = 0;
      } else if(r > 0) {
         --r;
         m = p(d, m, 10.0F);
      }

   }

   public static float p(float var0, float var1, float var2) {
      float var3 = t.k(var0 - var1);
      if(var3 < -var2) {
         var3 = -var2;
      }

      if(var3 >= var2) {
         var3 = var2;
      }

      return var0 - var3;
   }

   private static float h(float var0, float var1, float var2) {
      return 0.0F;
   }

   public static float D() {
      return d;
   }

   public static boolean U() {
      return D;
   }

   public static Color M() {
      Color var1 = Color.white;
      e();
      Color var2 = new Color(su.N.T());
      Color var3 = new Color(su.H.T());
      double var4 = su.f.p();
      String var6 = Q.J.S("ArrayList Color").M();
      float var7 = 4.0F;
      int var8 = 0;
      int var9 = 0;
      var8 = var8 + j.b().x.f() + 5;
      ++var9;
      d.h(new d[5]);
      if(var6.equalsIgnoreCase("Rainbow")) {
         var1 = xg.j(20, 0.8F, 1.0F);
      }

      if(var6.equalsIgnoreCase("Astolfo")) {
         var1 = xg.t((int)var7, var8);
      }

      if(var6.equalsIgnoreCase("Pulse")) {
         var1 = xg.C(new Color(255, 50, 50), new Color(79, 9, 9), Math.abs((double)System.currentTimeMillis() / var4) / 100.0D + 6.0D * (double)var7 * 2.55D / 60.0D);
      }

      if(var6.equalsIgnoreCase("Custom")) {
         var1 = xg.C(new Color(var2.getRGB()), new Color(var3.getRGB()), Math.abs((double)System.currentTimeMillis() / var4) / 100.0D + 3.0D * (double)var7 * 2.55D / 60.0D);
      }

      if(var6.equalsIgnoreCase("None")) {
         var1 = new Color(255, 255, 255);
      }

      return var1;
   }

   public static u0 i() {
      return Q.L;
   }

   public static ij y() {
      j var0 = j.b();
      ij var1 = var0.x;
      String var2 = Q.J.S("FontList").M();
      String var3 = var2.toLowerCase();
      boolean var4 = true;
      switch(var3.hashCode()) {
      case -1686065428:
         if(var3.equals("comfortaa")) {
            var4 = false;
         }
         break;
      case -1063148335:
         if(var3.equals("robotoLight")) {
            var4 = true;
         }
         break;
      case -232065865:
         if(var3.equals("robotoregular")) {
            var4 = true;
         }
         break;
      case 3314352:
         if(var3.equals("lato")) {
            var4 = true;
         }
         break;
      case 109278081:
         if(var3.equals("sf ui")) {
            var4 = true;
         }
         break;
      case 351153427:
         if(var3.equals("verdana")) {
            var4 = true;
         }
      }

      return var1;
   }

   public static g6 Y() {
      return Q.M;
   }

   public static String k() {
      return T;
   }

   public static void Z(String var0) {
      T = var0;
   }

   @mr
   public void M(z2 var1) {
      if(!U() && var1.c()) {
         k = true;
      } else if(!U() && k && var1.d()) {
         i = j.b().sf.V;
         d = j.b().sf.hN;
         f = j.b().sf.V;
         H = j.b().sf.hN;
         m = j.b().sf.AK;
         k = false;
      } else {
         k = false;
      }

      if(var1.c()) {
         C = m;
         f = i;
         H = d;
         m = h(m, d, 50.0F);
         j();
         a = q;
         q = d;
      }

   }

   @mr
   public void b(zf var1) {
      if(var1.w() instanceof i) {
         r = 10;
      }

   }

   public void T() throws SocketException {
      this.J = new iv();
      this.z = new zt();
      this.j = new _3();
      this.A = new dt();
      (this.L = new u0()).z();
      (this.M = new g6()).h();
      this.Z = new pd();
      this.W = new xi();
      Y().q(d8.class).n();
      this.h = new _2();
      _x.K(this);
   }

   public void I() {
      _x.E(this);
      (this.M = new g6()).Q();
   }

   @mr
   public void r(bi var1) {
      Q.W.Q().forEach((var0) -> {
         if(var0.Q() == Keyboard.getEventKey()) {
            var0.B();
         }

      });
      this.j.X().stream().filter((var1x) -> {
         return var1x.o() == var1.T();
      }).forEach(mk::g);
   }

   static {
      t((d[])null);
   }

   public static void t(d[] var0) {
      F = var0;
   }

   public static d[] e() {
      return F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

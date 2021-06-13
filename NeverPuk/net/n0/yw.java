package net.n0;

import java.util.Map;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yt;

public class yw extends yt {
   private final boolean Y;

   public yw(boolean var1) {
      super(0, 0.0F, false);
      this.Y = var1;
   }

   public int Z(ks var1) {
      yw.i var2 = yw.i.d(var1);
      return this.Y && var2.i()?var2.E():var2.m();
   }

   public float Q(ks var1) {
      yw.i var2 = yw.i.d(var1);
      return this.Y && var2.i()?var2.L():var2.T();
   }

   protected void u(ks var1, net.yv.r var2, net.r.r var3) {
      kw.b();
      yw.i var5 = yw.i.d(var1);
      if(var5 == yw.i.PUFFERFISH) {
         var3.o((net.n_.i)(new net.n_.i(net.nb.b.j, 1200, 3)));
         var3.o((net.n_.i)(new net.n_.i(net.nb.b.p, 300, 2)));
         var3.o((net.n_.i)(new net.n_.i(net.nb.b.f, 300, 1)));
      }

      super.u(var1, var2, var3);
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      int[] var3 = kw.b();
      if(this.a(var1)) {
         yw.i[] var4 = yw.i.values();
         int var5 = var4.length;
         int var6 = 0;
         if(var6 < var5) {
            yw.i var7 = var4[var6];
            if(!this.Y || var7.i()) {
               var2.add(new ks(this, 1, var7.W()));
            }

            ++var6;
         }
      }

   }

   public String f(ks var1) {
      yw.i var2 = yw.i.d(var1);
      return this.z() + "." + var2.v() + "." + (this.Y && var2.i()?"cooked":"raw");
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum i {
      COD,
      SALMON,
      CLOWNFISH,
      PUFFERFISH;

      private static final Map I;
      private final int f;
      private final String h;
      private final int u;
      private final float T;
      private final int H;
      private final float C;
      private final boolean w;

      private i(int var3, String var4, int var5, float var6, int var7, float var8) {
         this.f = var3;
         this.h = var4;
         this.u = var5;
         this.T = var6;
         this.H = var7;
         this.C = var8;
         this.w = true;
      }

      private i(int var3, String var4, int var5, float var6) {
         this.f = var3;
         this.h = var4;
         this.u = var5;
         this.T = var6;
         this.H = 0;
         this.C = 0.0F;
         this.w = false;
      }

      public int W() {
         return this.f;
      }

      public String v() {
         return this.h;
      }

      public int m() {
         return this.u;
      }

      public float T() {
         return this.T;
      }

      public int E() {
         return this.H;
      }

      public float L() {
         return this.C;
      }

      public boolean i() {
         return this.w;
      }

      public static yw.i w(int var0) {
         kw.b();
         yw.i var2 = (yw.i)I.get(Integer.valueOf(var0));
         return var2 == null?COD:var2;
      }

      public static yw.i d(ks var0) {
         int[] var1 = kw.b();
         return var0.Z() instanceof yw?w(var0.n()):COD;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}

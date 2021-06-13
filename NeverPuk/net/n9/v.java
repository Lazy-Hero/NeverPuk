package net.n9;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import net.os;
import net.oz;
import net.z9;
import net.c9.q;
import net.n9.e;
import net.n9.k;
import net.n9.y;
import net.u.d;
import net.y3.a;
import net.yz.m_;

public class v {
   private final String c;
   protected List T = Lists.newArrayList();
   protected int[][] m;
   private net.y3.r X;
   protected boolean j;
   protected int L;
   protected int D;
   protected int l;
   protected int p;
   private float J;
   private float b;
   private float C;
   private float d;
   protected int o;
   protected int v;
   private int u = -1;
   public float e;
   public float h;
   public int Y;
   public int W;
   public int t = -1;
   public v U = null;
   public boolean q = false;
   public int z = 0;
   public v Q = null;
   public v n = null;
   public boolean G = false;
   public boolean N = false;

   private v(v var1) {
      this.c = var1.c;
      this.q = true;
   }

   protected v(String var1) {
      this.c = var1;
      if(z9.Sk()) {
         this.U = new v(this);
      }

   }

   protected static v t(m_ var0) {
      return new v(var0.toString());
   }

   public void R(int var1, int var2, int var3, int var4, boolean var5) {
      this.L = var3;
      this.D = var4;
      this.j = var5;
      float var6 = (float)(0.009999999776482582D / (double)var1);
      float var7 = (float)(0.009999999776482582D / (double)var2);
      this.J = (float)var3 / (float)((double)var1) + var6;
      this.b = (float)(var3 + this.l) / (float)((double)var1) - var6;
      this.C = (float)var4 / (float)var2 + var7;
      this.d = (float)(var4 + this.p) / (float)var2 - var7;
      this.e = Math.min(this.J, this.b);
      this.h = Math.min(this.C, this.d);
      if(this.U != null) {
         this.U.R(this.l, this.p, 0, 0, false);
      }

   }

   public void M(v var1) {
      this.L = var1.L;
      this.D = var1.D;
      this.l = var1.l;
      this.p = var1.p;
      this.j = var1.j;
      this.J = var1.J;
      this.b = var1.b;
      this.C = var1.C;
      this.d = var1.d;
      if(this.U != null) {
         this.U.R(this.l, this.p, 0, 0, false);
      }

   }

   public int e() {
      return this.L;
   }

   public int u() {
      return this.D;
   }

   public int d() {
      return this.l;
   }

   public int z() {
      return this.p;
   }

   public float q() {
      return this.J;
   }

   public float o() {
      return this.b;
   }

   public float W(double var1) {
      float var3 = this.b - this.J;
      return this.J + var3 * (float)var1 / 16.0F;
   }

   public float x(float var1) {
      float var2 = this.b - this.J;
      return (var1 - this.J) / var2 * 16.0F;
   }

   public float n() {
      return this.C;
   }

   public float r() {
      return this.d;
   }

   public float L(double var1) {
      float var3 = this.d - this.C;
      return this.C + var3 * (float)var1 / 16.0F;
   }

   public float G(float var1) {
      float var2 = this.d - this.C;
      return (var1 - this.C) / var2 * 16.0F;
   }

   public String V() {
      return this.c;
   }

   public void F() {
      if(this.X != null) {
         ++this.v;
         if(this.v >= this.X.e(this.o)) {
            int var1 = this.X.r(this.o);
            int var2 = this.X.w() == 0?this.T.size():this.X.w();
            this.o = (this.o + 1) % var2;
            this.v = 0;
            int var3 = this.X.r(this.o);
            boolean var4 = false;
            boolean var5 = this.q;
            if(var1 != var3 && var3 < this.T.size()) {
               y.H((int[][])this.T.get(var3), this.l, this.p, this.L, this.D, var4, var5);
            }
         } else if(this.X.J()) {
            this.B();
         }
      }

   }

   private void B() {
      double var1 = 1.0D - (double)this.v / (double)this.X.e(this.o);
      int var3 = this.X.r(this.o);
      int var4 = this.X.w() == 0?this.T.size():this.X.w();
      int var5 = this.X.r((this.o + 1) % var4);
      if(var3 != var5 && var5 < this.T.size()) {
         int[][] var6 = (int[][])this.T.get(var3);
         int[][] var7 = (int[][])this.T.get(var5);
         if(this.m == null || this.m.length != var6.length) {
            this.m = new int[var6.length][];
         }

         for(int var8 = 0; var8 < var6.length; ++var8) {
            if(this.m[var8] == null) {
               this.m[var8] = new int[var6[var8].length];
            }

            if(var8 < var7.length && var7[var8].length == var6[var8].length) {
               for(int var9 = 0; var9 < var6[var8].length; ++var9) {
                  int var10 = var6[var8][var9];
                  int var11 = var7[var8][var9];
                  int var12 = this.b(var1, var10 >> 16 & 255, var11 >> 16 & 255);
                  int var13 = this.b(var1, var10 >> 8 & 255, var11 >> 8 & 255);
                  int var14 = this.b(var1, var10 & 255, var11 & 255);
                  this.m[var8][var9] = var10 & -16777216 | var12 << 16 | var13 << 8 | var14;
               }
            }
         }

         y.H(this.m, this.l, this.p, this.L, this.D, false, false);
      }

   }

   private int b(double var1, int var3, int var4) {
      return (int)(var1 * (double)var3 + (1.0D - var1) * (double)var4);
   }

   public int[][] d(int var1) {
      return (int[][])this.T.get(var1);
   }

   public int D() {
      return this.T.size();
   }

   public void a(int var1) {
      this.l = var1;
      if(this.U != null) {
         this.U.a(this.l);
      }

   }

   public void h(int var1) {
      this.p = var1;
      if(this.U != null) {
         this.U.h(this.p);
      }

   }

   public void J(k var1, boolean var2) throws IOException {
      this.j();
      this.l = var1.D;
      this.p = var1.g;
      this.p = this.l;
      if(this.U != null) {
         this.U.l = this.l;
         this.U.p = this.p;
      }

   }

   public void q(q var1, int var2) throws IOException {
      e.d();
      BufferedImage var4 = y.T(var1.k());
      if(this.l != var4.getWidth()) {
         var4 = os.v(var4, this.l);
      }

      net.y3.r var5 = (net.y3.r)var1.S("animation");
      int[][] var6 = new int[var2][];
      var6[0] = new int[var4.getWidth() * var4.getHeight()];
      var4.getRGB(0, 0, var4.getWidth(), var4.getHeight(), var6[0], 0, var4.getWidth());
      this.T.add(var6);
      int var7 = var4.getHeight() / this.l;
      if(var5.w() > 0) {
         Iterator var8 = var5.T().iterator();
         if(var8.hasNext()) {
            int var9 = ((Integer)var8.next()).intValue();
            if(var9 >= var7) {
               throw new RuntimeException("invalid frameindex " + var9);
            }

            this.r(var9);
            this.T.set(var9, I(var6, this.l, this.l, var9));
         }

         this.X = var5;
      }

      ArrayList var14 = Lists.newArrayList();
      int var16 = 0;
      if(var16 < var7) {
         this.T.add(I(var6, this.l, this.l, var16));
         var14.add(new a(var16, -1));
         ++var16;
      }

      this.X = new net.y3.r(var14, this.l, this.p, var5.T(), var5.J());
      if(!this.G) {
         if(z9.Q()) {
            this.m();
         }

         var7 = 0;
         if(var7 < this.T.size()) {
            int[][] var15 = (int[][])this.T.get(var7);
            if(!this.c.startsWith("minecraft:blocks/leaves_")) {
               var16 = 0;
               if(var16 < var15.length) {
                  int[] var10 = var15[var16];
                  this.J(var10);
                  ++var16;
               }
            }

            ++var7;
         }

         if(this.U != null) {
            q var13 = z9.k().A(var1.O());
            this.U.q(var13, var2);
         }
      }

      if(d.y() == null) {
         e.K(new String[3]);
      }

   }

   public void m(int var1) {
      ArrayList var2 = Lists.newArrayList();

      for(int var3 = 0; var3 < this.T.size(); ++var3) {
         int[][] var4 = (int[][])this.T.get(var3);
         var2.add(y.a(var1, this.l, var4));
      }

      this.w(var2);
      if(this.U != null) {
         this.U.m(var1);
      }

   }

   private void r(int var1) {
      if(this.T.size() <= var1) {
         for(int var2 = this.T.size(); var2 <= var1; ++var2) {
            this.T.add((Object)null);
         }
      }

      if(this.U != null) {
         this.U.r(var1);
      }

   }

   private static int[][] I(int[][] var0, int var1, int var2, int var3) {
      int[][] var4 = new int[var0.length][];

      for(int var5 = 0; var5 < var0.length; ++var5) {
         int[] var6 = var0[var5];
         var4[var5] = new int[(var1 >> var5) * (var2 >> var5)];
         System.arraycopy(var6, var3 * var4[var5].length, var4[var5], 0, var4[var5].length);
      }

      return var4;
   }

   public void J() {
      this.T.clear();
      if(this.U != null) {
         this.U.J();
      }

   }

   public boolean Q() {
      return this.X != null;
   }

   public void w(List var1) {
      this.T = var1;
      if(this.U != null) {
         this.U.w(var1);
      }

   }

   private void j() {
      this.X = null;
      this.w(Lists.newArrayList());
      this.o = 0;
      this.v = 0;
      if(this.U != null) {
         this.U.j();
      }

   }

   public String toString() {
      return "TextureAtlasSprite{name=\'" + this.c + '\'' + ", frameCount=" + this.T.size() + ", rotated=" + this.j + ", x=" + this.L + ", y=" + this.D + ", height=" + this.p + ", width=" + this.l + ", u0=" + this.J + ", u1=" + this.b + ", v0=" + this.C + ", v1=" + this.d + '}';
   }

   public boolean T(net.c9.p var1, m_ var2) {
      return false;
   }

   public boolean C(net.c9.p var1, m_ var2, Function var3) {
      return true;
   }

   public Collection S() {
      return ImmutableList.of();
   }

   public int Q() {
      return this.u;
   }

   public void C(int var1) {
      this.u = var1;
   }

   private void J(int[] var1) {
      long var2 = 0L;
      long var4 = 0L;
      long var6 = 0L;
      long var8 = 0L;

      for(int var10 = 0; var10 < var1.length; ++var10) {
         int var11 = var1[var10];
         int var12 = var11 >> 24 & 255;
         if(var12 >= 16) {
            int var13 = var11 >> 16 & 255;
            int var14 = var11 >> 8 & 255;
            int var15 = var11 & 255;
            var2 += (long)var13;
            var4 += (long)var14;
            var6 += (long)var15;
            ++var8;
         }
      }

      long var17;
      int var10000 = (var17 = var8 - 0L) == 0L?0:(var17 < 0L?-1:1);
   }

   public double O(float var1) {
      float var2 = this.b - this.J;
      return (double)((var1 - this.J) / var2 * 16.0F);
   }

   public double p(float var1) {
      float var2 = this.d - this.C;
      return (double)((var1 - this.C) / var2 * 16.0F);
   }

   public void v() {
      if(this.t < 0) {
         this.t = y.v();
         y.I(this.t, this.z, this.l, this.p);
         os.n();
      }

      os.M(this.t);
   }

   public void X() {
      if(this.t >= 0) {
         y.R(this.t);
         this.t = -1;
      }

   }

   public float M(float var1) {
      var1 = var1 - this.e;
      float var2 = (float)this.Y / (float)this.l;
      var1 = var1 * var2;
      return var1;
   }

   public float u(float var1) {
      var1 = var1 - this.h;
      float var2 = (float)this.W / (float)this.p;
      var1 = var1 * var2;
      return var1;
   }

   public List w() {
      ArrayList var1 = new ArrayList();
      var1.addAll(this.T);
      return var1;
   }

   public net.y3.r u() {
      return this.X;
   }

   public void O(net.y3.r var1) {
      this.X = var1;
   }

   private void m() {
      if(oz.ek) {
         String var1 = this.c + "_n";
         m_ var2 = new m_(var1);
         var2 = z9.h().l(var2);
         if(z9.Y(var2)) {
            this.Q = new v(var1);
            this.Q.G = true;
            this.Q.M(this);
            z9.h().c(z9.k(), this.Q);
         }
      }

      if(oz.H3) {
         String var3 = this.c + "_s";
         m_ var5 = new m_(var3);
         var5 = z9.h().l(var5);
         if(z9.Y(var5)) {
            this.n = new v(var3);
            this.n.G = true;
            this.n.M(this);
            z9.h().c(z9.k(), this.n);
         }
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}

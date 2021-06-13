package net.n9;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.bh;
import net.gh;
import net.i6;
import net.os;
import net.rd;
import net.ww;
import net.x3;
import net.z9;
import net.c9.q;
import net.n9.e;
import net.n9.f;
import net.n9.k;
import net.n9.l;
import net.n9.o;
import net.n9.u;
import net.n9.v;
import net.n9.y;
import net.u.d;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b extends f implements o {
   private static final Logger L = LogManager.getLogger();
   public static final m_ i = new m_("missingno");
   public static final m_ N = new m_("textures/atlas/blocks.png");
   private final List c;
   private final Map M;
   private final Map V;
   private final String X;
   private final u e;
   private int P;
   private final v B;
   private v[] l;
   private int R;
   private int x;
   private int p;
   private double a;
   private double h;
   private int A;
   public int W;
   public int Y;

   public b(String var1) {
      this(var1, (u)null);
   }

   public b(String var1, boolean var2) {
      this(var1, (u)null, var2);
   }

   public b(String var1, @Nullable u var2) {
      this(var1, var2, false);
   }

   public b(String var1, u var2, boolean var3) {
      this.l = null;
      this.R = -1;
      this.x = -1;
      this.p = -1;
      this.a = -1.0D;
      this.h = -1.0D;
      this.A = 0;
      this.W = 0;
      this.Y = 0;
      this.c = Lists.newArrayList();
      this.M = Maps.newHashMap();
      this.V = Maps.newHashMap();
      this.B = new v("missingno");
      this.X = var1;
      this.e = var2;
   }

   private void K() {
      int var1 = this.h();
      int[] var2 = this.i(var1);
      this.B.a(var1);
      this.B.h(var1);
      int[][] var3 = new int[this.P + 1][];
      var3[0] = var2;
      this.B.w(Lists.newArrayList(new int[][][]{var3}));
      this.B.C(this.A++);
   }

   public void c(net.c9.p var1) throws IOException {
      gh.L = var1;
      if(this.e != null) {
         this.Z(var1, this.e);
      }

   }

   public void Z(net.c9.p var1, u var2) {
      this.M.clear();
      this.A = 0;
      i6.Q(i6.B6, new Object[]{this});
      var2.w(this);
      if(this.P >= 4) {
         this.P = this.l(this.M, var1);
         z9.c("Mipmap levels: " + this.P);
      }

      this.K();
      this.P();
      this.l(var1);
   }

   public void l(net.c9.p var1) {
      gh.L = var1;
      e.d();
      z9.v("Multitexture: " + z9.Sk());
      if(z9.Sk()) {
         Iterator var3 = this.V.values().iterator();
         if(var3.hasNext()) {
            v var4 = (v)var3.next();
            var4.X();
            d.h(new d[5]);
         }
      }

      bh.H(this);
      rd.n(this);
      x3.i(this);
      int var20 = os.Z();
      l var21 = new l(var20, var20, 0, this.P);
      this.V.clear();
      this.c.clear();
      int var5 = Integer.MAX_VALUE;
      int var6 = this.h();
      this.R = var6;
      int var7 = 1 << this.P;
      ArrayList var8 = new ArrayList(this.M.values());
      int var9 = 0;
      if(var9 < var8.size()) {
         v var10 = ww.x(var8, var9, this);
         m_ var11 = this.V(var10);
         q var12 = null;
         if(var10.Q() < 0) {
            var10.C(this.A++);
         }

         if(var10.T(var1, var11)) {
            if(var10.C(var1, var11, (var1) -> {
               return (v)this.M.get(var1.toString());
            })) {
               z9.v("Custom loader (skipped): " + var10);
            }

            z9.v("Custom loader: " + var10);
         }

         k var13 = k.e(var1.A(var11));
         if(z9.Q()) {
            var12 = gh.c(var1, var11);
         } else {
            var12 = var1.A(var11);
         }

         int var14 = var12.S("animation") != null;
         var10.J(var13, (boolean)var14);
         IOUtils.closeQuietly(var12);
         int var30 = var10.d();
         var14 = var10.z();
         if(var30 >= 1 && var14 >= 1) {
            if(var30 < var6 || this.P > 0) {
               int var15 = this.P > 0?os.x(var30, var6):os.k(var30, var6);
               if(var15 != var30) {
                  if(!os.I(var30)) {
                     z9.c("Scaled non power of 2: " + var10.V() + ", " + var30 + " -> " + var15);
                  }

                  z9.c("Scaled too small texture: " + var10.V() + ", " + var30 + " -> " + var15);
                  int var16 = var14 * var15 / var30;
                  var10.a(var15);
                  var10.h(var16);
               }
            }

            var5 = Math.min(var5, Math.min(var10.d(), var10.z()));
            int var37 = Math.min(Integer.lowestOneBit(var10.d()), Integer.lowestOneBit(var10.z()));
            if(var37 < var7) {
               L.warn("Texture {} with size {}x{} limits mip level from {} to {}", var11, Integer.valueOf(var10.d()), Integer.valueOf(var10.z()), Integer.valueOf(net.u.t.r(var7)), Integer.valueOf(net.u.t.r(var37)));
               var7 = var37;
            }

            if(this.c(var1, var10)) {
               var21.a(var10);
            }
         }

         z9.h("Invalid sprite size: " + var10);
         ++var9;
      }

      var9 = Math.min(var5, var7);
      int var24 = net.u.t.r(var9);
      if(var24 < 0) {
         var24 = 0;
      }

      if(var24 < this.P) {
         L.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.X, Integer.valueOf(this.P), Integer.valueOf(var24), Integer.valueOf(var9));
         this.P = var24;
      }

      this.B.m(this.P);
      var21.a(this.B);
      var21.J();
      L.info("Created: {}x{} {}-atlas", Integer.valueOf(var21.j()), Integer.valueOf(var21.H()), this.X);
      if(z9.Q()) {
         gh.a(this.L(), this.P, var21.j(), var21.H(), var21, this);
      }

      y.I(this.L(), this.P, var21.j(), var21.H());
      HashMap var25 = Maps.newHashMap(this.M);
      Iterator var27 = var21.p().iterator();
      if(var27.hasNext()) {
         v var31 = (v)var27.next();
         if(z9.Q()) {
            gh.T(gh.L(var31).V());
         }

         String var35 = var31.V();
         var25.remove(var35);
         this.V.put(var35, var31);
         if(z9.Q()) {
            gh.B(var31.d(0), var31.d(), var31.z(), var31.e(), var31.u(), false, false);
         }

         y.H(var31.d(0), var31.d(), var31.z(), var31.e(), var31.u(), false, false);
         if(var31.Q()) {
            this.c.add(var31);
         }
      }

      var27 = var25.values().iterator();
      if(var27.hasNext()) {
         v var32 = (v)var27.next();
         var32.M(this.B);
      }

      if(z9.Sk()) {
         int var29 = var21.j();
         int var33 = var21.H();
         Iterator var36 = var21.p().iterator();
         if(var36.hasNext()) {
            v var38 = (v)var36.next();
            var38.Y = var29;
            var38.W = var33;
            var38.z = this.P;
            v var39 = var38.U;
            if(var39 != null) {
               if(var39.d() <= 0) {
                  var39.a(var38.d());
                  var39.h(var38.z());
                  var39.R(var38.d(), var38.z(), 0, 0, false);
                  var39.J();
                  List var17 = var38.w();
                  var39.w(var17);
                  var39.O(var38.u());
               }

               var39.Y = var29;
               var39.W = var33;
               var39.z = this.P;
               var38.v();
               boolean var40 = false;
               boolean var18 = true;
               y.H(var39.d(0), var39.d(), var39.z(), var39.e(), var39.u(), var40, var18);
            }
         }

         z9.G().n().E(N);
      }

      i6.Q(i6.uU, new Object[]{this});
      this.f(var21.j(), var21.H());
      if(z9.Z(System.getProperty("saveTextureMap"), "true")) {
         z9.v("Exporting texture map: " + this.X);
         os.M("debug/" + this.X.replaceAll("/", "_"), this.L(), this.P, var21.j(), var21.H());
      }

   }

   public boolean c(net.c9.p var1, v var2) {
      m_ var3 = this.V(var2);
      q var4 = null;
      if(var2.T(var1, var3)) {
         os.G(var2, this.P);
      } else {
         var4 = var1.A(var3);
         var2.q(var4, this.P + 1);
         IOUtils.closeQuietly(var4);
      }

      var2.m(this.P);
      return true;
   }

   public m_ V(v var1) {
      m_ var2 = new m_(var1.V());
      return this.l(var2);
   }

   public m_ l(m_ var1) {
      return this.e(var1)?new m_(var1.A(), var1.v() + ".png"):new m_(var1.A(), String.format("%s/%s%s", new Object[]{this.X, var1.v(), ".png"}));
   }

   public v O(String var1) {
      v var2 = (v)this.V.get(var1);
      var2 = this.B;
      return var2;
   }

   public void z() {
      if(z9.Q()) {
         gh.o = this.t();
      }

      boolean var1 = false;
      boolean var2 = false;
      y.n(this.L());

      for(v var4 : this.c) {
         if(this.n(var4)) {
            var4.F();
            if(var4.Q != null) {
               var1 = true;
            }

            if(var4.n != null) {
               var2 = true;
            }
         }
      }

      if(z9.Sk()) {
         for(v var11 : this.c) {
            if(this.n(var11)) {
               v var5 = var11.U;
               if(var11 == os.VE || var11 == os.X) {
                  var5.o = var11.o;
               }

               var11.v();
               var5.F();
            }
         }

         y.n(this.L());
      }

      if(z9.Q()) {
         y.n(this.t().y);

         for(v var12 : this.c) {
            if(var12.Q != null && this.n(var12)) {
               if(var12 == os.VE || var12 == os.X) {
                  var12.Q.o = var12.o;
               }

               var12.Q.F();
            }
         }

         y.n(this.t().K);

         for(v var13 : this.c) {
            if(var13.n != null && this.n(var13)) {
               if(var13 == os.VE || var13 == os.X) {
                  var13.Q.o = var13.o;
               }

               var13.n.F();
            }
         }

         y.n(this.L());
      }

      if(z9.Q()) {
         gh.o = null;
      }

   }

   public v f(m_ var1) {
      throw new IllegalArgumentException("Location cannot be null!");
   }

   public void I() {
      this.z();
   }

   public void L(int var1) {
      this.P = var1;
   }

   public v s() {
      return this.B;
   }

   @Nullable
   public v t(String var1) {
      return (v)this.M.get(var1);
   }

   public boolean Z(v var1) {
      String var2 = var1.V();
      if(!this.M.containsKey(var2)) {
         this.M.put(var2, var1);
         if(var1.Q() < 0) {
            var1.C(this.A++);
         }

         return true;
      } else {
         return false;
      }
   }

   public String i() {
      return this.X;
   }

   public int c() {
      return this.P;
   }

   private boolean e(m_ var1) {
      String var2 = var1.v();
      return this.Z(var2);
   }

   private boolean Z(String var1) {
      String var2 = var1.toLowerCase();
      return var2.startsWith("mcpatcher/") || var2.startsWith("optifine/");
   }

   public v S(String var1) {
      m_ var2 = new m_(var1);
      return (v)this.M.get(var2.toString());
   }

   public v w(m_ var1) {
      return (v)this.M.get(var1.toString());
   }

   private boolean n(v var1) {
      return var1 != os.N && var1 != os.V0?(var1 != os.t && var1 != os.L?(var1 != os.V4 && var1 != os.Vh?(var1 == os.a?z9.S4():var1 == os.VE || var1 == os.X || z9.SH()):z9.F()):z9.C()):z9.D();
   }

   public int a() {
      return this.A;
   }

   private int l(Map var1, net.c9.p var2) {
      int var3 = this.e(var1, var2, 20);
      if(var3 < 16) {
         var3 = 16;
      }

      var3 = net.u.t.A(var3);
      if(var3 > 16) {
         z9.c("Sprite size: " + var3);
      }

      int var4 = net.u.t.r(var3);
      if(var4 < 4) {
         var4 = 4;
      }

      return var4;
   }

   private int e(Map var1, net.c9.p var2, int var3) {
      HashMap var4 = new HashMap();

      for(Object var6 : var1.entrySet()) {
         v var7 = (v)((Entry)var6).getValue();
         m_ var8 = new m_(var7.V());
         m_ var9 = this.l(var8);
         if(!var7.T(var2, var8)) {
            q var10 = var2.A(var9);
            InputStream var11 = var10.k();
            Dimension var12 = os.P(var11, "png");
            int var13 = var12.width;
            int var14 = net.u.t.A(var13);
            if(!var4.containsKey(Integer.valueOf(var14))) {
               var4.put(Integer.valueOf(var14), Integer.valueOf(1));
            } else {
               int var15 = ((Integer)var4.get(Integer.valueOf(var14))).intValue();
               var4.put(Integer.valueOf(var14), Integer.valueOf(var15 + 1));
            }
         }
      }

      int var16 = 0;
      Set var17 = var4.keySet();
      TreeSet var18 = new TreeSet(var17);

      int var19;
      for(Iterator var21 = var18.iterator(); var21.hasNext(); var16 += var19) {
         int var23 = ((Integer)var21.next()).intValue();
         var19 = ((Integer)var4.get(Integer.valueOf(var23))).intValue();
      }

      int var22 = 16;
      int var24 = 0;
      var19 = var16 * var3 / 100;
      Iterator var25 = var18.iterator();

      while(var25.hasNext()) {
         int var26 = ((Integer)var25.next()).intValue();
         int var27 = ((Integer)var4.get(Integer.valueOf(var26))).intValue();
         var24 += var27;
         if(var26 > var22) {
            var22 = var26;
         }

         if(var24 > var19) {
            return var22;
         }
      }

      return var22;
   }

   private int h() {
      int var1 = 1 << this.P;
      if(var1 < 8) {
         var1 = 8;
      }

      return var1;
   }

   private int[] i(int var1) {
      BufferedImage var2 = new BufferedImage(16, 16, 2);
      var2.setRGB(0, 0, 16, 16, y.P, 0, 16);
      BufferedImage var3 = os.R(var2, var1);
      int[] var4 = new int[var1 * var1];
      var3.getRGB(0, 0, var1, var1, var4, 0, var1);
      return var4;
   }

   public boolean D() {
      int var1 = net.y.d.D();
      int var2 = this.L();
      return var1 == var2;
   }

   private void f(int var1, int var2) {
      this.x = -1;
      this.p = -1;
      this.l = null;
      if(this.R > 0) {
         this.x = var1 / this.R;
         this.p = var2 / this.R;
         this.l = new v[this.x * this.p];
         this.a = 1.0D / (double)this.x;
         this.h = 1.0D / (double)this.p;

         for(v var4 : this.V.values()) {
            double var5 = 0.5D / (double)var1;
            double var7 = 0.5D / (double)var2;
            double var9 = (double)Math.min(var4.q(), var4.o()) + var5;
            double var11 = (double)Math.min(var4.n(), var4.r()) + var7;
            double var13 = (double)Math.max(var4.q(), var4.o()) - var5;
            double var15 = (double)Math.max(var4.n(), var4.r()) - var7;
            int var17 = (int)(var9 / this.a);
            int var18 = (int)(var11 / this.h);
            int var19 = (int)(var13 / this.a);
            int var20 = (int)(var15 / this.h);

            for(int var21 = var17; var21 <= var19; ++var21) {
               if(var21 < this.x) {
                  for(int var22 = var18; var22 <= var20; ++var22) {
                     if(var22 < this.x) {
                        int var23 = var22 * this.x + var21;
                        this.l[var23] = var4;
                     } else {
                        z9.h("Invalid grid V: " + var22 + ", icon: " + var4.V());
                     }
                  }
               } else {
                  z9.h("Invalid grid U: " + var21 + ", icon: " + var4.V());
               }
            }
         }
      }

   }

   public v O(double var1, double var3) {
      if(this.l == null) {
         return null;
      } else {
         int var5 = (int)(var1 / this.a);
         int var6 = (int)(var3 / this.h);
         int var7 = var6 * this.x + var5;
         return var7 <= this.l.length?this.l[var7]:null;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}

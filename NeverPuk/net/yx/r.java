package net.yx;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.g4;
import net.pg;
import net.xc;
import net.xn;
import net.ne.a;
import net.nn.j;
import net.u.t;
import net.y.d;
import net.y.u1;
import net.yx.e;
import net.yx.k;
import net.yx.q;
import net.yz.m_;

public class r extends net.z.g {
   private static final m_ U = new m_("textures/gui/advancements/widgets.png");
   private static final Pattern K = Pattern.compile("(.+) \\S+");
   private final k T;
   private final xc s;
   private final g4 z;
   private final String H;
   private final int m;
   private final List i;
   private final j j;
   private r r;
   private final List l = Lists.newArrayList();
   private pg N;
   private final int o;
   private final int S;

   public r(k var1, j var2, xc var3, g4 var4) {
      this.T = var1;
      this.s = var3;
      this.z = var4;
      this.j = var2;
      this.H = var2.sO.Q(var4.s().c(), 163);
      this.o = t.M(var4.o() * 28.0F);
      this.S = t.M(var4.g() * 27.0F);
      int var5 = var3.D();
      int var6 = String.valueOf(var5).length();
      int var7 = var5 > 1?var2.sO.r("  ") + var2.sO.r("0") * var6 * 2 + var2.sO.r("/"):0;
      int var8 = 29 + var2.sO.r(this.H) + var7;
      String var9 = var4.j().c();
      this.i = this.U(var9, var8);

      for(String var11 : this.i) {
         var8 = Math.max(var8, var2.sO.r(var11));
      }

      this.m = var8 + 3 + 5;
   }

   private List U(String var1, int var2) {
      if(var1.isEmpty()) {
         return Collections.emptyList();
      } else {
         List var3 = this.j.sO.m(var1, var2);
         if(var3.size() < 2) {
            return var3;
         } else {
            String var4 = (String)var3.get(0);
            String var5 = (String)var3.get(1);
            int var6 = this.j.sO.r(var4 + ' ' + var5.split(" ")[0]);
            if(var6 - var2 <= 10) {
               return this.j.sO.m(var1, var6);
            } else {
               Matcher var7 = K.matcher(var4);
               if(var7.matches()) {
                  int var8 = this.j.sO.r(var7.group(1));
                  if(var2 - var8 <= 10) {
                     return this.j.sO.m(var1, var8);
                  }
               }

               return var3;
            }
         }
      }
   }

   @Nullable
   private r q(xc var1) {
      while(true) {
         var1 = var1.P();
         if(var1.y() != null) {
            break;
         }
      }

      if(var1.y() != null) {
         return this.T.B(var1);
      } else {
         return null;
      }
   }

   public void Q(int var1, int var2, boolean var3) {
      if(this.r != null) {
         int var4 = var1 + this.r.o + 13;
         int var5 = var1 + this.r.o + 26 + 4;
         int var6 = var2 + this.r.S + 13;
         int var7 = var1 + this.o + 13;
         int var8 = var2 + this.S + 13;
         int var9 = -16777216;
         this.Y(var5, var4, var6 - 1, var9);
         this.Y(var5 + 1, var4, var6, var9);
         this.Y(var5, var4, var6 + 1, var9);
         this.Y(var7, var5 - 1, var8 - 1, var9);
         this.Y(var7, var5 - 1, var8, var9);
         this.Y(var7, var5 - 1, var8 + 1, var9);
         this.z(var5 - 1, var8, var6, var9);
         this.z(var5 + 1, var8, var6, var9);
      }

      for(r var11 : this.l) {
         var11.Q(var1, var2, var3);
      }

   }

   public void d(int var1, int var2) {
      if(!this.z.s() || this.N != null && this.N.l()) {
         float var3 = this.N == null?0.0F:this.N.F();
         q var4;
         if(var3 >= 1.0F) {
            var4 = q.OBTAINED;
         } else {
            var4 = q.UNOBTAINED;
         }

         this.j.n().E(U);
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.C();
         this.g(var1 + this.o + 3, var2 + this.S, this.z.m().V(), 128 + var4.r() * 26, 26, 26);
         u1.A();
         this.j.K().g((a)null, this.z.C(), var1 + this.o + 8, var2 + this.S + 5);
      }

      for(r var6 : this.l) {
         var6.d(var1, var2);
      }

   }

   public void M(pg var1) {
      this.N = var1;
   }

   public void I(r var1) {
      this.l.add(var1);
   }

   public void q(int var1, int var2, float var3, int var4, int var5) {
      int[] var6 = q.c();
      int var10000 = var4 + var1 + this.o + this.m + 26;
      this.T.O();
      boolean var7 = var10000 >= e.q;
      String var8 = this.N == null?null:this.N.y();
      byte var9 = 0;
      boolean var10 = 113 - var2 - this.S - 26 <= 6 + this.i.size() * this.j.sO.R;
      float var11 = this.N == null?0.0F:this.N.F();
      int var12 = t.M(var11 * (float)this.m);
      if(Float.compare(var11, 1.0F) >= 0) {
         var12 = this.m / 2;
         q var13 = q.OBTAINED;
         q var14 = q.OBTAINED;
         q var15 = q.OBTAINED;
         net.u.d.h(new net.u.d[3]);
      }

      if(var12 < 2) {
         var12 = this.m / 2;
         q var21 = q.UNOBTAINED;
         q var24 = q.UNOBTAINED;
         q var27 = q.UNOBTAINED;
      }

      if(var12 > this.m - 2) {
         var12 = this.m / 2;
         q var22 = q.OBTAINED;
         q var25 = q.OBTAINED;
         q var28 = q.UNOBTAINED;
      }

      q var23 = q.OBTAINED;
      q var26 = q.UNOBTAINED;
      q var29 = q.UNOBTAINED;
      int var16 = this.m - var12;
      this.j.n().E(U);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.C();
      int var17 = var2 + this.S;
      int var18 = var1 + this.o;
      int var19 = 32 + this.i.size() * this.j.sO.R;
      if(!this.i.isEmpty()) {
         this.L(var18, var17 + 26 - var19, this.m, var19, 10, 200, 26, 0, 52);
         this.L(var18, var17, this.m, var19, 10, 200, 26, 0, 52);
      }

      this.g(var18, var17, 0, var23.r() * 26, var12, 26);
      this.g(var18 + var12, var17, 200 - var16, var26.r() * 26, var16, 26);
      this.g(var1 + this.o + 3, var2 + this.S, this.z.m().V(), 128 + var29.r() * 26, 26, 26);
      this.j.sO.W(this.H, (float)(var1 + this.o + 32), (float)(var2 + this.S + 9), -1, true);
      this.j.sO.W(var8, (float)(var1 + this.o + this.m - var9 - 5), (float)(var2 + this.S + 9), -1, true);
      int var20 = 0;
      if(var20 < this.i.size()) {
         this.j.sO.W((String)this.i.get(var20), (float)(var18 + 5), (float)(var2 + this.S + 9 + 17 + var20 * this.j.sO.R), -5592406, false);
         ++var20;
      }

      u1.A();
      this.j.K().g((a)null, this.z.C(), var1 + this.o + 8, var2 + this.S + 5);
   }

   protected void L(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.g(var1, var2, var8, var9, var5, var5);
      this.M(var1 + var5, var2, var3 - var5 - var5, var5, var8 + var5, var9, var6 - var5 - var5, var7);
      this.g(var1 + var3 - var5, var2, var8 + var6 - var5, var9, var5, var5);
      this.g(var1, var2 + var4 - var5, var8, var9 + var7 - var5, var5, var5);
      this.M(var1 + var5, var2 + var4 - var5, var3 - var5 - var5, var5, var8 + var5, var9 + var7 - var5, var6 - var5 - var5, var7);
      this.g(var1 + var3 - var5, var2 + var4 - var5, var8 + var6 - var5, var9 + var7 - var5, var5, var5);
      this.M(var1, var2 + var5, var5, var4 - var5 - var5, var8, var9 + var5, var6, var7 - var5 - var5);
      this.M(var1 + var5, var2 + var5, var3 - var5 - var5, var4 - var5 - var5, var8 + var5, var9 + var5, var6 - var5 - var5, var7 - var5 - var5);
      this.M(var1 + var3 - var5, var2 + var5, var5, var4 - var5 - var5, var8 + var6 - var5, var9 + var5, var6, var7 - var5 - var5);
   }

   protected void M(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = 0; var9 < var3; var9 += var7) {
         int var10 = var1 + var9;
         int var11 = Math.min(var7, var3 - var9);

         for(int var12 = 0; var12 < var4; var12 += var8) {
            int var13 = var2 + var12;
            int var14 = Math.min(var8, var4 - var12);
            this.g(var10, var13, var5, var6, var11, var14);
         }
      }

   }

   public boolean O(int var1, int var2, int var3, int var4) {
      if(!this.z.s() || this.N != null && this.N.l()) {
         int var5 = var1 + this.o;
         int var6 = var5 + 26;
         int var7 = var2 + this.S;
         int var8 = var7 + 26;
         return var3 >= var5 && var3 <= var6 && var4 >= var7 && var4 <= var8;
      } else {
         return false;
      }
   }

   public void s() {
      if(this.r == null && this.s.P() != null) {
         this.r = this.q(this.s);
         if(this.r != null) {
            this.r.I(this);
         }
      }

   }

   public int n() {
      return this.S;
   }

   public int v() {
      return this.o;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

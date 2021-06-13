package net.q;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.nn.j;
import net.q.o;
import net.u.t;
import net.v.c;
import net.y.u1;
import net.yz.m_;
import net.z.g;

public class m extends g {
   private static final m_ g = new m_("textures/gui/recipe_book.png");
   private final List Y = Lists.newArrayList();
   private boolean A;
   private int C;
   private int h;
   private j D;
   private o b;
   private s c;
   private float Q;

   public void t(j var1, o var2, int var3, int var4, int var5, int var6, float var7, c var8) {
      this.D = var1;
      this.b = var2;
      boolean var9 = var8.x();
      List var10 = var2.y(true);
      List var11 = Collections.emptyList();
      int var12 = var10.size();
      int var13 = var12 + var11.size();
      int var14 = var13 <= 16?4:5;
      int var15 = (int)Math.ceil((double)((float)var13 / (float)var14));
      this.C = var3;
      this.h = var4;
      boolean var10000 = true;
      float var17 = (float)(this.C + Math.min(var13, var14) * 25);
      float var18 = (float)(var5 + 50);
      if(var17 > var18) {
         this.C = (int)((float)this.C - var7 * (float)((int)((var17 - var18) / var7)));
      }

      float var19 = (float)(this.h + var15 * 25);
      float var20 = (float)(var6 + 50);
      if(var19 > var20) {
         this.h = (int)((float)this.h - var7 * (float)t.Y((var19 - var20) / var7));
      }

      float var21 = (float)this.h;
      float var22 = (float)(var6 - 100);
      if(var21 < var22) {
         this.h = (int)((float)this.h - var7 * (float)t.Y((var21 - var22) / var7));
      }

      this.A = true;
      this.Y.clear();

      for(int var23 = 0; var23 < var13; ++var23) {
         boolean var24 = var23 < var12;
         this.Y.add(new m.i(this.C + 4 + 25 * (var23 % var14), this.h + 5 + 25 * (var23 / var14), (s)var10.get(var23), var24));
      }

      this.c = null;
   }

   public o B() {
      return this.b;
   }

   public s m() {
      return this.c;
   }

   public boolean L(int var1, int var2, int var3) {
      return false;
   }

   public void K(int var1, int var2, float var3) {
      if(this.A) {
         this.Q += var3;
         u1.A();
         net.y.d.C();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.D.n().E(g);
         net.y.d.c();
         net.y.d.O(0.0F, 0.0F, 170.0F);
         int var4 = this.Y.size() <= 16?4:5;
         int var5 = Math.min(this.Y.size(), var4);
         int var6 = t.Y((float)this.Y.size() / (float)var4);
         boolean var10000 = true;
         var10000 = true;
         var10000 = true;
         var10000 = true;
         this.c(var5, var6, 24, 4, 82, 208);
         net.y.d.E();
         u1.m();

         for(m.i var12 : this.Y) {
            var12.Z(this.D, var1, var2, var3);
         }

         net.y.d.Y();
      }

   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      o.r();
      this.g(this.C, this.h, var5, var6, var4, var4);
      this.g(this.C + var4 * 2 + var1 * var3, this.h, var5 + var3 + var4, var6, var4, var4);
      this.g(this.C, this.h + var4 * 2 + var2 * var3, var5, var6 + var3 + var4, var4, var4);
      this.g(this.C + var4 * 2 + var1 * var3, this.h + var4 * 2 + var2 * var3, var5 + var3 + var4, var6 + var3 + var4, var4, var4);
      int var8 = 0;
      if(var8 < var1) {
         this.g(this.C + var4 + var8 * var3, this.h, var5 + var4, var6, var3, var4);
         this.g(this.C + var4 + (var8 + 1) * var3, this.h, var5 + var4, var6, var4, var4);
         int var9 = 0;
         if(var9 < var2) {
            this.g(this.C, this.h + var4 + var9 * var3, var5, var6 + var4, var4, var3);
            this.g(this.C, this.h + var4 + (var9 + 1) * var3, var5, var6 + var4, var4, var4);
            this.g(this.C + var4 + var8 * var3, this.h + var4 + var9 * var3, var5 + var4, var6 + var4, var3, var3);
            this.g(this.C + var4 + (var8 + 1) * var3, this.h + var4 + var9 * var3, var5 + var4, var6 + var4, var4, var3);
            this.g(this.C + var4 + var8 * var3, this.h + var4 + (var9 + 1) * var3, var5 + var4, var6 + var4, var3, var4);
            this.g(this.C + var4 + (var8 + 1) * var3 - 1, this.h + var4 + (var9 + 1) * var3 - 1, var5 + var4, var6 + var4, var4 + 1, var4 + 1);
            if(var8 == var1 - 1) {
               this.g(this.C + var4 * 2 + var1 * var3, this.h + var4 + var9 * var3, var5 + var3 + var4, var6 + var4, var4, var3);
               this.g(this.C + var4 * 2 + var1 * var3, this.h + var4 + (var9 + 1) * var3, var5 + var3 + var4, var6 + var4, var4, var4);
            }

            ++var9;
         }

         this.g(this.C + var4 + var8 * var3, this.h + var4 * 2 + var2 * var3, var5 + var4, var6 + var3 + var4, var3, var4);
         this.g(this.C + var4 + (var8 + 1) * var3, this.h + var4 * 2 + var2 * var3, var5 + var4, var6 + var3 + var4, var4, var4);
         ++var8;
      }

   }

   public void M(boolean var1) {
      this.A = var1;
   }

   public boolean m() {
      return this.A;
   }

   private static xn b(xn var0) {
      return var0;
   }

   class i extends net.z.m {
      private final s I;
      private final boolean n;

      public i(int var2, int var3, s var4, boolean var5) {
         super(0, var2, var3, "");
         this.s = 24;
         this.h = 24;
         this.I = var4;
         this.n = var5;
      }

      public void Z(j var1, int var2, int var3, float var4) {
         o.r();
         u1.A();
         net.y.d.m();
         var1.n().E(m.g);
         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         int var6 = 152;
         if(!this.n) {
            var6 += 26;
         }

         int var7 = 78;
         if(this.P) {
            var7 += 26;
         }

         this.g(this.D, this.R, var6, var7, this.s, this.h);
         int var8 = 3;
         int var9 = 3;
         if(this.I instanceof net.cr.j) {
            net.cr.j var10 = (net.cr.j)this.I;
            var8 = var10.M();
            var9 = var10.n();
         }

         Iterator var21 = this.I.p().iterator();
         int var11 = 0;
         int var12 = 3 + var11 * 7;
         int var13 = 0;
         if(var21.hasNext()) {
            ks[] var14 = ((net.cr.l)var21.next()).x();
            if(var14.length != 0) {
               int var15 = 3 + var13 * 7;
               net.y.d.c();
               float var10002 = 0.42F;
               int var17 = (int)((float)(this.D + var15) / 0.42F - 3.0F);
               int var18 = (int)((float)(this.R + var12) / 0.42F - 3.0F);
               net.y.d.W(0.42F, 0.42F, 1.0F);
               net.y.d.K();
               var1.K().M(var14[t.M(m.this.Q / 30.0F) % var14.length], var17, var18);
               net.y.d.i();
               net.y.d.Y();
            }
         }

         ++var13;
         net.u.d.h(new net.u.d[2]);
         ++var11;
         net.y.d.d();
         u1.m();
      }

      // $FF: synthetic method
      static s access$000(m.i var0) {
         return var0.I;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}

package net.ns;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.ns.b;
import net.ns.i;

public class i9 {
   private net.cn.z Z;
   private net.nf.i g;
   private net.nf.i z;
   private final b p;
   private final List N;
   private static int[] m;

   protected i9() {
      this.p = new b(this);
      this.N = Lists.newArrayList(new i[]{net.nb.x.G, net.nb.x.v, net.nb.x.s, net.nb.x.T, net.nb.x.x, net.nb.x.e, net.nb.x.w});
   }

   private i9(long var1, net.yv.j var3, String var4) {
      this();
      if(var3 == net.yv.j.C && !var4.isEmpty()) {
         this.Z = net.cn.z.P(var4).n();
      }

      net.nf.i[] var5 = net.nf.i.x(var1, var3, this.Z);
      this.g = var5[0];
      this.z = var5[1];
   }

   public i9(net.cg.z var1) {
      this(var1.D(), var1.h(), var1.X());
   }

   public List n() {
      return this.N;
   }

   public i b(net.u.j var1) {
      return this.L(var1, (i)null);
   }

   public i L(net.u.j var1, i var2) {
      return this.p.T(var1.t(), var1.y(), var2);
   }

   public float H(float var1, int var2) {
      return var1;
   }

   public i[] U(i[] var1, int var2, int var3, int var4, int var5) {
      net.nf.r.d();
      if(var1.length < var4 * var5) {
         var1 = new i[var4 * var5];
      }

      int[] var6 = this.g.Y(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1[var7] = i.z(var6[var7], net.nb.x.Q);
      }

      return var1;
   }

   public i[] h(@Nullable i[] var1, int var2, int var3, int var4, int var5) {
      return this.y(var1, var2, var3, var4, var5, true);
   }

   public i[] y(@Nullable i[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      net.nf.r.d();
      if(var1.length < var4 * var5) {
         var1 = new i[var4 * var5];
      }

      if(var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         i[] var9 = this.p.i(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.z.Y(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = i.z(var7[var8], net.nb.x.Q);
         }

         return var1;
      }
   }

   public boolean q(int var1, int var2, int var3, List var4) {
      net.nf.r.d();
      int var6 = var1 - var3 >> 2;
      M();
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.g.Y(var6, var7, var10, var11);
      int var13 = 0;
      if(var13 < var10 * var11) {
         i var14 = i.F(var12[var13]);
         if(!var4.contains(var14)) {
            return false;
         }

         ++var13;
      }

      return true;
   }

   @Nullable
   public net.u.j R(int var1, int var2, int var3, List var4, Random var5) {
      net.nf.r.d();
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.g.Y(var6, var7, var10, var11);
      net.u.j var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var10 * var11; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         i var18 = i.F(var12[var15]);
         if(var4.contains(var18) && var5.nextInt(var14 + 1) == 0) {
            var13 = new net.u.j(var16, 0, var17);
            ++var14;
         }
      }

      return var13;
   }

   public void M() {
      this.p.y();
   }

   public boolean a() {
      return this.Z != null && this.Z.Q >= 0;
   }

   public i S() {
      return this.Z != null && this.Z.Q >= 0?i.u(this.Z.Q):null;
   }

   public static void w(int[] var0) {
      m = var0;
   }

   public static int[] M() {
      return m;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      w(new int[3]);
   }
}

package net.ye;

import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.y0.d1;
import net.y6.ep;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class y implements wr {
   private final net.y0.d V;
   protected net.y0.o a;
   private net.y6.z r;
   private m_ D;
   private UUID A;
   private Class v;
   protected net.y0.o z;
   private net.y6.z Q;
   private m_ C;
   private UUID m;
   private Class L;

   public y(net.y0.d var1) {
      this.V = var1;
   }

   public void C(net.r.r var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      if(var1.O() != null || var1.m() != null) {
         net.y.d.F();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.nj.f var10 = var1.O();
         if(!var10.N()) {
            y.n var11 = this.h(var1, this.A, var10, this.a, this.r, this.D, this.v, var2, var3, var4, var5, var6, var7, var8, true);
            this.A = var11.Q;
            this.a = var11.O;
            this.D = var11.G;
            this.r = var11.T;
            this.v = var11.w;
         }

         net.nj.f var13 = var1.m();
         if(!var13.N()) {
            y.n var12 = this.h(var1, this.m, var13, this.z, this.Q, this.C, this.L, var2, var3, var4, var5, var6, var7, var8, false);
            this.m = var12.Q;
            this.z = var12.O;
            this.C = var12.G;
            this.Q = var12.T;
            this.L = var12.w;
         }

         net.y.d.g();
      }

   }

   private y.n h(net.r.r var1, @Nullable UUID var2, net.nj.f var3, net.y0.o var4, net.y6.z var5, m_ var6, Class var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, boolean var15) {
      if(!var2.equals(var3.R("UUID"))) {
         var2 = var3.R("UUID");
         var7 = net.ne.v.C(var3.J("id"));
         if(var7 == net.yn.k.class) {
            var4 = new d1(this.V);
            var5 = new ep();
            var6 = d1.d[var3.P("Variant")];
         }
      }

      ((net.y0.o)var4).i(var6);
      net.y.d.c();
      float var16 = var1.Q()?-1.3F:-1.5F;
      float var17 = 0.4F;
      net.y.d.O(var17, var16, 0.0F);
      if(var7 == net.yn.k.class) {
         var11 = 0.0F;
      }

      ((net.y6.z)var5).x(var1, var8, var9, var10);
      ((net.y6.z)var5).p(var8, var9, var11, var12, var13, var14, var1);
      ((net.y6.z)var5).V(var1, var8, var9, var11, var12, var13, var14);
      net.y.d.Y();
      return new y.n(var2, (net.y0.o)var4, (net.y6.z)var5, var6, var7);
   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }

   class n {
      public UUID Q;
      public net.y0.o O;
      public net.y6.z T;
      public m_ G;
      public Class w;

      public n(UUID var2, net.y0.o var3, net.y6.z var4, m_ var5, Class var6) {
         this.Q = var2;
         this.O = var3;
         this.T = var4;
         this.G = var5;
         this.w = var6;
      }
   }
}

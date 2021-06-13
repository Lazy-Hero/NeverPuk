package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.z4;
import net.yz.a5;
import net.yz.aq;

public class zq extends z4 {
   public static final net.yr.o O = net.yr.o.k("has_record");

   public static void u(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.c(zq.a.class, new String[]{"RecordItem"}));
   }

   protected zq() {
      super(net.y1.l.S, net.y1.h.W);
      this.r(this.b.T().s(O, Boolean.valueOf(false)));
      this.f(net.ys.r.X);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(((Boolean)var3.i(O)).booleanValue()) {
         this.v(var1, var2, var3);
         var3 = var3.s(O, Boolean.valueOf(false));
         var1.k(var2, var3, 2);
         return true;
      } else {
         return false;
      }
   }

   public void L(net.yv.r var1, net.u.j var2, net.yw.n var3, ks var4) {
      net.ni.v var5 = var1.L(var2);
      if(var5 instanceof zq.a) {
         ((zq.a)var5).t(var4.s());
         var1.k(var2, var3.s(O, Boolean.valueOf(true)), 2);
      }

   }

   private void v(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!var1.x) {
         net.ni.v var5 = var1.L(var2);
         if(var5 instanceof zq.a) {
            zq.a var6 = (zq.a)var5;
            ks var7 = var6.o();
            if(!var7.B()) {
               var1.s(1010, var2, 0);
               var1.O(var2, (net.yz.a)null);
               var6.t(ks.a);
               float var10000 = 0.7F;
               double var9 = (double)(var1.G.nextFloat() * 0.7F) + 0.15000000596046448D;
               double var11 = (double)(var1.G.nextFloat() * 0.7F) + 0.06000000238418579D + 0.6D;
               double var13 = (double)(var1.G.nextFloat() * 0.7F) + 0.15000000596046448D;
               ks var15 = var7.s();
               net.nm.i var16 = new net.nm.i(var1, (double)var2.t() + var9, (double)var2.h() + var11, (double)var2.y() + var13, var15);
               var16.b();
               var1.S(var16);
            }
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.v(var1, var2, var3);
      super.V(var1, var2, var3);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      if(!var1.x) {
         super.P(var1, var2, var3, var4, 0);
      }

   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new zq.a();
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      net.ni.v var4 = var2.L(var3);
      if(var4 instanceof zq.a) {
         ks var5 = ((zq.a)var4).o();
         if(!var5.B()) {
            return net.n0.y.h(var5.Z()) + 1 - net.n0.y.h(net.nb.j.a);
         }
      }

      return 0;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.yw.n D(int var1) {
      return this.p().s(O, Boolean.valueOf(true));
   }

   public int d(net.yw.n var1) {
      return ((Boolean)var1.i(O)).booleanValue()?1:0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{O});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class a extends net.ni.v {
      private ks N = ks.a;

      public void G(net.nj.f var1) {
         g3.v.w();
         super.G(var1);
         if(var1.K("RecordItem", 10)) {
            this.t(new ks(var1.o("RecordItem")));
         }

         if(var1.P("Record") > 0) {
            this.t(new ks(net.n0.y.k(var1.P("Record"))));
         }

      }

      public net.nj.f b(net.nj.f var1) {
         int[] var2 = g3.v.w();
         super.b(var1);
         if(!this.o().B()) {
            var1.K("RecordItem", this.o().Z(new net.nj.f()));
         }

         return var1;
      }

      public ks o() {
         return this.N;
      }

      public void t(ks var1) {
         this.N = var1;
         this.W();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}

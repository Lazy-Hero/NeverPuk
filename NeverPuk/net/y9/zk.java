package net.y9;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yz.a5;
import net.yz.ai;
import net.yz.aq;

public class zk extends z4 {
   private static final List Q = Lists.newArrayList(new net.yz.a[]{net.nb.l.we, net.nb.l.Hk, net.nb.l.Mb, net.nb.l.Ds, net.nb.l.oa, net.nb.l.Cb, net.nb.l.h, net.nb.l.wF, net.nb.l.H9, net.nb.l.Hm});

   public zk() {
      super(net.y1.l.S);
      this.f(net.ys.r.i);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      g3.v.w();
      boolean var7 = var2.B(var3);
      net.ni.v var8 = var2.L(var3);
      if(var8 instanceof net.ni.d) {
         net.ni.d var9 = (net.ni.d)var8;
         if(var9.C != var7) {
            if(var7) {
               var9.S(var2, var3);
            }

            var9.C = var7;
         }
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(var1.x) {
         return true;
      } else {
         net.ni.v var11 = var1.L(var2);
         if(var11 instanceof net.ni.d) {
            net.ni.d var12 = (net.ni.d)var11;
            var12.w();
            var12.S(var1, var2);
            var4.S(net.v.q.gP);
         }

         return true;
      }
   }

   public void w(net.yv.r var1, net.u.j var2, net.r.r var3) {
      if(!var1.x) {
         net.ni.v var4 = var1.L(var2);
         if(var4 instanceof net.ni.d) {
            ((net.ni.d)var4).S(var1, var2);
            var3.S(net.v.q.P);
         }
      }

   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.d();
   }

   private net.yz.a A(int var1) {
      if(var1 >= Q.size()) {
         var1 = 0;
      }

      return (net.yz.a)Q.get(var1);
   }

   public boolean T(net.yw.n var1, net.yv.r var2, net.u.j var3, int var4, int var5) {
      float var6 = (float)Math.pow(2.0D, (double)(var5 - 12) / 12.0D);
      var2.M((net.r.r)null, var3, this.A(var4), net.yz.p.RECORDS, 3.0F, var6);
      var2.n(ai.NOTE, (double)var3.t() + 0.5D, (double)var3.h() + 1.2D, (double)var3.y() + 0.5D, (double)var5 / 24.0D, 0.0D, 0.0D, new int[0]);
      return true;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

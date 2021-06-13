package net.n0;

import net.b2;
import net.xn;
import net.n0.k7;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class yt extends y {
   public final int m;
   private final int W;
   private final float D;
   private final boolean R;
   private boolean z;
   private net.n_.i p;
   private float a;

   public yt(int var1, float var2, boolean var3) {
      this.m = 32;
      this.W = var1;
      this.R = var3;
      this.D = var2;
      this.M(net.ys.r.A);
   }

   public yt(int var1, boolean var2) {
      this(var1, 0.6F, var2);
   }

   public ks V(ks var1, net.yv.r var2, net.ne.a var3) {
      int[] var4 = kw.b();
      if(var3 instanceof net.r.r) {
         net.r.r var5 = (net.r.r)var3;
         var5.e().f(this, var1);
         var2.L((net.r.r)null, var5.b, var5.hS, var5.hr, net.nb.l.MM, net.yz.p.PLAYERS, 0.5F, var2.G.nextFloat() * 0.1F + 0.9F);
         this.u(var1, var2, var5);
         var5.S(net.v.q.H(this));
         if(var5 instanceof net.r.h) {
            b2.j.l((net.r.h)var5, var1);
         }
      }

      var1.H(1);
      return var1;
   }

   protected void u(ks var1, net.yv.r var2, net.r.r var3) {
      if(!var2.x && this.p != null && var2.G.nextFloat() < this.a) {
         var3.o((net.n_.i)(new net.n_.i(this.p)));
      }

   }

   public int K(ks var1) {
      return 32;
   }

   public k7 g(ks var1) {
      return k7.EAT;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      if(var2.h(this.z)) {
         var2.T(var3);
         return new am(ad.SUCCESS, var5);
      } else {
         return new am(ad.FAIL, var5);
      }
   }

   public int Z(ks var1) {
      return this.W;
   }

   public float Q(ks var1) {
      return this.D;
   }

   public boolean K() {
      return this.R;
   }

   public yt b(net.n_.i var1, float var2) {
      this.p = var1;
      this.a = var2;
      return this;
   }

   public yt r() {
      this.z = true;
      return this;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

package net.y9;

import net.n0.ks;
import net.y9.g3;
import net.y9.r1;
import net.y9.rw;
import net.yv.o8;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r8 extends r1 {
   public static final net.yr.g v = rw.N;
   public static final net.yr.l F = net.yr.l.J("damage", 0, 2);
   protected static final net.u.e c = new net.u.e(0.0D, 0.0D, 0.125D, 1.0D, 1.0D, 0.875D);
   protected static final net.u.e H = new net.u.e(0.125D, 0.0D, 0.0D, 0.875D, 1.0D, 1.0D);
   protected static final Logger W = LogManager.getLogger();

   protected r8() {
      super(net.y1.l.Q);
      this.r(this.b.T().s(v, aq.NORTH).s(F, Integer.valueOf(0)));
      this.R(0);
      this.f(net.ys.r.X);
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      g3.v.w();
      aq var10 = var8.V().R();
      return super.U(var1, var2, var3, var4, var5, var6, var7, var8).s(v, var10).s(F, Integer.valueOf(var7 >> 2));
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(!var1.x) {
         var4.x((net.yv.z)(new r8.e(var1, var2)));
      }

      return true;
   }

   public int z(net.yw.n var1) {
      return ((Integer)var1.i(F)).intValue();
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      aq var4 = (aq)var1.i(v);
      return var4.r() == aq.l.X?c:H;
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this));
      var2.add(new ks(this, 1, 1));
      var2.add(new ks(this, 1, 2));
   }

   protected void l(net.nm.v var1) {
      var1.x(true);
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.yw.n var4) {
      var1.s(1031, var2, 0);
   }

   public void j(net.yv.r var1, net.u.j var2) {
      var1.s(1029, var2, 0);
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   public net.yw.n D(int var1) {
      return this.p().s(v, aq.Q(var1 & 3)).s(F, Integer.valueOf((var1 & 15) >> 2));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(v)).u();
      var2 = var2 | ((Integer)var1.i(F)).intValue() << 2;
      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      return var1.Q() != this?var1:var1.s(v, var2.d((aq)var1.i(v)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{v, F});
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static class e implements net.yv.z {
      private final net.yv.r G;
      private final net.u.j T;

      public e(net.yv.r var1, net.u.j var2) {
         this.G = var1;
         this.T = var2;
      }

      public String Q() {
         return "anvil";
      }

      public boolean H() {
         return false;
      }

      public net.cb.t b() {
         return new net.cb.h(net.nb.f.uc.j() + ".name", new Object[0]);
      }

      public net.nl.v A(net.r.i var1, net.r.r var2) {
         return new net.nl.r(var1, this.G, this.T, var2);
      }

      public String H() {
         return "minecraft:anvil";
      }
   }
}

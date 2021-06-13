package net.nm;

import io.netty.buffer.ByteBuf;
import net.xn;
import net.k.y;
import net.nm.w;
import net.yz.m_;

public class p extends w {
   private static final net.k.v vO = net.k.n.q(p.class, y.J);
   private static final net.k.v va = net.k.n.q(p.class, y.R);
   private final net.ni.w vv = new net.ni.w() {
      public void V() {
         p.this.A().d(p.vO, this.v());
         p.this.A().d(p.va, this.D());
      }

      public int o() {
         return 1;
      }

      public void L(ByteBuf var1) {
         var1.writeInt(p.this.G());
      }

      public net.u.j z() {
         return new net.u.j(p.this.b, p.this.hS + 0.5D, p.this.hr);
      }

      public net.u.r A() {
         return new net.u.r(p.this.b, p.this.hS, p.this.hr);
      }

      public net.yv.r T() {
         return p.this.hl;
      }

      public net.ne.l P() {
         return p.this;
      }

      public net.nx.f E() {
         return p.this.hl.v();
      }
   };
   private int vb;

   public p(net.yv.r var1) {
      super(var1);
   }

   public p(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void J(net.c0.d var0) {
      w.L(var0, p.class);
      var0.U(net.c0.q.ENTITY, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            boolean var4 = w.h.u();
            if(net.ni.v.p(net.ni.q.class).equals(new m_(var2.J("id")))) {
               var2.b("id", "Control");
               var1.w(net.c0.q.BLOCK_ENTITY, var2, var3);
               var2.b("id", "MinecartCommandBlock");
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   protected void g() {
      super.g();
      this.A().r(vO, "");
      this.A().r(va, new net.cb.l(""));
   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      this.vv.f(var1);
      this.A().d(vO, this.o().v());
      this.A().d(va, this.o().D());
   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      this.vv.E(var1);
   }

   public w.h R() {
      return w.h.COMMAND_BLOCK;
   }

   public net.yw.n M() {
      return net.nb.f.i.p();
   }

   public net.ni.w o() {
      return this.vv;
   }

   public void K(int var1, int var2, int var3, boolean var4) {
      boolean var5 = w.h.s();
      if(var4 && this.x - this.vb >= 4) {
         this.o().K(this.hl);
         this.vb = this.x;
      }

   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      this.vv.y(var1);
      return false;
   }

   public void O(net.k.v var1) {
      w.h.s();
      super.O(var1);
      if(va.equals(var1)) {
         this.vv.u((net.cb.t)this.A().a(va));
      } else if(vO.equals(var1)) {
         this.vv.a((String)this.A().a(vO));
      }

   }

   public boolean O() {
      return true;
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}

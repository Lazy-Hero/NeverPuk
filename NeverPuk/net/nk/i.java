package net.nk;

import net.xn;
import net.n0.k1;
import net.n0.ks;
import net.nk.fc;
import net.nk.n;

public abstract class i extends net.ne.s implements fc {
   private static String[] K8;

   public i(net.yv.r var1) {
      super(var1);
      this.p0 = 5;
   }

   public net.yz.p E() {
      return net.yz.p.HOSTILE;
   }

   public void d() {
      this.V();
      float var1 = this.d();
      if(var1 > 0.5F) {
         this.AP += 2;
      }

      super.d();
   }

   public void A() {
      super.A();
      if(!this.hl.x && this.hl.k() == net.yv.l.PEACEFUL) {
         this.B();
      }

   }

   protected net.yz.a X() {
      return net.nb.l.op;
   }

   protected net.yz.a q() {
      return net.nb.l.Du;
   }

   public boolean H(net.yz.z var1, float var2) {
      return !this.w(var1) && super.H(var1, var2);
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.HE;
   }

   protected net.yz.a r() {
      return net.nb.l.ox;
   }

   protected net.yz.a s(int var1) {
      return var1 > 4?net.nb.l.H2:net.nb.l.DB;
   }

   public boolean S(net.ne.l var1) {
      n.o.y();
      float var3 = (float)this.t(net.ne.d.S).K();
      int var4 = 0;
      if(var1 instanceof net.ne.a) {
         var3 += net.c1.y.M(this.S(), ((net.ne.a)var1).g());
         var4 = var4 + net.c1.y.f(this);
      }

      boolean var5 = var1.H(net.yz.z.O(this), var3);
      if(var5) {
         int var6 = net.c1.y.P(this);
         if(var6 > 0) {
            var1.n(var6 * 4);
         }

         if(var1 instanceof net.r.r) {
            net.r.r var7 = (net.r.r)var1;
            ks var8 = this.S();
            ks var9 = var7.F()?var7.t():ks.a;
            if(!var8.B() && !var9.B() && var8.Z() instanceof k1 && var9.Z() == net.nb.j.Yl) {
               float var10 = 0.25F + (float)net.c1.y.d(this) * 0.05F;
               if(this.p.nextFloat() < var10) {
                  var7.H().V(net.nb.j.Yl, 100);
                  this.hl.k(var7, (byte)30);
               }
            }
         }

         this.q(this, var1);
      }

      return var5;
   }

   public float O(net.u.j var1) {
      return 0.5F - this.hl.u(var1);
   }

   protected boolean D() {
      net.u.j var1 = new net.u.j(this.b, this.i().u, this.hr);
      if(this.hl.d(net.yv.w.SKY, var1) > this.p.nextInt(32)) {
         return false;
      } else {
         int var2 = this.hl.y(var1);
         if(this.hl.V()) {
            int var3 = this.hl.y();
            this.hl.U(10);
            var2 = this.hl.y(var1);
            this.hl.U(var3);
         }

         return var2 <= this.p.nextInt(8);
      }
   }

   public boolean l4() {
      return this.hl.k() != net.yv.l.PEACEFUL && this.D() && super.l4();
   }

   protected void W() {
      super.W();
      this.T().i(net.ne.d.S);
   }

   protected boolean W() {
      return true;
   }

   public boolean K(net.r.r var1) {
      return true;
   }

   public static void h(String[] var0) {
      K8 = var0;
   }

   public static String[] n() {
      return K8;
   }

   private static xn f(xn var0) {
      return var0;
   }

   static {
      if(n() != null) {
         h(new String[5]);
      }

   }
}

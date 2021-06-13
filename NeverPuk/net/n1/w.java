package net.n1;

import net.xn;
import net.c0.d;
import net.k.n;
import net.k.v;
import net.n1.m;
import net.n1.o;
import net.n_.i;
import net.yv.r;

public class w extends m {
   private static final v ln = n.q(w.class, net.k.y.f);

   public w(r var1) {
      super(var1);
      this.S(0.3125F, 0.3125F);
   }

   public w(r var1, net.ne.a var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.S(0.3125F, 0.3125F);
   }

   public static void j(d var0) {
      m.p(var0, "WitherSkull");
   }

   protected float U() {
      return this.K()?0.73F:super.U();
   }

   public w(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.S(0.3125F, 0.3125F);
   }

   public boolean a() {
      return false;
   }

   public float x(net.yv.u var1, r var2, net.u.j var3, net.yw.n var4) {
      float var5 = super.x(var1, var2, var3, var4);
      net.y9.l var6 = var4.Q();
      if(this.K() && net.a.z.J(var6)) {
         var5 = Math.min(0.8F, var5);
      }

      return var5;
   }

   protected void t(net.u.m var1) {
      String var2 = o.s.H();
      if(!this.hl.x) {
         if(var1.e != null) {
            label29: {
               if(this.U0 != null) {
                  if(!var1.e.H(net.yz.z.O(this.U0), 8.0F)) {
                     break label29;
                  }

                  if(var1.e.P()) {
                     this.q(this.U0, var1.e);
                  }

                  this.U0.d(5.0F);
               }

               var1.e.H(net.yz.z.B, 5.0F);
            }

            if(var1.e instanceof net.ne.a) {
               byte var3 = 0;
               if(this.hl.k() == net.yv.l.NORMAL) {
                  var3 = 10;
               }

               if(this.hl.k() == net.yv.l.HARD) {
                  var3 = 40;
               }

               ((net.ne.a)var1.e).o(new i(net.nb.b.e, 20 * var3, 1));
            }
         }

         this.hl.c(this, this.b, this.hS, this.hr, 1.0F, false, this.hl.N().b("mobGriefing"));
         this.B();
      }

   }

   public boolean w() {
      return false;
   }

   public boolean H(net.yz.z var1, float var2) {
      return false;
   }

   protected void g() {
      this.G.r(ln, Boolean.valueOf(false));
   }

   public boolean K() {
      return ((Boolean)this.G.a(ln)).booleanValue();
   }

   public void m(boolean var1) {
      this.G.d(ln, Boolean.valueOf(var1));
   }

   protected boolean E() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

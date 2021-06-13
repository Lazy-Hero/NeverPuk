package net.n1;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n1.o;
import net.n1.t;
import net.n_.i;
import net.nj.e;
import net.yv.d;
import net.yv.r;
import net.yz.ai;
import net.yz.aq;

public class a extends net.ne.l {
   private net.ne.a Wa;
   private net.ne.l WN;
   @Nullable
   private aq W5;
   private int WG;
   private double WO;
   private double Wz;
   private double Wd;
   @Nullable
   private UUID Wv;
   private net.u.j WJ;
   @Nullable
   private UUID Wf;
   private net.u.j Wc;

   public a(r var1) {
      super(var1);
      this.S(0.3125F, 0.3125F);
      this.r = true;
   }

   public net.yz.p E() {
      return net.yz.p.HOSTILE;
   }

   public a(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1);
      this.S(var2, var4, var6, this.hN, this.V);
      this.hf = var8;
      this.K = var10;
      this.J = var12;
   }

   public a(r var1, net.ne.a var2, net.ne.l var3, aq.l var4) {
      this(var1);
      this.Wa = var2;
      net.u.j var5 = new net.u.j(var2);
      double var6 = (double)var5.t() + 0.5D;
      double var8 = (double)var5.h() + 0.5D;
      double var10 = (double)var5.y() + 0.5D;
      this.S(var6, var8, var10, this.hN, this.V);
      this.WN = var3;
      this.W5 = aq.UP;
      this.k(var4);
   }

   protected void I(net.nj.f var1) {
      if(this.Wa != null) {
         net.u.j var2 = new net.u.j(this.Wa);
         net.nj.f var3 = e.E(this.Wa.O());
         var3.r("X", var2.t());
         var3.r("Y", var2.h());
         var3.r("Z", var2.y());
         var1.K("Owner", var3);
      }

      if(this.WN != null) {
         net.u.j var4 = new net.u.j(this.WN);
         net.nj.f var5 = e.E(this.WN.O());
         var5.r("X", var4.t());
         var5.r("Y", var4.h());
         var5.r("Z", var4.y());
         var1.K("Target", var5);
      }

      if(this.W5 != null) {
         var1.r("Dir", this.W5.w());
      }

      var1.r("Steps", this.WG);
      var1.a("TXD", this.WO);
      var1.a("TYD", this.Wz);
      var1.a("TZD", this.Wd);
   }

   protected void o(net.nj.f var1) {
      this.WG = var1.P("Steps");
      this.WO = var1.g("TXD");
      this.Wz = var1.g("TYD");
      this.Wd = var1.g("TZD");
      if(var1.K("Dir", 99)) {
         this.W5 = aq.l(var1.P("Dir"));
      }

      if(var1.K("Owner", 10)) {
         net.nj.f var2 = var1.o("Owner");
         this.Wv = e.O(var2);
         this.WJ = new net.u.j(var2.P("X"), var2.P("Y"), var2.P("Z"));
      }

      if(var1.K("Target", 10)) {
         net.nj.f var3 = var1.o("Target");
         this.Wf = e.O(var3);
         this.Wc = new net.u.j(var3.P("X"), var3.P("Y"), var3.P("Z"));
      }

   }

   protected void g() {
   }

   private void v(@Nullable aq var1) {
      this.W5 = var1;
   }

   private void k(@Nullable aq.l var1) {
      double var2 = 0.5D;
      net.u.j var4;
      if(this.WN == null) {
         var4 = (new net.u.j(this)).b();
      } else {
         var2 = (double)this.WN.m * 0.5D;
         var4 = new net.u.j(this.WN.b, this.WN.hS + var2, this.WN.hr);
      }

      double var5 = (double)var4.t() + 0.5D;
      double var7 = (double)var4.h() + var2;
      double var9 = (double)var4.y() + 0.5D;
      aq var11 = null;
      if(var4.S(this.b, this.hS, this.hr) >= 4.0D) {
         net.u.j var12 = new net.u.j(this);
         ArrayList var13 = Lists.newArrayList();
         if(var1 != aq.l.X) {
            if(var12.t() < var4.t() && this.hl.y(var12.g())) {
               var13.add(aq.EAST);
            } else if(var12.t() > var4.t() && this.hl.y(var12.H())) {
               var13.add(aq.WEST);
            }
         }

         if(var1 != aq.l.Y) {
            if(var12.h() < var4.h() && this.hl.y(var12.h())) {
               var13.add(aq.UP);
            } else if(var12.h() > var4.h() && this.hl.y(var12.b())) {
               var13.add(aq.DOWN);
            }
         }

         if(var1 != aq.l.Z) {
            if(var12.y() < var4.y() && this.hl.y(var12.d())) {
               var13.add(aq.SOUTH);
            } else if(var12.y() > var4.y() && this.hl.y(var12.D())) {
               var13.add(aq.NORTH);
            }
         }

         var11 = aq.k(this.p);
         if(var13.isEmpty()) {
            for(int var14 = 5; !this.hl.y(var12.C(var11)); --var14) {
               var11 = aq.k(this.p);
            }
         } else {
            var11 = (aq)var13.get(this.p.nextInt(var13.size()));
         }

         var5 = this.b + (double)var11.v();
         var7 = this.hS + (double)var11.z();
         var9 = this.hr + (double)var11.P();
      }

      this.v(var11);
      double var20 = var5 - this.b;
      double var21 = var7 - this.hS;
      double var16 = var9 - this.hr;
      double var18 = (double)net.u.t.R(var20 * var20 + var21 * var21 + var16 * var16);
      if(var18 == 0.0D) {
         this.WO = 0.0D;
         this.Wz = 0.0D;
         this.Wd = 0.0D;
      } else {
         this.WO = var20 / var18 * 0.15D;
         this.Wz = var21 / var18 * 0.15D;
         this.Wd = var16 / var18 * 0.15D;
      }

      this.w = true;
      this.WG = 10 + this.p.nextInt(5) * 10;
   }

   public void A() {
      String var1 = o.s.H();
      if(!this.hl.x && this.hl.k() == net.yv.l.PEACEFUL) {
         this.B();
      }

      super.A();
      if(!this.hl.x) {
         if(this.WN == null && this.Wf != null) {
            Iterator var2 = this.hl.p(net.ne.a.class, new net.u.e(this.Wc.F(-2, -2, -2), this.Wc.F(2, 2, 2))).iterator();
            if(var2.hasNext()) {
               net.ne.a var3 = (net.ne.a)var2.next();
               if(var3.O().equals(this.Wf)) {
                  this.WN = var3;
               }
            }

            this.Wf = null;
         }

         if(this.Wa == null && this.Wv != null) {
            Iterator var5 = this.hl.p(net.ne.a.class, new net.u.e(this.WJ.F(-2, -2, -2), this.WJ.F(2, 2, 2))).iterator();
            if(var5.hasNext()) {
               net.ne.a var8 = (net.ne.a)var5.next();
               if(var8.O().equals(this.Wv)) {
                  this.Wa = var8;
               }
            }

            this.Wv = null;
         }

         label344: {
            if(this.WN == null || !this.WN.P() || this.WN instanceof net.r.r && ((net.r.r)this.WN).VX()) {
               if(this.j()) {
                  break label344;
               }

               this.K -= 0.04D;
            }

            this.WO = net.u.t.F(this.WO * 1.025D, -1.0D, 1.0D);
            this.Wz = net.u.t.F(this.Wz * 1.025D, -1.0D, 1.0D);
            this.Wd = net.u.t.F(this.Wd * 1.025D, -1.0D, 1.0D);
            this.hf += (this.WO - this.hf) * 0.2D;
            this.K += (this.Wz - this.K) * 0.2D;
            this.J += (this.Wd - this.J) * 0.2D;
         }

         net.u.m var6 = t.d(this, true, false, this.Wa);
         this.a(var6);
      }

      this.t(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      t.J(this, 0.5F);
      if(this.hl.x) {
         this.hl.n(ai.END_ROD, this.b - this.hf, this.hS - this.K + 0.15D, this.hr - this.J, 0.0D, 0.0D, 0.0D, new int[0]);
      }

      if(this.WN != null && !this.WN.Z) {
         if(this.WG > 0) {
            --this.WG;
            if(this.WG == 0) {
               this.k(this.W5 == null?null:this.W5.r());
            }
         }

         if(this.W5 != null) {
            net.u.j var7 = new net.u.j(this);
            aq.l var9 = this.W5.r();
            if(this.hl.E(var7.C(this.W5), false)) {
               this.k(var9);
            }

            net.u.j var4 = new net.u.j(this.WN);
            if(var9 == aq.l.X && var7.t() == var4.t() || var9 == aq.l.Z && var7.y() == var4.y() || var9 == aq.l.Y && var7.h() == var4.h()) {
               this.k(var9);
            }
         }
      }

   }

   public boolean a() {
      return false;
   }

   public boolean p(double var1) {
      return var1 < 16384.0D;
   }

   public float d() {
      return 1.0F;
   }

   public int L() {
      return 15728880;
   }

   protected void a(net.u.m var1) {
      if(var1.e == null) {
         ((d)this.hl).q(ai.EXPLOSION_LARGE, this.b, this.hS, this.hr, 2, 0.2D, 0.2D, 0.2D, 0.0D, new int[0]);
         this.I(net.nb.l.C5, 1.0F, 1.0F);
      } else {
         boolean var2 = var1.e.H(net.yz.z.o(this, this.Wa).g(), 4.0F);
         this.q(this.Wa, var1.e);
         if(var1.e instanceof net.ne.a) {
            ((net.ne.a)var1.e).o(new i(net.nb.b.A, 200));
         }
      }

      this.B();
   }

   public boolean w() {
      return true;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(!this.hl.x) {
         this.I(net.nb.l.wW, 1.0F, 1.0F);
         ((d)this.hl).q(ai.CRIT, this.b, this.hS, this.hr, 15, 0.2D, 0.2D, 0.2D, 0.0D, new int[0]);
         this.B();
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

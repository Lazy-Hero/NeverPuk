package net.yn;

import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.z1;
import net.y9.lk;
import net.yn.h;
import net.yn.j;
import net.yn.n;
import net.yn.o;
import net.yn.w;
import net.yz.m_;

public class c extends j {
   private static final UUID WU = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final net.k.v Wf = net.k.n.q(c.class, net.k.y.d);
   private static final net.k.v WV = net.k.n.q(c.class, net.k.y.d);
   private static final String[] WA = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
   private static final String[] W3 = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
   private static final String[] WH = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
   private static final String[] Wv = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
   private String WL;
   private final String[] Wb = new String[3];

   public c(net.yv.r var1) {
      super(var1);
   }

   protected void g() {
      super.g();
      this.G.r(Wf, Integer.valueOf(0));
      this.G.r(WV, Integer.valueOf(n.NONE.d()));
   }

   public static void x(net.c0.d var0) {
      j.t(var0, c.class);
      var0.U(net.c0.q.ENTITY, new net.ng.c(c.class, new String[]{"ArmorItem"}));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Variant", this.a());
      if(!this.Nq.A(1).B()) {
         var1.K("ArmorItem", this.Nq.A(1).Z(new net.nj.f()));
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.f(var1.P("Variant"));
      if(var1.K("ArmorItem", 10)) {
         ks var2 = new ks(var1.o("ArmorItem"));
         if(!var2.B() && n.J(var2.Z())) {
            this.Nq.S(1, var2);
         }
      }

      this.IK();
   }

   public void f(int var1) {
      this.G.d(Wf, Integer.valueOf(var1));
      this.FX();
   }

   public int a() {
      return ((Integer)this.G.a(Wf)).intValue();
   }

   private void FX() {
      this.WL = null;
   }

   private void Fr() {
      int var1 = this.a();
      int var2 = (var1 & 255) % 7;
      int var3 = ((var1 & '\uff00') >> 8) % 5;
      n var4 = this.U();
      this.Wb[0] = WA[var2];
      this.Wb[1] = WH[var3];
      this.Wb[2] = var4.B();
      this.WL = "horse/" + W3[var2] + Wv[var3] + var4.P();
   }

   public String s() {
      if(this.WL == null) {
         this.Fr();
      }

      return this.WL;
   }

   public String[] L() {
      if(this.WL == null) {
         this.Fr();
      }

      return this.Wb;
   }

   protected void IK() {
      super.IK();
      this.d(this.Nq.A(1));
   }

   public void d(ks var1) {
      n var2 = n.o(var1);
      this.G.d(WV, Integer.valueOf(var2.d()));
      this.FX();
      if(!this.hl.x) {
         this.t(net.ne.d.g).o(WU);
         int var3 = var2.y();
         this.t(net.ne.d.g).g((new net.s.k(WU, "Horse armor bonus", (double)var3, 0)).A(false));
      }

   }

   public n U() {
      return n.X(((Integer)this.G.a(WV)).intValue());
   }

   public void b(z1 var1) {
      n var2 = this.U();
      super.b(var1);
      n var3 = this.U();
      if(this.x > 20 && var2 != var3 && var3 != n.NONE) {
         this.I(net.nb.l.oT, 0.5F, 1.0F);
      }

   }

   protected void w(lk var1) {
      super.w(var1);
      if(this.p.nextInt(10) == 0) {
         this.I(net.nb.l.PF, var1.m() * 0.6F, var1.X());
      }

   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t((double)this.O());
      this.t(net.ne.d.G).t(this.B());
      this.t(NA).t(this.o());
   }

   public void A() {
      super.A();
      if(this.hl.x && this.G.Z()) {
         this.G.x();
         this.FX();
      }

   }

   protected net.yz.a T() {
      super.T();
      return net.nb.l.oE;
   }

   protected net.yz.a r() {
      super.r();
      return net.nb.l.oi;
   }

   protected net.yz.a m(net.yz.z var1) {
      super.m(var1);
      return net.nb.l.Kl;
   }

   protected net.yz.a U() {
      super.U();
      return net.nb.l.PR;
   }

   protected m_ N() {
      return net.y7.p.a;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.C();
      ks var4 = var1.o((net.yz.k)var2);
      boolean var5 = !var4.B();
      if(!this.H9()) {
         if(this.Up() && var1.Q()) {
            this.t(var1);
            return true;
         }

         if(this.t()) {
            return super.R(var1, var2);
         }
      }

      if(this.H9()) {
         return super.R(var1, var2);
      } else {
         this.n(var1);
         return true;
      }
   }

   public boolean b(w var1) {
      return var1 == this?false:(!(var1 instanceof o) && !(var1 instanceof c)?false:this.Ue() && ((j)var1).Ue());
   }

   public net.ne.j r(net.ne.j var1) {
      Object var2;
      if(var1 instanceof o) {
         var2 = new h(this.hl);
      } else {
         c var3 = (c)var1;
         var2 = new c(this.hl);
         int var4 = this.p.nextInt(9);
         int var5;
         if(var4 < 4) {
            var5 = this.a() & 255;
         } else if(var4 < 8) {
            var5 = var3.a() & 255;
         } else {
            var5 = this.p.nextInt(7);
         }

         int var6 = this.p.nextInt(5);
         if(var6 < 2) {
            var5 = var5 | this.a() & '\uff00';
         } else if(var6 < 4) {
            var5 = var5 | var3.a() & '\uff00';
         } else {
            var5 = var5 | this.p.nextInt(5) << 8 & '\uff00';
         }

         ((c)var2).f(var5);
      }

      this.t(var1, (j)var2);
      return (net.ne.j)var2;
   }

   public boolean UC() {
      return true;
   }

   public boolean o(ks var1) {
      return n.J(var1.Z());
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      int var3;
      if(var2 instanceof c.w) {
         var3 = ((c.w)var2).l;
      } else {
         var3 = this.p.nextInt(7);
         var2 = new c.w(var3);
      }

      this.f(var3 | this.p.nextInt(5) << 8);
      return var2;
   }

   private static xn d(xn var0) {
      return var0;
   }

   public static class w implements net.ne.g {
      public int l;

      public w(int var1) {
         this.l = var1;
      }
   }
}

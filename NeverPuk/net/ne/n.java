package net.ne;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ne.d;
import net.ne.f;
import net.ne.l;
import net.y9.g2;
import net.yz.aq;
import net.yz.ax;
import org.apache.commons.lang3.Validate;

public abstract class n extends l {
   private static final Predicate u8 = new Predicate() {
      public boolean x(@Nullable l var1) {
         return var1 instanceof n;
      }
   };
   private int ut;
   protected net.u.j uD;
   @Nullable
   public aq uz;

   public n(net.yv.r var1) {
      super(var1);
      this.S(0.5F, 0.5F);
   }

   public n(net.yv.r var1, net.u.j var2) {
      this(var1);
      this.uD = var2;
   }

   protected void g() {
   }

   protected void b(aq var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.r().P());
      this.uz = var1;
      this.hN = (float)(this.uz.u() * 90);
      this.hq = this.hN;
      this.h();
   }

   protected void h() {
      boolean var1 = d.p();
      if(this.uz != null) {
         double var2 = (double)this.uD.t() + 0.5D;
         double var4 = (double)this.uD.h() + 0.5D;
         double var6 = (double)this.uD.y() + 0.5D;
         double var10000 = 0.46875D;
         double var10 = this.n(this.o());
         double var12 = this.n(this.E());
         var2 = var2 - (double)this.uz.v() * 0.46875D;
         var6 = var6 - (double)this.uz.P() * 0.46875D;
         var4 = var4 + var12;
         aq var14 = this.uz.i();
         var2 = var2 + var10 * (double)var14.v();
         var6 = var6 + var10 * (double)var14.P();
         this.b = var2;
         this.hS = var4;
         this.hr = var6;
         double var15 = (double)this.o();
         double var17 = (double)this.E();
         double var19 = (double)this.o();
         if(this.uz.r() == aq.l.Z) {
            var19 = 1.0D;
         }

         var15 = 1.0D;
         var15 = var15 / 32.0D;
         var17 = var17 / 32.0D;
         var19 = var19 / 32.0D;
         this.g(new net.u.e(var2 - var15, var4 - var17, var6 - var19, var2 + var15, var4 + var17, var6 + var19));
      }

   }

   private double n(int var1) {
      return var1 % 32 == 0?0.5D:0.0D;
   }

   public void A() {
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      if(this.ut++ == 100 && !this.hl.x) {
         this.ut = 0;
         if(!this.Z && !this.N()) {
            this.B();
            this.C((l)null);
         }
      }

   }

   public boolean N() {
      if(!this.hl.h(this, this.i()).isEmpty()) {
         return false;
      } else {
         int var1 = Math.max(1, this.o() / 16);
         int var2 = Math.max(1, this.E() / 16);
         net.u.j var3 = this.uD.C(this.uz.f());
         aq var4 = this.uz.i();
         net.u.j var5 = new net.u.j();

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               int var8 = (var1 - 1) / -2;
               int var9 = (var2 - 1) / -2;
               var5.V(var3).j(var4, var6 + var8).j(aq.UP, var7 + var9);
               net.yw.n var10 = this.hl.Z(var5);
               if(!var10.n().B() && !g2.R(var10)) {
                  return false;
               }
            }
         }

         return this.hl.S(this, this.i(), u8).isEmpty();
      }
   }

   public boolean w() {
      return true;
   }

   public boolean U(l var1) {
      return var1 instanceof net.r.r && this.H(net.yz.z.Q((net.r.r)var1), 0.0F);
   }

   public aq V() {
      return this.uz;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         if(!this.Z && !this.hl.x) {
            this.B();
            this.E();
            this.C(var1.v());
         }

         return true;
      }
   }

   public void N(f var1, double var2, double var4, double var6) {
      if(!this.hl.x && !this.Z && var2 * var2 + var4 * var4 + var6 * var6 > 0.0D) {
         this.B();
         this.C((l)null);
      }

   }

   public void u(double var1, double var3, double var5) {
      if(!this.hl.x && !this.Z && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.B();
         this.C((l)null);
      }

   }

   public void I(net.nj.f var1) {
      var1.D("Facing", (byte)this.uz.u());
      net.u.j var2 = this.r();
      var1.r("TileX", var2.t());
      var1.r("TileY", var2.h());
      var1.r("TileZ", var2.y());
   }

   public void o(net.nj.f var1) {
      this.uD = new net.u.j(var1.P("TileX"), var1.P("TileY"), var1.P("TileZ"));
      this.b(aq.Q(var1.R("Facing")));
   }

   public abstract int o();

   public abstract int E();

   public abstract void C(l var1);

   public abstract void a();

   public net.nm.i O(ks var1, float var2) {
      net.nm.i var3 = new net.nm.i(this.hl, this.b + (double)((float)this.uz.v() * 0.15F), this.hS + (double)var2, this.hr + (double)((float)this.uz.P() * 0.15F), var1);
      var3.b();
      this.hl.S(var3);
      return var3;
   }

   protected boolean g() {
      return false;
   }

   public void t(double var1, double var3, double var5) {
      this.uD = new net.u.j(var1, var3, var5);
      this.h();
      this.w = true;
   }

   public net.u.j r() {
      return this.uD;
   }

   public float q(net.yz.l var1) {
      if(this.uz != null && this.uz.r() != aq.l.Y) {
         switch(null.s[var1.ordinal()]) {
         case 1:
            this.uz = this.uz.f();
            break;
         case 2:
            this.uz = this.uz.i();
            break;
         case 3:
            this.uz = this.uz.R();
         }
      }

      float var2 = net.u.t.k(this.hN);
      switch(null.s[var1.ordinal()]) {
      case 1:
         return var2 + 180.0F;
      case 2:
         return var2 + 90.0F;
      case 3:
         return var2 + 270.0F;
      default:
         return var2;
      }
   }

   public float r(ax var1) {
      return this.q(var1.S(this.uz));
   }

   public void j(net.yi.e var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}

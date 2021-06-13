package net.nm;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.z3;
import net.nm.w;
import net.yv.x;
import net.yz.m_;

public abstract class u extends w implements x, net.y7.i {
   private net.yz.w nC = net.yz.w.C(36, ks.a);
   private boolean nT = true;
   private m_ nl;
   private long nc;

   public u(net.yv.r var1) {
      super(var1);
   }

   public u(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public void n(net.yz.z var1) {
      super.n(var1);
      if(this.hl.N().b("doEntityDrops")) {
         z3.q(this.hl, this, this);
      }

   }

   public boolean N() {
      for(ks var2 : this.nC) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      this.n((net.r.r)null);
      return (ks)this.nC.get(var1);
   }

   public ks W(int var1, int var2) {
      this.n((net.r.r)null);
      return net.nl.h.n(this.nC, var1, var2);
   }

   public ks S(int var1) {
      this.n((net.r.r)null);
      ks var2 = (ks)this.nC.get(var1);
      if(var2.B()) {
         return ks.a;
      } else {
         this.nC.set(var1, ks.a);
         return var2;
      }
   }

   public void S(int var1, ks var2) {
      this.n((net.r.r)null);
      this.nC.set(var1, var2);
      if(!var2.B() && var2.U() > this.m()) {
         var2.u(this.m());
      }

   }

   public void W() {
   }

   public boolean m(net.r.r var1) {
      return this.Z?false:var1.F(this) <= 64.0D;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      return true;
   }

   public int m() {
      return 64;
   }

   @Nullable
   public net.ne.l V(int var1) {
      this.nT = false;
      return super.V(var1);
   }

   public void B() {
      if(this.nT) {
         z3.q(this.hl, this, this);
      }

      super.B();
   }

   public void C(boolean var1) {
      this.nT = var1;
   }

   public static void V(net.c0.d var0, Class var1) {
      w.L(var0, var1);
      var0.U(net.c0.q.ENTITY, new net.ng.u(var1, new String[]{"Items"}));
   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      if(this.nl != null) {
         var1.b("LootTable", this.nl.toString());
         if(this.nc != 0L) {
            var1.V("LootTableSeed", this.nc);
         }
      } else {
         net.nl.h.l(var1, this.nC);
      }

   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      w.h.s();
      this.nC = net.yz.w.C(this.e(), ks.a);
      if(var1.K("LootTable", 8)) {
         this.nl = new m_(var1.J("LootTable"));
         this.nc = var1.P("LootTableSeed");
      }

      net.nl.h.W(var1, this.nC);
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      if(!this.hl.x) {
         var1.n(this);
      }

      return true;
   }

   protected void D() {
      float var1 = 0.98F;
      if(this.nl == null) {
         int var2 = 15 - net.nl.v.e(this);
         var1 += (float)var2 * 0.001F;
      }

      this.hf *= (double)var1;
      this.K *= 0.0D;
      this.J *= (double)var1;
   }

   public int e(int var1) {
      return 0;
   }

   public void Z(int var1, int var2) {
   }

   public int r() {
      return 0;
   }

   public boolean U() {
      return false;
   }

   public void P(net.yv.f var1) {
   }

   public net.yv.f z() {
      return net.yv.f.Q;
   }

   public void n(@Nullable net.r.r var1) {
      boolean var2 = w.h.s();
      if(this.nl != null) {
         net.y7.z var3 = this.hl.o().k(this.nl);
         this.nl = null;
         if(this.nc == 0L) {
            new Random();
         }

         Random var4 = new Random(this.nc);
         net.y7.r var5 = new net.y7.r((net.yv.d)this.hl);
         var5.v(var1.u());
         var3.B(this, var4, var5.w());
      }

   }

   public void T() {
      this.n((net.r.r)null);
      this.nC.clear();
   }

   public void f(m_ var1, long var2) {
      this.nl = var1;
      this.nc = var2;
   }

   public m_ j() {
      return this.nl;
   }

   private static xn c(xn var0) {
      return var0;
   }
}

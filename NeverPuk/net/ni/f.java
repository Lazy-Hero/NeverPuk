package net.ni;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.a;
import net.ni.w;
import net.yz.m_;

public abstract class f extends a implements net.y7.i {
   protected m_ B;
   protected long Y;
   protected String T;

   protected boolean W(net.nj.f var1) {
      if(var1.K("LootTable", 8)) {
         this.B = new m_(var1.J("LootTable"));
         this.Y = var1.P("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean A(net.nj.f var1) {
      if(this.B != null) {
         var1.b("LootTable", this.B.toString());
         if(this.Y != 0L) {
            var1.V("LootTableSeed", this.Y);
         }

         return true;
      } else {
         return false;
      }
   }

   public void r(@Nullable net.r.r var1) {
      int[] var2 = w.C();
      if(this.B != null) {
         net.y7.z var3 = this.J.o().k(this.B);
         this.B = null;
         if(this.Y == 0L) {
            new Random();
         }

         Random var4 = new Random(this.Y);
         net.y7.r var5 = new net.y7.r((net.yv.d)this.J);
         var5.v(var1.u());
         var3.B(this, var4, var5.w());
      }

   }

   public m_ j() {
      return this.B;
   }

   public void G(m_ var1, long var2) {
      this.B = var1;
      this.Y = var2;
   }

   public boolean H() {
      return this.T != null && !this.T.isEmpty();
   }

   public void b(String var1) {
      this.T = var1;
   }

   public ks A(int var1) {
      this.r((net.r.r)null);
      return (ks)this.p().get(var1);
   }

   public ks W(int var1, int var2) {
      this.r((net.r.r)null);
      ks var3 = net.nl.h.n(this.p(), var1, var2);
      if(!var3.B()) {
         this.W();
      }

      return var3;
   }

   public ks S(int var1) {
      this.r((net.r.r)null);
      return net.nl.h.m(this.p(), var1);
   }

   public void S(int var1, @Nullable ks var2) {
      this.r((net.r.r)null);
      this.p().set(var1, var2);
      if(var2.U() > this.m()) {
         var2.u(this.m());
      }

      this.W();
   }

   public boolean m(net.r.r var1) {
      int[] var2 = w.C();
      return this.J.L(this.S) != this?false:Double.compare(var1.o((double)this.S.t() + 0.5D, (double)this.S.h() + 0.5D, (double)this.S.y() + 0.5D), 64.0D) <= 0;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      return true;
   }

   public int e(int var1) {
      return 0;
   }

   public void Z(int var1, int var2) {
   }

   public int r() {
      return 0;
   }

   public void T() {
      this.r((net.r.r)null);
      this.p().clear();
   }

   protected abstract net.yz.w p();

   private static xn d(xn var0) {
      return var0;
   }
}

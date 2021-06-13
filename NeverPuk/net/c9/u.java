package net.c9;

import java.util.List;
import net.xn;
import net.c9.b;
import net.yz.m_;
import net.z.we;
import net.z.wz;

public abstract class u implements net.z.z {
   private static final m_ W = new m_("textures/gui/resource_packs.png");
   private static final net.cb.t L = new net.cb.h("resourcePack.incompatible", new Object[0]);
   private static final net.cb.t S = new net.cb.h("resourcePack.incompatible.old", new Object[0]);
   private static final net.cb.t v = new net.cb.h("resourcePack.incompatible.new", new Object[0]);
   protected final net.nn.j U;
   protected final we D;

   public u(we var1) {
      this.D = var1;
      this.U = net.nn.j.b();
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      b.K();
      int var11 = this.I();
      if(var11 != 3) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.z.g.u(var2 - 1, var3 - 1, var2 + var4 - 9, var3 + var5 + 1, -8978432);
      }

      this.M();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.z.g.r((float)var2, (float)var3, 0.0F, 0.0F, 32.0F, 32.0F, 32.0F, 32.0F);
      String var12 = this.z();
      String var13 = this.v();
      if(this.U() && (this.U.T.iI || var8)) {
         this.U.n().E(W);
         net.z.g.u(var2, var3, var2 + 32, var3 + 32, -1601138544);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         int var14 = var6 - var2;
         int var15 = var7 - var3;
         if(var11 < 3) {
            var12 = L.c();
            var13 = S.c();
            net.u.d.h(new net.u.d[2]);
         }

         if(var11 > 3) {
            var12 = L.c();
            var13 = v.c();
         }

         if(this.m()) {
            if(var14 < 32) {
               net.z.g.r((float)var2, (float)var3, 0.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            net.z.g.r((float)var2, (float)var3, 0.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }

         if(this.G()) {
            if(var14 < 16) {
               net.z.g.r((float)var2, (float)var3, 32.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            net.z.g.r((float)var2, (float)var3, 32.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }

         if(this.P()) {
            if(var14 < 32 && var14 > 16 && var15 < 16) {
               net.z.g.r((float)var2, (float)var3, 96.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            net.z.g.r((float)var2, (float)var3, 96.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }

         if(this.T()) {
            if(var14 < 32 && var14 > 16 && var15 > 16) {
               net.z.g.r((float)var2, (float)var3, 64.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            net.z.g.r((float)var2, (float)var3, 64.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }
      }

      int var17 = this.U.sO.r(var12);
      if(var17 > 157) {
         var12 = this.U.sO.Q(var12, 157 - this.U.sO.r("...")) + "...";
      }

      this.U.sO.U(var12, (float)(var2 + 32 + 2), (float)(var3 + 1), 16777215);
      List var18 = this.U.sO.m(var13, 157);
      int var16 = 0;
      if(var16 < var18.size()) {
         this.U.sO.U((String)var18.get(var16), (float)(var2 + 32 + 2), (float)(var3 + 12 + 10 * var16), 8421504);
         ++var16;
      }

   }

   protected abstract int I();

   protected abstract String v();

   protected abstract String z();

   protected abstract void M();

   protected boolean U() {
      return true;
   }

   protected boolean m() {
      return !this.D.M(this);
   }

   protected boolean G() {
      return this.D.M(this);
   }

   protected boolean P() {
      List var1 = this.D.g(this);
      int var2 = var1.indexOf(this);
      return ((u)var1.get(var2 - 1)).U();
   }

   protected boolean T() {
      List var1 = this.D.g(this);
      int var2 = var1.indexOf(this);
      return var2 < var1.size() - 1 && ((u)var1.get(var2 + 1)).U();
   }

   public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.U() && var5 <= 32) {
         if(this.m()) {
            this.D.y();
            final int var12 = ((u)this.D.C().get(0)).J()?1:0;
            int var14 = this.I();
            if(var14 == 3) {
               this.D.g(this).remove(this);
               this.D.C().add(var12, this);
            } else {
               String var9 = b.x("resourcePack.incompatible.confirm.title", new Object[0]);
               String var10 = b.x("resourcePack.incompatible.confirm." + (var14 > 3?"new":"old"), new Object[0]);
               this.U.s(new wz(new net.z.f() {
                  public void y(boolean var1, int var2) {
                     b.K();
                     List var4 = u.this.D.g(u.this);
                     u.this.U.s(u.this.D);
                     if(var1) {
                        var4.remove(u.this);
                        u.this.D.C().add(var12, u.this);
                     }

                  }

                  private static xn a(xn var0) {
                     return var0;
                  }
               }, var9, var10, 0));
            }

            return true;
         }

         if(var5 < 16 && this.G()) {
            this.D.g(this).remove(this);
            this.D.z().add(0, this);
            this.D.y();
            return true;
         }

         if(var5 > 16 && var6 < 16 && this.P()) {
            List var11 = this.D.g(this);
            int var13 = var11.indexOf(this);
            var11.remove(this);
            var11.add(var13 - 1, this);
            this.D.y();
            return true;
         }

         if(var5 > 16 && var6 > 16 && this.T()) {
            List var7 = this.D.g(this);
            int var8 = var7.indexOf(this);
            var7.remove(this);
            var7.add(var8 + 1, this);
            this.D.y();
            return true;
         }
      }

      return false;
   }

   public void h(int var1, int var2, int var3, float var4) {
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public boolean J() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

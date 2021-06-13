package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.r;
import net.yz.ai;

public abstract class n extends r {
   private static final net.k.v YB = net.k.n.q(n.class, net.k.y.g);
   protected int YW;
   private n.a YQ = n.a.NONE;

   public n(net.yv.r var1) {
      super(var1);
   }

   protected void g() {
      super.g();
      this.G.r(YB, Byte.valueOf((byte)0));
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.YW = var1.P("SpellTicks");
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("SpellTicks", this.YW);
   }

   public r.o y() {
      return this.k8()?r.o.SPELLCASTING:r.o.CROSSED;
   }

   public boolean k8() {
      net.u.d[] var1 = n.o.f;
      return this.hl.x?((Byte)this.G.a(YB)).byteValue() > 0:this.YW > 0;
   }

   public void z(n.a var1) {
      this.YQ = var1;
      this.G.d(YB, Byte.valueOf((byte)var1.o));
   }

   protected n.a G() {
      return !this.hl.x?this.YQ:n.a.O(((Byte)this.G.a(YB)).byteValue());
   }

   protected void T() {
      super.T();
      if(this.YW > 0) {
         --this.YW;
      }

   }

   public void A() {
      n.o.f;
      super.A();
      if(this.hl.x && this.k8()) {
         n.a var2 = this.G();
         double var3 = var2.F[0];
         double var5 = var2.F[1];
         double var7 = var2.F[2];
         float var9 = this.AK * 0.017453292F + net.u.t.m((float)this.x * 0.6662F) * 0.25F;
         float var10 = net.u.t.m(var9);
         float var11 = net.u.t.A(var9);
         this.hl.n(ai.SPELL_MOB, this.b + (double)var10 * 0.6D, this.hS + 1.8D, this.hr + (double)var11 * 0.6D, var3, var5, var7, new int[0]);
         this.hl.n(ai.SPELL_MOB, this.b - (double)var10 * 0.6D, this.hS + 1.8D, this.hr - (double)var11 * 0.6D, var3, var5, var7, new int[0]);
      }

   }

   protected int i() {
      return this.YW;
   }

   protected abstract net.yz.a d();

   private static xn a(xn var0) {
      return var0;
   }

   public static enum a {
      NONE(0, 0.0D, 0.0D, 0.0D),
      SUMMON_VEX(1, 0.7D, 0.7D, 0.8D),
      FANGS(2, 0.4D, 0.3D, 0.35D),
      WOLOLO(3, 0.7D, 0.5D, 0.2D),
      DISAPPEAR(4, 0.3D, 0.3D, 0.8D),
      BLINDNESS(5, 0.1D, 0.1D, 0.2D);

      private final int o;
      private final double[] F;

      private a(int var3, double var4, double var6, double var8) {
         this.o = var3;
         this.F = new double[]{var4, var6, var8};
      }

      public static n.a O(int var0) {
         n.o.f;
         n.a[] var2 = values();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            n.a var5 = var2[var4];
            if(var0 == var5.o) {
               return var5;
            }

            ++var4;
         }

         return NONE;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public class h extends net.y_.b {
      public h() {
         this.h(3);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.f;
         return n.this.i() > 0;
      }

      public void I() {
         super.I();
         n.this.p6.u();
      }

      public void C() {
         super.C();
         n.this.z(n.a.NONE);
      }

      public void E() {
         net.u.d[] var1 = n.o.f;
         if(n.this.M() != null) {
            n.this.E().n(n.this.M(), (float)n.this.v(), (float)n.this.w());
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public abstract class o extends net.y_.b {
      protected int x;
      protected int r;
      private static net.u.d[] f;

      public boolean f() {
         net.u.d[] var1 = y();
         return n.this.M() == null?false:(n.this.k8()?false:n.this.x >= this.r);
      }

      public boolean X() {
         return n.this.M() != null && this.x > 0;
      }

      public void I() {
         y();
         this.x = this.g();
         n.this.YW = this.h();
         this.r = n.this.x + this.T();
         net.yz.a var2 = this.H();
         n.this.I(var2, 1.0F, 1.0F);
         n.this.z(this.K());
      }

      public void E() {
         --this.x;
         if(this.x == 0) {
            this.Q();
            n.this.I(n.this.d(), 1.0F, 1.0F);
         }

      }

      protected abstract void Q();

      protected int g() {
         return 20;
      }

      protected abstract int h();

      protected abstract int T();

      @Nullable
      protected abstract net.yz.a H();

      protected abstract n.a K();

      public static void I(net.u.d[] var0) {
         f = var0;
      }

      private static xn a(xn var0) {
         return var0;
      }

      static {
         if(y() != null) {
            I(new net.u.d[2]);
         }

      }
   }
}

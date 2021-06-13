package net.c2;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.xn;
import net.c2.j;
import net.c2.n;
import net.m.l;
import net.n0.ks;
import net.nl.z1;
import net.y.u1;
import net.yz.m_;
import net.z.tu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y extends n {
   private static final Logger S3 = LogManager.getLogger();
   private static final m_ Sj = new m_("textures/gui/container/beacon.png");
   private final z1 Sa;
   private y.p SN;
   private boolean Sv;

   public y(net.r.i var1, z1 var2) {
      super(new net.nl.y(var1, var2));
      this.Sa = var2;
      this.s = 230;
      this.W = 219;
   }

   public void L() {
      super.L();
      this.SN = new y.p(-1, this.Y + 164, this.F + 107);
      this.m.add(this.SN);
      this.m.add(new y.u(-2, this.Y + 190, this.F + 107));
      this.Sv = true;
      this.SN.O = false;
   }

   public void K() {
      super.K();
      j.u.g();
      int var2 = this.Sa.e(0);
      net.n_.f var3 = net.n_.f.Q(this.Sa.e(1));
      net.n_.f var4 = net.n_.f.Q(this.Sa.e(2));
      if(this.Sv && var2 >= 0) {
         this.Sv = false;
         int var5 = 100;
         int var6 = 0;
         int var7 = net.ni.h.y[var6].length;
         int var8 = var7 * 22 + (var7 - 1) * 2;
         int var9 = 0;
         if(var9 < var7) {
            net.n_.f var10 = net.ni.h.y[var6][var9];
            y.j var11 = new y.j(var5++, this.Y + 76 + var9 * 24 - var8 / 2, this.F + 22 + var6 * 25, var10, var6);
            this.m.add(var11);
            if(var6 >= var2) {
               var11.O = false;
            }

            if(var10 == var3) {
               var11.l(true);
            }

            ++var9;
         }

         ++var6;
         var6 = 3;
         var7 = net.ni.h.y[3].length + 1;
         var8 = var7 * 22 + (var7 - 1) * 2;
         var9 = 0;
         if(var9 < var7 - 1) {
            net.n_.f var21 = net.ni.h.y[3][var9];
            y.j var22 = new y.j(var5++, this.Y + 167 + var9 * 24 - var8 / 2, this.F + 47, var21, 3);
            this.m.add(var22);
            if(3 >= var2) {
               var22.O = false;
            }

            if(var21 == var4) {
               var22.l(true);
            }

            ++var9;
         }

         y.j var20 = new y.j(var5++, this.Y + 167 + (var7 - 1) * 24 - var8 / 2, this.F + 47, var3, 3);
         this.m.add(var20);
         if(3 >= var2) {
            var20.O = false;
         }

         if(var3 == var4) {
            var20.l(true);
         }
      }

      this.SN.O = !this.Sa.A(0).B();
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.g == -2) {
         this.A.sf.x3.L((net.n2.k)(new net.m.f(this.A.sf.aG.S)));
         this.A.s((tu)null);
      } else if(var1.g == -1) {
         String var2 = "MC|Beacon";
         net.n2.h var3 = new net.n2.h(Unpooled.buffer());
         var3.writeInt(this.Sa.e(1));
         var3.writeInt(this.Sa.e(2));
         this.A.d().L((net.n2.k)(new l("MC|Beacon", var3)));
         this.A.sf.x3.L((net.n2.k)(new net.m.f(this.A.sf.aG.S)));
         this.A.s((tu)null);
      } else if(var1 instanceof y.j) {
         y.j var4 = (y.j)var1;
         if(var4.S()) {
            return;
         }

         int var5 = net.n_.f.N(var4.t);
         if(var4.C < 3) {
            this.Sa.Z(1, var5);
         } else {
            this.Sa.Z(2, var5);
         }

         this.m.clear();
         this.L();
         this.K();
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      u1.m();
      this.d(this.O, net.c9.b.x("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
      this.d(this.O, net.c9.b.x("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);

      for(net.z.m var4 : this.m) {
         if(var4.Z()) {
            var4.W(var1 - this.Y, var2 - this.F);
            break;
         }
      }

      u1.A();
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(Sj);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
      this.t.t = 100.0F;
      this.t.M(new ks(net.nb.j.WL), var4 + 42, var5 + 109);
      this.t.M(new ks(net.nb.j.B), var4 + 42 + 22, var5 + 109);
      this.t.M(new ks(net.nb.j.F), var4 + 42 + 44, var5 + 109);
      this.t.M(new ks(net.nb.j.S1), var4 + 42 + 66, var5 + 109);
      this.t.t = 0.0F;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static class h extends net.z.m {
      private final m_ K;
      private final int u;
      private final int T;
      private boolean Z;

      protected h(int var1, int var2, int var3, m_ var4, int var5, int var6) {
         super(var1, var2, var3, 22, 22, "");
         this.K = var4;
         this.u = var5;
         this.T = var6;
      }

      public void Z(net.nn.j var1, int var2, int var3, float var4) {
         int var5 = j.u.C();
         if(this.F) {
            var1.n().E(y.Sj);
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
            boolean var10000 = true;
            int var7 = 0;
            if(!this.O) {
               var7 += this.s * 2;
            }

            if(this.Z) {
               var7 += this.s * 1;
            }

            if(this.P) {
               var7 += this.s * 3;
            }

            this.g(this.D, this.R, var7, 219, this.s, this.h);
            if(!y.Sj.equals(this.K)) {
               var1.n().E(this.K);
            }

            this.g(this.D + 2, this.R + 2, this.u, this.T, 18, 18);
         }

      }

      public boolean S() {
         return this.Z;
      }

      public void l(boolean var1) {
         this.Z = var1;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class j extends y.h {
      private final net.n_.f t;
      private final int C;

      public j(int var2, int var3, int var4, net.n_.f var5, int var6) {
         super(var2, var3, var4, n.K, var5.b() % 8 * 18, 198 + var5.b() / 8 * 18);
         this.t = var5;
         this.C = var6;
      }

      public void W(int var1, int var2) {
         j.u.g();
         String var4 = net.c9.b.x(this.t.s(), new Object[0]);
         if(this.C >= 3 && this.t != net.nb.b.n) {
            var4 = var4 + " II";
         }

         y.this.B(var4, var1, var2);
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   class p extends y.h {
      public p(int var2, int var3, int var4) {
         super(var2, var3, var4, y.Sj, 90, 220);
      }

      public void W(int var1, int var2) {
         y.this.B(net.c9.b.x("gui.done", new Object[0]), var1, var2);
      }
   }

   class u extends y.h {
      public u(int var2, int var3, int var4) {
         super(var2, var3, var4, y.Sj, 112, 220);
      }

      public void W(int var1, int var2) {
         y.this.B(net.c9.b.x("gui.cancel", new Object[0]), var1, var2);
      }
   }
}

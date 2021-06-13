package net.z;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.xn;
import net.n0.ks;
import net.y.u1;
import net.yz.m_;
import net.z.g;
import net.z.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w7 extends net.c2.n {
   private static final Logger p0 = LogManager.getLogger();
   private static final m_ pO = new m_("textures/gui/container/villager.png");
   private final net.ne.m pI;
   private w7.n pk;
   private w7.n pn;
   private int pm;
   private final net.cb.t pt;

   public w7(net.r.i var1, net.ne.m var2, net.yv.r var3) {
      super(new net.nl.q(var1, var2, var3));
      this.pI = var2;
      this.pt = var2.b();
   }

   public void L() {
      super.L();
      int var1 = (q - this.s) / 2;
      int var2 = (V - this.W) / 2;
      this.pk = (w7.n)this.x(new w7.n(1, var1 + 120 + 27, var2 + 24 - 1, true));
      this.pn = (w7.n)this.x(new w7.n(2, var1 + 36 - 19, var2 + 24 - 1, false));
      this.pk.O = false;
      this.pn.O = false;
   }

   protected void z(int var1, int var2) {
      String var3 = this.pt.l();
      this.O.v(var3, (float)(this.s / 2 - this.O.r(var3) / 2), 6.0F, 4210752);
      this.O.v(net.c9.b.x("container.inventory", new Object[0]), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   public void K() {
      super.K();
      net.nq.z var1 = this.pI.L((net.r.r)this.A.sf);
      this.pk.O = this.pm < var1.size() - 1;
      this.pn.O = this.pm > 0;
   }

   protected void t(m var1) throws IOException {
      boolean var2 = false;
      if(var1 == this.pk) {
         ++this.pm;
         net.nq.z var3 = this.pI.L((net.r.r)this.A.sf);
         if(this.pm >= var3.size()) {
            this.pm = var3.size() - 1;
         }

         var2 = true;
      } else if(var1 == this.pn) {
         --this.pm;
         if(this.pm < 0) {
            this.pm = 0;
         }

         var2 = true;
      }

      ((net.nl.q)this.f).C(this.pm);
      net.n2.h var6 = new net.n2.h(Unpooled.buffer());
      var6.writeInt(this.pm);
      this.A.d().L((net.n2.k)(new net.m.l("MC|TrSel", var6)));
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(pO);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
      net.nq.z var6 = this.pI.L((net.r.r)this.A.sf);
      if(!var6.isEmpty()) {
         int var7 = this.pm;
         if(var7 >= var6.size()) {
            return;
         }

         net.nq.x var8 = (net.nq.x)var6.get(var7);
         if(var8.y()) {
            this.A.n().E(pO);
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            net.y.d.i();
            this.g(this.Y + 83, this.F + 21, 212, 0, 28, 21);
            this.g(this.Y + 83, this.F + 51, 212, 0, 28, 21);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      g.C();
      super.v(var1, var2, var3);
      net.nq.z var5 = this.pI.L((net.r.r)this.A.sf);
      if(!var5.isEmpty()) {
         int var6 = (q - this.s) / 2;
         int var7 = (V - this.W) / 2;
         int var8 = this.pm;
         net.nq.x var9 = (net.nq.x)var5.get(var8);
         ks var10 = var9.K();
         ks var11 = var9.z();
         ks var12 = var9.f();
         net.y.d.c();
         u1.A();
         net.y.d.i();
         net.y.d.F();
         net.y.d.G();
         net.y.d.K();
         this.t.t = 100.0F;
         this.t.M(var10, var6 + 36, var7 + 24);
         this.t.q(this.O, var10, var6 + 36, var7 + 24);
         if(!var11.B()) {
            this.t.M(var11, var6 + 62, var7 + 24);
            this.t.q(this.O, var11, var6 + 62, var7 + 24);
         }

         this.t.M(var12, var6 + 120, var7 + 24);
         this.t.q(this.O, var12, var6 + 120, var7 + 24);
         this.t.t = 0.0F;
         net.y.d.i();
         if(this.f(36, 24, 16, 16, var1, var2) && !var10.B()) {
            this.C(var10, var1, var2);
         }

         if(!var11.B() && this.f(62, 24, 16, 16, var1, var2) && !var11.B()) {
            this.C(var11, var1, var2);
         }

         if(!var12.B() && this.f(120, 24, 16, 16, var1, var2) && !var12.B()) {
            this.C(var12, var1, var2);
         }

         if(var9.y() && (this.f(83, 21, 28, 21, var1, var2) || this.f(83, 51, 28, 21, var1, var2))) {
            this.B(net.c9.b.x("merchant.deprecated", new Object[0]), var1, var2);
         }

         net.y.d.Y();
         net.y.d.K();
         net.y.d.B();
         u1.B();
      }

      this.X(var1, var2);
   }

   public net.ne.m S() {
      return this.pI;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static class n extends m {
      private final boolean Z;

      public n(int var1, int var2, int var3, boolean var4) {
         super(var1, var2, var3, 12, 19, "");
         this.Z = var4;
      }

      public void Z(net.nn.j var1, int var2, int var3, float var4) {
         boolean var5 = g.C();
         if(this.F) {
            var1.n().E(w7.pO);
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            if(var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h) {
               boolean var9 = true;
            } else {
               boolean var10000 = false;
            }

            int var7 = 0;
            int var8 = 176;
            if(!this.O) {
               var8 += this.s * 2;
            }

            if(!this.Z) {
               var7 += this.h;
            }

            this.g(this.D, this.R, var8, var7, this.s, this.h);
         }

      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}

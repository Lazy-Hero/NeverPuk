package net.ni;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.ni.c;
import net.ni.v;
import net.ni.w;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z extends c implements net.yz.i {
   private static final Logger s = LogManager.getLogger();
   private long q;
   private int p;
   private net.u.j A;
   private boolean F;

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.V("Age", this.q);
      if(this.A != null) {
         var1.K("ExitPortal", net.nj.e.b(this.A));
      }

      if(this.F) {
         var1.c("ExactTeleport", this.F);
      }

      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.q = var1.P("Age");
      if(var1.K("ExitPortal", 10)) {
         this.A = net.nj.e.L(var1.o("ExitPortal"));
      }

      this.F = var1.i("ExactTeleport");
   }

   public double K() {
      return 65536.0D;
   }

   public void m() {
      boolean var1 = this.I();
      boolean var2 = this.O();
      ++this.q;
      --this.p;
      if(var1 != this.I() || var2 != this.O()) {
         this.W();
      }

   }

   public boolean I() {
      return this.q < 200L;
   }

   public boolean O() {
      return this.p > 0;
   }

   public float I(float var1) {
      return net.u.t.T(((float)this.q + var1) / 200.0F, 0.0F, 1.0F);
   }

   public float o(float var1) {
      return 1.0F - net.u.t.T(((float)this.p - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 8, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public void s() {
      if(!this.J.x) {
         this.p = 40;
         this.J.x(this.C(), this.a(), 1, 0);
         this.W();
      }

   }

   public boolean q(int var1, int var2) {
      if(var1 == 1) {
         this.p = 40;
         return true;
      } else {
         return super.q(var1, var2);
      }
   }

   public void W(net.ne.l var1) {
      if(!this.J.x && !this.O()) {
         this.p = 100;
         if(this.A == null && this.J.F instanceof net.yv.k) {
            this.U();
         }

         if(this.A != null) {
            net.u.j var2 = this.F?this.A:this.u();
            var1.a((double)var2.t() + 0.5D, (double)var2.h() + 0.5D, (double)var2.y() + 0.5D);
         }

         this.s();
      }

   }

   private net.u.j u() {
      net.u.j var1 = K(this.J, this.A, 5, false);
      s.debug("Best exit position for portal at {} is {}", this.A, var1);
      return var1.h();
   }

   private void U() {
      w.C();
      net.u.r var2 = (new net.u.r((double)this.C().t(), 0.0D, (double)this.C().y())).I();
      net.u.r var3 = var2.T(1024.0D);
      int var4 = 16;
      if(v(this.J, var3).m() > 0) {
         --var4;
         s.debug("Skipping backwards past nonempty chunk at {}", var3);
         var3 = var3.v(var2.T(-16.0D));
      }

      var4 = 16;
      if(v(this.J, var3).m() == 0) {
         --var4;
         s.debug("Skipping forward past empty chunk at {}", var3);
         var3 = var3.v(var2.T(16.0D));
      }

      s.debug("Found chunk at {}", var3);
      net.l.q var8 = v(this.J, var3);
      this.A = t(var8);
      if(this.A == null) {
         this.A = new net.u.j(var3.p + 0.5D, 75.0D, var3.a + 0.5D);
         s.debug("Failed to find suitable block, settling on {}", this.A);
         (new net.w.p()).K(this.J, new Random(this.A.F()), this.A);
      }

      s.debug("Found block at {}", this.A);
      this.A = K(this.J, this.A, 16, true);
      s.debug("Creating portal at {}", this.A);
      this.A = this.A.J(10);
      this.z(this.A);
      this.W();
   }

   private static net.u.j K(net.yv.r var0, net.u.j var1, int var2, boolean var3) {
      Object var4 = null;

      for(int var5 = -var2; var5 <= var2; ++var5) {
         for(int var6 = -var2; var6 <= var2; ++var6) {
            int var7 = 255;

            while(true) {
               net.u.j var8 = new net.u.j(var1.t() + var5, var7, var1.y() + var6);
               net.yw.n var9 = var0.Z(var8);
               if(var9.w() && var9.Q() != net.nb.f.T8) {
                  break;
               }

               --var7;
            }
         }
      }

      return var1;
   }

   private static net.l.q v(net.yv.r var0, net.u.r var1) {
      return var0.q(net.u.t.L(var1.p / 16.0D), net.u.t.L(var1.a / 16.0D));
   }

   @Nullable
   private static net.u.j t(net.l.q var0) {
      net.u.j var1 = new net.u.j(var0.Q * 16, 30, var0.U * 16);
      int var2 = var0.m() + 16 - 1;
      net.u.j var3 = new net.u.j(var0.Q * 16 + 16 - 1, var2, var0.U * 16 + 16 - 1);
      net.u.j var4 = null;
      double var5 = 0.0D;

      for(net.u.j var8 : net.u.j.e(var1, var3)) {
         net.yw.n var9 = var0.u(var8);
         if(var9.Q() == net.nb.f.Tz && !var0.u(var8.J(1)).w() && !var0.u(var8.J(2)).w()) {
            double var10 = var8.S(0.0D, 0.0D, 0.0D);
            if(var10 < var5) {
               var4 = var8;
               var5 = var10;
            }
         }
      }

      return var4;
   }

   private void z(net.u.j var1) {
      (new net.w.m()).K(this.J, new Random(), var1);
      v var2 = this.J.L(var1);
      if(var2 instanceof net.ni.z) {
         net.ni.z var3 = (net.ni.z)var2;
         var3.A = new net.u.j(this.C());
         var3.W();
      } else {
         s.warn("Couldn\'t save exit portal at {}", var1);
      }

   }

   public boolean y(aq var1) {
      return this.a().p().F(this.J, this.C(), var1);
   }

   public int g() {
      int var1 = 0;

      for(aq var5 : aq.values()) {
         var1 += this.y(var5)?1:0;
      }

      return var1;
   }

   public void A(net.u.j var1) {
      this.F = true;
      this.A = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

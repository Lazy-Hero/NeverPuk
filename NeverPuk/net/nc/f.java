package net.nc;

import net.xn;
import net.nc.b;
import net.nc.l;
import net.nc.m;
import net.nc.o;
import net.nc.u;
import net.nc.y;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f extends net.cg.h {
   private static final Logger m = LogManager.getLogger();
   private b y;
   private net.nj.f T;

   public f() {
      this("scoreboard");
   }

   public f(String var1) {
      super(var1);
   }

   public void u(b var1) {
      this.y = var1;
      if(this.T != null) {
         this.I(this.T);
      }

   }

   public void I(net.nj.f var1) {
      if(this.y == null) {
         this.T = var1;
      } else {
         this.Y(var1.A("Objectives", 10));
         this.K(var1.A("PlayerScores", 10));
         if(var1.K("DisplaySlots", 10)) {
            this.t(var1.o("DisplaySlots"));
         }

         if(var1.K("Teams", 9)) {
            this.s(var1.A("Teams", 10));
         }
      }

   }

   protected void s(net.nj.h var1) {
      m.I();
      int var3 = 0;
      if(var3 < var1.z()) {
         net.nj.f var4 = var1.i(var3);
         String var5 = var4.J("Name");
         if(var5.length() > 16) {
            var5 = var5.substring(0, 16);
         }

         y var6 = this.y.S(var5);
         String var7 = var4.J("DisplayName");
         if(var7.length() > 32) {
            var7 = var7.substring(0, 32);
         }

         var6.q(var7);
         if(var4.K("TeamColor", 8)) {
            var6.s(net.cb.z.w(var4.J("TeamColor")));
         }

         var6.J(var4.J("Prefix"));
         var6.u(var4.J("Suffix"));
         if(var4.K("AllowFriendlyFire", 99)) {
            var6.D(var4.i("AllowFriendlyFire"));
         }

         if(var4.K("SeeFriendlyInvisibles", 99)) {
            var6.a(var4.i("SeeFriendlyInvisibles"));
         }

         if(var4.K("NameTagVisibility", 8)) {
            m.f var8 = m.f.M(var4.J("NameTagVisibility"));
            var6.W(var8);
         }

         if(var4.K("DeathMessageVisibility", 8)) {
            m.f var10 = m.f.M(var4.J("DeathMessageVisibility"));
            var6.I(var10);
         }

         if(var4.K("CollisionRule", 8)) {
            m.k var11 = m.k.y(var4.J("CollisionRule"));
            var6.P(var11);
         }

         this.F(var6, var4.A("Players", 8));
         ++var3;
      }

   }

   protected void F(y var1, net.nj.h var2) {
      for(int var3 = 0; var3 < var2.z(); ++var3) {
         this.y.A(var2.w(var3), var1.D());
      }

   }

   protected void t(net.nj.f var1) {
      int var2 = 0;

      while(true) {
         if(var1.K("slot_" + var2, 8)) {
            String var3 = var1.J("slot_" + var2);
            l var4 = this.y.e(var3);
            this.y.W(var2, var4);
         }

         ++var2;
      }
   }

   protected void Y(net.nj.h var1) {
      for(int var2 = 0; var2 < var1.z(); ++var2) {
         net.nj.f var3 = var1.i(var2);
         u var4 = (u)u.J.get(var3.J("CriteriaName"));
         String var5 = var3.J("Name");
         if(var5.length() > 16) {
            var5 = var5.substring(0, 16);
         }

         l var6 = this.y.I(var5, var4);
         var6.J(var3.J("DisplayName"));
         var6.I(u.o.l(var3.J("RenderType")));
      }

   }

   protected void K(net.nj.h var1) {
      for(int var2 = 0; var2 < var1.z(); ++var2) {
         net.nj.f var3 = var1.i(var2);
         l var4 = this.y.e(var3.J("Objective"));
         String var5 = var3.J("Name");
         if(var5.length() > 40) {
            var5 = var5.substring(0, 40);
         }

         o var6 = this.y.p(var5, var4);
         var6.A(var3.P("Score"));
         if(var3.G("Locked")) {
            var6.b(var3.i("Locked"));
         }
      }

   }

   public net.nj.f v(net.nj.f var1) {
      if(this.y == null) {
         m.warn("Tried to save scoreboard without having a scoreboard...");
         return var1;
      } else {
         var1.K("Objectives", this.u());
         var1.K("PlayerScores", this.O());
         var1.K("Teams", this.s());
         this.a(var1);
         return var1;
      }
   }

   protected net.nj.h s() {
      net.nj.h var1 = new net.nj.h();

      for(y var3 : this.y.S()) {
         net.nj.f var4 = new net.nj.f();
         var4.b("Name", var3.D());
         var4.b("DisplayName", var3.a());
         if(var3.b().c() >= 0) {
            var4.b("TeamColor", var3.b().s());
         }

         var4.b("Prefix", var3.G());
         var4.b("Suffix", var3.I());
         var4.c("AllowFriendlyFire", var3.B());
         var4.c("SeeFriendlyInvisibles", var3.e());
         var4.b("NameTagVisibility", var3.q().internalName);
         var4.b("DeathMessageVisibility", var3.e().internalName);
         var4.b("CollisionRule", var3.U().name);
         net.nj.h var5 = new net.nj.h();

         for(String var7 : var3.Q()) {
            var5.m(new net.nj.y(var7));
         }

         var4.K("Players", var5);
         var1.m(var4);
      }

      return var1;
   }

   protected void a(net.nj.f var1) {
      net.nj.f var2 = new net.nj.f();
      int var4 = 0;

      while(true) {
         l var5 = this.y.S(var4);
         var2.b("slot_" + var4, var5.e());
         boolean var10000 = true;
         ++var4;
      }
   }

   protected net.nj.h u() {
      net.nj.h var1 = new net.nj.h();

      for(l var3 : this.y.q()) {
         if(var3.v() != null) {
            net.nj.f var4 = new net.nj.f();
            var4.b("Name", var3.e());
            var4.b("CriteriaName", var3.v().k());
            var4.b("DisplayName", var3.a());
            var4.b("RenderType", var3.t().e());
            var1.m(var4);
         }
      }

      return var1;
   }

   protected net.nj.h O() {
      net.nj.h var1 = new net.nj.h();

      for(o var3 : this.y.i()) {
         if(var3.M() != null) {
            net.nj.f var4 = new net.nj.f();
            var4.b("Name", var3.W());
            var4.b("Objective", var3.M().e());
            var4.r("Score", var3.W());
            var4.c("Locked", var3.G());
            var1.m(var4);
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

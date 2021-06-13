package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.ru;
import net.y9.z4;
import net.yz.a5;
import net.yz.a7;
import net.yz.aq;
import net.yz.ax;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zc extends z4 {
   private static final Logger F = LogManager.getLogger();
   public static final net.yr.g c = ru.n;
   public static final net.yr.o r = net.yr.o.k("conditional");

   public zc(net.y1.h var1) {
      super(net.y1.l.i, var1);
      this.r(this.b.T().s(c, aq.NORTH).s(r, Boolean.valueOf(false)));
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      net.ni.q var3 = new net.ni.q();
      var3.v(this == net.nb.f.Tc);
      return var3;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         net.ni.v var6 = var2.L(var3);
         if(var6 instanceof net.ni.q) {
            net.ni.q var7 = (net.ni.q)var6;
            boolean var8 = var2.B(var3);
            boolean var9 = var7.S();
            var7.N(var8);
            if(!var7.L() && var7.I() != net.ni.q.SEQUENCE) {
               var7.B();
               var2.c(var3, this, this.u(var2));
            }
         }
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         net.ni.v var5 = var1.L(var2);
         if(var5 instanceof net.ni.q) {
            net.ni.q var6 = (net.ni.q)var5;
            net.ni.w var7 = var6.d();
            boolean var8 = !a7.Y(var7.v());
            net.ni.q var9 = var6.I();
            boolean var10 = var6.C();
            if(var9 == net.ni.q.AUTO) {
               var6.B();
               this.A(var3, var1, var2, var7, var8);
               if(var6.S() || var6.L()) {
                  var1.c(var2, this, this.u(var1));
               }
            } else if(var9 == net.ni.q.REDSTONE) {
               this.A(var3, var1, var2, var7, var8);
            }

            var1.Z((net.u.j)var2, (l)this);
         }
      }

   }

   private void A(net.yw.n var1, net.yv.r var2, net.u.j var3, net.ni.w var4, boolean var5) {
      var4.K(var2);
      X(var2, var3, (aq)var1.i(c));
   }

   public int u(net.yv.r var1) {
      return 1;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      net.ni.v var10 = var1.L(var2);
      if(var10 instanceof net.ni.q && var4.Vm()) {
         var4.v((net.ni.q)var10);
         return true;
      } else {
         return false;
      }
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      net.ni.v var4 = var2.L(var3);
      return var4 instanceof net.ni.q?((net.ni.q)var4).d().n():0;
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      net.ni.v var6 = var1.L(var2);
      if(var6 instanceof net.ni.q) {
         net.ni.q var7 = (net.ni.q)var6;
         net.ni.w var8 = var7.d();
         if(var5.v()) {
            var8.E(var5.j());
         }

         if(!var1.x) {
            net.nj.f var9 = var5.o();
            if(!var9.K("BlockEntityTag", 10)) {
               var8.f(var1.N().b("sendCommandFeedback"));
               var7.v(this == net.nb.f.Tc);
            }

            if(var7.I() == net.ni.q.SEQUENCE) {
               boolean var10 = var1.B(var2);
               var7.N(var10);
            }
         }
      }

   }

   public int T(Random var1) {
      return 0;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.yw.n D(int var1) {
      return this.p().s(c, aq.l(var1 & 7)).s(r, Boolean.valueOf((var1 & 8) != 0));
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(c)).w() | (((Boolean)var1.i(r)).booleanValue()?8:0);
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(c, var2.d((aq)var1.i(c)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(c)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{c, r});
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(c, aq.i(var2, var8)).s(r, Boolean.valueOf(false));
   }

   private static void X(net.yv.r var0, net.u.j var1, aq var2) {
      g3.v.w();
      net.u.j var4 = new net.u.j(var1);
      net.yv.p var5 = var0.N();
      int var6 = var5.C("maxCommandChainLength");
      if(var6-- > 0) {
         var4.q(var2);
         net.yw.n var7 = var0.Z(var4);
         l var8 = var7.Q();
         if(var8 != net.nb.f.Tc) {
            ;
         }

         net.ni.v var9 = var0.L(var4);
         if(!(var9 instanceof net.ni.q)) {
            ;
         }

         net.ni.q var10 = (net.ni.q)var9;
         if(var10.I() != net.ni.q.SEQUENCE) {
            ;
         }

         if(var10.S() || var10.L()) {
            net.ni.w var11 = var10.d();
            if(var10.B()) {
               if(!var11.K(var0)) {
                  ;
               }

               var0.Z((net.u.j)var4, (l)var8);
            }

            if(var10.G()) {
               var11.k(0);
            }
         }

         var2 = (aq)var7.i(c);
      }

      if(var6 <= 0) {
         int var14 = Math.max(var5.C("maxCommandChainLength"), 0);
         F.warn("Commandblock chain tried to execure more than " + var14 + " steps!");
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}

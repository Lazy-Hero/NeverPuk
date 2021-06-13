package net.y9;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class gl extends g3 {
   public static final net.yr.w p = net.yr.w.L("shape", g3.v.class, new Predicate() {
      public boolean L(@Nullable g3.v var1) {
         int[] var2 = g3.v.w();
         return var1 != g3.v.NORTH_EAST && var1 != g3.v.NORTH_WEST && var1 != g3.v.SOUTH_EAST && var1 != g3.v.SOUTH_WEST;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });
   public static final net.yr.o J = net.yr.o.k("powered");

   public gl() {
      super(true);
      this.r(this.b.T().s(J, Boolean.valueOf(false)).s(p, g3.v.NORTH_SOUTH));
      this.R(true);
   }

   public int u(net.yv.r var1) {
      return 20;
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var1.x && !((Boolean)var3.i(J)).booleanValue()) {
         this.F(var1, var2, var3);
      }

   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x && ((Boolean)var3.i(J)).booleanValue()) {
         this.F(var1, var2, var3);
      }

   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Boolean)var1.i(J)).booleanValue()?15:0;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !((Boolean)var1.i(J)).booleanValue()?0:(var4 == aq.UP?15:0);
   }

   private void F(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      boolean var4 = ((Boolean)var3.i(J)).booleanValue();
      boolean var5 = false;
      List var6 = this.U(var1, var2, net.nm.w.class, new Predicate[0]);
      if(!var6.isEmpty()) {
         var5 = true;
      }

      var1.k(var2, var3.s(J, Boolean.valueOf(true)), 3);
      this.S(var1, var2, var3, true);
      var1.b(var2, this, false);
      var1.b(var2.b(), this, false);
      var1.k(var2, var2);
      var1.k(var2, var3.s(J, Boolean.valueOf(false)), 3);
      this.S(var1, var2, var3, false);
      var1.b(var2, this, false);
      var1.b(var2.b(), this, false);
      var1.k(var2, var2);
      var1.c(new net.u.j(var2), this, this.u(var1));
      var1.Z((net.u.j)var2, (l)this);
   }

   protected void S(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      g3.g var5 = new g3.g(var1, var2, var3);

      for(net.u.j var7 : var5.q()) {
         net.yw.n var8 = var1.Z(var7);
         var8.q(var1, var7, var8.Q(), var2);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      this.F(var1, var2, var3);
   }

   public net.yr.h J() {
      return p;
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      if(((Boolean)var1.i(J)).booleanValue()) {
         List var4 = this.U(var2, var3, net.nm.p.class, new Predicate[0]);
         if(!var4.isEmpty()) {
            return ((net.nm.p)var4.get(0)).o().n();
         }

         List var5 = this.U(var2, var3, net.nm.w.class, new Predicate[]{net.yz.q.v});
         if(!var5.isEmpty()) {
            return net.nl.v.e((net.nl.z1)var5.get(0));
         }
      }

      return 0;
   }

   protected List U(net.yv.r var1, net.u.j var2, Class var3, Predicate... var4) {
      net.u.e var5 = this.D(var2);
      return var4.length != 1?var1.p(var3, var5):var1.L(var3, var5, var4[0]);
   }

   private net.u.e D(net.u.j var1) {
      float var10000 = 0.2F;
      return new net.u.e((double)((float)var1.t() + 0.2F), (double)var1.h(), (double)((float)var1.y() + 0.2F), (double)((float)(var1.t() + 1) - 0.2F), (double)((float)(var1.h() + 1) - 0.2F), (double)((float)(var1.y() + 1) - 0.2F));
   }

   public net.yw.n D(int var1) {
      return this.p().s(p, g3.v.z(var1 & 7)).s(J, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((g3.v)var1.i(p)).a();
      if(((Boolean)var1.i(J)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.U[var2.ordinal()]) {
      case 1:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 2:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 3:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 4:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 5:
            return var1.s(p, g3.v.NORTH_WEST);
         case 6:
            return var1.s(p, g3.v.NORTH_EAST);
         case 7:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 8:
            return var1.s(p, g3.v.SOUTH_WEST);
         }
      case 2:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 2:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 3:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 4:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 5:
            return var1.s(p, g3.v.NORTH_EAST);
         case 6:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 7:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(p, g3.v.NORTH_WEST);
         case 9:
            return var1.s(p, g3.v.EAST_WEST);
         case 10:
            return var1.s(p, g3.v.NORTH_SOUTH);
         }
      case 3:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 2:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 3:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 4:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 5:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 6:
            return var1.s(p, g3.v.NORTH_WEST);
         case 7:
            return var1.s(p, g3.v.NORTH_EAST);
         case 8:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 9:
            return var1.s(p, g3.v.EAST_WEST);
         case 10:
            return var1.s(p, g3.v.NORTH_SOUTH);
         }
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      g3.v var3 = (g3.v)var1.i(p);
      switch(null.i[var2.ordinal()]) {
      case 1:
         switch(null.e[var3.ordinal()]) {
         case 3:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 4:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 5:
            return var1.s(p, g3.v.NORTH_EAST);
         case 6:
            return var1.s(p, g3.v.NORTH_WEST);
         case 7:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(p, g3.v.SOUTH_EAST);
         default:
            return super.P(var1, var2);
         }
      case 2:
         switch(null.e[var3.ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 2:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 3:
         case 4:
         default:
            break;
         case 5:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 6:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 7:
            return var1.s(p, g3.v.NORTH_EAST);
         case 8:
            return var1.s(p, g3.v.NORTH_WEST);
         }
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{p, J});
   }

   private static xn a(xn var0) {
      return var0;
   }
}

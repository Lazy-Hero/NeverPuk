package net.y9;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yz.ax;

public class gs extends g3 {
   public static final net.yr.w H = net.yr.w.L("shape", g3.v.class, new Predicate() {
      public boolean E(@Nullable g3.v var1) {
         int[] var2 = g3.v.w();
         return var1 != g3.v.NORTH_EAST && var1 != g3.v.NORTH_WEST && var1 != g3.v.SOUTH_EAST && var1 != g3.v.SOUTH_WEST;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });
   public static final net.yr.o u = net.yr.o.k("powered");

   protected gs() {
      super(true);
      this.r(this.b.T().s(H, g3.v.NORTH_SOUTH).s(u, Boolean.valueOf(false)));
   }

   protected boolean O(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4, int var5) {
      if(var5 >= 8) {
         return false;
      } else {
         int var6 = var2.t();
         int var7 = var2.h();
         int var8 = var2.y();
         boolean var9 = true;
         g3.v var10 = (g3.v)var3.i(H);
         switch(null.L[var10.ordinal()]) {
         case 1:
            ++var8;
            break;
         case 2:
            --var6;
            break;
         case 3:
            --var6;
            var10 = g3.v.EAST_WEST;
            break;
         case 4:
            --var6;
            ++var7;
            var9 = false;
            var10 = g3.v.EAST_WEST;
            break;
         case 5:
            ++var8;
            var10 = g3.v.NORTH_SOUTH;
            break;
         case 6:
            ++var8;
            ++var7;
            var9 = false;
            var10 = g3.v.NORTH_SOUTH;
         }

         return this.M(var1, new net.u.j(var6, var7, var8), var4, var5, var10)?true:this.M(var1, new net.u.j(var6, var7 - 1, var8), var4, var5, var10);
      }
   }

   protected boolean M(net.yv.r var1, net.u.j var2, boolean var3, int var4, g3.v var5) {
      net.yw.n var6 = var1.Z(var2);
      if(var6.Q() != this) {
         return false;
      } else {
         g3.v var7 = (g3.v)var6.i(H);
         return var5 != g3.v.EAST_WEST || var7 != g3.v.NORTH_SOUTH && var7 != g3.v.ASCENDING_NORTH && var7 != g3.v.ASCENDING_SOUTH?(var5 != g3.v.NORTH_SOUTH || var7 != g3.v.EAST_WEST && var7 != g3.v.ASCENDING_EAST && var7 != g3.v.ASCENDING_WEST?(!((Boolean)var6.i(u)).booleanValue()?false:var1.B(var2) || this.O(var1, var2, var6, var3, var4 + 1)):false):false;
      }
   }

   protected void A(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4) {
      boolean var5 = ((Boolean)var1.i(u)).booleanValue();
      boolean var6 = var2.B(var3) || this.O(var2, var3, var1, true, 0) || this.O(var2, var3, var1, false, 0);
      if(var6 != var5) {
         var2.k(var3, var1.s(u, Boolean.valueOf(var6)), 3);
         var2.b(var3.b(), this, false);
         if(((g3.v)var1.i(H)).i()) {
            var2.b(var3.h(), this, false);
         }
      }

   }

   public net.yr.h J() {
      return H;
   }

   public net.yw.n D(int var1) {
      return this.p().s(H, g3.v.z(var1 & 7)).s(u, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((g3.v)var1.i(H)).a();
      if(((Boolean)var1.i(u)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.d[var2.ordinal()]) {
      case 1:
         switch(null.L[((g3.v)var1.i(H)).ordinal()]) {
         case 3:
            return var1.s(H, g3.v.ASCENDING_WEST);
         case 4:
            return var1.s(H, g3.v.ASCENDING_EAST);
         case 5:
            return var1.s(H, g3.v.ASCENDING_SOUTH);
         case 6:
            return var1.s(H, g3.v.ASCENDING_NORTH);
         case 7:
            return var1.s(H, g3.v.NORTH_WEST);
         case 8:
            return var1.s(H, g3.v.NORTH_EAST);
         case 9:
            return var1.s(H, g3.v.SOUTH_EAST);
         case 10:
            return var1.s(H, g3.v.SOUTH_WEST);
         }
      case 2:
         switch(null.L[((g3.v)var1.i(H)).ordinal()]) {
         case 1:
            return var1.s(H, g3.v.EAST_WEST);
         case 2:
            return var1.s(H, g3.v.NORTH_SOUTH);
         case 3:
            return var1.s(H, g3.v.ASCENDING_NORTH);
         case 4:
            return var1.s(H, g3.v.ASCENDING_SOUTH);
         case 5:
            return var1.s(H, g3.v.ASCENDING_WEST);
         case 6:
            return var1.s(H, g3.v.ASCENDING_EAST);
         case 7:
            return var1.s(H, g3.v.NORTH_EAST);
         case 8:
            return var1.s(H, g3.v.SOUTH_EAST);
         case 9:
            return var1.s(H, g3.v.SOUTH_WEST);
         case 10:
            return var1.s(H, g3.v.NORTH_WEST);
         }
      case 3:
         switch(null.L[((g3.v)var1.i(H)).ordinal()]) {
         case 1:
            return var1.s(H, g3.v.EAST_WEST);
         case 2:
            return var1.s(H, g3.v.NORTH_SOUTH);
         case 3:
            return var1.s(H, g3.v.ASCENDING_SOUTH);
         case 4:
            return var1.s(H, g3.v.ASCENDING_NORTH);
         case 5:
            return var1.s(H, g3.v.ASCENDING_EAST);
         case 6:
            return var1.s(H, g3.v.ASCENDING_WEST);
         case 7:
            return var1.s(H, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(H, g3.v.NORTH_WEST);
         case 9:
            return var1.s(H, g3.v.NORTH_EAST);
         case 10:
            return var1.s(H, g3.v.SOUTH_EAST);
         }
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      g3.v var3 = (g3.v)var1.i(H);
      switch(null.J[var2.ordinal()]) {
      case 1:
         switch(null.L[var3.ordinal()]) {
         case 5:
            return var1.s(H, g3.v.ASCENDING_SOUTH);
         case 6:
            return var1.s(H, g3.v.ASCENDING_NORTH);
         case 7:
            return var1.s(H, g3.v.NORTH_EAST);
         case 8:
            return var1.s(H, g3.v.NORTH_WEST);
         case 9:
            return var1.s(H, g3.v.SOUTH_WEST);
         case 10:
            return var1.s(H, g3.v.SOUTH_EAST);
         default:
            return super.P(var1, var2);
         }
      case 2:
         switch(null.L[var3.ordinal()]) {
         case 3:
            return var1.s(H, g3.v.ASCENDING_WEST);
         case 4:
            return var1.s(H, g3.v.ASCENDING_EAST);
         case 5:
         case 6:
         default:
            break;
         case 7:
            return var1.s(H, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(H, g3.v.SOUTH_EAST);
         case 9:
            return var1.s(H, g3.v.NORTH_EAST);
         case 10:
            return var1.s(H, g3.v.NORTH_WEST);
         }
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{H, u});
   }

   private static xn a(xn var0) {
      return var0;
   }
}

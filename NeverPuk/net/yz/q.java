package net.yz;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.z1;
import net.yz.m_;

public final class q {
   public static final Predicate Y = new Predicate() {
      public boolean q(@Nullable net.ne.l var1) {
         return var1.P();
      }
   };
   public static final Predicate P = new Predicate() {
      public boolean A(@Nullable net.ne.l var1) {
         int var2 = m_.J();
         return var1.P() && !var1.t() && !var1.M();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static final Predicate v = new Predicate() {
      public boolean m(@Nullable net.ne.l var1) {
         int var2 = m_.g();
         return var1 instanceof z1 && var1.P();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static final Predicate q = new Predicate() {
      public boolean g(@Nullable net.ne.l var1) {
         int var2 = m_.J();
         return !(var1 instanceof net.r.r) || !((net.r.r)var1).VX() && !((net.r.r)var1).V8();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static final Predicate n = new Predicate() {
      public boolean w(@Nullable net.ne.l var1) {
         int var2 = m_.g();
         return !(var1 instanceof net.r.r) || !((net.r.r)var1).VX();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public static Predicate P(final double var0, final double var2, final double var4, double var6) {
      final double var8 = var6 * var6;
      return new Predicate() {
         public boolean X(@Nullable net.ne.l var1) {
            int var2x = m_.J();
            return var1 != null && Double.compare(var1.o(var0, var2, var4), var8) <= 0;
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      };
   }

   public static Predicate K(final net.ne.l var0) {
      m_.g();
      final net.nc.m var2 = var0.f();
      final net.nc.m var3 = var2 == null?net.nc.m.ALWAYS:var2.U();
      Predicate var4 = var3 == net.nc.m.NEVER?Predicates.alwaysFalse():Predicates.and(n, new Predicate() {
         public boolean w(@Nullable net.ne.l var1) {
            int var2x = m_.J();
            if(!var1.b()) {
               return false;
            } else if(!var0.hl.x || var1 instanceof net.r.r && ((net.r.r)var1).VV()) {
               net.nc.m var3x = var1.f();
               net.nc.m var4 = var3x == null?net.nc.m.ALWAYS:var3x.U();
               if(var4 == net.nc.m.NEVER) {
                  return false;
               } else {
                  if(var2 != null && var2.w(var3x)) {
                     boolean var6 = true;
                  } else {
                     boolean var10000 = false;
                  }

                  if(var3 == net.nc.m.HIDE_FOR_OWN_TEAM || var4 == net.nc.m.HIDE_FOR_OWN_TEAM) {
                     ;
                  }

                  return var3 != net.nc.m.HIDE_FOR_OTHER_TEAMS && var4 != net.nc.m.HIDE_FOR_OTHER_TEAMS;
               }
            } else {
               return false;
            }
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      });
      return var4;
   }

   public static Predicate b(final net.ne.l var0) {
      return new Predicate() {
         public boolean e(@Nullable net.ne.l var1) {
            int var2 = m_.g();
            if(var1.M()) {
               var1 = var1.D();
               if(var1 != var0) {
                  ;
               }

               return false;
            } else {
               return true;
            }
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      };
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class i implements Predicate {
      private final ks b;

      public i(ks var1) {
         this.b = var1;
      }

      public boolean D(@Nullable net.ne.l var1) {
         int var2 = m_.g();
         if(!var1.P()) {
            return false;
         } else if(!(var1 instanceof net.ne.a)) {
            return false;
         } else {
            net.ne.a var3 = (net.ne.a)var1;
            return !var3.U(net.ne.y.M(this.b)).B()?false:(var3 instanceof net.ne.y?((net.ne.y)var3).lw():(var3 instanceof net.nm.z?true:var3 instanceof net.r.r));
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}

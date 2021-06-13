package net.b;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.m;
import net.b.n;
import net.b.r;
import net.nb.f;
import net.ne.y;
import net.u.d;
import net.u.e;
import net.u.j;
import net.y9.g3;
import net.y9.ln;
import net.y9.r3;
import net.y9.r9;
import net.y9.re;
import net.yv.o8;
import net.yz.aq;

public class i extends r {
   protected float D;

   public void o(o8 var1, y var2) {
      super.o(var1, var2);
      this.D = var2.Q(m.WATER);
   }

   public void H() {
      this.e.v(m.WATER, this.D);
      super.H();
   }

   public c H() {
      int var1;
      if(this.R() && this.e.p()) {
         var1 = (int)this.e.i().u;
         j.v var8 = new j.v(net.u.t.L(this.e.b), var1, net.u.t.L(this.e.hr));

         for(net.y9.l var3 = this.m.Z(var8).Q(); var3 == f.dy || var3 == f.uM; var3 = this.m.Z(var8).Q()) {
            ++var1;
            var8.V(net.u.t.L(this.e.b), var1, net.u.t.L(this.e.hr));
         }
      } else if(this.e.k) {
         var1 = net.u.t.L(this.e.i().u + 0.5D);
      } else {
         j var2;
         for(var2 = new j(this.e); (this.m.Z(var2).n() == net.y1.l.q || this.m.Z(var2).Q().c(this.m, var2)) && var2.h() > 0; var2 = var2.b()) {
            ;
         }

         var1 = var2.h().h();
      }

      j var9 = new j(this.e);
      m var10 = this.D(this.e, var9.t(), var1, var9.y());
      if(this.e.Q(var10) < 0.0F) {
         HashSet var4 = Sets.newHashSet();
         var4.add(new j(this.e.i().n, (double)var1, this.e.i().N));
         var4.add(new j(this.e.i().n, (double)var1, this.e.i().r));
         var4.add(new j(this.e.i().d, (double)var1, this.e.i().N));
         var4.add(new j(this.e.i().d, (double)var1, this.e.i().r));

         for(j var6 : var4) {
            m var7 = this.B(this.e, var6);
            if(this.e.Q(var7) >= 0.0F) {
               return this.v(var6.t(), var6.h(), var6.y());
            }
         }
      }

      return this.v(var9.t(), var1, var9.y());
   }

   public c E(double var1, double var3, double var5) {
      return this.v(net.u.t.L(var1), net.u.t.L(var3), net.u.t.L(var5));
   }

   public int z(c[] var1, c var2, c var3, float var4) {
      n.q();
      int var6 = 0;
      int var7 = 0;
      m var8 = this.D(this.e, var2.H, var2.E + 1, var2.i);
      if(Float.compare(this.e.Q(var8), 0.0F) >= 0) {
         var7 = net.u.t.M(Math.max(1.0F, this.e.ha));
      }

      j var9 = (new j(var2.H, var2.E, var2.i)).b();
      double var10 = (double)var2.E - (1.0D - this.m.Z(var9).q(this.m, var9).c);
      c var12 = this.f(var2.H, var2.E, var2.i + 1, var7, var10, aq.SOUTH);
      c var13 = this.f(var2.H - 1, var2.E, var2.i, var7, var10, aq.WEST);
      c var14 = this.f(var2.H + 1, var2.E, var2.i, var7, var10, aq.EAST);
      c var15 = this.f(var2.H, var2.E, var2.i - 1, var7, var10, aq.NORTH);
      if(var12 != null && !var12.e && var12.a(var3) < var4) {
         var1[var6++] = var12;
      }

      if(var13 != null && !var13.e && var13.a(var3) < var4) {
         var1[var6++] = var13;
      }

      if(var14 != null && !var14.e && var14.a(var3) < var4) {
         var1[var6++] = var14;
      }

      if(var15 != null && !var15.e && var15.a(var3) < var4) {
         var1[var6++] = var15;
      }

      if(var15 != null && var15.j != m.OPEN && Float.compare(var15.v, 0.0F) == 0) {
         boolean var24 = false;
      } else {
         boolean var10000 = true;
      }

      if(var12 != null && var12.j != m.OPEN && Float.compare(var12.v, 0.0F) == 0) {
         boolean var26 = false;
      } else {
         boolean var25 = true;
      }

      if(var14 != null && var14.j != m.OPEN && Float.compare(var14.v, 0.0F) == 0) {
         boolean var28 = false;
      } else {
         boolean var27 = true;
      }

      if(var13 != null && var13.j != m.OPEN && Float.compare(var13.v, 0.0F) == 0) {
         boolean var30 = false;
      } else {
         boolean var29 = true;
      }

      c var20 = this.f(var2.H - 1, var2.E, var2.i - 1, var7, var10, aq.NORTH);
      if(var20 != null && !var20.e && Float.compare(var20.a(var3), var4) < 0) {
         var1[var6++] = var20;
      }

      var20 = this.f(var2.H + 1, var2.E, var2.i - 1, var7, var10, aq.NORTH);
      if(var20 != null && !var20.e && Float.compare(var20.a(var3), var4) < 0) {
         var1[var6++] = var20;
      }

      var20 = this.f(var2.H - 1, var2.E, var2.i + 1, var7, var10, aq.SOUTH);
      if(var20 != null && !var20.e && Float.compare(var20.a(var3), var4) < 0) {
         var1[var6++] = var20;
      }

      var20 = this.f(var2.H + 1, var2.E, var2.i + 1, var7, var10, aq.SOUTH);
      if(var20 != null && !var20.e && Float.compare(var20.a(var3), var4) < 0) {
         var1[var6++] = var20;
      }

      if(d.y() == null) {
         n.N("F7SKI");
      }

      return var6;
   }

   @Nullable
   private c f(int var1, int var2, int var3, int var4, double var5, aq var7) {
      c var8 = null;
      j var9 = new j(var1, var2, var3);
      j var10 = var9.b();
      double var11 = (double)var2 - (1.0D - this.m.Z(var10).q(this.m, var10).c);
      if(var11 - var5 > 1.125D) {
         return null;
      } else {
         m var13 = this.D(this.e, var1, var2, var3);
         float var14 = this.e.Q(var13);
         double var15 = (double)this.e.h9 / 2.0D;
         if(var14 >= 0.0F) {
            var8 = this.v(var1, var2, var3);
            var8.j = var13;
            var8.v = Math.max(var8.v, var14);
         }

         if(var13 == m.WALKABLE) {
            return var8;
         } else {
            if(var13 != m.FENCE && var13 != m.TRAPDOOR) {
               var8 = this.f(var1, var2 + 1, var3, var4 - 1, var5, var7);
               if((var8.j == m.OPEN || var8.j == m.WALKABLE) && this.e.h9 < 1.0F) {
                  double var17 = (double)(var1 - var7.v()) + 0.5D;
                  double var19 = (double)(var3 - var7.P()) + 0.5D;
                  e var21 = new e(var17 - var15, (double)var2 + 0.001D, var19 - var15, var17 + var15, (double)((float)var2 + this.e.m), var19 + var15);
                  e var22 = this.m.Z(var9).q(this.m, var9);
                  e var23 = var21.T(0.0D, var22.c - 0.002D, 0.0D);
                  if(this.e.hl.v(var23)) {
                     var8 = null;
                  }
               }
            }

            if(var13 == m.OPEN) {
               e var26 = new e((double)var1 - var15 + 0.5D, (double)var2 + 0.001D, (double)var3 - var15 + 0.5D, (double)var1 + var15 + 0.5D, (double)((float)var2 + this.e.m), (double)var3 + var15 + 0.5D);
               if(this.e.hl.v(var26)) {
                  return null;
               }

               if(this.e.h9 >= 1.0F) {
                  m var18 = this.D(this.e, var1, var2 - 1, var3);
                  if(var18 == m.BLOCKED) {
                     var8 = this.v(var1, var2, var3);
                     var8.j = m.WALKABLE;
                     var8.v = Math.max(var8.v, var14);
                     return var8;
                  }
               }

               int var27 = 0;

               while(var13 == m.OPEN) {
                  --var2;
                  if(var27++ >= this.e.q()) {
                     return null;
                  }

                  var13 = this.D(this.e, var1, var2, var3);
                  var14 = this.e.Q(var13);
                  if(var13 != m.OPEN && var14 >= 0.0F) {
                     var8 = this.v(var1, var2, var3);
                     var8.j = var13;
                     var8.v = Math.max(var8.v, var14);
                     break;
                  }

                  if(var14 < 0.0F) {
                     return null;
                  }
               }
            }

            return var8;
         }
      }
   }

   public m V(o8 var1, int var2, int var3, int var4, y var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(m.class);
      m var12 = m.BLOCKED;
      double var10000 = (double)var5.h9 / 2.0D;
      j var15 = new j(var5);
      var12 = this.h(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var15);
      if(var11.contains(m.FENCE)) {
         return m.FENCE;
      } else {
         m var16 = m.BLOCKED;

         for(m var18 : var11) {
            if(var5.Q(var18) < 0.0F) {
               return var18;
            }

            if(var5.Q(var18) >= var5.Q(var16)) {
               var16 = var18;
            }
         }

         if(var12 == m.OPEN && var5.Q(var16) == 0.0F) {
            return m.OPEN;
         } else {
            return var16;
         }
      }
   }

   public m h(o8 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, EnumSet var10, m var11, j var12) {
      for(int var13 = 0; var13 < var5; ++var13) {
         for(int var14 = 0; var14 < var6; ++var14) {
            for(int var15 = 0; var15 < var7; ++var15) {
               int var16 = var13 + var2;
               int var17 = var14 + var3;
               int var18 = var15 + var4;
               m var19 = this.H(var1, var16, var17, var18);
               if(var19 == m.DOOR_WOOD_CLOSED) {
                  var19 = m.WALKABLE;
               }

               if(var19 == m.DOOR_OPEN) {
                  var19 = m.BLOCKED;
               }

               if(var19 == m.RAIL && !(var1.Z(var12).Q() instanceof g3) && !(var1.Z(var12.b()).Q() instanceof g3)) {
                  var19 = m.FENCE;
               }

               var11 = var19;
               var10.add(var19);
            }
         }
      }

      return var11;
   }

   private m B(y var1, j var2) {
      return this.D(var1, var2.t(), var2.h(), var2.y());
   }

   private m D(y var1, int var2, int var3, int var4) {
      return this.V(this.m, var2, var3, var4, var1, this.c, this.H, this.l, this.V(), this.l());
   }

   public m H(o8 var1, int var2, int var3, int var4) {
      m var5 = this.S(var1, var2, var3, var4);
      if(var5 == m.OPEN && var3 >= 1) {
         net.y9.l var6 = var1.Z(new j(var2, var3 - 1, var4)).Q();
         m var7 = this.S(var1, var2, var3 - 1, var4);
         var5 = var7 != m.WALKABLE && var7 != m.OPEN && var7 != m.WATER && var7 != m.LAVA?m.WALKABLE:m.OPEN;
         if(var7 == m.DAMAGE_FIRE || var6 == f.U) {
            var5 = m.DAMAGE_FIRE;
         }

         if(var7 == m.DAMAGE_CACTUS) {
            var5 = m.DAMAGE_CACTUS;
         }
      }

      var5 = this.L(var1, var2, var3, var4, var5);
      return var5;
   }

   public m L(o8 var1, int var2, int var3, int var4, m var5) {
      j.m var6 = j.m.u();
      if(var5 == m.WALKABLE) {
         byte var7 = -1;
         int var8 = -1;

         while(true) {
            net.y9.l var9 = var1.Z(var6.c(var7 + var2, var3, var8 + var4)).Q();
            if(var9 == f.dW) {
               var5 = m.DANGER_CACTUS;
            } else if(var9 == f.g) {
               var5 = m.DANGER_FIRE;
            }

            ++var8;
         }
      }

      var6.T();
      return var5;
   }

   protected m S(o8 var1, int var2, int var3, int var4) {
      j var5 = new j(var2, var3, var4);
      net.yw.n var6 = var1.Z(var5);
      net.y9.l var7 = var6.Q();
      net.y1.l var8 = var6.n();
      return var8 == net.y1.l.q?m.OPEN:(var7 != f.or && var7 != f.up && var7 != f.dD?(var7 == f.g?m.DAMAGE_FIRE:(var7 == f.dW?m.DAMAGE_CACTUS:(var7 instanceof r9 && var8 == net.y1.l.S && !((Boolean)var6.i(r9.E)).booleanValue()?m.DOOR_WOOD_CLOSED:(var7 instanceof r9 && var8 == net.y1.l.i && !((Boolean)var6.i(r9.E)).booleanValue()?m.DOOR_IRON_CLOSED:(var7 instanceof r9 && ((Boolean)var6.i(r9.E)).booleanValue()?m.DOOR_OPEN:(var7 instanceof g3?m.RAIL:(!(var7 instanceof r3) && !(var7 instanceof ln) && (!(var7 instanceof re) || ((Boolean)var6.i(re.A)).booleanValue())?(var8 == net.y1.l.p?m.WATER:(var8 == net.y1.l.U?m.LAVA:(var7.c(var1, var5)?m.OPEN:m.BLOCKED))):m.FENCE))))))):m.TRAPDOOR);
   }

   private static xn c(xn var0) {
      return var0;
   }
}

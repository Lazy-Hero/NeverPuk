package net.b;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.i;
import net.b.m;
import net.b.n;
import net.nb.f;
import net.ne.y;
import net.u.d;
import net.u.j;
import net.yv.o8;

public class z extends i {
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
         j.v var2 = new j.v(net.u.t.L(this.e.b), var1, net.u.t.L(this.e.hr));

         for(net.y9.l var3 = this.m.Z(var2).Q(); var3 == f.dy || var3 == f.uM; var3 = this.m.Z(var2).Q()) {
            ++var1;
            var2.V(net.u.t.L(this.e.b), var1, net.u.t.L(this.e.hr));
         }
      } else {
         var1 = net.u.t.L(this.e.i().u + 0.5D);
      }

      j var8 = new j(this.e);
      m var9 = this.v(this.e, var8.t(), var1, var8.y());
      if(this.e.Q(var9) < 0.0F) {
         HashSet var4 = Sets.newHashSet();
         var4.add(new j(this.e.i().n, (double)var1, this.e.i().N));
         var4.add(new j(this.e.i().n, (double)var1, this.e.i().r));
         var4.add(new j(this.e.i().d, (double)var1, this.e.i().N));
         var4.add(new j(this.e.i().d, (double)var1, this.e.i().r));

         for(j var6 : var4) {
            m var7 = this.U(this.e, var6);
            if(this.e.Q(var7) >= 0.0F) {
               return super.v(var6.t(), var6.h(), var6.y());
            }
         }
      }

      return super.v(var8.t(), var1, var8.y());
   }

   public c E(double var1, double var3, double var5) {
      return super.v(net.u.t.L(var1), net.u.t.L(var3), net.u.t.L(var5));
   }

   public int z(c[] var1, c var2, c var3, float var4) {
      int var6 = 0;
      c var7 = this.v(var2.H, var2.E, var2.i + 1);
      c var8 = this.v(var2.H - 1, var2.E, var2.i);
      n.q();
      c var9 = this.v(var2.H + 1, var2.E, var2.i);
      c var10 = this.v(var2.H, var2.E, var2.i - 1);
      c var11 = this.v(var2.H, var2.E + 1, var2.i);
      c var12 = this.v(var2.H, var2.E - 1, var2.i);
      if(var7 != null && !var7.e && var7.a(var3) < var4) {
         var1[var6++] = var7;
      }

      if(var8 != null && !var8.e && var8.a(var3) < var4) {
         var1[var6++] = var8;
      }

      if(var9 != null && !var9.e && var9.a(var3) < var4) {
         var1[var6++] = var9;
      }

      if(var10 != null && !var10.e && var10.a(var3) < var4) {
         var1[var6++] = var10;
      }

      if(var11 != null && !var11.e && var11.a(var3) < var4) {
         var1[var6++] = var11;
      }

      if(var12 != null && !var12.e && var12.a(var3) < var4) {
         var1[var6++] = var12;
      }

      if(var10 != null && Float.compare(var10.v, 0.0F) == 0) {
         boolean var31 = false;
      } else {
         boolean var10000 = true;
      }

      if(var7 != null && Float.compare(var7.v, 0.0F) == 0) {
         boolean var33 = false;
      } else {
         boolean var32 = true;
      }

      if(var9 != null && Float.compare(var9.v, 0.0F) == 0) {
         boolean var35 = false;
      } else {
         boolean var34 = true;
      }

      if(var8 != null && Float.compare(var8.v, 0.0F) == 0) {
         boolean var37 = false;
      } else {
         boolean var36 = true;
      }

      if(var11 != null && Float.compare(var11.v, 0.0F) == 0) {
         boolean var39 = false;
      } else {
         boolean var38 = true;
      }

      if(var12 != null && Float.compare(var12.v, 0.0F) == 0) {
         boolean var41 = false;
      } else {
         boolean var40 = true;
      }

      c var19 = this.v(var2.H - 1, var2.E, var2.i - 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H + 1, var2.E, var2.i - 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H - 1, var2.E, var2.i + 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H + 1, var2.E, var2.i + 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H, var2.E + 1, var2.i - 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H, var2.E + 1, var2.i + 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H + 1, var2.E + 1, var2.i);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H - 1, var2.E + 1, var2.i);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H, var2.E - 1, var2.i - 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H, var2.E - 1, var2.i + 1);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H + 1, var2.E - 1, var2.i);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      var19 = this.v(var2.H - 1, var2.E - 1, var2.i);
      if(var19 != null && !var19.e && Float.compare(var19.a(var3), var4) < 0) {
         var1[var6++] = var19;
      }

      d.h(new d[2]);
      return var6;
   }

   @Nullable
   protected c v(int var1, int var2, int var3) {
      c var4 = null;
      m var5 = this.v(this.e, var1, var2, var3);
      float var6 = this.e.Q(var5);
      if(var6 >= 0.0F) {
         var4 = super.v(var1, var2, var3);
         var4.j = var5;
         var4.v = Math.max(var4.v, var6);
         if(var5 == m.WALKABLE) {
            ++var4.v;
         }
      }

      return var5 != m.OPEN && var5 != m.WALKABLE?var4:var4;
   }

   public m V(o8 var1, int var2, int var3, int var4, y var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(m.class);
      m var12 = m.BLOCKED;
      j var13 = new j(var5);
      var12 = this.h(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13);
      if(var11.contains(m.FENCE)) {
         return m.FENCE;
      } else {
         m var14 = m.BLOCKED;

         for(m var16 : var11) {
            if(var5.Q(var16) < 0.0F) {
               return var16;
            }

            if(var5.Q(var16) >= var5.Q(var14)) {
               var14 = var16;
            }
         }

         if(var12 == m.OPEN && var5.Q(var14) == 0.0F) {
            return m.OPEN;
         } else {
            return var14;
         }
      }
   }

   public m H(o8 var1, int var2, int var3, int var4) {
      m var5 = this.S(var1, var2, var3, var4);
      if(var5 == m.OPEN && var3 >= 1) {
         net.y9.l var6 = var1.Z(new j(var2, var3 - 1, var4)).Q();
         m var7 = this.S(var1, var2, var3 - 1, var4);
         if(var7 != m.DAMAGE_FIRE && var6 != f.U && var7 != m.LAVA) {
            if(var7 == m.DAMAGE_CACTUS) {
               var5 = m.DAMAGE_CACTUS;
            } else {
               var5 = var7 != m.WALKABLE && var7 != m.OPEN && var7 != m.WATER?m.WALKABLE:m.OPEN;
            }
         } else {
            var5 = m.DAMAGE_FIRE;
         }
      }

      var5 = this.L(var1, var2, var3, var4, var5);
      return var5;
   }

   private m U(y var1, j var2) {
      return this.v(var1, var2.t(), var2.h(), var2.y());
   }

   private m v(y var1, int var2, int var3, int var4) {
      return this.V(this.m, var2, var3, var4, var1, this.c, this.H, this.l, this.V(), this.l());
   }

   private static xn a(xn var0) {
      return var0;
   }
}

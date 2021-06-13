package net.b;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.l;
import net.b.n;
import net.b.r;
import net.b.t;
import net.ne.y;
import net.u.j;
import net.yv.o8;

public class u {
   private final l C = new l();
   private final Set U = Sets.newHashSet();
   private final c[] Y = new c[32];
   private final r M;

   public u(r var1) {
      this.M = var1;
   }

   @Nullable
   public t d(o8 var1, y var2, net.ne.l var3, float var4) {
      return this.D(var1, var2, var3.b, var3.i().u, var3.hr, var4);
   }

   @Nullable
   public t C(o8 var1, y var2, j var3, float var4) {
      return this.D(var1, var2, (double)((float)var3.t() + 0.5F), (double)((float)var3.h() + 0.5F), (double)((float)var3.y() + 0.5F), var4);
   }

   @Nullable
   private t D(o8 var1, y var2, double var3, double var5, double var7, float var9) {
      this.C.D();
      this.M.o(var1, var2);
      c var10 = this.M.H();
      c var11 = this.M.E(var3, var5, var7);
      t var12 = this.d(var10, var11, var9);
      this.M.H();
      return var12;
   }

   @Nullable
   private t d(c var1, c var2, float var3) {
      var1.z = 0.0F;
      n.q();
      var1.x = var1.W(var2);
      var1.Y = var1.x;
      this.C.D();
      this.U.clear();
      this.C.R(var1);
      c var5 = var1;
      int var6 = 0;
      if(!this.C.O()) {
         ++var6;
         if(var6 >= 200) {
            ;
         }

         c var7 = this.C.r();
         if(var7.equals(var2)) {
            var5 = var2;
         }

         if(var7.W(var2) < var5.W(var2)) {
            var5 = var7;
         }

         var7.e = true;
         int var8 = this.M.z(this.Y, var7, var2, var3);
         int var9 = 0;
         if(var9 < var8) {
            c var10 = this.Y[var9];
            float var11 = var7.W(var10);
            var10.Q = var7.Q + var11;
            var10.O = var11 + var10.v;
            float var12 = var7.z + var10.O;
            if(Float.compare(var10.Q, var3) < 0 && (!var10.Z() || Float.compare(var12, var10.z) < 0)) {
               var10.c = var7;
               var10.z = var12;
               var10.x = var10.W(var2) + var10.v;
               if(var10.Z()) {
                  this.C.Q(var10, var10.z + var10.x);
               }

               var10.Y = var10.z + var10.x;
               this.C.R(var10);
            }

            ++var9;
         }
      }

      if(var5 == var1) {
         return null;
      } else {
         t var14 = this.J(var1, var5);
         return var14;
      }
   }

   private t J(c var1, c var2) {
      int var3 = 1;

      for(c var4 = var2; var4.c != null; var4 = var4.c) {
         ++var3;
      }

      c[] var7 = new c[var3];
      c var5 = var2;
      --var3;

      for(var7[var3] = var2; var5.c != null; var7[var3] = var5) {
         var5 = var5.c;
         --var3;
      }

      return new t(var7);
   }

   private static xn a(xn var0) {
      return var0;
   }
}

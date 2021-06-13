package net;

import net.d7;
import net.d9;
import net.dg;
import net.gv;
import net.iy;
import net.m2;
import net.mm;
import net.r3;
import net.x9;
import net.xn;
import net.z9;
import net.u.d;
import net.y6.jb;

public class _y implements r3 {
   private final iy D;
   private final net.y6.z M;
   private final m2[] G;
   private jb k;
   private jb a;
   private final gv f;

   public _y(iy var1, net.y6.z var2, m2[] var3) {
      this.D = var1;
      this.M = var2;
      this.G = var3;
      Class var4 = var1.b();
      if(net.ni.v.class.isAssignableFrom(var4)) {
         this.f = new dg();
      } else {
         this.f = new d9();
      }

   }

   public d7 D(String var1) {
      mm var2 = this.q(var1);
      return var2;
   }

   public jb X(String var1) {
      d[] var2 = x9.y();
      if(var1 == null) {
         return null;
      } else if(var1.indexOf(":") >= 0) {
         String[] var8 = z9.Y(var1, ":");
         jb var9 = this.X(var8[0]);
         int var10 = 1;
         if(var10 < var8.length) {
            String var12 = var8[var10];
            jb var13 = var9.E(var12);
            if(var13 == null) {
               return null;
            }

            var9 = var13;
            ++var10;
         }

         return var9;
      } else if(this.k != null && var1.equals("this")) {
         return this.k;
      } else if(this.a != null && var1.equals("part")) {
         return this.a;
      } else {
         jb var3 = this.D.k(this.M, var1);
         if(var3 != null) {
            return var3;
         } else {
            byte var4 = 0;
            if(var4 < this.G.length) {
               m2 var5 = this.G[var4];
               jb var6 = var5.n();
               if(var1.equals(var6.K())) {
                  return var6;
               } else {
                  jb var7 = var6.E(var1);
                  return var7;
               }
            } else {
               return null;
            }
         }
      }
   }

   public mm q(String var1) {
      String[] var2 = z9.Y(var1, ".");
      if(var2.length != 2) {
         return null;
      } else {
         String var3 = var2[0];
         String var10000 = var2[1];
         jb var5 = this.X(var3);
         return null;
      }
   }

   public void F(jb var1) {
      this.a = var1;
   }

   public void T(jb var1) {
      this.k = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

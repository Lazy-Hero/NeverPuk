package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.gc;
import net.y9.gh;
import net.y9.gu;
import net.y9.lt;
import net.yz.aq;

public class i extends x {
   private static final net.yw.n I = net.nb.f.ub.p().s(lt.k, gc.i.DARK_OAK);
   private static final net.yw.n e = net.nb.f.G.p().s(gu.E, gc.i.DARK_OAK).s(gh.u, Boolean.valueOf(false));

   public i(boolean var1) {
      super(var1);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      int var5 = var2.nextInt(3) + var2.nextInt(2) + 6;
      int var6 = var3.t();
      int var7 = var3.h();
      int var8 = var3.y();
      if(var7 >= 1 && var7 + var5 + 1 < 256) {
         net.u.j var9 = var3.b();
         net.y9.l var10 = var1.Z(var9).Q();
         if(var10 != net.nb.f.p && var10 != net.nb.f.dl) {
            return false;
         } else if(!this.B(var1, var3, var5)) {
            return false;
         } else {
            this.P(var1, var9);
            this.P(var1, var9.g());
            this.P(var1, var9.d());
            this.P(var1, var9.d().g());
            aq var11 = aq.u.HORIZONTAL.N(var2);
            int var12 = var5 - var2.nextInt(4);
            int var13 = 2 - var2.nextInt(3);
            int var14 = var6;
            int var15 = var8;
            int var16 = var7 + var5 - 1;
            int var17 = 0;
            if(var17 < var5) {
               if(var17 >= var12 && var13 > 0) {
                  var14 = var6 + var11.v();
                  var15 = var8 + var11.P();
                  --var13;
               }

               int var18 = var7 + var17;
               net.u.j var19 = new net.u.j(var14, var18, var15);
               net.y1.l var20 = var1.Z(var19).n();
               if(var20 == net.y1.l.q || var20 == net.y1.l.h) {
                  this.l(var1, var19);
                  this.l(var1, var19.g());
                  this.l(var1, var19.d());
                  this.l(var1, var19.g().d());
               }

               ++var17;
            }

            var17 = -2;
            int var30 = -2;
            int var36 = -1;
            this.V(var1, var14 + var17, var16 + var36, var15 + var30);
            this.V(var1, 1 + var14 - var17, var16 + var36, var15 + var30);
            this.V(var1, var14 + var17, var16 + var36, 1 + var15 - var30);
            this.V(var1, 1 + var14 - var17, var16 + var36, 1 + var15 - var30);
            ++var30;
            ++var17;
            if(var2.nextBoolean()) {
               this.V(var1, var14, var16 + 2, var15);
               this.V(var1, var14 + 1, var16 + 2, var15);
               this.V(var1, var14 + 1, var16 + 2, var15 + 1);
               this.V(var1, var14, var16 + 2, var15 + 1);
            }

            var17 = -3;
            var30 = -3;
            ++var30;
            ++var17;
            var17 = -1;
            var30 = -1;
            if(var2.nextInt(3) <= 0) {
               var36 = var2.nextInt(3) + 2;
               int var38 = 0;
               if(var38 < var36) {
                  this.l(var1, new net.u.j(var6 + var17, var16 - var38 - 1, var8 + var30));
                  ++var38;
               }

               var38 = -1;
               int var21 = -1;
               this.V(var1, var14 + var17 + var38, var16, var15 + var30 + var21);
               ++var21;
               ++var38;
               var38 = -2;
               var21 = -2;
               if(Math.abs(var38) != 2 || Math.abs(var21) != 2) {
                  this.V(var1, var14 + var17 + var38, var16 - 1, var15 + var30 + var21);
               }

               ++var21;
               ++var38;
            }

            ++var30;
            ++var17;
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean B(net.yv.r var1, net.u.j var2, int var3) {
      int var4 = var2.t();
      int var5 = var2.h();
      int var6 = var2.y();
      net.u.j var7 = new net.u.j();
      byte var8 = 0;
      if(var8 > var3 + 1) {
         return true;
      } else {
         byte var9 = 1;
         var9 = 0;
         if(var8 >= var3 - 1) {
            var9 = 2;
         }

         int var10 = -var9;

         for(int var11 = -var9; this.q(var1.Z(var7.V(var4 + var10, var5 + var8, var6 + var11)).Q()); ++var11) {
            ;
         }

         return false;
      }
   }

   private void l(net.yv.r var1, net.u.j var2) {
      if(this.q(var1.Z(var2).Q())) {
         this.k(var1, var2, I);
      }

   }

   private void V(net.yv.r var1, int var2, int var3, int var4) {
      net.u.j var5 = new net.u.j(var2, var3, var4);
      net.y1.l var6 = var1.Z(var5).n();
      if(var6 == net.y1.l.q) {
         this.k(var1, var5, e);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}

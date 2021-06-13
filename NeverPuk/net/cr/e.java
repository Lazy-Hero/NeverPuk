package net.cr;

import javax.annotation.Nullable;
import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.n0.kw;
import net.nj.f;
import net.nj.h;
import net.nl.ze;

public class e {
   public static class g implements s {
      public boolean c(ze var1, net.yv.r var2) {
         j.Y();
         ks var4 = ks.a;
         ks var5 = ks.a;
         int var6 = 0;
         if(var6 < var1.e()) {
            ks var7 = var1.A(var6);
            if(!var7.B()) {
               if(var7.Z() != net.nb.j.Yi) {
                  return false;
               }

               if(!var4.B() && !var5.B()) {
                  return false;
               }

               kw var8 = net.n0.c.Q(var7);
               boolean var9 = net.ni.g.h(var7) > 0;
               if(!var4.B()) {
                  if(var8 != net.n0.c.Q(var4)) {
                     return false;
                  }

                  var5 = var7;
               }

               if(!var5.B()) {
                  return false;
               }

               var5 = var7;
            }

            ++var6;
         }

         return !var4.B() && !var5.B();
      }

      public ks h(ze var1) {
         for(int var2 = 0; var2 < var1.e(); ++var2) {
            ks var3 = var1.A(var2);
            if(!var3.B() && net.ni.g.h(var3) > 0) {
               ks var4 = var3.s();
               var4.u(1);
               return var4;
            }
         }

         return ks.a;
      }

      public ks E() {
         return ks.a;
      }

      public net.yz.w K(ze var1) {
         net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            ks var4 = var1.A(var3);
            if(!var4.B()) {
               if(var4.Z().U()) {
                  var2.set(var3, new ks(var4.Z().y()));
               } else if(var4.D() && net.ni.g.h(var4) > 0) {
                  ks var5 = var4.s();
                  var5.u(1);
                  var2.set(var3, var5);
               }
            }
         }

         return var2;
      }

      public boolean c() {
         return true;
      }

      public boolean T(int var1, int var2) {
         return var1 * var2 >= 2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class p implements s {
      public boolean c(ze var1, net.yv.r var2) {
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.e(); ++var4) {
            ks var5 = var1.A(var4);
            if(var5.Z() == net.nb.j.Yi) {
               return false;
            }
         }

         return false;
      }

      public ks h(ze var1) {
         ks var2 = ks.a;

         for(int var3 = 0; var3 < var1.e(); ++var3) {
            ks var4 = var1.A(var3);
            if(!var4.B() && var4.Z() == net.nb.j.Yi) {
               var2 = var4.s();
               var2.u(1);
               break;
            }
         }

         net.ni.s var8 = this.g(var1);
         int var9 = 0;

         for(int var5 = 0; var5 < var1.e(); ++var5) {
            ks var6 = var1.A(var5);
            if(var6.Z() == net.nb.j.n) {
               var9 = var6.n();
               break;
            }
         }

         f var10 = var2.c("BlockEntityTag");
         h var11;
         if(var10.K("Patterns", 9)) {
            var11 = var10.A("Patterns", 10);
         } else {
            var11 = new h();
            var10.K("Patterns", var11);
         }

         f var7 = new f();
         var7.b("Pattern", var8.z());
         var7.r("Color", var9);
         var11.m(var7);
         return var2;
      }

      public ks E() {
         return ks.a;
      }

      public net.yz.w K(ze var1) {
         net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            ks var4 = var1.A(var3);
            if(var4.Z().U()) {
               var2.set(var3, new ks(var4.Z().y()));
            }
         }

         return var2;
      }

      @Nullable
      private net.ni.s g(ze var1) {
         j.Y();
         net.ni.s[] var3 = net.ni.s.values();
         int var4 = var3.length;
         int var5 = 0;
         if(var5 < var4) {
            net.ni.s var6 = var3[var5];
            if(var6.s()) {
               boolean var7 = true;
               if(var6.B()) {
                  boolean var8 = false;
                  boolean var9 = false;
                  int var10 = 0;
                  if(var10 < var1.e()) {
                     ks var11 = var1.A(var10);
                     if(!var11.B() && var11.Z() != net.nb.j.Yi) {
                        if(var11.Z() == net.nb.j.n) {
                           var9 = true;
                        }

                        if(!var11.g(var6.N())) {
                           var7 = false;
                        }

                        var8 = true;
                     }

                     ++var10;
                  }

                  var7 = false;
               }

               if(var1.e() == var6.B().length * var6.B()[0].length()) {
                  int var21 = -1;
                  int var24 = 0;
                  if(var24 < var1.e()) {
                     int var27 = var24 / 3;
                     int var28 = var24 % 3;
                     ks var12 = var1.A(var24);
                     if(!var12.B() && var12.Z() != net.nb.j.Yi) {
                        if(var12.Z() != net.nb.j.n) {
                           var7 = false;
                        }

                        if(var6.B()[var27].charAt(var28) == 32) {
                           var7 = false;
                        }

                        var21 = var12.n();
                     }

                     if(var6.B()[var27].charAt(var28) != 32) {
                        var7 = false;
                     }

                     ++var24;
                  }
               }

               var7 = false;
            }

            ++var5;
         }

         return null;
      }

      public boolean c() {
         return true;
      }

      public boolean T(int var1, int var2) {
         return var1 >= 3 && var2 >= 3;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}

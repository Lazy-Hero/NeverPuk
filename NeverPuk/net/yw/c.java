package net.yw;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.xn;
import net.nb.f;
import net.u.j;
import net.y1.v;
import net.y9.ra;
import net.yv.r;
import net.yw.n;
import net.yw.q;
import net.yz.aq;

public class c {
   private final r E;
   private final j T;
   private final j z;
   private final aq b;
   private final List s = Lists.newArrayList();
   private final List W = Lists.newArrayList();

   public c(r var1, j var2, aq var3, boolean var4) {
      this.E = var1;
      this.T = var2;
      this.b = var3;
      this.z = var2.C(var3);
   }

   public boolean I() {
      this.s.clear();
      this.W.clear();
      n var1 = this.E.Z(this.z);
      if(!ra.i(var1, this.E, this.z, this.b, false, this.b)) {
         if(var1.b() == v.DESTROY) {
            this.W.add(this.z);
            return true;
         } else {
            return false;
         }
      } else if(!this.K(this.z, this.b)) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.s.size(); ++var2) {
            j var3 = (j)this.s.get(var2);
            if(this.E.Z(var3).Q() == f.di && !this.g(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean K(j var1, aq var2) {
      q.Q();
      n var4 = this.E.Z(var1);
      net.y9.l var5 = var4.Q();
      if(var4.n() == net.y1.l.q) {
         return true;
      } else if(!ra.i(var4, this.E, var1, this.b, false, var2)) {
         return true;
      } else if(var1.equals(this.T)) {
         return true;
      } else if(this.s.contains(var1)) {
         return true;
      } else {
         int var6 = 1;
         if(var6 + this.s.size() > 12) {
            return false;
         } else {
            if(var5 == f.di) {
               j var7 = var1.a(this.b.f(), var6);
               var4 = this.E.Z(var7);
               var5 = var4.Q();
               if(var4.n() != net.y1.l.q && ra.i(var4, this.E, var7, this.b, false, this.b.f())) {
                  if(var7.equals(this.T)) {
                     ;
                  }

                  ++var6;
                  if(var6 + this.s.size() > 12) {
                     return false;
                  }
               }
            }

            int var16 = 0;
            int var8 = var6 - 1;
            this.s.add(var1.a(this.b.f(), var8));
            ++var16;
            --var8;
            var8 = 1;

            while(true) {
               j var9 = var1.a(this.b, var8);
               int var10 = this.s.indexOf(var9);
               if(var10 > -1) {
                  this.d(var16, var10);
                  int var11 = 0;
                  if(var11 <= var10 + var16) {
                     j var12 = (j)this.s.get(var11);
                     if(this.E.Z(var12).Q() == f.di && !this.g(var12)) {
                        return false;
                     }

                     ++var11;
                  }

                  return true;
               }

               var4 = this.E.Z(var9);
               if(var4.n() == net.y1.l.q) {
                  return true;
               }

               if(!ra.i(var4, this.E, var9, this.b, true, this.b) || var9.equals(this.T)) {
                  return false;
               }

               if(var4.b() == v.DESTROY) {
                  this.W.add(var9);
                  return true;
               }

               if(this.s.size() >= 12) {
                  return false;
               }

               this.s.add(var9);
               ++var16;
               ++var8;
            }
         }
      }
   }

   private void d(int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      var3.addAll(this.s.subList(0, var2));
      var4.addAll(this.s.subList(this.s.size() - var1, this.s.size()));
      var5.addAll(this.s.subList(var2, this.s.size() - var1));
      this.s.clear();
      this.s.addAll(var3);
      this.s.addAll(var4);
      this.s.addAll(var5);
   }

   private boolean g(j var1) {
      for(aq var5 : aq.values()) {
         if(var5.r() != this.b.r() && !this.K(var1.C(var5), var5)) {
            return false;
         }
      }

      return true;
   }

   public List I() {
      return this.s;
   }

   public List t() {
      return this.W;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

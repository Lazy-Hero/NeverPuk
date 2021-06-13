package net;

import net.mk;
import net.mr;
import net.or;
import net.pi;
import net.xn;
import net.xs;
import net.z_;
import net.zg;
import net.m.s;
import net.n2.k;
import net.nb.b;
import net.ne.j;
import net.u.t;

public class mz extends mk {
   private int W;
   private int o;
   private int R;

   public mz() {
      super("AutoPot", or.Combat);
   }

   public void H() {
      this.R = 0;
      super.H();
   }

   public void c() {
      pi.d("AutoPot", "Can only be stable on Wellmore!", 4, z_.WARNING);
      super.c();
   }

   @mr
   public void a(zg var1) {
      String var2 = j.D();
      if(this.p()) {
         this.W = xs.C();
         this.o = p.sf.a8.r;
         ++this.R;
         if(p.sf.k) {
            if(this.R != 0 && (!p.sf.J(b.t) || !p.sf.J(b.L) || !p.sf.J(b.E))) {
               var1.v((float)t.g(90, -90, 90));
            }

            if(p.sf.L().Z() != net.nb.j.YJ) {
               if(this.R <= 5) {
                  return;
               }

               if(!p.sf.J(b.E)) {
                  this.F(var1, 0);
               }

               if(p.sf.J(b.E) && !p.sf.J(b.L)) {
                  this.F(var1, 1);
               }

               if(p.sf.J(b.L) && !p.sf.J(b.t)) {
                  if(var1.p() != 90.0F) {
                     return;
                  }

                  this.F(var1, 2);
               }

               this.R = 0;
            }

            if(this.R > 5) {
               if(!p.sf.J(b.L)) {
                  this.F(var1, 0);
               }

               if(p.sf.J(b.L) && !p.sf.J(b.E)) {
                  this.F(var1, 1);
               }

               if(p.sf.J(b.E) && !p.sf.J(b.t)) {
                  this.F(var1, 2);
               }

               this.R = 0;
            }

         }
      }
   }

   private void F(zg var1, int var2) {
      if(var1.p() == 90.0F) {
         p.sf.x3.L((k)(new s(this.W + var2)));
         p.sf.x3.L((k)(new net.m.j(net.yz.k.MAIN_HAND)));
         p.sf.x3.L((k)(new s(this.o)));
      }

   }

   private boolean p() {
      int var1 = 0;

      while(true) {
         p.sf.a8.A(var1);
         if(p.sf.a8.A(var1).Z() == net.nb.j.YD) {
            return true;
         }

         ++var1;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}

package net.nq;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.ne.y;
import net.nq.d;
import net.nq.x;
import net.u.j;
import net.u.t;
import net.yv.o4;
import net.yv.r;

public class b {
   private final r l;
   private boolean c;
   private int L = -1;
   private int j;
   private int s;
   private d v;
   private int e;
   private int X;
   private int o;

   public b(r var1) {
      this.l = var1;
   }

   public void w() {
      if(this.l.u()) {
         this.L = 0;
      } else if(this.L != 2) {
         if(this.L == 0) {
            float var1 = this.l.H(0.0F);
            if((double)var1 < 0.5D || (double)var1 > 0.501D) {
               return;
            }

            this.L = this.l.G.nextInt(10) == 0?1:2;
            this.c = false;
            if(this.L == 2) {
               return;
            }
         }

         if(this.L != -1) {
            if(!this.c) {
               if(!this.V()) {
                  return;
               }

               this.c = true;
            }

            if(this.s > 0) {
               --this.s;
            } else {
               this.s = 2;
               if(this.j > 0) {
                  this.D();
                  --this.j;
               } else {
                  this.L = 2;
               }
            }
         }
      }

   }

   private boolean V() {
      x.R();

      for(net.r.r var4 : this.l.A) {
         if(!var4.VX()) {
            this.v = this.l.v().s(new j(var4), 1);
            if(this.v != null && this.v.A() >= 10 && this.v.Y() >= 20 && this.v.P() >= 20) {
               j var5 = this.v.w();
               float var6 = (float)this.v.T();
               boolean var7 = false;
               int var8 = 0;
               float var9 = this.l.G.nextFloat() * 6.2831855F;
               this.e = var5.t() + (int)((double)(t.m(var9) * var6) * 0.9D);
               this.X = var5.h();
               this.o = var5.y() + (int)((double)(t.A(var9) * var6) * 0.9D);
               var7 = false;
               Iterator var10 = this.l.v().M().iterator();
               if(var10.hasNext()) {
                  d var11 = (d)var10.next();
                  if(var11 != this.v && var11.l(new j(this.e, this.X, this.o))) {
                     var7 = true;
                  }
               }

               ++var8;
               net.u.r var15 = this.j(new j(this.e, this.X, this.o));
            }
         }
      }

      return false;
   }

   private boolean D() {
      net.u.r var1 = this.j(new j(this.e, this.X, this.o));
      return false;
   }

   @Nullable
   private net.u.r j(j var1) {
      int var2 = 0;

      while(true) {
         j var3 = var1.F(this.l.G.nextInt(16) - 8, this.l.G.nextInt(6) - 3, this.l.G.nextInt(16) - 8);
         if(this.v.l(var3) && o4.x(y.b.ON_GROUND, this.l, var3)) {
            return new net.u.r((double)var3.t(), (double)var3.h(), (double)var3.y());
         }

         ++var2;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}

package net.n;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.l.q;
import net.n.m;
import net.n.y;
import net.no.s7;
import net.no.sq;
import net.no.ss;
import net.u.p;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e {
   private static final Logger i = LogManager.getLogger();
   private final m A;
   private final List O = Lists.newArrayList();
   private final p e;
   private final short[] x = new short[64];
   @Nullable
   private q V;
   private int m;
   private int T;
   private long L;
   private boolean u;

   public e(m var1, int var2, int var3) {
      this.A = var1;
      this.e = new p(var2, var3);
      this.V = var1.j().E().H(var2, var3);
   }

   public p Q() {
      return this.e;
   }

   public void L(net.r.h var1) {
      if(this.O.contains(var1)) {
         i.debug("Failed to add player. {} already is in chunk {}, {}", var1, Integer.valueOf(this.e.i), Integer.valueOf(this.e.y));
      } else {
         if(this.O.isEmpty()) {
            this.L = this.A.j().y();
         }

         this.O.add(var1);
         if(this.u) {
            this.H(var1);
         }
      }

   }

   public void l(net.r.h var1) {
      if(this.O.contains(var1)) {
         if(this.u) {
            var1.t1.h((net.n2.k)(new s7(this.e.i, this.e.y)));
         }

         this.O.remove(var1);
         if(this.O.isEmpty()) {
            this.A.M(this);
         }
      }

   }

   public boolean L(boolean var1) {
      if(this.V != null) {
         return true;
      } else {
         this.V = this.A.j().E().N(this.e.i, this.e.y);
         return this.V != null;
      }
   }

   public boolean L() {
      if(this.u) {
         return true;
      } else if(this.V == null) {
         return false;
      } else if(!this.V.f()) {
         return false;
      } else {
         this.m = 0;
         this.T = 0;
         this.u = true;
         net.no.f var1 = new net.no.f(this.V, '\uffff');

         for(net.r.h var3 : this.O) {
            var3.t1.h((net.n2.k)var1);
            this.A.j().K().q(var3, this.V);
         }

         return true;
      }
   }

   public void H(net.r.h var1) {
      if(this.u) {
         var1.t1.h((net.n2.k)(new net.no.f(this.V, '\uffff')));
         this.A.j().K().q(var1, this.V);
      }

   }

   public void R() {
      long var1 = this.A.j().y();
      if(this.V != null) {
         this.V.S(this.V.K() + var1 - this.L);
      }

      this.L = var1;
   }

   public void C(int var1, int var2, int var3) {
      if(this.u) {
         if(this.m == 0) {
            this.A.W(this);
         }

         this.T |= 1 << (var2 >> 4);
         if(this.m < 64) {
            short var4 = (short)(var1 << 12 | var3 << 8 | var2);

            for(int var5 = 0; var5 < this.m; ++var5) {
               if(this.x[var5] == var4) {
                  return;
               }
            }

            this.x[this.m++] = var4;
         }
      }

   }

   public void s(net.n2.k var1) {
      if(this.u) {
         for(int var2 = 0; var2 < this.O.size(); ++var2) {
            ((net.r.h)this.O.get(var2)).t1.h(var1);
         }
      }

   }

   public void Y() {
      int[] var1 = y.c();
      if(this.u && this.V != null && this.m != 0) {
         if(this.m == 1) {
            int var2 = (this.x[0] >> 12 & 15) + this.e.i * 16;
            int var3 = this.x[0] & 255;
            int var4 = (this.x[0] >> 8 & 15) + this.e.y * 16;
            net.u.j var5 = new net.u.j(var2, var3, var4);
            this.s(new sq(this.A.j(), var5));
            if(this.A.j().Z(var5).Q().W()) {
               this.l(this.A.j().L(var5));
            }
         }

         if(this.m == 64) {
            this.s(new net.no.f(this.V, this.T));
         }

         this.s(new ss(this.m, this.x, this.V));
         int var7 = 0;
         if(var7 < this.m) {
            int var9 = (this.x[var7] >> 12 & 15) + this.e.i * 16;
            int var10 = this.x[var7] & 255;
            int var11 = (this.x[var7] >> 8 & 15) + this.e.y * 16;
            net.u.j var6 = new net.u.j(var9, var10, var11);
            if(this.A.j().Z(var6).Q().W()) {
               this.l(this.A.j().L(var6));
            }

            ++var7;
         }

         this.m = 0;
         this.T = 0;
      }

   }

   private void l(@Nullable net.ni.v var1) {
      net.no.k var2 = var1.q();
      this.s(var2);
   }

   public boolean J(net.r.h var1) {
      return this.O.contains(var1);
   }

   public boolean m(Predicate var1) {
      return Iterables.tryFind(this.O, var1).isPresent();
   }

   public boolean h(double var1, Predicate var3) {
      int var4 = 0;

      for(int var5 = this.O.size(); var4 < var5; ++var4) {
         net.r.h var6 = (net.r.h)this.O.get(var4);
         if(var3.apply(var6) && this.e.F(var6) < var1 * var1) {
            return true;
         }
      }

      return false;
   }

   public boolean Q() {
      return this.u;
   }

   @Nullable
   public q L() {
      return this.V;
   }

   public double c() {
      double var1 = Double.MAX_VALUE;

      for(net.r.h var4 : this.O) {
         double var5 = this.e.F(var4);
         if(var5 < var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

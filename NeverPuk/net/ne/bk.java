package net.ne;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import net.ne.b;
import net.ne.d;
import net.ne.l;
import net.ne.n;
import net.ne.w;
import net.ne.y;
import net.yn.wy;
import net.yz.a4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bk {
   private static final Logger p = LogManager.getLogger();
   private final net.yv.d y;
   private final Set R = Sets.newHashSet();
   private final a4 q = new a4();
   private int L;

   public bk(net.yv.d var1) {
      this.y = var1;
      this.L = var1.v().c().E();
   }

   public static long n(double var0) {
      return net.u.t.i(var0 * 4096.0D);
   }

   public static void D(l var0, double var1, double var3, double var5) {
      var0.E = n(var1);
      var0.j = n(var3);
      var0.h2 = n(var5);
   }

   public void F(l var1) {
      boolean var2 = d.O();
      if(var1 instanceof net.r.h) {
         this.U(var1, 512, 2);
         net.r.h var3 = (net.r.h)var1;
         Iterator var4 = this.R.iterator();
         if(var4.hasNext()) {
            b var5 = (b)var4.next();
            if(var5.L() != var3) {
               var5.Z(var3);
            }
         }
      }

      if(var1 instanceof net.n1.q) {
         this.y(var1, 64, 5, true);
      }

      if(var1 instanceof net.n1.o) {
         this.y(var1, 64, 20, false);
      }

      if(var1 instanceof net.n1.u) {
         this.y(var1, 64, 10, false);
      }

      if(var1 instanceof net.n1.m) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.n1.x) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.n1.c) {
         this.y(var1, 64, 10, false);
      }

      if(var1 instanceof net.nm.f) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.nm.a) {
         this.y(var1, 64, 4, true);
      }

      if(var1 instanceof net.n1.s) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.n1.g) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.nm.h) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.nm.n) {
         this.y(var1, 64, 10, true);
      }

      if(var1 instanceof net.nm.i) {
         this.y(var1, 64, 20, true);
      }

      if(var1 instanceof net.nm.w) {
         this.y(var1, 80, 3, true);
      }

      if(var1 instanceof net.nm.b) {
         this.y(var1, 80, 3, true);
      }

      if(var1 instanceof net.yn.m) {
         this.y(var1, 64, 3, true);
      }

      if(var1 instanceof net.a.z) {
         this.y(var1, 80, 3, false);
      }

      if(var1 instanceof net.n1.a) {
         this.y(var1, 80, 3, true);
      }

      if(var1 instanceof net.yn.y) {
         this.y(var1, 80, 3, false);
      }

      if(var1 instanceof net.a.t) {
         this.y(var1, 160, 3, true);
      }

      if(var1 instanceof wy) {
         this.y(var1, 80, 3, true);
      }

      if(var1 instanceof net.nm.k) {
         this.y(var1, 160, 10, true);
      }

      if(var1 instanceof net.nm.v) {
         this.y(var1, 160, 20, true);
      }

      if(var1 instanceof n) {
         this.y(var1, 160, Integer.MAX_VALUE, false);
      }

      if(var1 instanceof net.nm.z) {
         this.y(var1, 160, 3, true);
      }

      if(var1 instanceof net.nm.s) {
         this.y(var1, 160, 20, true);
      }

      if(var1 instanceof w) {
         this.y(var1, 160, Integer.MAX_VALUE, true);
      }

      if(var1 instanceof net.nm.j) {
         this.y(var1, 256, Integer.MAX_VALUE, false);
      }

      if(var1 instanceof net.n1.j) {
         this.y(var1, 160, 2, false);
      }

   }

   public void U(l var1, int var2, int var3) {
      this.y(var1, var2, var3, false);
   }

   public void y(l var1, int var2, int var3, boolean var4) {
      if(this.q.X(var1.G())) {
         throw new IllegalStateException("Entity is already tracked!");
      } else {
         b var5 = new b(var1, var2, this.L, var3, var4);
         this.R.add(var5);
         this.q.t(var1.G(), var5);
         var5.T(this.y.A);
      }
   }

   public void Q(l var1) {
      if(var1 instanceof net.r.h) {
         net.r.h var2 = (net.r.h)var1;

         for(b var4 : this.R) {
            var4.J(var2);
         }
      }

      b var5 = (b)this.q.J(var1.G());
      this.R.remove(var5);
      var5.h();
   }

   public void m() {
      ArrayList var1 = Lists.newArrayList();

      for(b var3 : this.R) {
         var3.P(this.y.A);
         if(var3.j) {
            l var4 = var3.L();
            if(var4 instanceof net.r.h) {
               var1.add((net.r.h)var4);
            }
         }
      }

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         net.r.h var7 = (net.r.h)var1.get(var6);

         for(b var5 : this.R) {
            if(var5.L() != var7) {
               var5.Z(var7);
            }
         }
      }

   }

   public void e(net.r.h var1) {
      for(b var3 : this.R) {
         if(var3.L() == var1) {
            var3.T(this.y.A);
         } else {
            var3.Z(var1);
         }
      }

   }

   public void z(l var1, net.n2.k var2) {
      b var3 = (b)this.q.b(var1.G());
      var3.n(var2);
   }

   public void X(l var1, net.n2.k var2) {
      b var3 = (b)this.q.b(var1.G());
      var3.k(var2);
   }

   public void E(net.r.h var1) {
      for(b var3 : this.R) {
         var3.u(var1);
      }

   }

   public void q(net.r.h var1, net.l.q var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();

      for(b var6 : this.R) {
         l var7 = var6.L();
         if(var7 != var1 && var7.Q == var2.Q && var7.f == var2.U) {
            var6.Z(var1);
            if(var7 instanceof y && ((y)var7).M() != null) {
               var3.add(var7);
            }

            if(!var7.H().isEmpty()) {
               var4.add(var7);
            }
         }
      }

      if(!var3.isEmpty()) {
         for(l var10 : var3) {
            var1.t1.h((net.n2.k)(new net.no.z(var10, ((y)var10).M())));
         }
      }

      if(!var4.isEmpty()) {
         for(l var11 : var4) {
            var1.t1.h((net.n2.k)(new net.no.d(var11)));
         }
      }

   }

   public void L(int var1) {
      this.L = (var1 - 1) * 16;

      for(b var3 : this.R) {
         var3.G(this.L);
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}

package net.l;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.l.h;
import net.l.o;
import net.ne.l;
import net.ni.v;
import net.ns.i9;
import net.ny.f;
import net.u.j;
import net.u.p;
import net.yv.w;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class q {
   private static final Logger d = LogManager.getLogger();
   public static final f E = null;
   private final f[] y;
   private final byte[] M;
   private final int[] O;
   private final boolean[] l;
   private boolean f;
   private final net.yv.r q;
   private final int[] A;
   public final int Q;
   public final int U;
   private boolean C;
   private final Map L;
   private final net.yz.g[] W;
   private boolean o;
   private boolean N;
   private boolean D;
   private boolean G;
   private boolean Z;
   private long z;
   private int c;
   private long H;
   private int b;
   private final ConcurrentLinkedQueue B;
   public boolean J;
   private static String R;

   public q(net.yv.r var1, int var2, int var3) {
      this.y = new f[16];
      this.M = new byte[256];
      this.O = new int[256];
      this.l = new boolean[256];
      this.L = Maps.newHashMap();
      this.b = 4096;
      this.B = Queues.newConcurrentLinkedQueue();
      this.W = (net.yz.g[])(new net.yz.g[16]);
      this.q = var1;
      this.Q = var2;
      this.U = var3;
      this.A = new int[256];

      for(int var4 = 0; var4 < this.W.length; ++var4) {
         this.W[var4] = new net.yz.g(l.class);
      }

      Arrays.fill(this.O, -999);
      Arrays.fill(this.M, (byte)-1);
   }

   public q(net.yv.r var1, o var2, int var3, int var4) {
      this(var1, var3, var4);
      boolean var10000 = true;
      boolean var6 = var1.F.A();
      byte var7 = 0;
      byte var8 = 0;
      int var9 = 0;

      while(true) {
         net.yw.n var10 = var2.b(var7, var9, var8);
         if(var10.n() != net.y1.l.q) {
            int var11 = var9 >> 4;
            if(this.y[var11] == E) {
               this.y[var11] = new f(var11 << 4, var6);
            }

            this.y[var11].v(var7, var9 & 15, var8, var10);
         }

         ++var9;
      }
   }

   public boolean t(int var1, int var2) {
      return var1 == this.Q && var2 == this.U;
   }

   public int r(j var1) {
      return this.s(var1.t() & 15, var1.y() & 15);
   }

   public int s(int var1, int var2) {
      return this.A[var2 << 4 | var1];
   }

   @Nullable
   private f D() {
      int var1;
      for(var1 = this.y.length - 1; this.y[var1] == E; --var1) {
         ;
      }

      return this.y[var1];
   }

   public int m() {
      f var1 = this.D();
      return 0;
   }

   public f[] R() {
      return this.y;
   }

   protected void n() {
      int var1 = this.m();
      this.c = Integer.MAX_VALUE;
      byte var2 = 0;
      int var3 = 0;

      while(true) {
         this.O[var2 + (var3 << 4)] = -999;
         int var4 = var1 + 16;

         while(true) {
            net.yw.n var5 = this.R(var2, var4 - 1, var3);
            if(var5.K() != 0) {
               this.A[var3 << 4 | var2] = var4;
               if(var4 < this.c) {
                  this.c = var4;
               }

               ++var3;
               break;
            }

            --var4;
         }
      }
   }

   public void Q() {
      int var1 = this.m();
      this.c = Integer.MAX_VALUE;
      byte var2 = 0;
      int var3 = 0;

      while(true) {
         this.O[var2 + (var3 << 4)] = -999;

         int var4;
         for(var4 = var1 + 16; this.b(var2, var4 - 1, var3) == 0; --var4) {
            ;
         }

         this.A[var3 << 4 | var2] = var4;
         if(var4 < this.c) {
            this.c = var4;
         }

         if(this.q.F.A()) {
            var4 = 15;
            int var5 = var1 + 16 - 1;
            int var6 = this.b(var2, var5, var3);
            var4 = var4 - var6;
            f var7 = this.y[var5 >> 4];
            if(var7 != E) {
               var7.W(var2, var5 & 15, var3, var4);
               this.q.m(new j((this.Q << 4) + var2, var5, (this.U << 4) + var3));
            }

            --var5;
         }

         ++var3;
      }
   }

   private void J(int var1, int var2) {
      this.l[var1 + var2 * 16] = true;
      this.C = true;
   }

   private void Y(boolean var1) {
      this.q.M.K("recheckGaps");
      if(!this.q.a(new j(this.Q * 16 + 8, 0, this.U * 16 + 8), 16)) {
         this.q.M.N();
      } else {
         byte var2 = 0;

         int var3;
         for(var3 = 0; !this.l[var2 + var3 * 16]; ++var3) {
            ;
         }

         this.l[var2 + var3 * 16] = false;
         int var4 = this.s(var2, var3);
         int var5 = this.Q * 16 + var2;
         int var6 = this.U * 16 + var3;
         int var7 = Integer.MAX_VALUE;

         for(aq var9 : aq.u.HORIZONTAL) {
            var7 = Math.min(var7, this.q.Y(var5 + var9.v(), var6 + var9.P()));
         }

         this.J(var5, var6, var7);

         for(aq var11 : aq.u.HORIZONTAL) {
            this.J(var5 + var11.v(), var6 + var11.P(), var4);
         }

         this.q.M.N();
      }
   }

   private void J(int var1, int var2, int var3) {
      int var4 = this.q.A(new j(var1, 0, var2)).h();
      if(var4 > var3) {
         this.p(var1, var2, var3, var4 + 1);
      } else if(var4 < var3) {
         this.p(var1, var2, var4, var3 + 1);
      }

   }

   private void p(int var1, int var2, int var3, int var4) {
      if(var4 > var3 && this.q.a(new j(var1, 0, var2), 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.q.b(w.SKY, new j(var1, var5, var2));
         }

         this.G = true;
      }

   }

   private void O(int var1, int var2, int var3) {
      O();
      int var5 = this.A[var3 << 4 | var1] & 255;
      int var6 = var5;
      if(var2 > var5) {
         var6 = var2;
      }

      if(var6 > 0 && this.b(var1, var6 - 1, var3) == 0) {
         --var6;
      }

      if(var6 != var5) {
         this.q.W(var1 + this.Q * 16, var3 + this.U * 16, var6, var5);
         this.A[var3 << 4 | var1] = var6;
         int var7 = this.Q * 16 + var1;
         int var8 = this.U * 16 + var3;
         if(this.q.F.A()) {
            if(var6 < var5 && var6 < var5) {
               f var10 = this.y[var6 >> 4];
               if(var10 != E) {
                  var10.W(var1, var6 & 15, var3, 15);
                  this.q.m(new j((this.Q << 4) + var1, var6, (this.U << 4) + var3));
               }

               int var9 = var6 + 1;
            }

            if(var5 < var6) {
               f var19 = this.y[var5 >> 4];
               if(var19 != E) {
                  var19.W(var1, var5 & 15, var3, 0);
                  this.q.m(new j((this.Q << 4) + var1, var5, (this.U << 4) + var3));
               }

               int var15 = var5 + 1;
            }

            int var16 = 15;
            --var6;
            int var20 = this.b(var1, var6, var3);
            if(var20 == 0) {
               var20 = 1;
            }

            var16 = var16 - var20;
            if(var16 < 0) {
               var16 = 0;
            }

            f var11 = this.y[var6 >> 4];
            if(var11 != E) {
               var11.W(var1, var6 & 15, var3, var16);
            }
         }

         int var18 = this.A[var3 << 4 | var1];
         int var21 = var5;
         int var22 = var18;
         if(var18 < var5) {
            var21 = var18;
            var22 = var5;
         }

         if(var18 < this.c) {
            this.c = var18;
         }

         if(this.q.F.A()) {
            Iterator var12 = aq.u.HORIZONTAL.iterator();
            if(var12.hasNext()) {
               aq var13 = (aq)var12.next();
               this.p(var7 + var13.v(), var8 + var13.P(), var21, var22);
            }

            this.p(var7, var8, var21, var22);
         }

         this.G = true;
      }

   }

   public int Z(j var1) {
      return this.u(var1).K();
   }

   private int b(int var1, int var2, int var3) {
      return this.R(var1, var2, var3).K();
   }

   public net.yw.n u(j var1) {
      return this.R(var1.t(), var1.h(), var1.y());
   }

   public net.yw.n R(int var1, int var2, int var3) {
      if(this.q.t() == net.yv.j.J) {
         net.yw.n var7 = null;
         if(var2 == 60) {
            var7 = net.nb.f.dr.p();
         }

         if(var2 == 70) {
            var7 = net.cn.f.Q(var1, var3);
         }

         return net.nb.f.ou.p();
      } else {
         if(var2 >> 4 < this.y.length) {
            f var4 = this.y[var2 >> 4];
            if(var4 != E) {
               return var4.j(var1 & 15, var2 & 15, var3 & 15);
            }
         }

         return net.nb.f.ou.p();
      }
   }

   @Nullable
   public net.yw.n V(j var1, net.yw.n var2) {
      int var3 = var1.t() & 15;
      int var4 = var1.h();
      int var5 = var1.y() & 15;
      int var6 = var5 << 4 | var3;
      if(var4 >= this.O[var6] - 1) {
         this.O[var6] = -999;
      }

      int var7 = this.A[var6];
      net.yw.n var8 = this.u(var1);
      if(var8 == var2) {
         return null;
      } else {
         net.y9.l var9 = var2.Q();
         net.y9.l var10 = var8.Q();
         f var11 = this.y[var4 >> 4];
         boolean var12 = false;
         if(var11 == E) {
            if(var9 == net.nb.f.ou) {
               return null;
            }

            var11 = new f(var4 >> 4 << 4, this.q.F.A());
            this.y[var4 >> 4] = var11;
            var12 = var4 >= var7;
         }

         var11.v(var3, var4 & 15, var5, var2);
         if(var10 != var9) {
            if(!this.q.x) {
               var10.V(this.q, var1, var8);
            } else if(var10 instanceof net.y9.r) {
               this.q.j(var1);
            }
         }

         if(var11.j(var3, var4 & 15, var5).Q() != var9) {
            return null;
         } else {
            this.Q();
            if(var10 instanceof net.y9.r) {
               v var13 = this.K(var1, q.r.CHECK);
               var13.K();
            }

            if(!this.q.x && var10 != var9) {
               var9.b(this.q, var1, var2);
            }

            if(var9 instanceof net.y9.r) {
               v var16 = this.K(var1, q.r.CHECK);
               var16 = ((net.y9.r)var9).J(this.q, var9.d(var2));
               this.q.Z(var1, var16);
               var16.K();
            }

            this.G = true;
            return var8;
         }
      }
   }

   public int C(w var1, j var2) {
      int var3 = var2.t() & 15;
      int var4 = var2.h();
      int var5 = var2.y() & 15;
      f var6 = this.y[var4 >> 4];
      return var6 == E?(this.C(var2)?var1.defaultLightValue:0):(var1 == w.SKY?(!this.q.F.A()?0:var6.V(var3, var4 & 15, var5)):(var1 == w.BLOCK?var6.Q(var3, var4 & 15, var5):var1.defaultLightValue));
   }

   public void B(w var1, j var2, int var3) {
      int var4 = var2.t() & 15;
      int var5 = var2.h();
      int var6 = var2.y() & 15;
      f var7 = this.y[var5 >> 4];
      if(var7 == E) {
         var7 = new f(var5 >> 4 << 4, this.q.F.A());
         this.y[var5 >> 4] = var7;
         this.Q();
      }

      this.G = true;
      if(var1 == w.SKY) {
         if(this.q.F.A()) {
            var7.W(var4, var5 & 15, var6, var3);
         }
      } else if(var1 == w.BLOCK) {
         var7.t(var4, var5 & 15, var6, var3);
      }

   }

   public int j(j var1, int var2) {
      int var3 = var1.t() & 15;
      int var4 = var1.h();
      int var5 = var1.y() & 15;
      f var6 = this.y[var4 >> 4];
      if(var6 != E) {
         int var7 = !this.q.F.A()?0:var6.V(var3, var4 & 15, var5);
         var7 = var7 - var2;
         int var8 = var6.Q(var3, var4 & 15, var5);
         if(var8 > var7) {
            var7 = var8;
         }

         return var7;
      } else {
         return this.q.F.A() && var2 < w.SKY.defaultLightValue?w.SKY.defaultLightValue - var2:0;
      }
   }

   public void s(l var1) {
      this.Z = true;
      int var2 = net.u.t.L(var1.b / 16.0D);
      int var3 = net.u.t.L(var1.hr / 16.0D);
      if(var2 != this.Q || var3 != this.U) {
         d.warn("Wrong location! ({}, {}) should be ({}, {}), {}", Integer.valueOf(var2), Integer.valueOf(var3), Integer.valueOf(this.Q), Integer.valueOf(this.U), var1);
         var1.B();
      }

      int var4 = net.u.t.L(var1.hS / 16.0D);
      var4 = 0;
      if(var4 >= this.W.length) {
         var4 = this.W.length - 1;
      }

      var1.U = true;
      var1.Q = this.Q;
      var1.D = var4;
      var1.f = this.U;
      this.W[var4].add(var1);
   }

   public void f(l var1) {
      this.a(var1, var1.D);
   }

   public void a(l var1, int var2) {
      var2 = 0;
      if(var2 >= this.W.length) {
         var2 = this.W.length - 1;
      }

      this.W[var2].remove(var1);
   }

   public boolean C(j var1) {
      int var2 = var1.t() & 15;
      int var3 = var1.h();
      int var4 = var1.y() & 15;
      return var3 >= this.A[var4 << 4 | var2];
   }

   @Nullable
   private v F(j var1) {
      net.yw.n var2 = this.u(var1);
      net.y9.l var3 = var2.Q();
      return !var3.W()?null:((net.y9.r)var3).J(this.q, var2.Q().d(var2));
   }

   @Nullable
   public v K(j var1, q.r var2) {
      v var3 = (v)this.L.get(var1);
      if(var2 == q.r.IMMEDIATE) {
         var3 = this.F(var1);
         this.q.Z(var1, var3);
      } else if(var2 == q.r.QUEUED) {
         this.B.add(var1);
      }

      return var3;
   }

   public void O(v var1) {
      this.x(var1.C(), var1);
      if(this.f) {
         this.q.o(var1);
      }

   }

   public void x(j var1, v var2) {
      var2.k(this.q);
      var2.h(var1);
      if(this.u(var1).Q() instanceof net.y9.r) {
         if(this.L.containsKey(var1)) {
            ((v)this.L.get(var1)).Z();
         }

         var2.Q();
         this.L.put(var1, var2);
      }

   }

   public void u(j var1) {
      if(this.f) {
         v var2 = (v)this.L.remove(var1);
         var2.Z();
      }

   }

   public void m() {
      this.f = true;
      this.q.o(this.L.values());

      for(net.yz.g var4 : this.W) {
         this.q.r(var4);
      }

   }

   public void J() {
      this.f = false;

      for(v var2 : this.L.values()) {
         this.q.x(var2);
      }

      for(net.yz.g var4 : this.W) {
         this.q.x((Collection)var4);
      }

   }

   public void k() {
      this.G = true;
   }

   public void F(@Nullable l var1, net.u.e var2, List var3, Predicate var4) {
      int var5 = net.u.t.L((var2.u - 2.0D) / 16.0D);
      int var6 = net.u.t.L((var2.c + 2.0D) / 16.0D);
      var5 = net.u.t.g(var5, 0, this.W.length - 1);
      var6 = net.u.t.g(var6, 0, this.W.length - 1);

      for(int var7 = var5; var7 <= var6; ++var7) {
         if(!this.W[var7].isEmpty()) {
            for(l var9 : this.W[var7]) {
               if(var9.i().O(var2) && var9 != var1) {
                  if(var4.apply(var9)) {
                     var3.add(var9);
                  }

                  l[] var10 = var9.T();

                  for(l var14 : var10) {
                     if(var14 != var1 && var14.i().O(var2) && var4.apply(var14)) {
                        var3.add(var14);
                     }
                  }
               }
            }
         }
      }

   }

   public void Z(Class var1, net.u.e var2, List var3, Predicate var4) {
      int var5 = net.u.t.L((var2.u - 2.0D) / 16.0D);
      int var6 = net.u.t.L((var2.c + 2.0D) / 16.0D);
      var5 = net.u.t.g(var5, 0, this.W.length - 1);
      var6 = net.u.t.g(var6, 0, this.W.length - 1);

      for(int var7 = var5; var7 <= var6; ++var7) {
         for(l var9 : this.W[var7].m(var1)) {
            if(var9.i().O(var2) && var4.apply(var9)) {
               var3.add(var9);
            }
         }
      }

   }

   public boolean e(boolean var1) {
      return (!this.Z || this.q.y() == this.z) && !this.G?this.G:true;
   }

   public Random y(long var1) {
      return new Random(this.q.a() + (long)(this.Q * this.Q * 4987142) + (long)(this.Q * 5947611) + (long)(this.U * this.U) * 4392871L + (long)(this.U * 389711) ^ var1);
   }

   public boolean z() {
      return false;
   }

   public void m(h var1, net.cn.e var2) {
      q var3 = var1.e(this.Q, this.U - 1);
      q var4 = var1.e(this.Q + 1, this.U);
      q var5 = var1.e(this.Q, this.U + 1);
      q var6 = var1.e(this.Q - 1, this.U);
      if(var1.e(this.Q + 1, this.U + 1) != null) {
         this.b(var2);
      }

      if(var1.e(this.Q - 1, this.U + 1) != null) {
         var6.b(var2);
      }

      if(var1.e(this.Q + 1, this.U - 1) != null) {
         var3.b(var2);
      }

      q var7 = var1.e(this.Q - 1, this.U - 1);
      var7.b(var2);
   }

   protected void b(net.cn.e var1) {
      if(this.M()) {
         if(var1.c(this, this.Q, this.U)) {
            this.k();
         }
      } else {
         this.T();
         var1.u(this.Q, this.U);
         this.k();
      }

   }

   public j q(j var1) {
      int var2 = var1.t() & 15;
      int var3 = var1.y() & 15;
      int var4 = var2 | var3 << 4;
      j var5 = new j(var1.t(), this.O[var4], var1.y());
      if(var5.h() == -999) {
         int var6 = this.m() + 15;
         var5 = new j(var1.t(), var6, var1.y());
         int var7 = -1;

         while(var5.h() > 0) {
            net.yw.n var8 = this.u(var5);
            net.y1.l var9 = var8.n();
            if(!var9.f() && !var9.y()) {
               var5 = var5.b();
            } else {
               var7 = var5.h() + 1;
            }
         }

         this.O[var4] = var7;
      }

      return new j(var1.t(), this.O[var4], var1.y());
   }

   public void A(boolean var1) {
      if(this.C && this.q.F.A()) {
         this.Y(this.q.x);
      }

      this.D = true;
      if(!this.N && this.o) {
         this.T();
      }

      while(!this.B.isEmpty()) {
         j var2 = (j)this.B.poll();
         if(this.K(var2, q.r.CHECK) == null && this.u(var2).Q().W()) {
            v var3 = this.F(var2);
            this.q.Z(var2, var3);
            this.q.k(var2, var2);
         }
      }

   }

   public boolean f() {
      return this.D && this.o && this.N;
   }

   public boolean p() {
      return this.D;
   }

   public p r() {
      return new p(this.Q, this.U);
   }

   public boolean a(int var1, int var2) {
      var1 = 0;
      if(var2 >= 256) {
         var2 = 255;
      }

      for(int var3 = var1; var3 <= var2; var3 += 16) {
         f var4 = this.y[var3 >> 4];
         if(var4 != E && !var4.g()) {
            return false;
         }
      }

      return true;
   }

   public void l(f[] var1) {
      if(this.y.length != var1.length) {
         d.warn("Could not set level chunk sections, array length is {} instead of {}", Integer.valueOf(var1.length), Integer.valueOf(this.y.length));
      } else {
         System.arraycopy(var1, 0, this.y, 0, this.y.length);
      }

   }

   public void c(net.n2.h var1, int var2, boolean var3) {
      boolean var4 = this.q.F.A();

      for(int var5 = 0; var5 < this.y.length; ++var5) {
         f var6 = this.y[var5];
         if((var2 & 1 << var5) == 0) {
            if(var6 != E) {
               this.y[var5] = E;
            }
         } else {
            if(var6 == E) {
               var6 = new f(var5 << 4, var4);
               this.y[var5] = var6;
            }

            var6.B().X(var1);
            var1.readBytes(var6.a().o());
            var1.readBytes(var6.I().o());
         }
      }

      var1.readBytes(this.M);

      for(int var7 = 0; var7 < this.y.length; ++var7) {
         if(this.y[var7] != E && (var2 & 1 << var7) != 0) {
            this.y[var7].R();
         }
      }

      this.N = true;
      this.o = true;
      this.n();

      for(v var9 : this.L.values()) {
         var9.K();
      }

   }

   public net.ns.i b(j var1, i9 var2) {
      int var3 = var1.t() & 15;
      int var4 = var1.y() & 15;
      int var5 = this.M[var4 << 4 | var3] & 255;
      if(var5 == 255) {
         net.ns.i var6 = var2.L(var1, net.nb.x.v);
         var5 = net.ns.i.y(var6);
         this.M[var4 << 4 | var3] = (byte)(var5 & 255);
      }

      net.ns.i var7 = net.ns.i.F(var5);
      return net.nb.x.v;
   }

   public byte[] O() {
      return this.M;
   }

   public void h(byte[] var1) {
      if(this.M.length != var1.length) {
         d.warn("Could not set level chunk biomes, array length is {} instead of {}", Integer.valueOf(var1.length), Integer.valueOf(this.M.length));
      } else {
         System.arraycopy(var1, 0, this.M, 0, this.M.length);
      }

   }

   public void I() {
      this.b = 0;
   }

   public void z() {
      if(this.b < 4096) {
         j var1 = new j(this.Q << 4, 0, this.U << 4);
         boolean var2 = false;
         if(this.b < 4096) {
            int var3 = this.b % 16;
            int var4 = this.b / 16 % 16;
            int var5 = this.b / 256;
            ++this.b;
            int var6 = 0;

            while(true) {
               j var7 = var1.F(var4, (var3 << 4) + var6, var5);
               boolean var8 = var4 == 15 || var5 == 15;
               if(this.y[var3] == E) {
                  ;
               }

               if(this.y[var3] != E && this.y[var3].j(var4, var6, var5).n() == net.y1.l.q) {
                  for(aq var12 : aq.values()) {
                     j var13 = var7.C(var12);
                     if(this.q.Z(var13).f() > 0) {
                        this.q.m(var13);
                     }
                  }

                  this.q.m(var7);
               }

               ++var6;
            }
         }

      }
   }

   public void T() {
      this.o = true;
      this.N = true;
      j var1 = new j(this.Q << 4, 0, this.U << 4);
      if(this.q.F.A()) {
         if(this.q.C(var1.F(-1, 0, -1), var1.F(16, this.q.k(), 16))) {
            byte var2 = 0;

            for(int var3 = 0; this.I(var2, var3); ++var3) {
               ;
            }

            this.N = false;
            if(this.N) {
               for(aq var6 : aq.u.HORIZONTAL) {
                  int var4 = var6.i() == aq.n.POSITIVE?16:1;
                  this.q.d(var1.a(var6, var4)).P(var6.f());
               }

               this.P();
            }
         } else {
            this.N = false;
         }
      }

   }

   private void P() {
      for(int var1 = 0; var1 < this.l.length; ++var1) {
         this.l[var1] = true;
      }

      this.Y(false);
   }

   private void P(aq var1) {
      if(this.o) {
         if(var1 == aq.EAST) {
            int var5 = 0;

            while(true) {
               this.I(15, var5);
               ++var5;
            }
         }

         if(var1 == aq.WEST) {
            int var4 = 0;

            while(true) {
               this.I(0, var4);
               ++var4;
            }
         }

         if(var1 == aq.SOUTH) {
            int var3 = 0;

            while(true) {
               this.I(var3, 15);
               ++var3;
            }
         }

         if(var1 == aq.NORTH) {
            int var2 = 0;

            while(true) {
               this.I(var2, 0);
               ++var2;
            }
         }
      }

   }

   private boolean I(int var1, int var2) {
      int var3 = this.m();
      boolean var4 = false;
      boolean var5 = false;
      j.v var6 = new j.v((this.Q << 4) + var1, 0, (this.U << 4) + var2);
      int var7 = var3 + 16 - 1;

      while(true) {
         if(var7 <= this.q.k()) {
            ;
         }

         var6.V(var6.t(), var7, var6.y());
         int var8 = this.Z(var6);
         if(var8 == 255 && var6.h() < this.q.k()) {
            var5 = true;
         }

         var4 = true;
         --var7;
      }
   }

   public boolean Q() {
      return this.f;
   }

   public void j(boolean var1) {
      this.f = var1;
   }

   public net.yv.r q() {
      return this.q;
   }

   public int[] T() {
      return this.A;
   }

   public void R(int[] var1) {
      if(this.A.length != var1.length) {
         d.warn("Could not set level chunk heightmap, array length is {} instead of {}", Integer.valueOf(var1.length), Integer.valueOf(this.A.length));
      } else {
         System.arraycopy(var1, 0, this.A, 0, this.A.length);
      }

   }

   public Map i() {
      return this.L;
   }

   public net.yz.g[] z() {
      return this.W;
   }

   public boolean M() {
      return this.o;
   }

   public void V(boolean var1) {
      this.o = var1;
   }

   public boolean h() {
      return this.N;
   }

   public void N(boolean var1) {
      this.N = var1;
   }

   public void w(boolean var1) {
      this.G = var1;
   }

   public void o(boolean var1) {
      this.Z = var1;
   }

   public void T(long var1) {
      this.z = var1;
   }

   public int E() {
      return this.c;
   }

   public long K() {
      return this.H;
   }

   public void S(long var1) {
      this.H = var1;
   }

   static {
      Y("u90Aoc");
   }

   public static void Y(String var0) {
      R = var0;
   }

   public static String O() {
      return R;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   public static enum r {
      IMMEDIATE,
      QUEUED,
      CHECK;
   }
}

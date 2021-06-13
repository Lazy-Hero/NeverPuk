package net.z;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net._x;
import net.gn;
import net.vh;
import net.xn;
import net.zv;
import net.z.c;
import net.z.g;
import net.z.l;
import net.z.t;
import net.z.tg;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class tz extends g {
   private static final Logger m = LogManager.getLogger();
   private final net.nn.j i;
   private final List F = Lists.newArrayList();
   private final List r = Lists.newArrayList();
   private final List p = Lists.newArrayList();
   private int I;
   private boolean a;

   public tz(net.nn.j var1) {
      this.i = var1;
   }

   public void o(int var1) {
      boolean var2 = g.B();
      if(this.i.T.i3 != net.r.r.HIDDEN) {
         float var3 = this.S();
         net.y.d.c();
         net.y.d.O(2.0F, 8.0F, 0.0F);
         net.y.d.W(var3, var3, 1.0F);
         net.y.d.Y();
         int var4 = this.A();
         int var5 = this.p.size();
         float var6 = this.i.T.w1 * 0.9F + 0.1F;
         if(var5 > 0) {
            boolean var7 = this.g();
            int var8 = net.u.t.Y((float)this.g() / var3);
            net.y.d.c();
            net.y.d.O(2.5F, 8.0F, 0.0F);
            net.y.d.O(0.0F, -3.0F, 0.0F);
            net.y.d.W(var3, var3, 1.0F);
            int var9 = 0;
            int var10 = 0;
            if(var10 + this.I < this.p.size() && var10 < var4) {
               c var11 = (c)this.p.get(var10 + this.I);
               int var12 = var1 - var11.q();
               if(var12 < 200 || var7) {
                  double var13 = (double)var12 / 200.0D;
                  var13 = 1.0D - var13;
                  var13 = var13 * 10.0D;
                  var13 = net.u.t.F(var13, 0.0D, 1.0D);
                  var13 = var13 * var13;
                  int var15 = (int)(255.0D * var13);
                  if(var7) {
                     var15 = 255;
                  }

                  var15 = (int)((float)var15 * var6);
                  ++var9;
                  if(var15 > 3) {
                     int var16 = -var10 * 9;
                     String var17 = var11.m().c();
                     net.y.d.C();
                     if(!vh.a.Q() || !gn.Q.j.d(vh.class).v()) {
                        u(-2, var16 - 9, var8 + 4, var16, var15 / 2 << 24);
                     }

                     this.i.sO.U(var17, 0.0F, (float)((double)var16 - 9.5D) + var3, 16777215 + (var15 << 24));
                     net.y.d.d();
                     net.y.d.E();
                  }
               }

               ++var10;
            }

            if(var7) {
               var10 = this.i.sO.R;
               net.y.d.O(-3.0F, 0.0F, 0.0F);
               int var20 = var5 * var10 + var5;
               int var21 = var9 * var10 + var9;
               int var26 = this.I * var21 / var5;
               int var14 = var21 * var21 / var20;
               if(var20 != var21) {
                  int var28 = var26 > 0?170:96;
                  int var29 = this.a?13382451:3355562;
                  u(0, -var26, 2, -var26 - var14, var29 + (var28 << 24));
                  u(2, -var26, 1, -var26 - var14, 13421772 + (var28 << 24));
               }
            }

            net.y.d.Y();
         }
      }

   }

   public void A(boolean var1) {
      this.p.clear();
      this.r.clear();
      this.F.clear();
   }

   public void G(net.cb.t var1) {
      this.O(var1, 0);
      zv var2 = new zv(var1.l());
      _x.m(var2);
   }

   public void O(net.cb.t var1, int var2) {
      this.r(var1, var2, this.i.y.n(), false);
      m.info("[CHAT] {}", var1.l().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void r(net.cb.t var1, int var2, int var3, boolean var4) {
      this.i(var2);
      int var5 = net.u.t.M((float)this.g() / this.S());
      List var6 = l.f(var1, var5, this.i.sO, false, false);
      boolean var7 = this.g();

      for(net.cb.t var9 : var6) {
         if(this.I > 0) {
            this.a = true;
            this.x(1);
         }

         this.p.add(0, new c(var3, var9, var2));
      }

      while(this.p.size() > 100) {
         this.p.remove(this.p.size() - 1);
      }

      this.r.add(0, new c(var3, var1, var2));

      while(this.r.size() > 100) {
         this.r.remove(this.r.size() - 1);
      }

   }

   public void O() {
      this.p.clear();
      this.i();
      int var1 = this.r.size() - 1;

      while(true) {
         c var2 = (c)this.r.get(var1);
         this.r(var2.m(), var2.r(), var2.q(), true);
         --var1;
      }
   }

   public List b() {
      return this.F;
   }

   public void I(String var1) {
      if(this.F.isEmpty() || !((String)this.F.get(this.F.size() - 1)).equals(var1)) {
         this.F.add(var1);
      }

   }

   public void i() {
      this.I = 0;
      this.a = false;
   }

   public void x(int var1) {
      this.I += var1;
      int var2 = this.p.size();
      if(this.I > var2 - this.A()) {
         this.I = var2 - this.A();
      }

      if(this.I <= 0) {
         this.I = 0;
         this.a = false;
      }

   }

   @Nullable
   public net.cb.t q(int var1, int var2) {
      if(this.g()) {
         int var3 = t.K();
         float var4 = this.S();
         int var5 = var1 / var3 - 2;
         int var6 = var2 / var3 - 40;
         var5 = net.u.t.M((float)var5 / var4);
         var6 = net.u.t.M((float)var6 / var4);
         int var7 = Math.min(this.A(), this.p.size());
         if(var5 <= net.u.t.M((float)this.g() / this.S()) && var6 < this.i.sO.R * var7 + var7) {
            int var8 = var6 / this.i.sO.R + this.I;
            if(var8 < this.p.size()) {
               c var9 = (c)this.p.get(var8);
               int var10 = 0;

               for(net.cb.t var12 : var9.m()) {
                  if(var12 instanceof net.cb.l) {
                     var10 += this.i.sO.r(l.j(((net.cb.l)var12).N(), false));
                     if(var10 > var5) {
                        return var12;
                     }
                  }
               }
            }
         }
      }

      return null;
   }

   public boolean g() {
      return this.i.s5 instanceof tg;
   }

   public void i(int var1) {
      Iterator var2 = this.p.iterator();

      while(var2.hasNext()) {
         c var3 = (c)var2.next();
         if(var3.r() == var1) {
            var2.remove();
         }
      }

      var2 = this.r.iterator();

      while(var2.hasNext()) {
         c var5 = (c)var2.next();
         if(var5.r() == var1) {
            var2.remove();
            break;
         }
      }

   }

   public int g() {
      return o(this.i.T.U);
   }

   public int P() {
      return F(this.g()?this.i.T.k:this.i.T.io);
   }

   public float S() {
      return this.i.T.H;
   }

   public static int o(float var0) {
      return net.u.t.M(var0 * 280.0F + 40.0F);
   }

   public static int F(float var0) {
      return net.u.t.M(var0 * 160.0F + 20.0F);
   }

   public int A() {
      return this.P() / 9;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

package net.r;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.cb.l;
import net.cb.t;
import net.n0.ks;
import net.n0.y;
import net.n2.k;
import net.nj.e;
import net.nj.f;
import net.nl.z1;
import net.r.h;
import net.r.n;
import net.r.r;
import net.yf.p;
import net.yz.w;

public class i implements z1 {
   public final w X = w.C(36, ks.a);
   public final w P = w.C(4, ks.a);
   public final w j = w.C(1, ks.a);
   private final List U;
   public int r;
   public r v;
   private ks K;
   private int C;

   public i(r var1) {
      this.U = Arrays.asList(new w[]{this.X, this.P, this.j});
      this.K = ks.a;
      this.v = var1;
   }

   public ks r() {
      return m(this.r)?(ks)this.X.get(this.r):ks.a;
   }

   public static int d() {
      return 9;
   }

   private boolean f(ks var1, ks var2) {
      return !var1.B() && this.Z(var1, var2) && var1.y() && var1.U() < var1.j() && var1.U() < this.m();
   }

   private boolean Z(ks var1, ks var2) {
      return var1.Z() == var2.Z() && (!var1.z() || var1.n() == var2.n()) && ks.a(var1, var2);
   }

   public int o() {
      for(int var1 = 0; var1 < this.X.size(); ++var1) {
         if(((ks)this.X.get(var1)).B()) {
            return var1;
         }
      }

      return -1;
   }

   public void i(ks var1) {
      int var2 = this.G(var1);
      if(m(var2)) {
         this.r = var2;
      } else if(var2 == -1) {
         this.r = this.f();
         if(!((ks)this.X.get(this.r)).B()) {
            int var3 = this.o();
            if(var3 != -1) {
               this.X.set(var3, this.X.get(this.r));
            }
         }

         this.X.set(this.r, var1);
      } else {
         this.Z(var2);
      }

   }

   public void Z(int var1) {
      this.r = this.f();
      ks var2 = (ks)this.X.get(this.r);
      this.X.set(this.r, this.X.get(var1));
      this.X.set(var1, var2);
   }

   public static boolean m(int var0) {
      return var0 < 9;
   }

   public int G(ks var1) {
      for(int var2 = 0; var2 < this.X.size(); ++var2) {
         if(!((ks)this.X.get(var2)).B() && this.Z(var1, (ks)this.X.get(var2))) {
            return var2;
         }
      }

      return -1;
   }

   public int n(ks var1) {
      for(int var2 = 0; var2 < this.X.size(); ++var2) {
         ks var3 = (ks)this.X.get(var2);
         if(!((ks)this.X.get(var2)).B() && this.Z(var1, (ks)this.X.get(var2)) && !((ks)this.X.get(var2)).j() && !var3.g() && !var3.v()) {
            return var2;
         }
      }

      return -1;
   }

   public int f() {
      int var1 = 0;

      while(true) {
         int var2 = (this.r + var1) % 9;
         if(((ks)this.X.get(var2)).B()) {
            return var2;
         }

         ++var1;
      }
   }

   public void r(int var1) {
      var1 = 1;
      var1 = -1;

      for(this.r -= var1; this.r < 0; this.r += 9) {
         ;
      }

      while(this.r >= 9) {
         this.r -= 9;
      }

   }

   public int C(@Nullable y var1, int var2, int var3, @Nullable f var4) {
      n.o();
      int var6 = 0;
      int var7 = 0;
      if(var7 < this.e()) {
         ks var8 = this.A(var7);
         if(!var8.B() && (var1 == null || var8.Z() == var1) && (var2 <= -1 || var8.n() == var2) && (var4 == null || e.v(var4, var8.o(), true))) {
            int var9 = var3 <= 0?var8.U():Math.min(var3 - var6, var8.U());
            var6 += var9;
            var8.H(var9);
            if(var8.B()) {
               this.S(var7, ks.a);
            }

            if(var3 > 0 && var6 >= var3) {
               return var6;
            }
         }

         ++var7;
      }

      if(!this.K.B()) {
         if(var1 != null && this.K.Z() != var1) {
            return var6;
         }

         if(var2 > -1 && this.K.n() != var2) {
            return var6;
         }

         if(var4 != null && !e.v(var4, this.K.o(), true)) {
            return var6;
         }

         var7 = var3 <= 0?this.K.U():Math.min(var3 - var6, this.K.U());
         var6 += var7;
         if(var3 != 0) {
            this.K.H(var7);
            if(this.K.B()) {
               this.K = ks.a;
            }

            if(var3 > 0 && var6 >= var3) {
               return var6;
            }
         }
      }

      return var6;
   }

   private int h(ks var1) {
      int var2 = this.b(var1);
      if(var2 == -1) {
         var2 = this.o();
      }

      return var2 == -1?var1.U():this.d(var2, var1);
   }

   private int d(int var1, ks var2) {
      y var3 = var2.Z();
      int var4 = var2.U();
      ks var5 = this.A(var1);
      if(var5.B()) {
         var5 = new ks(var3, 0, var2.n());
         if(var2.D()) {
            var5.t(var2.o().F());
         }

         this.S(var1, var5);
      }

      int var6 = var4;
      if(var4 > var5.j() - var5.U()) {
         var6 = var5.j() - var5.U();
      }

      if(var6 > this.m() - var5.U()) {
         var6 = this.m() - var5.U();
      }

      return var4;
   }

   public int b(ks var1) {
      if(this.f(this.A(this.r), var1)) {
         return this.r;
      } else if(this.f(this.A(40), var1)) {
         return 40;
      } else {
         for(int var2 = 0; var2 < this.X.size(); ++var2) {
            if(this.f((ks)this.X.get(var2), var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public void Y() {
      for(w var2 : this.U) {
         for(int var3 = 0; var3 < var2.size(); ++var3) {
            if(!((ks)var2.get(var3)).B()) {
               ((ks)var2.get(var3)).o(this.v.hl, this.v, var3, this.r == var3);
            }
         }
      }

   }

   public boolean D(ks var1) {
      return this.S(-1, var1);
   }

   public boolean S(int var1, ks var2) {
      if(var2.B()) {
         return false;
      } else if(var2.j()) {
         if(var1 == -1) {
            var1 = this.o();
         }

         this.X.set(var1, var2.s());
         ((ks)this.X.get(var1)).S(5);
         var2.u(0);
         return true;
      } else {
         int var3;
         while(true) {
            var3 = var2.U();
            if(var1 == -1) {
               var2.u(this.h(var2));
            } else {
               var2.u(this.d(var1, var2));
            }

            if(var2.B() || var2.U() >= var3) {
               break;
            }
         }

         if(var2.U() == var3 && this.v.a6.V) {
            var2.u(0);
            return true;
         } else {
            return var2.U() < var3;
         }
      }
   }

   public void D(net.yv.r var1, ks var2) {
      if(!var1.x) {
         while(!var2.B()) {
            int var3 = this.b(var2);
            if(var3 == -1) {
               var3 = this.o();
            }

            if(var3 == -1) {
               this.v.Y(var2, false);
               break;
            }

            int var4 = var2.j() - this.A(var3).U();
            if(this.S(var3, var2.w(var4))) {
               ((h)this.v).t1.h((k)(new net.no.r(-2, var3, this.A(var3))));
            }
         }
      }

   }

   public ks W(int var1, int var2) {
      w var3 = null;

      for(w var5 : this.U) {
         if(var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      return !((ks)var3.get(var1)).B()?net.nl.h.n(var3, var1, var2):ks.a;
   }

   public void M(ks var1) {
      for(w var3 : this.U) {
         for(int var4 = 0; var4 < var3.size(); ++var4) {
            if(var3.get(var4) == var1) {
               var3.set(var4, ks.a);
               break;
            }
         }
      }

   }

   public ks S(int var1) {
      w var2 = null;

      for(w var4 : this.U) {
         if(var1 < var4.size()) {
            var2 = var4;
            break;
         }

         var1 -= var4.size();
      }

      if(!((ks)var2.get(var1)).B()) {
         ks var5 = (ks)var2.get(var1);
         var2.set(var1, ks.a);
         return var5;
      } else {
         return ks.a;
      }
   }

   public void S(int var1, ks var2) {
      w var3 = null;

      for(w var5 : this.U) {
         if(var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      var3.set(var1, var2);
   }

   public float B(net.yw.n var1) {
      float var2 = 1.0F;
      if(!((ks)this.X.get(this.r)).B()) {
         var2 *= ((ks)this.X.get(this.r)).y(var1);
      }

      return var2;
   }

   public net.nj.h G(net.nj.h var1) {
      for(int var2 = 0; var2 < this.X.size(); ++var2) {
         if(!((ks)this.X.get(var2)).B()) {
            f var3 = new f();
            var3.D("Slot", (byte)var2);
            ((ks)this.X.get(var2)).Z(var3);
            var1.m(var3);
         }
      }

      for(int var4 = 0; var4 < this.P.size(); ++var4) {
         if(!((ks)this.P.get(var4)).B()) {
            f var6 = new f();
            var6.D("Slot", (byte)(var4 + 100));
            ((ks)this.P.get(var4)).Z(var6);
            var1.m(var6);
         }
      }

      for(int var5 = 0; var5 < this.j.size(); ++var5) {
         if(!((ks)this.j.get(var5)).B()) {
            f var7 = new f();
            var7.D("Slot", (byte)(var5 + 150));
            ((ks)this.j.get(var5)).Z(var7);
            var1.m(var7);
         }
      }

      return var1;
   }

   public void g(net.nj.h var1) {
      this.X.clear();
      this.P.clear();
      this.j.clear();

      for(int var2 = 0; var2 < var1.z(); ++var2) {
         f var3 = var1.i(var2);
         int var4 = var3.R("Slot") & 255;
         ks var5 = new ks(var3);
         if(!var5.B()) {
            if(var4 < this.X.size()) {
               this.X.set(var4, var5);
            } else if(var4 >= 100 && var4 < this.P.size() + 100) {
               this.P.set(var4 - 100, var5);
            } else if(var4 >= 150 && var4 < this.j.size() + 150) {
               this.j.set(var4 - 150, var5);
            }
         }
      }

   }

   public int e() {
      return this.X.size() + this.P.size() + this.j.size();
   }

   public boolean N() {
      for(ks var2 : this.X) {
         if(!var2.B()) {
            return false;
         }
      }

      for(ks var5 : this.P) {
         if(!var5.B()) {
            return false;
         }
      }

      for(ks var6 : this.j) {
         if(!var6.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      Object var2 = null;

      for(w var4 : this.U) {
         if(var1 < var4.size()) {
            break;
         }

         var1 -= var4.size();
      }

      return ks.a;
   }

   public String Q() {
      return "container.inventory";
   }

   public boolean H() {
      return false;
   }

   public t b() {
      return (t)(this.H()?new l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public int m() {
      return 64;
   }

   public boolean P(net.yw.n var1) {
      if(var1.n().F()) {
         return true;
      } else {
         ks var2 = this.A(this.r);
         return !var2.B() && var2.D(var1);
      }
   }

   public ks Q(int var1) {
      return (ks)this.P.get(var1);
   }

   public void t(float var1) {
      var1 = var1 / 4.0F;
      if(var1 < 1.0F) {
         var1 = 1.0F;
      }

      for(int var2 = 0; var2 < this.P.size(); ++var2) {
         ks var3 = (ks)this.P.get(var2);
         if(var3.Z() instanceof net.n0.j) {
            var3.S((int)var1, this.v);
         }
      }

   }

   public void v() {
      for(List var2 : this.U) {
         for(int var3 = 0; var3 < var2.size(); ++var3) {
            ks var4 = (ks)var2.get(var3);
            if(!var4.B()) {
               this.v.s(var4, true, false);
               var2.set(var3, ks.a);
            }
         }
      }

   }

   public void W() {
      ++this.C;
   }

   public int s() {
      return this.C;
   }

   public void F(ks var1) {
      this.K = var1;
   }

   public ks j() {
      return this.K;
   }

   public boolean m(r var1) {
      return this.v.Z?false:var1.F(this.v) <= 64.0D;
   }

   public boolean z(ks var1) {
      label19:
      for(List var3 : this.U) {
         Iterator var4 = var3.iterator();

         while(true) {
            if(!var4.hasNext()) {
               continue label19;
            }

            ks var5 = (ks)var4.next();
            if(!var5.B() && var5.g(var1)) {
               break;
            }
         }

         return true;
      }

      return false;
   }

   public void o(r var1) {
   }

   public void b(r var1) {
   }

   public boolean s(int var1, ks var2) {
      return true;
   }

   public void e(i var1) {
      for(int var2 = 0; var2 < this.e(); ++var2) {
         this.S(var2, var1.A(var2));
      }

      this.r = var1.r;
   }

   public int e(int var1) {
      return 0;
   }

   public void Z(int var1, int var2) {
   }

   public int r() {
      return 0;
   }

   public void T() {
      for(List var2 : this.U) {
         var2.clear();
      }

   }

   public void Q(p var1, boolean var2) {
      for(ks var4 : this.X) {
         var1.x(var4);
      }

      var1.x((ks)this.j.get(0));
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}

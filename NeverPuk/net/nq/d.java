package net.nq;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.ne.a;
import net.nj.f;
import net.nj.h;
import net.nq.c;
import net.nq.x;
import net.u.e;
import net.u.j;
import net.u.t;
import net.y9.l;
import net.y9.r9;
import net.yn.s;
import net.yv.r;
import net.yz.aq;

public class d {
   private r B;
   private final List R = Lists.newArrayList();
   private j m = j.V;
   private j D = j.V;
   private int I;
   private int S;
   private int E;
   private int N;
   private int q;
   private final Map g = Maps.newHashMap();
   private final List W = Lists.newArrayList();
   private int C;

   public d() {
   }

   public d(r var1) {
      this.B = var1;
   }

   public void H(r var1) {
      this.B = var1;
   }

   public void N(int var1) {
      this.E = var1;
      this.x();
      this.L();
      if(var1 % 20 == 0) {
         this.O();
      }

      if(var1 % 30 == 0) {
         this.r();
      }

      int var2 = this.N / 10;
      if(this.C < var2 && this.R.size() > 20 && this.B.G.nextInt(7000) == 0) {
         net.u.r var3 = this.y(this.D, 2, 4, 2);
         net.nk.b var4 = new net.nk.b(this.B);
         var4.t(var3.p, var3.H, var3.a);
         this.B.S(var4);
         ++this.C;
      }

   }

   private net.u.r y(j var1, int var2, int var3, int var4) {
      int var5 = 0;

      while(true) {
         j var6 = var1.F(this.B.G.nextInt(16) - 8, this.B.G.nextInt(6) - 3, this.B.G.nextInt(16) - 8);
         if(this.l(var6) && this.M(new j(var2, var3, var4), var6)) {
            return new net.u.r((double)var6.t(), (double)var6.h(), (double)var6.y());
         }

         ++var5;
      }
   }

   private boolean M(j var1, j var2) {
      if(!this.B.Z(var2.b()).z()) {
         return false;
      } else {
         int var3 = var2.t() - var1.t() / 2;
         int var4 = var2.y() - var1.y() / 2;

         for(int var5 = var3; var5 < var3 + var1.t(); ++var5) {
            for(int var6 = var2.h(); var6 < var2.h() + var1.h(); ++var6) {
               for(int var7 = var4; var7 < var4 + var1.y(); ++var7) {
                  if(this.B.Z(new j(var5, var6, var7)).i()) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void r() {
      List var1 = this.B.p(net.nk.b.class, new e((double)(this.D.t() - this.I), (double)(this.D.h() - 4), (double)(this.D.y() - this.I), (double)(this.D.t() + this.I), (double)(this.D.h() + 4), (double)(this.D.y() + this.I)));
      this.C = var1.size();
   }

   private void O() {
      List var1 = this.B.p(s.class, new e((double)(this.D.t() - this.I), (double)(this.D.h() - 4), (double)(this.D.y() - this.I), (double)(this.D.t() + this.I), (double)(this.D.h() + 4), (double)(this.D.y() + this.I)));
      this.N = var1.size();
      if(this.N == 0) {
         this.g.clear();
      }

   }

   public j w() {
      return this.D;
   }

   public int T() {
      return this.I;
   }

   public int A() {
      return this.R.size();
   }

   public int Y() {
      return this.E - this.S;
   }

   public int P() {
      return this.N;
   }

   public boolean l(j var1) {
      return this.D.n(var1) < (double)(this.I * this.I);
   }

   public List i() {
      return this.R;
   }

   public c A(j var1) {
      c var2 = null;
      int var3 = Integer.MAX_VALUE;

      for(c var5 : this.R) {
         int var6 = var5.C(var1);
         if(var6 < var3) {
            var2 = var5;
            var3 = var6;
         }
      }

      return var2;
   }

   public c P(j var1) {
      c var2 = null;
      int var3 = Integer.MAX_VALUE;

      for(c var5 : this.R) {
         int var6 = var5.C(var1);
         if(var6 > 256) {
            var6 = var6 * 1000;
         } else {
            var6 = var5.K();
         }

         if(var6 < var3) {
            j var7 = var5.a();
            aq var8 = var5.f();
            if(this.B.Z(var7.a(var8, 1)).Q().c(this.B, var7.a(var8, 1)) && this.B.Z(var7.a(var8, -1)).Q().c(this.B, var7.a(var8, -1)) && this.B.Z(var7.h().a(var8, 1)).Q().c(this.B, var7.h().a(var8, 1)) && this.B.Z(var7.h().a(var8, -1)).Q().c(this.B, var7.h().a(var8, -1))) {
               var2 = var5;
               var3 = var6;
            }
         }
      }

      return var2;
   }

   @Nullable
   public c C(j var1) {
      if(this.D.n(var1) > (double)(this.I * this.I)) {
         return null;
      } else {
         for(c var3 : this.R) {
            if(var3.a().t() == var1.t() && var3.a().y() == var1.y() && Math.abs(var3.a().h() - var1.h()) <= 1) {
               return var3;
            }
         }

         return null;
      }
   }

   public void j(c var1) {
      this.R.add(var1);
      this.m = this.m.z(var1.a());
      this.u();
      this.S = var1.l();
   }

   public boolean P() {
      return this.R.isEmpty();
   }

   public void r(a var1) {
      for(d.n var3 : this.W) {
         if(var3.X == var1) {
            var3.t = this.E;
            return;
         }
      }

      this.W.add(new d.n(var1, this.E));
   }

   @Nullable
   public a I(a var1) {
      double var2 = Double.MAX_VALUE;
      Object var4 = null;

      for(int var5 = 0; var5 < this.W.size(); ++var5) {
         d.n var6 = (d.n)this.W.get(var5);
         double var7 = var6.X.F(var1);
         if(var7 <= var2) {
            var2 = var7;
         }
      }

      return null;
   }

   public net.r.r d(a var1) {
      double var2 = Double.MAX_VALUE;
      net.r.r var4 = null;

      for(String var6 : this.g.keySet()) {
         if(this.P(var6)) {
            net.r.r var7 = this.B.k(var6);
            double var8 = var7.F(var1);
            if(var8 <= var2) {
               var4 = var7;
               var2 = var8;
            }
         }
      }

      return var4;
   }

   private void L() {
      Iterator var1 = this.W.iterator();

      while(var1.hasNext()) {
         d.n var2 = (d.n)var1.next();
         if(!var2.X.P() || Math.abs(this.E - var2.t) > 300) {
            var1.remove();
         }
      }

   }

   private void x() {
      boolean var1 = false;
      boolean var2 = this.B.G.nextInt(50) == 0;
      Iterator var3 = this.R.iterator();

      while(var3.hasNext()) {
         c var4 = (c)var3.next();
         var4.Q();
         if(!this.h(var4.a()) || Math.abs(this.E - var4.l()) > 1200) {
            this.m = this.m.m(var4.a());
            var1 = true;
            var4.f(true);
            var3.remove();
         }
      }

      this.u();
   }

   private boolean h(j var1) {
      net.yw.n var2 = this.B.Z(var1);
      l var3 = var2.Q();
      return var3 instanceof r9?var2.n() == net.y1.l.S:false;
   }

   private void u() {
      int var1 = this.R.size();
      this.D = j.V;
      this.I = 0;
   }

   public int F(String var1) {
      Integer var2 = (Integer)this.g.get(var1);
      return 0;
   }

   public int b(String var1, int var2) {
      int var3 = this.F(var1);
      int var4 = t.g(var3 + var2, -30, 10);
      this.g.put(var1, Integer.valueOf(var4));
      return var4;
   }

   public boolean P(String var1) {
      return this.F(var1) <= -15;
   }

   public void r(f var1) {
      this.N = var1.P("PopSize");
      this.I = var1.P("Radius");
      this.C = var1.P("Golems");
      this.S = var1.P("Stable");
      this.E = var1.P("Tick");
      this.q = var1.P("MTick");
      this.D = new j(var1.P("CX"), var1.P("CY"), var1.P("CZ"));
      this.m = new j(var1.P("ACX"), var1.P("ACY"), var1.P("ACZ"));
      h var2 = var1.A("Doors", 10);

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         f var4 = var2.i(var3);
         c var5 = new c(new j(var4.P("X"), var4.P("Y"), var4.P("Z")), var4.P("IDX"), var4.P("IDZ"), var4.P("TS"));
         this.R.add(var5);
      }

      h var8 = var1.A("Players", 10);

      for(int var9 = 0; var9 < var8.z(); ++var9) {
         f var10 = var8.i(var9);
         if(var10.G("UUID") && this.B != null && this.B.v() != null) {
            net.n.s var6 = this.B.v().x();
            GameProfile var7 = var6.U(UUID.fromString(var10.J("UUID")));
            this.g.put(var7.getName(), Integer.valueOf(var10.P("S")));
         } else {
            this.g.put(var10.J("Name"), Integer.valueOf(var10.P("S")));
         }
      }

   }

   public void A(f var1) {
      var1.r("PopSize", this.N);
      var1.r("Radius", this.I);
      var1.r("Golems", this.C);
      var1.r("Stable", this.S);
      var1.r("Tick", this.E);
      var1.r("MTick", this.q);
      var1.r("CX", this.D.t());
      x.R();
      var1.r("CY", this.D.h());
      var1.r("CZ", this.D.y());
      var1.r("ACX", this.m.t());
      var1.r("ACY", this.m.h());
      var1.r("ACZ", this.m.y());
      h var3 = new h();
      Iterator var4 = this.R.iterator();
      if(var4.hasNext()) {
         c var5 = (c)var4.next();
         f var6 = new f();
         var6.r("X", var5.a().t());
         var6.r("Y", var5.a().h());
         var6.r("Z", var5.a().y());
         var6.r("IDX", var5.g());
         var6.r("IDZ", var5.O());
         var6.r("TS", var5.l());
         var3.m(var6);
         net.u.d.h(new net.u.d[5]);
      }

      var1.K("Doors", var3);
      h var10 = new h();
      Iterator var11 = this.g.keySet().iterator();
      if(var11.hasNext()) {
         String var12 = (String)var11.next();
         f var7 = new f();
         net.n.s var8 = this.B.v().x();
         GameProfile var9 = var8.M(var12);
         var7.b("UUID", var9.getId().toString());
         var7.r("S", ((Integer)this.g.get(var12)).intValue());
         var10.m(var7);
      }

      var1.K("Players", var10);
   }

   public void K() {
      this.q = this.E;
   }

   public boolean F() {
      return this.q == 0 || this.E - this.q >= 3600;
   }

   public void b(int var1) {
      for(String var3 : this.g.keySet()) {
         this.b(var3, var1);
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   class n {
      public a X;
      public int t;

      n(a var2, int var3) {
         this.X = var2;
         this.t = var3;
      }
   }
}

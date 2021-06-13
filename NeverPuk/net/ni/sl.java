package net.ni;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.ni.w;
import net.y9.rh;
import net.yz.a3;
import net.yz.a7;
import net.yz.au;
import net.yz.ax;
import net.yz.m_;

public class sl extends v {
   private String n = "";
   private String O = "";
   private String y = "";
   private net.u.j k = new net.u.j(0, 1, 0);
   private net.u.j L = net.u.j.V;
   private ax z = ax.NONE;
   private net.yz.l v = net.yz.l.NONE;
   private sl.s q = sl.s.DATA;
   private boolean A = true;
   private boolean Y;
   private boolean N;
   private boolean C = true;
   private float f = 1.0F;
   private long c;

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.b("name", this.n);
      var1.b("author", this.O);
      var1.b("metadata", this.y);
      var1.r("posX", this.k.t());
      var1.r("posY", this.k.h());
      var1.r("posZ", this.k.y());
      var1.r("sizeX", this.L.t());
      var1.r("sizeY", this.L.h());
      var1.r("sizeZ", this.L.y());
      var1.b("rotation", this.v.toString());
      var1.b("mirror", this.z.toString());
      var1.b("mode", this.q.toString());
      var1.c("ignoreEntities", this.A);
      var1.c("powered", this.Y);
      var1.c("showair", this.N);
      var1.c("showboundingbox", this.C);
      var1.d("integrity", this.f);
      var1.V("seed", this.c);
      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.B(var1.J("name"));
      this.O = var1.J("author");
      this.y = var1.J("metadata");
      w.C();
      int var3 = net.u.t.g(var1.P("posX"), -32, 32);
      int var4 = net.u.t.g(var1.P("posY"), -32, 32);
      int var5 = net.u.t.g(var1.P("posZ"), -32, 32);
      this.k = new net.u.j(var3, var4, var5);
      int var6 = net.u.t.g(var1.P("sizeX"), 0, 32);
      int var7 = net.u.t.g(var1.P("sizeY"), 0, 32);
      int var8 = net.u.t.g(var1.P("sizeZ"), 0, 32);
      this.L = new net.u.j(var6, var7, var8);
      this.v = net.yz.l.valueOf(var1.J("rotation"));
      this.z = ax.valueOf(var1.J("mirror"));
      this.q = sl.s.valueOf(var1.J("mode"));
      this.A = var1.i("ignoreEntities");
      this.Y = var1.i("powered");
      this.N = var1.i("showair");
      this.C = var1.i("showboundingbox");
      if(var1.G("integrity")) {
         this.f = var1.S("integrity");
      }

      this.f = 1.0F;
      this.c = var1.P("seed");
      this.l();
   }

   private void l() {
      if(this.J != null) {
         net.u.j var1 = this.C();
         net.yw.n var2 = this.J.Z(var1);
         if(var2.Q() == net.nb.f.TJ) {
            this.J.k(var1, var2.s(rh.c, this.q), 2);
         }
      }

   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 7, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public boolean H(net.r.r var1) {
      if(!var1.Vm()) {
         return false;
      } else {
         if(var1.T().x) {
            var1.J(this);
         }

         return true;
      }
   }

   public String O() {
      return this.n;
   }

   public void B(String var1) {
      String var2 = var1;

      for(char var6 : a3.J) {
         var2 = var2.replace(var6, '_');
      }

      this.n = var2;
   }

   public void D(net.ne.a var1) {
      if(!a7.Y(var1.Q())) {
         this.O = var1.Q();
      }

   }

   public net.u.j g() {
      return this.k;
   }

   public void n(net.u.j var1) {
      this.k = var1;
   }

   public net.u.j y() {
      return this.L;
   }

   public void C(net.u.j var1) {
      this.L = var1;
   }

   public ax G() {
      return this.z;
   }

   public void C(ax var1) {
      this.z = var1;
   }

   public net.yz.l A() {
      return this.v;
   }

   public void t(net.yz.l var1) {
      this.v = var1;
   }

   public String J() {
      return this.y;
   }

   public void f(String var1) {
      this.y = var1;
   }

   public sl.s x() {
      return this.q;
   }

   public void m(sl.s var1) {
      this.q = var1;
      net.yw.n var2 = this.J.Z(this.C());
      if(var2.Q() == net.nb.f.TJ) {
         this.J.k(this.C(), var2.s(rh.c, var1), 2);
      }

   }

   public void g() {
      switch(null.h[this.x().ordinal()]) {
      case 1:
         this.m(sl.s.LOAD);
         break;
      case 2:
         this.m(sl.s.CORNER);
         break;
      case 3:
         this.m(sl.s.DATA);
         break;
      case 4:
         this.m(sl.s.SAVE);
      }

   }

   public boolean F() {
      return this.A;
   }

   public void i(boolean var1) {
      this.A = var1;
   }

   public float p() {
      return this.f;
   }

   public void P(float var1) {
      this.f = var1;
   }

   public long f() {
      return this.c;
   }

   public void j(long var1) {
      this.c = var1;
   }

   public boolean P() {
      int[] var1 = w.C();
      if(this.q != sl.s.SAVE) {
         return false;
      } else {
         net.u.j var2 = this.C();
         boolean var10000 = true;
         net.u.j var4 = new net.u.j(var2.t() - 80, 0, var2.y() - 80);
         net.u.j var5 = new net.u.j(var2.t() + 80, 255, var2.y() + 80);
         List var6 = this.F(var4, var5);
         List var7 = this.j(var6);
         if(var7.size() < 1) {
            return false;
         } else {
            net.y4.v var8 = this.O(var2, var7);
            if(var8.e - var8.i > 1 && var8.P - var8.D > 1 && var8.J - var8.p > 1) {
               this.k = new net.u.j(var8.i - var2.t() + 1, var8.D - var2.h() + 1, var8.p - var2.y() + 1);
               this.L = new net.u.j(var8.e - var8.i - 1, var8.P - var8.D - 1, var8.J - var8.p - 1);
               this.W();
               net.yw.n var9 = this.J.Z(var2);
               this.J.V(var2, var9, var9, 3);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private List j(List var1) {
      Iterable var2 = Iterables.filter(var1, new Predicate() {
         public boolean W(@Nullable sl var1) {
            int[] var2 = w.C();
            return var1.q == sl.s.CORNER && sl.this.n.equals(var1.n);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      return Lists.newArrayList(var2);
   }

   private List F(net.u.j var1, net.u.j var2) {
      ArrayList var3 = Lists.newArrayList();

      for(net.u.j var5 : net.u.j.X(var1, var2)) {
         net.yw.n var6 = this.J.Z(var5);
         if(var6.Q() == net.nb.f.TJ) {
            v var7 = this.J.L(var5);
            if(var7 instanceof sl) {
               var3.add((sl)var7);
            }
         }
      }

      return var3;
   }

   private net.y4.v O(net.u.j var1, List var2) {
      net.y4.v var3;
      if(var2.size() > 1) {
         net.u.j var4 = ((sl)var2.get(0)).C();
         var3 = new net.y4.v(var4, var4);
      } else {
         var3 = new net.y4.v(var1, var1);
      }

      for(sl var5 : var2) {
         net.u.j var6 = var5.C();
         if(var6.t() < var3.i) {
            var3.i = var6.t();
         } else if(var6.t() > var3.e) {
            var3.e = var6.t();
         }

         if(var6.h() < var3.D) {
            var3.D = var6.h();
         } else if(var6.h() > var3.P) {
            var3.P = var6.h();
         }

         if(var6.y() < var3.p) {
            var3.p = var6.y();
         } else if(var6.y() > var3.J) {
            var3.J = var6.y();
         }
      }

      return var3;
   }

   public void E(ByteBuf var1) {
      var1.writeInt(this.S.t());
      var1.writeInt(this.S.h());
      var1.writeInt(this.S.y());
   }

   public boolean T() {
      return this.D(true);
   }

   public boolean D(boolean var1) {
      if(this.q == sl.s.SAVE && !this.J.x && !a7.Y(this.n)) {
         net.u.j var2 = this.C().z(this.k);
         net.yv.d var3 = (net.yv.d)this.J;
         net.nx.f var4 = this.J.v();
         net.yj.e var5 = var3.A();
         net.yj.f var6 = var5.O(var4, new m_(this.n));
         var6.t(this.J, var2, this.L, !this.A, net.nb.f.f);
         var6.p(this.O);
         return var5.v(var4, new m_(this.n));
      } else {
         return false;
      }
   }

   public boolean W() {
      return this.z(true);
   }

   public boolean z(boolean var1) {
      if(this.q == sl.s.LOAD && !this.J.x && !a7.Y(this.n)) {
         net.u.j var2 = this.C();
         var2.z(this.k);
         net.yv.d var4 = (net.yv.d)this.J;
         net.nx.f var5 = this.J.v();
         net.yj.e var6 = var4.A();
         net.yj.f var7 = var6.p(var5, new m_(this.n));
         return false;
      } else {
         return false;
      }
   }

   public void y() {
      net.yv.d var1 = (net.yv.d)this.J;
      net.yj.e var2 = var1.A();
      var2.r(new m_(this.n));
   }

   public boolean K() {
      if(this.q == sl.s.LOAD && !this.J.x) {
         net.yv.d var1 = (net.yv.d)this.J;
         net.nx.f var2 = this.J.v();
         net.yj.e var3 = var1.A();
         return var3.p(var2, new m_(this.n)) != null;
      } else {
         return false;
      }
   }

   public boolean I() {
      return this.Y;
   }

   public void e(boolean var1) {
      this.Y = var1;
   }

   public boolean l() {
      return this.N;
   }

   public void D(boolean var1) {
      this.N = var1;
   }

   public boolean L() {
      return this.C;
   }

   public void V(boolean var1) {
      this.C = var1;
   }

   @Nullable
   public net.cb.t b() {
      return new net.cb.h("structure_block.hover." + this.q.H, new Object[]{this.q == sl.s.DATA?this.y:this.n});
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static enum s implements au {
      SAVE,
      LOAD,
      CORNER,
      DATA;

      private static final sl.s[] l;
      private final String H;
      private final int W;

      private s(String var3, int var4) {
         this.H = var3;
         this.W = var4;
      }

      public String f() {
         return this.H;
      }

      public int H() {
         return this.W;
      }

      public static sl.s O(int var0) {
         int[] var1 = w.C();
         return var0 >= 0 && var0 < l.length?l[var0]:l[0];
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}

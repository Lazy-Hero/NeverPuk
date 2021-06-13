package net.ni;

import net.xn;
import net.n0.k3;
import net.n0.k_;
import net.n0.ks;
import net.n0.y9;
import net.n0.yo;
import net.ni.a;
import net.ni.w;
import net.nl.z1;
import net.y9.zw;
import net.yz.aq;

public class l extends a implements net.yz.i, net.nl.z {
   private static final int[] P = new int[]{0};
   private static final int[] A = new int[]{2, 1};
   private static final int[] k = new int[]{1};
   private net.yz.w W = net.yz.w.C(3, ks.a);
   private int c;
   private int e;
   private int B;
   private int V;
   private String E;

   public int e() {
      return this.W.size();
   }

   public boolean N() {
      for(ks var2 : this.W) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      return (ks)this.W.get(var1);
   }

   public ks W(int var1, int var2) {
      return net.nl.h.n(this.W, var1, var2);
   }

   public ks S(int var1) {
      return net.nl.h.m(this.W, var1);
   }

   public void S(int var1, ks var2) {
      ks var3 = (ks)this.W.get(var1);
      if(!var2.B() && var2.g(var3) && ks.a(var2, var3)) {
         boolean var5 = true;
      } else {
         boolean var10000 = false;
      }

      this.W.set(var1, var2);
      if(var2.U() > this.m()) {
         var2.u(this.m());
      }

      this.V = this.x(var2);
      this.B = 0;
      this.W();
   }

   public String Q() {
      return this.H()?this.E:"container.furnace";
   }

   public boolean H() {
      return this.E != null && !this.E.isEmpty();
   }

   public void q(String var1) {
      this.E = var1;
   }

   public static void T(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.u(l.class, new String[]{"Items"}));
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.W = net.yz.w.C(this.e(), ks.a);
      net.nl.h.W(var1, this.W);
      this.c = var1.E("BurnTime");
      this.B = var1.E("CookTime");
      this.V = var1.E("CookTimeTotal");
      this.e = z((ks)this.W.get(1));
      if(var1.K("CustomName", 8)) {
         this.E = var1.J("CustomName");
      }

   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.h("BurnTime", (short)this.c);
      var1.h("CookTime", (short)this.B);
      var1.h("CookTimeTotal", (short)this.V);
      net.nl.h.l(var1, this.W);
      if(this.H()) {
         var1.b("CustomName", this.E);
      }

      return var1;
   }

   public int m() {
      return 64;
   }

   public boolean g() {
      return this.c > 0;
   }

   public static boolean K(z1 var0) {
      return var0.e(0) > 0;
   }

   public void m() {
      boolean var1 = this.g();
      boolean var2 = false;
      if(this.g()) {
         --this.c;
      }

      if(!this.J.x) {
         ks var3 = (ks)this.W.get(1);
         if(this.g() || !var3.B() && !((ks)this.W.get(0)).B()) {
            if(!this.g() && this.L()) {
               this.c = z(var3);
               this.e = this.c;
               if(this.g()) {
                  var2 = true;
                  if(!var3.B()) {
                     net.n0.y var4 = var3.Z();
                     var3.H(1);
                     if(var3.B()) {
                        net.n0.y var5 = var4.y();
                        this.W.set(1, ks.a);
                     }
                  }
               }
            }

            if(this.g() && this.L()) {
               ++this.B;
               if(this.B == this.V) {
                  this.B = 0;
                  this.V = this.x((ks)this.W.get(0));
                  this.g();
                  var2 = true;
               }
            } else {
               this.B = 0;
            }
         } else if(!this.g() && this.B > 0) {
            this.B = net.u.t.g(this.B - 2, 0, this.V);
         }

         if(var1 != this.g()) {
            var2 = true;
            zw.d(this.g(), this.J, this.S);
         }
      }

      this.W();
   }

   public int x(ks var1) {
      return 200;
   }

   private boolean L() {
      if(((ks)this.W.get(0)).B()) {
         return false;
      } else {
         ks var1 = net.cr.i.z().Q((ks)this.W.get(0));
         if(var1.B()) {
            return false;
         } else {
            ks var2 = (ks)this.W.get(2);
            return var2.B()?true:(!var2.g(var1)?false:(var2.U() < this.m() && var2.U() < var2.j()?true:var2.U() < var1.j()));
         }
      }
   }

   public void g() {
      if(this.L()) {
         ks var1 = (ks)this.W.get(0);
         ks var2 = net.cr.i.z().Q(var1);
         ks var3 = (ks)this.W.get(2);
         if(var3.B()) {
            this.W.set(2, var2.s());
         } else if(var3.Z() == var2.Z()) {
            var3.A(1);
         }

         if(var1.Z() == net.n0.y.q(net.nb.f.um) && var1.n() == 1 && !((ks)this.W.get(1)).B() && ((ks)this.W.get(1)).Z() == net.nb.j.YF) {
            this.W.set(1, new ks(net.nb.j.Wb));
         }

         var1.H(1);
      }

   }

   public static int z(ks var0) {
      int[] var1 = w.C();
      if(var0.B()) {
         return 0;
      } else {
         net.n0.y var2 = var0.Z();
         return var2 == net.n0.y.q(net.nb.f.S)?150:(var2 == net.n0.y.q(net.nb.f.ur)?100:(var2 == net.n0.y.q(net.nb.f.uK)?67:(var2 == net.n0.y.q(net.nb.f.K)?300:(var2 == net.n0.y.q(net.nb.f.uo)?100:(net.y9.l.F(var2).p().n() == net.y1.l.S?300:(var2 == net.n0.y.q(net.nb.f.TR)?16000:(var2 instanceof k_ && "WOOD".equals(((k_)var2).E())?200:(var2 instanceof k3 && "WOOD".equals(((k3)var2).I())?200:(var2 instanceof y9 && "WOOD".equals(((y9)var2).g())?200:(var2 == net.nb.j.Wu?100:(var2 != net.nb.j.w && var2 != net.nb.j.WQ?(var2 == net.nb.j.Wj?200:(var2 == net.nb.j.u?1600:(var2 == net.nb.j.T?20000:(var2 != net.n0.y.q(net.nb.f.X) && var2 != net.nb.j.o?(var2 == net.nb.j.K?2400:(var2 instanceof yo && var2 != net.nb.j.Y5?200:(var2 instanceof net.n0.g?400:0))):100)))):300)))))))))));
      }
   }

   public static boolean Z(ks var0) {
      return z(var0) > 0;
   }

   public boolean m(net.r.r var1) {
      return this.J.L(this.S) != this?false:var1.o((double)this.S.t() + 0.5D, (double)this.S.h() + 0.5D, (double)this.S.y() + 0.5D) <= 64.0D;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      if(var1 == 2) {
         return false;
      } else if(var1 != 1) {
         return true;
      } else {
         ks var3 = (ks)this.W.get(1);
         return Z(var2) || net.nl.f.K(var2) && var3.Z() != net.nb.j.YF;
      }
   }

   public int[] e(aq var1) {
      return var1 == aq.DOWN?A:(var1 == aq.UP?P:k);
   }

   public boolean Q(int var1, ks var2, aq var3) {
      return this.s(var1, var2);
   }

   public boolean i(int var1, ks var2, aq var3) {
      if(var3 == aq.DOWN && var1 == 1) {
         net.n0.y var4 = var2.Z();
         return var4 == net.nb.j.Wb || var4 == net.nb.j.YF;
      } else {
         return true;
      }
   }

   public String H() {
      return "minecraft:furnace";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      return new net.nl.g(var1, this);
   }

   public int e(int var1) {
      switch(var1) {
      case 0:
         return this.c;
      case 1:
         return this.e;
      case 2:
         return this.B;
      case 3:
         return this.V;
      default:
         return 0;
      }
   }

   public void Z(int var1, int var2) {
      switch(var1) {
      case 0:
         this.c = var2;
         break;
      case 1:
         this.e = var2;
         break;
      case 2:
         this.B = var2;
         break;
      case 3:
         this.V = var2;
      }

   }

   public int r() {
      return 4;
   }

   public void T() {
      this.W.clear();
   }

   private static xn a(xn var0) {
      return var0;
   }
}

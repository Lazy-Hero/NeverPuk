package net.ni;

import java.util.Arrays;
import net.xn;
import net.n0.ks;
import net.ni.a;
import net.ni.w;
import net.y9.z8;
import net.yz.aq;

public class o extends a implements net.yz.i, net.nl.z {
   private static final int[] u = new int[]{3};
   private static final int[] g = new int[]{0, 1, 2, 3};
   private static final int[] N = new int[]{0, 1, 2, 4};
   private net.yz.w R = net.yz.w.C(5, ks.a);
   private int e;
   private boolean[] b;
   private net.n0.y B;
   private String W;
   private int z;

   public String Q() {
      return this.H()?this.W:"container.brewing";
   }

   public boolean H() {
      return this.W != null && !this.W.isEmpty();
   }

   public void T(String var1) {
      this.W = var1;
   }

   public int e() {
      return this.R.size();
   }

   public boolean N() {
      for(ks var2 : this.R) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public void m() {
      w.C();
      ks var2 = (ks)this.R.get(4);
      if(this.z <= 0 && var2.Z() == net.nb.j.H) {
         this.z = 20;
         var2.H(1);
         this.W();
      }

      boolean var3 = this.o();
      boolean var4 = this.e > 0;
      ks var5 = (ks)this.R.get(3);
      if(var3 && this.z > 0) {
         --this.z;
         this.e = 400;
         this.B = var5.Z();
         this.W();
      }

      if(!this.J.x) {
         boolean[] var6 = this.I();
         if(!Arrays.equals(var6, this.b)) {
            this.b = var6;
            net.yw.n var7 = this.J.Z(this.C());
            if(!(var7.Q() instanceof z8)) {
               return;
            }

            int var8 = 0;
            if(var8 < z8.F.length) {
               var7 = var7.s(z8.F[var8], Boolean.valueOf(var6[var8]));
               ++var8;
            }

            this.J.k(this.S, var7, 2);
         }
      }

   }

   public boolean[] I() {
      boolean[] var1 = new boolean[3];
      int var2 = 0;

      while(true) {
         if(!((ks)this.R.get(var2)).B()) {
            var1[var2] = true;
         }

         ++var2;
      }
   }

   private boolean o() {
      ks var1 = (ks)this.R.get(3);
      if(var1.B()) {
         return false;
      } else if(!net.n_.j.K(var1)) {
         return false;
      } else {
         int var2 = 0;

         while(true) {
            ks var3 = (ks)this.R.get(var2);
            if(!var3.B() && net.n_.j.Q(var3, var1)) {
               return true;
            }

            ++var2;
         }
      }
   }

   private void e() {
      ks var1 = (ks)this.R.get(3);
      int var2 = 0;

      while(true) {
         this.R.set(var2, net.n_.j.H(var1, (ks)this.R.get(var2)));
         ++var2;
      }
   }

   public static void i(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.u(o.class, new String[]{"Items"}));
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.R = net.yz.w.C(this.e(), ks.a);
      net.nl.h.W(var1, this.R);
      this.e = var1.E("BrewTime");
      if(var1.K("CustomName", 8)) {
         this.W = var1.J("CustomName");
      }

      this.z = var1.R("Fuel");
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.h("BrewTime", (short)this.e);
      net.nl.h.l(var1, this.R);
      if(this.H()) {
         var1.b("CustomName", this.W);
      }

      var1.D("Fuel", (byte)this.z);
      return var1;
   }

   public ks A(int var1) {
      return var1 < this.R.size()?(ks)this.R.get(var1):ks.a;
   }

   public ks W(int var1, int var2) {
      return net.nl.h.n(this.R, var1, var2);
   }

   public ks S(int var1) {
      return net.nl.h.m(this.R, var1);
   }

   public void S(int var1, ks var2) {
      if(var1 < this.R.size()) {
         this.R.set(var1, var2);
      }

   }

   public int m() {
      return 64;
   }

   public boolean m(net.r.r var1) {
      return this.J.L(this.S) != this?false:var1.o((double)this.S.t() + 0.5D, (double)this.S.h() + 0.5D, (double)this.S.y() + 0.5D) <= 64.0D;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      if(var1 == 3) {
         return net.n_.j.K(var2);
      } else {
         net.n0.y var3 = var2.Z();
         return var1 == 4?var3 == net.nb.j.H:(var3 == net.nb.j.I || var3 == net.nb.j.YD || var3 == net.nb.j.Wg || var3 == net.nb.j.SG) && this.A(var1).B();
      }
   }

   public int[] e(aq var1) {
      return var1 == aq.UP?u:(var1 == aq.DOWN?g:N);
   }

   public boolean Q(int var1, ks var2, aq var3) {
      return this.s(var1, var2);
   }

   public boolean i(int var1, ks var2, aq var3) {
      return var1 == 3?var2.Z() == net.nb.j.SG:true;
   }

   public String H() {
      return "minecraft:brewing_stand";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      return new net.nl.i(var1, this);
   }

   public int e(int var1) {
      switch(var1) {
      case 0:
         return this.e;
      case 1:
         return this.z;
      default:
         return 0;
      }
   }

   public void Z(int var1, int var2) {
      switch(var1) {
      case 0:
         this.e = var2;
         break;
      case 1:
         this.z = var2;
      }

   }

   public int r() {
      return 2;
   }

   public void T() {
      this.R.clear();
   }

   private static xn a(xn var0) {
      return var0;
   }
}

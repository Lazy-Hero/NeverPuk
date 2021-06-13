package net.ni;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.ni.f;
import net.ni.w;

public class p extends f {
   private static final Random X = new Random();
   private net.yz.w b = net.yz.w.C(9, ks.a);

   public int e() {
      return 9;
   }

   public boolean N() {
      for(ks var2 : this.b) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public int b() {
      this.r((net.r.r)null);
      w.C();
      int var2 = -1;
      int var3 = 1;
      int var4 = 0;
      if(var4 < this.b.size()) {
         if(!((ks)this.b.get(var4)).B() && X.nextInt(var3++) == 0) {
            var2 = var4;
         }

         ++var4;
      }

      return var2;
   }

   public int t(ks var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         if(((ks)this.b.get(var2)).B()) {
            this.S(var2, var1);
            return var2;
         }
      }

      return -1;
   }

   public String Q() {
      return this.H()?this.T:"container.dispenser";
   }

   public static void I(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.u(p.class, new String[]{"Items"}));
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.b = net.yz.w.C(this.e(), ks.a);
      if(!this.W(var1)) {
         net.nl.h.W(var1, this.b);
      }

      if(var1.K("CustomName", 8)) {
         this.T = var1.J("CustomName");
      }

   }

   public net.nj.f b(net.nj.f var1) {
      super.b((net.nj.f)var1);
      if(!this.A(var1)) {
         net.nl.h.l(var1, this.b);
      }

      if(this.H()) {
         var1.b("CustomName", this.T);
      }

      return var1;
   }

   public int m() {
      return 64;
   }

   public String H() {
      return "minecraft:dispenser";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      this.r(var2);
      return new net.nl.n(var1, this);
   }

   protected net.yz.w p() {
      return this.b;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

package net.n1;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import net.xn;
import net.c0.d;
import net.k.n;
import net.k.v;
import net.n0.ks;
import net.n1.o;
import net.n_.i;
import net.nj.h;
import net.yv.r;
import net.yz.ai;
import net.yz.m_;

public class b extends o {
   private static final v iH = n.q(b.class, net.k.y.d);
   private net.n_.b iP = net.nb.w.j;
   private final Set io = Sets.newHashSet();
   private boolean i2;

   public b(r var1) {
      super(var1);
   }

   public b(r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public b(r var1, net.ne.a var2) {
      super(var1, var2);
   }

   public void b(ks var1) {
      if(var1.Z() == net.nb.j.l) {
         this.iP = net.n_.y.h(var1);
         List var2 = net.n_.y.Z(var1);
         if(!var2.isEmpty()) {
            for(i var4 : var2) {
               this.io.add(new i(var4));
            }
         }

         int var5 = b(var1);
         if(var5 == -1) {
            this.V();
         } else {
            this.B(var5);
         }
      } else if(var1.Z() == net.nb.j.W_) {
         this.iP = net.nb.w.j;
         this.io.clear();
         this.G.d(iH, Integer.valueOf(-1));
      }

   }

   public static int b(ks var0) {
      net.nj.f var1 = var0.o();
      return var1.K("CustomPotionColor", 99)?var1.P("CustomPotionColor"):-1;
   }

   private void V() {
      this.i2 = false;
      this.G.d(iH, Integer.valueOf(net.n_.y.S(net.n_.y.T(this.iP, this.io))));
   }

   public void U(i var1) {
      this.io.add(var1);
      this.A().d(iH, Integer.valueOf(net.n_.y.S(net.n_.y.T(this.iP, this.io))));
   }

   protected void g() {
      super.g();
      this.G.r(iH, Integer.valueOf(-1));
   }

   public void A() {
      super.A();
      if(this.hl.x) {
         if(this.k_) {
            if(this.k9 % 5 == 0) {
               this.E(1);
            }
         } else {
            this.E(2);
         }
      } else if(this.k_ && this.k9 != 0 && !this.io.isEmpty() && this.k9 >= 600) {
         this.hl.k(this, (byte)0);
         this.iP = net.nb.w.j;
         this.io.clear();
         this.G.d(iH, Integer.valueOf(-1));
      }

   }

   private void E(int var1) {
      int var2 = this.J();
      if(var2 != -1) {
         double var3 = (double)(var2 >> 16 & 255) / 255.0D;
         double var5 = (double)(var2 >> 8 & 255) / 255.0D;
         double var7 = (double)(var2 >> 0 & 255) / 255.0D;

         for(int var9 = 0; var9 < var1; ++var9) {
            this.hl.n(ai.SPELL_MOB, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, var3, var5, var7, new int[0]);
         }
      }

   }

   public int J() {
      return ((Integer)this.G.a(iH)).intValue();
   }

   private void B(int var1) {
      this.i2 = true;
      this.G.d(iH, Integer.valueOf(var1));
   }

   public static void c(d var0) {
      o.w(var0, "TippedArrow");
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      if(this.iP != net.nb.w.j && this.iP != null) {
         var1.b("Potion", ((m_)net.n_.b.b.t(this.iP)).toString());
      }

      if(this.i2) {
         var1.r("Color", this.J());
      }

      if(!this.io.isEmpty()) {
         h var2 = new h();

         for(i var4 : this.io) {
            var2.m(var4.t(new net.nj.f()));
         }

         var1.K("CustomPotionEffects", var2);
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("Potion", 8)) {
         this.iP = net.n_.y.N(var1);
      }

      for(i var3 : net.n_.y.p(var1)) {
         this.U(var3);
      }

      if(var1.K("Color", 99)) {
         this.B(var1.P("Color"));
      } else {
         this.V();
      }

   }

   protected void d(net.ne.a var1) {
      super.d(var1);

      for(i var3 : this.iP.s()) {
         var1.o(new i(var3.i(), Math.max(var3.S() / 8, 1), var3.d(), var3.b(), var3.q()));
      }

      if(!this.io.isEmpty()) {
         for(i var5 : this.io) {
            var1.o(var5);
         }
      }

   }

   protected ks C() {
      if(this.io.isEmpty() && this.iP == net.nb.w.j) {
         return new ks(net.nb.j.W_);
      } else {
         ks var1 = new ks(net.nb.j.l);
         net.n_.y.b(var1, this.iP);
         net.n_.y.u(var1, this.io);
         if(this.i2) {
            net.nj.f var2 = var1.o();
            var2 = new net.nj.f();
            var1.t(var2);
            var2.r("CustomPotionColor", this.J());
         }

         return var1;
      }
   }

   public void R(byte var1) {
      String var2 = o.s.H();
      if(var1 == 0) {
         int var3 = this.J();
         if(var3 != -1) {
            double var4 = (double)(var3 >> 16 & 255) / 255.0D;
            double var6 = (double)(var3 >> 8 & 255) / 255.0D;
            double var8 = (double)(var3 >> 0 & 255) / 255.0D;
            int var10 = 0;
            this.hl.n(ai.SPELL_MOB, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, var4, var6, var8, new int[0]);
            ++var10;
         }
      }

      super.R(var1);
   }

   private static xn b(xn var0) {
      return var0;
   }
}

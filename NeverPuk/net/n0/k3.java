package net.n0;

import com.google.common.collect.Multimap;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.nl.z2;

public class k3 extends y {
   private final float d;
   private final y.d p;

   public k3(y.d var1) {
      this.p = var1;
      this.S = 1;
      this.d(var1.W());
      this.M(net.ys.r.R);
      this.d = 3.0F + var1.l();
   }

   public float l() {
      return this.p.l();
   }

   public float V(ks var1, net.yw.n var2) {
      kw.b();
      net.y9.l var4 = var2.Q();
      if(var4 == net.nb.f.o) {
         return 15.0F;
      } else {
         net.y1.l var5 = var2.n();
         return var5 != net.y1.l.u && var5 != net.y1.l.Y && var5 != net.y1.l.v && var5 != net.y1.l.h && var5 != net.y1.l.H?1.0F:1.5F;
      }
   }

   public boolean S(ks var1, net.ne.a var2, net.ne.a var3) {
      var1.S(1, var3);
      return true;
   }

   public boolean Y(ks var1, net.yv.r var2, net.yw.n var3, net.u.j var4, net.ne.a var5) {
      if((double)var3.s(var2, var4) != 0.0D) {
         var1.S(2, var5);
      }

      return true;
   }

   public boolean a() {
      return true;
   }

   public boolean W(net.yw.n var1) {
      return var1.Q() == net.nb.f.o;
   }

   public int z() {
      return this.p.D();
   }

   public String I() {
      return this.p.toString();
   }

   public boolean l(ks var1, ks var2) {
      return this.p.d() == var2.Z() || super.l(var1, var2);
   }

   public Multimap v(z2 var1) {
      kw.b();
      Multimap var3 = super.v(var1);
      if(var1 == z2.MAINHAND) {
         var3.put(net.ne.d.S.K(), new net.s.k(U, "Weapon modifier", (double)this.d, 0));
         var3.put(net.ne.d.E.K(), new net.s.k(v, "Weapon modifier", -2.4000000953674316D, 0));
      }

      return var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

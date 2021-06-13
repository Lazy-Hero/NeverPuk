package net.n0;

import com.google.common.collect.Multimap;
import java.util.Set;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.nl.z2;

public class k_ extends y {
   private final Set a;
   protected float t;
   protected float F;
   protected float M;
   protected y.d H;

   protected k_(float var1, float var2, y.d var3, Set var4) {
      this.t = 4.0F;
      this.H = var3;
      this.a = var4;
      this.S = 1;
      this.d(var3.W());
      this.t = var3.E();
      this.F = var1 + var3.l();
      this.M = var2;
      this.M(net.ys.r.y);
   }

   protected k_(y.d var1, Set var2) {
      this(0.0F, 0.0F, var1, var2);
   }

   public float V(ks var1, net.yw.n var2) {
      return this.a.contains(var2.Q())?this.t:1.0F;
   }

   public boolean S(ks var1, net.ne.a var2, net.ne.a var3) {
      var1.S(2, var3);
      return true;
   }

   public boolean Y(ks var1, net.yv.r var2, net.yw.n var3, net.u.j var4, net.ne.a var5) {
      int[] var6 = kw.b();
      if(!var2.x && Double.compare((double)var3.s(var2, var4), 0.0D) != 0) {
         var1.S(1, var5);
      }

      return true;
   }

   public boolean a() {
      return true;
   }

   public int z() {
      return this.H.D();
   }

   public String E() {
      return this.H.toString();
   }

   public boolean l(ks var1, ks var2) {
      return this.H.d() == var2.Z() || super.l(var1, var2);
   }

   public Multimap v(z2 var1) {
      kw.b();
      Multimap var3 = super.v(var1);
      if(var1 == z2.MAINHAND) {
         var3.put(net.ne.d.S.K(), new net.s.k(U, "Tool modifier", (double)this.F, 0));
         var3.put(net.ne.d.E.K(), new net.s.k(v, "Tool modifier", (double)this.M, 0));
      }

      return var3;
   }

   public float c() {
      return this.F;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

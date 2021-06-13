package net.nw;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.xn;
import net.a.t;
import net.nw.a;
import net.nw.e;
import net.nw.f;
import net.nw.g;
import net.nw.k;
import net.nw.l;
import net.nw.m;
import net.nw.s;
import net.nw.u;
import net.nw.w;
import net.nw.x;
import net.nw.y;
import net.u.d;

public class v {
   private static v[] b = new v[0];
   public static final v z = X(k.class, "HoldingPattern");
   public static final v j = X(u.class, "StrafePlayer");
   public static final v L = X(e.class, "LandingApproach");
   public static final v W = X(w.class, "Landing");
   public static final v V = X(m.class, "Takeoff");
   public static final v a = X(y.class, "SittingFlaming");
   public static final v H = X(net.nw.z.class, "SittingScanning");
   public static final v w = X(f.class, "SittingAttacking");
   public static final v Y = X(g.class, "ChargingPlayer");
   public static final v Q = X(a.class, "Dying");
   public static final v E = X(l.class, "Hover");
   private final Class x;
   private final int t;
   private final String n;

   private v(int var1, Class var2, String var3) {
      this.t = var1;
      this.x = var2;
      this.n = var3;
   }

   public x i(t var1) {
      Constructor var2 = this.M();
      return (x)var2.newInstance(new Object[]{var1});
   }

   protected Constructor M() throws NoSuchMethodException {
      return this.x.getConstructor(new Class[]{t.class});
   }

   public int a() {
      return this.t;
   }

   public String toString() {
      return this.n + " (#" + this.t + ")";
   }

   public static v V(int var0) {
      d[] var1 = s.H();
      return var0 >= 0 && var0 < b.length?b[var0]:z;
   }

   public static int s() {
      return b.length;
   }

   private static v X(Class var0, String var1) {
      v var2 = new v(b.length, var0, var1);
      b = (v[])Arrays.copyOf(b, b.length + 1);
      b[var2.a()] = var2;
      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

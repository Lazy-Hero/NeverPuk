package net.cg;

import net.xn;
import net.yv.o9;
import net.yz.a7;

public class r implements Comparable {
   private final String I;
   private final String w;
   private final long z;
   private final long b;
   private final boolean m;
   private final o9 n;
   private final boolean e;
   private final boolean v;
   private final String P;
   private final int F;
   private final boolean O;

   public r(net.cg.z var1, String var2, String var3, long var4, boolean var6) {
      this.I = var2;
      net.cg.z.z();
      this.w = var3;
      this.z = var1.x();
      this.b = var4;
      this.n = var1.h();
      this.m = var6;
      this.e = var1.b();
      this.v = var1.u();
      this.P = var1.r();
      this.F = var1.G();
      this.O = var1.p();
      if(net.u.d.y() == null) {
         net.cg.z.x(false);
      }

   }

   public String X() {
      return this.I;
   }

   public String I() {
      return this.w;
   }

   public long H() {
      return this.b;
   }

   public boolean I() {
      return this.m;
   }

   public long k() {
      return this.z;
   }

   public int D(r var1) {
      boolean var2 = net.cg.z.V();
      return Long.compare(this.z, var1.z) < 0?1:(this.z > var1.z?-1:this.I.compareTo(var1.I));
   }

   public o9 Y() {
      return this.n;
   }

   public boolean Y() {
      return this.e;
   }

   public boolean j() {
      return this.v;
   }

   public String S() {
      boolean var1 = net.cg.z.V();
      return a7.Y(this.P)?net.yq.e.E("selectWorld.versionUnknown"):this.P;
   }

   public boolean Q() {
      return this.K();
   }

   public boolean K() {
      return this.F > 1343;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

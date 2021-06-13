package net.yz;

import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;

public class e {
   private final net.yz.z F;
   private final int Z;
   private final float b;
   private final float J;
   private final String K;
   private final float l;

   public e(net.yz.z var1, int var2, float var3, float var4, String var5, float var6) {
      this.F = var1;
      this.Z = var2;
      this.b = var4;
      this.J = var3;
      this.K = var5;
      this.l = var6;
   }

   public net.yz.z c() {
      return this.F;
   }

   public float b() {
      return this.b;
   }

   public boolean r() {
      return this.F.v() instanceof net.ne.a;
   }

   @Nullable
   public String L() {
      return this.K;
   }

   @Nullable
   public net.cb.t x() {
      int var1 = m_.g();
      return this.c().v() == null?null:this.c().v().b();
   }

   public float t() {
      int var1 = m_.J();
      return this.F == net.yz.z.s?Float.MAX_VALUE:this.l;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

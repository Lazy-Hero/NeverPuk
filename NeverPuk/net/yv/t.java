package net.yv;

import net.yv.j;
import net.yv.o9;

public final class t {
   private final long h;
   private final o9 E;
   private final boolean N;
   private final boolean t;
   private final j L;
   private boolean I;
   private boolean X;
   private String q;

   public t(long var1, o9 var3, boolean var4, boolean var5, j var6) {
      this.q = "";
      this.h = var1;
      this.E = var3;
      this.N = var4;
      this.t = var5;
      this.L = var6;
   }

   public t(net.cg.z var1) {
      this(var1.D(), var1.h(), var1.X(), var1.b(), var1.h());
   }

   public t X() {
      this.X = true;
      return this;
   }

   public t p() {
      this.I = true;
      return this;
   }

   public t D(String var1) {
      this.q = var1;
      return this;
   }

   public boolean I() {
      return this.X;
   }

   public long r() {
      return this.h;
   }

   public o9 H() {
      return this.E;
   }

   public boolean h() {
      return this.t;
   }

   public boolean i() {
      return this.N;
   }

   public j H() {
      return this.L;
   }

   public boolean Y() {
      return this.I;
   }

   public static o9 K(int var0) {
      return o9.M(var0);
   }

   public String T() {
      return this.q;
   }
}

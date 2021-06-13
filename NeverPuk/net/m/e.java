package net.m;

import java.io.IOException;

public class e implements net.n2.k {
   private int d;
   private e.p h;
   private int k;

   public e() {
   }

   public e(net.ne.l var1, e.p var2) {
      this(var1, var2, 0);
   }

   public e(net.ne.l var1, e.p var2, int var3) {
      this.d = var1.G();
      this.h = var2;
      this.k = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.d = var1.q();
      this.h = (e.p)var1.S(e.p.class);
      this.k = var1.q();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.d);
      var1.A(this.h);
      var1.a(this.k);
   }

   public void X(net.x.x var1) {
      var1.s(this);
   }

   public e.p m() {
      return this.h;
   }

   public int P() {
      return this.k;
   }

   public static enum p {
      START_SNEAKING,
      STOP_SNEAKING,
      STOP_SLEEPING,
      START_SPRINTING,
      STOP_SPRINTING,
      START_RIDING_JUMP,
      STOP_RIDING_JUMP,
      OPEN_INVENTORY,
      START_FALL_FLYING;
   }
}

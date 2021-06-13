package net.yv;

import java.util.UUID;

public abstract class of {
   private final UUID D;
   protected net.cb.t O;
   protected float w;
   protected of.y r;
   protected of.f g;
   protected boolean G;
   protected boolean K;
   protected boolean R;

   public of(UUID var1, net.cb.t var2, of.y var3, of.f var4) {
      this.D = var1;
      this.O = var2;
      this.r = var3;
      this.g = var4;
      this.w = 1.0F;
   }

   public UUID a() {
      return this.D;
   }

   public net.cb.t t() {
      return this.O;
   }

   public void T(net.cb.t var1) {
      this.O = var1;
   }

   public float g() {
      return this.w;
   }

   public void n(float var1) {
      this.w = var1;
   }

   public of.y y() {
      return this.r;
   }

   public void A(of.y var1) {
      this.r = var1;
   }

   public of.f t() {
      return this.g;
   }

   public void Y(of.f var1) {
      this.g = var1;
   }

   public boolean r() {
      return this.G;
   }

   public of u(boolean var1) {
      this.G = var1;
      return this;
   }

   public boolean Q() {
      return this.K;
   }

   public of O(boolean var1) {
      this.K = var1;
      return this;
   }

   public of C(boolean var1) {
      this.R = var1;
      return this;
   }

   public boolean e() {
      return this.R;
   }

   public static enum f {
      PROGRESS,
      NOTCHED_6,
      NOTCHED_10,
      NOTCHED_12,
      NOTCHED_20;
   }

   public static enum y {
      PINK,
      BLUE,
      RED,
      GREEN,
      YELLOW,
      PURPLE,
      WHITE;
   }
}

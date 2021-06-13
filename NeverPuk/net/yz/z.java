package net.yz;

import javax.annotation.Nullable;
import net.xn;
import net.yz.j;
import net.yz.m_;
import net.yz.v;

public class z {
   public static final net.yz.z p = (new net.yz.z("inFire")).Y();
   public static final net.yz.z i = new net.yz.z("lightningBolt");
   public static final net.yz.z y = (new net.yz.z("onFire")).s().Y();
   public static final net.yz.z a = (new net.yz.z("lava")).Y();
   public static final net.yz.z f = (new net.yz.z("hotFloor")).Y();
   public static final net.yz.z q = (new net.yz.z("inWall")).s();
   public static final net.yz.z h = (new net.yz.z("cramming")).s();
   public static final net.yz.z N = (new net.yz.z("drown")).s();
   public static final net.yz.z D = (new net.yz.z("starve")).s().z();
   public static final net.yz.z I = new net.yz.z("cactus");
   public static final net.yz.z H = (new net.yz.z("fall")).s();
   public static final net.yz.z g = (new net.yz.z("flyIntoWall")).s();
   public static final net.yz.z s = (new net.yz.z("outOfWorld")).s().W();
   public static final net.yz.z P = (new net.yz.z("generic")).s();
   public static final net.yz.z B = (new net.yz.z("magic")).s().X();
   public static final net.yz.z F = (new net.yz.z("wither")).s();
   public static final net.yz.z J = new net.yz.z("anvil");
   public static final net.yz.z r = new net.yz.z("fallingBlock");
   public static final net.yz.z b = (new net.yz.z("dragonBreath")).s();
   public static final net.yz.z n = (new net.yz.z("fireworks")).l();
   private boolean V;
   private boolean G;
   private boolean Z;
   private float e = 0.1F;
   private boolean z;
   private boolean W;
   private boolean X;
   private boolean L;
   private boolean K;
   public String M;

   public static net.yz.z O(net.ne.a var0) {
      return new v("mob", var0);
   }

   public static net.yz.z o(net.ne.l var0, net.ne.a var1) {
      return new j("mob", var0, var1);
   }

   public static net.yz.z Q(net.r.r var0) {
      return new v("player", var0);
   }

   public static net.yz.z k(net.n1.o var0, @Nullable net.ne.l var1) {
      return (new j("arrow", var0, var1)).g();
   }

   public static net.yz.z h(net.n1.m var0, @Nullable net.ne.l var1) {
      return (new j("onFire", var0, var0)).Y().g();
   }

   public static net.yz.z Z(net.ne.l var0, @Nullable net.ne.l var1) {
      return (new j("thrown", var0, var1)).g();
   }

   public static net.yz.z G(net.ne.l var0, @Nullable net.ne.l var1) {
      return (new j("indirectMagic", var0, var1)).s().X();
   }

   public static net.yz.z y(net.ne.l var0) {
      return (new v("thorns", var0)).z().X();
   }

   public static net.yz.z A(@Nullable net.yv.u var0) {
      int var1 = m_.g();
      return var0 != null && var0.s() != null?(new v("explosion.player", var0.s())).n().l():(new net.yz.z("explosion")).n().l();
   }

   public static net.yz.z J(@Nullable net.ne.a var0) {
      return (new v("explosion.player", var0)).n().l();
   }

   public boolean R() {
      return this.W;
   }

   public net.yz.z g() {
      this.W = true;
      return this;
   }

   public boolean e() {
      return this.K;
   }

   public net.yz.z l() {
      this.K = true;
      return this;
   }

   public boolean i() {
      return this.V;
   }

   public float o() {
      return this.e;
   }

   public boolean a() {
      return this.G;
   }

   public boolean v() {
      return this.Z;
   }

   protected z(String var1) {
      this.M = var1;
   }

   @Nullable
   public net.ne.l g() {
      return this.v();
   }

   @Nullable
   public net.ne.l v() {
      return null;
   }

   protected net.yz.z s() {
      this.V = true;
      this.e = 0.0F;
      return this;
   }

   protected net.yz.z W() {
      this.G = true;
      return this;
   }

   protected net.yz.z z() {
      this.Z = true;
      this.e = 0.0F;
      return this;
   }

   protected net.yz.z Y() {
      this.z = true;
      return this;
   }

   public net.cb.t Z(net.ne.a var1) {
      net.ne.a var2 = var1.O();
      String var3 = "death.attack." + this.M;
      String var4 = var3 + ".player";
      return net.yq.e.s(var4)?new net.cb.h(var4, new Object[]{var1.b(), var2.b()}):new net.cb.h(var3, new Object[]{var1.b()});
   }

   public boolean q() {
      return this.z;
   }

   public String V() {
      return this.M;
   }

   public net.yz.z n() {
      this.X = true;
      return this;
   }

   public boolean V() {
      return this.X;
   }

   public boolean p() {
      return this.L;
   }

   public net.yz.z X() {
      this.L = true;
      return this;
   }

   public boolean Q() {
      m_.g();
      net.ne.l var2 = this.v();
      return var2 instanceof net.r.r && ((net.r.r)var2).a6.V;
   }

   @Nullable
   public net.u.r X() {
      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

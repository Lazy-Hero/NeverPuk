package net.nv;

import java.util.Objects;
import javax.annotation.Nullable;
import net.xn;
import net.nv.f;
import net.nv.l;
import net.nv.t;

public class a implements f {
   private final f P;
   @Nullable
   private final net.u.r x;
   @Nullable
   private final net.u.j v;
   @Nullable
   private final Integer Q;
   @Nullable
   private final net.ne.l t;
   @Nullable
   private final Boolean c;

   public a(f var1, @Nullable net.u.r var2, @Nullable net.u.j var3, @Nullable Integer var4, @Nullable net.ne.l var5, @Nullable Boolean var6) {
      this.P = var1;
      this.x = var2;
      this.v = var3;
      this.Q = var4;
      this.t = var5;
      this.c = var6;
   }

   public static a m(f var0) {
      return var0 instanceof a?(a)var0:new a(var0, (net.u.r)null, (net.u.j)null, (Integer)null, (net.ne.l)null, (Boolean)null);
   }

   public a G(net.ne.l var1, net.u.r var2) {
      return this.t == var1 && Objects.equals(this.x, var2)?this:new a(this.P, var2, new net.u.j(var2), this.Q, var1, this.c);
   }

   public a f(int var1) {
      String[] var2 = t.Y();
      return this.Q != null && this.Q.intValue() <= var1?this:new a(this.P, this.x, this.v, Integer.valueOf(var1), this.t, this.c);
   }

   public a E(boolean var1) {
      String[] var2 = t.Y();
      return this.c != null && (!this.c.booleanValue() || var1)?this:new a(this.P, this.x, this.v, this.Q, this.t, Boolean.valueOf(var1));
   }

   public a W() {
      return this.x != null?this:new a(this.P, this.A(), this.z(), this.Q, this.t, this.c);
   }

   public String Q() {
      return this.t != null?this.t.Q():this.P.Q();
   }

   public net.cb.t b() {
      return this.t != null?this.t.b():this.P.b();
   }

   public void r(net.cb.t var1) {
      if(this.c == null || this.c.booleanValue()) {
         this.P.r(var1);
      }

   }

   public boolean n(int var1, String var2) {
      return (this.Q == null || this.Q.intValue() >= var1) && this.P.n(var1, var2);
   }

   public net.u.j z() {
      return this.v != null?this.v:(this.t != null?this.t.z():this.P.z());
   }

   public net.u.r A() {
      return this.x != null?this.x:(this.t != null?this.t.A():this.P.A());
   }

   public net.yv.r T() {
      return this.t != null?this.t.T():this.P.T();
   }

   @Nullable
   public net.ne.l P() {
      return this.t != null?this.t.P():this.P.P();
   }

   public boolean x() {
      return this.c != null?this.c.booleanValue():this.P.x();
   }

   public void n(l.p var1, int var2) {
      if(this.t != null) {
         this.t.n(var1, var2);
      } else {
         this.P.n(var1, var2);
      }

   }

   @Nullable
   public net.nx.f E() {
      return this.P.E();
   }

   private static xn a(xn var0) {
      return var0;
   }
}

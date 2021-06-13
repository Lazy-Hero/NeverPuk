package net.ne;

import java.util.UUID;
import net.xn;
import net.ne.d;
import net.ne.l;
import net.ne.y;

public abstract class s extends y {
   public static final UUID c8 = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
   public static final net.s.k cO = (new net.s.k(c8, "Fleeing speed bonus", 2.0D, 2)).A(false);
   private net.u.j c4 = net.u.j.V;
   private float cb = -1.0F;
   private final float cH = net.b.m.WATER.A();
   private static String[] cz;

   public s(net.yv.r var1) {
      super(var1);
   }

   public float O(net.u.j var1) {
      return 0.0F;
   }

   public boolean l4() {
      return super.l4() && this.O(new net.u.j(this.b, this.i().u, this.hr)) >= 0.0F;
   }

   public boolean DI() {
      return !this.p6.q();
   }

   public boolean Dv() {
      return this.x(new net.u.j(this));
   }

   public boolean x(net.u.j var1) {
      return this.cb == -1.0F?true:this.c4.n(var1) < (double)(this.cb * this.cb);
   }

   public void y(net.u.j var1, int var2) {
      this.c4 = var1;
      this.cb = (float)var2;
   }

   public net.u.j I() {
      return this.c4;
   }

   public float H() {
      return this.cb;
   }

   public void DI() {
      this.cb = -1.0F;
   }

   public boolean DM() {
      return this.cb != -1.0F;
   }

   protected void gr() {
      d.p();
      super.gr();
      if(this.ln() && this.M() != null && this.M().hl == this.hl) {
         l var2 = this.M();
         this.y(new net.u.j((int)var2.b, (int)var2.hS, (int)var2.hr), 5);
         float var3 = this.d(var2);
         if(this instanceof net.yn.d && ((net.yn.d)this).Ke()) {
            if(var3 > 10.0F) {
               this.b(true, true);
            }

            return;
         }

         this.f(var3);
         if(Float.compare(var3, 10.0F) > 0) {
            this.b(true, true);
            this.p_.g(1);
         }

         if(var3 > 6.0F) {
            double var4 = (var2.b - this.b) / (double)var3;
            double var6 = (var2.hS - this.hS) / (double)var3;
            double var8 = (var2.hr - this.hr) / (double)var3;
            this.hf += var4 * Math.abs(var4) * 0.4D;
            this.K += var6 * Math.abs(var6) * 0.4D;
            this.J += var8 * Math.abs(var8) * 0.4D;
         }

         this.p_.P(1);
         float var10 = 2.0F;
         net.u.r var5 = (new net.u.r(var2.b - this.b, var2.hS - this.hS, var2.hr - this.hr)).I().T((double)Math.max(var3 - 2.0F, 0.0F));
         this.H().k(this.b + var5.p, this.hS + var5.H, this.hr + var5.a, this.F());
      }

   }

   protected double F() {
      return 1.0D;
   }

   protected void f(float var1) {
   }

   static {
      G(new String[1]);
   }

   public static void G(String[] var0) {
      cz = var0;
   }

   public static String[] Y() {
      return cz;
   }

   private static xn b(xn var0) {
      return var0;
   }
}

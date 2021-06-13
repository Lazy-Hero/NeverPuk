package net.y_;

import net.xn;
import net.y_.b;
import net.y_.s;

public class oq extends b {
   private final net.ne.s G;
   private net.nq.c f;
   private int A = -1;
   private int B = -1;

   public oq(net.ne.s var1) {
      this.G = var1;
      this.h(1);
   }

   public boolean f() {
      b.q();
      net.u.j var2 = new net.u.j(this.G);
      if((!this.G.hl.u() || this.G.hl.b() && !this.G.hl.P(var2).D()) && this.G.hl.F.A()) {
         if(this.G.Q().nextInt(50) != 0) {
            return false;
         } else if(this.A != -1 && this.G.o((double)this.A, this.G.hS, (double)this.B) < 4.0D) {
            return false;
         } else {
            net.nq.d var3 = this.G.hl.v().s(var2, 14);
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean X() {
      return !this.G.H().q();
   }

   public void I() {
      this.A = -1;
      net.u.j var1 = this.f.h();
      int var2 = var1.t();
      int var3 = var1.h();
      int var4 = var1.y();
      if(this.G.x(var1) > 256.0D) {
         net.u.r var5 = s.l(this.G, 14, 3, new net.u.r((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D));
         this.G.H().k(var5.p, var5.H, var5.a, 1.0D);
      } else {
         this.G.H().k((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 1.0D);
      }

   }

   public void C() {
      this.A = this.f.h().t();
      this.B = this.f.h().y();
      this.f = null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}

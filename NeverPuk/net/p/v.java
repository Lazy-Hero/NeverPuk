package net.p;

import com.mojang.authlib.GameProfile;
import net.xn;
import net.cb.l;
import net.cb.t;
import net.n2.k;
import net.nn.j;
import net.p.n;
import net.p.p;
import net.y.d;
import net.yy.f;
import net.yz.m_;
import net.z.g;

public class v implements n {
   private final GameProfile o;
   private final m_ Q;

   public v(GameProfile var1) {
      this.o = var1;
      this.Q = f.m(var1.getName());
      f.e(this.Q, var1.getName());
   }

   public void X(p var1) {
      j.b().d().L((k)(new net.m.n(this.o.getId())));
   }

   public t m() {
      return new l(this.o.getName());
   }

   public void A(float var1, int var2) {
      j.b().n().E(this.Q);
      d.T(1.0F, 1.0F, 1.0F, (float)var2 / 255.0F);
      g.v(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      p.Y();
      g.v(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      net.u.d.h(new net.u.d[5]);
   }

   public boolean C() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
